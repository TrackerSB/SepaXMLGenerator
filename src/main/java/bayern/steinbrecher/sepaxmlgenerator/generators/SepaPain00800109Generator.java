package bayern.steinbrecher.sepaxmlgenerator.generators;

import bayern.steinbrecher.sepaxmlgenerator.GenerationFailedException;
import bayern.steinbrecher.sepaxmlgenerator.SepaDocumentDescription;
import bayern.steinbrecher.sepaxmlgenerator.SepaGenerator;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.CustomerDirectDebitInitiationV09;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.Document;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109.GroupHeader83;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.GregorianCalendar;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public class SepaPain00800109Generator extends SepaGenerator {
    private static final DatatypeFactory datatypeFactory;

    static {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public SepaPain00800109Generator() {
        super("pain.008.001.09.xsd");
    }

    @Override
    public String generateXML(SepaDocumentDescription sepaDocumentDescription) throws GenerationFailedException {
        Document document = new Document();
        {
            CustomerDirectDebitInitiationV09 cstmrDrctDbtInitn = new CustomerDirectDebitInitiationV09();
            {
                GroupHeader83 grpHdr = new GroupHeader83();
                grpHdr.setCreDtTm(datatypeFactory.newXMLGregorianCalendar(new GregorianCalendar()));
                grpHdr.setMsgId(sepaDocumentDescription.msgId());
                cstmrDrctDbtInitn.setGrpHdr(grpHdr);
            }
            document.setCstmrDrctDbtInitn(cstmrDrctDbtInitn);
        }

        return generateXML(document);
    }
}
