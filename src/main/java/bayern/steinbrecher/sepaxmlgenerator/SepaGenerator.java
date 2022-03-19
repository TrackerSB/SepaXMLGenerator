package bayern.steinbrecher.sepaxmlgenerator;

import bayern.steinbrecher.sepaxmlgenerator.generators.SepaPain00800102Generator;
import bayern.steinbrecher.sepaxmlgenerator.generators.SepaPain00800109Generator;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.glassfish.jaxb.runtime.v2.ContextFactory;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public abstract class SepaGenerator {

    private static final Logger LOGGER = Logger.getLogger(SepaPain00800109Generator.class.getName());
    private static final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    private final Validator validator;

    protected SepaGenerator(String xsdFileName) {
        Schema schema;
        try {
            schema = schemaFactory.newSchema(getClass().getResource(xsdFileName));
        } catch (SAXException ex) {
            throw new ExceptionInInitializerError(ex);
        }
        validator = schema.newValidator();
    }

    protected abstract Class<?> getDocumentType();

    protected final String generateXML(Object xmlRootElement) throws GenerationFailedException {
        StringWriter xmlWriter = new StringWriter();
        try {
            JAXBContext context = ContextFactory.createContext(new Class[]{getDocumentType()}, null);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(xmlRootElement, xmlWriter);
        } catch (JAXBException ex) {
            throw new GenerationFailedException("Converting POJO to XML failed", ex);
        }
        return xmlWriter.toString();
    }

    public final String generateXML(SepaDocumentDescription sepaDocumentDescription)
            throws GenerationFailedException {
        if (validateDescription(sepaDocumentDescription)) {
            return generateXMLImpl(sepaDocumentDescription);
        }
        throw new IllegalArgumentException("The given SEPA document description is invalid");
    }

    protected abstract String generateXMLImpl(SepaDocumentDescription sepaDocumentDescription)
            throws GenerationFailedException;

    /**
     * Check whether the given SEPA document description is valid. The checked validity constraints partially exceed
     * the validity constraints of any XSD (e.g. checksums of IBANs or legal conditions for dates).
     */
    public static boolean validateDescription(SepaDocumentDescription sepaDocumentDescription) {
        Queue<Object> toValidate = new ArrayDeque<>();
        toValidate.add(sepaDocumentDescription);
        while (!toValidate.isEmpty()) {
            // Validate current element
            Object current = toValidate.remove();
            if (current instanceof Validatable validatable) {
                if (!validatable.isValid()) {
                    LOGGER.log(Level.INFO, String.format("%s is invalid", current));
                    return false;
                }
            }

            // Append its record entries
            Class<?> currentClass = current.getClass();
            if (currentClass.isRecord()) {
                RecordComponent[] recordComponents = currentClass.getRecordComponents();
                for (RecordComponent component : recordComponents) {
                    Method accessor = component.getAccessor();
                    try {
                        Object recordMember = accessor.invoke(current);
                        if (recordMember != null) {
                            toValidate.add(recordMember);
                        }
                    } catch (IllegalAccessException | InvocationTargetException ex) {
                        LOGGER.log(Level.SEVERE,
                                String.format("Could not retrieve member of record %s with %s",
                                        currentClass.getName(), accessor.getName()),
                                ex);
                    }
                }
            } else if (current instanceof Iterable<?> iterable) {
                iterable.forEach(toValidate::add);
            }
        }
        return true;
    }

    public boolean validateXML(String xml) {
        try {
            validator.validate(new StreamSource(new StringReader(xml)));
        } catch (SAXException | IOException ex) {
            LOGGER.log(Level.INFO, "A given XML was invalid due to the following reasons", ex);
            return false;
        }
        return true;
    }

    public static SepaGenerator getGenerator(SepaVersion version) {
        return switch (version) {
            case PAIN_008_001_02 -> new SepaPain00800102Generator();
            case PAIN_008_001_09 -> new SepaPain00800109Generator();
        };
    }
}
