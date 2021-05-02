package bayern.steinbrecher.sepaxmlgenerator;

import bayern.steinbrecher.sepaxmlgenerator.generators.SepaPain00800109Generator;

/**
 * @author Stefan Huber
 * @since 0.1
 */
public interface SepaGenerator {

    String generateXML(SepaVersion version, SepaDocumentDescription sepaDocumentDescription);

    boolean validateXML(SepaVersion version, String xml);

    static SepaGenerator getGenerator(SepaVersion version){
        return switch (version){
            case PAIN_008_001_09 -> new SepaPain00800109Generator();
        };
    }
}
