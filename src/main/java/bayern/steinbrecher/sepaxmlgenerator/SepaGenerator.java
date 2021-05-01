package bayern.steinbrecher.sepaxmlgenerator;

import bayern.steinbrecher.sepaxmlgenerator.schemevisitors.SepaPain00800109Visitor;
import bayern.steinbrecher.sepaxmlgenerator.schemevisitors.SepaSchemeVisitor;
import bayern.steinbrecher.sepaxmlgenerator.sepatypes.SepaDocument;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public final class SepaGenerator {

    private SepaGenerator() {
        throw new UnsupportedOperationException("The construction of instances is prohibited");
    }

    private static SepaDocument convertToDocument(SepaDocumentDescription sepaDocumentDescription){
        throw new UnsupportedOperationException("Conversion not supported");
    }

    public static String generateXML(SepaVersion version, SepaDocumentDescription sepaDocumentDescription) {
        SepaSchemeVisitor visitor = switch (version) {
            case PAIN_008_001_09 -> new SepaPain00800109Visitor();
        };

        SepaDocument sepaDocument = convertToDocument(sepaDocumentDescription);
        return visitor.visitGenerate(sepaDocument);
    }
}
