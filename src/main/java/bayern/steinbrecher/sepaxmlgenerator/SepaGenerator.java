package bayern.steinbrecher.sepaxmlgenerator;

import bayern.steinbrecher.sepaxmlgenerator.generators.SepaPain00800109Generator;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.Document;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public abstract class SepaGenerator {

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

    public abstract boolean validateXML(String xml);

    public static SepaGenerator getGenerator(SepaVersion version){
        return switch (version){
            case PAIN_008_001_09 -> new SepaPain00800109Generator();
        };
    }
}
