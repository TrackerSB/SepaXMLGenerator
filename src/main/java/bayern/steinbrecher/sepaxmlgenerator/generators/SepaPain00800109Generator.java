package bayern.steinbrecher.sepaxmlgenerator.generators;

import bayern.steinbrecher.sepaxmlgenerator.SepaDocumentDescription;
import bayern.steinbrecher.sepaxmlgenerator.SepaGenerator;
import bayern.steinbrecher.sepaxmlgenerator.SepaVersion;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public class SepaPain00800109Generator implements SepaGenerator {
    @Override
    public String generateXML(SepaVersion version, SepaDocumentDescription sepaDocumentDescription) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean validateXML(SepaVersion version, String xml) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
