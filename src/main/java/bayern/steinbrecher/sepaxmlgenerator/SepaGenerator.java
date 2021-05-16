package bayern.steinbrecher.sepaxmlgenerator;

import bayern.steinbrecher.sepaxmlgenerator.generators.SepaPain00800109Generator;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.Document;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
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

    protected String generateXML(Object xmlRootElement) throws GenerationFailedException {
        StringWriter xmlWriter = new StringWriter();
        try {
            JAXBContext context = JAXBContext.newInstance(Document.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(xmlRootElement, xmlWriter);
        } catch (JAXBException ex) {
            throw new GenerationFailedException("Converting POJO to XML failed", ex);
        }
        return xmlWriter.toString();
    }

    public abstract String generateXML(SepaDocumentDescription sepaDocumentDescription) throws GenerationFailedException;

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
            case PAIN_008_001_09 -> new SepaPain00800109Generator();
        };
    }
}
