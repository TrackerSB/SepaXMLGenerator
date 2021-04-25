package bayern.steinbrecher.sepaxmlgenerator;

/**
 * See https://wiki.xmldation.com/General_Information/ISO20022/pain.008 for explanation of different Sepa versions.
 *
 * @author Stefan Huber
 * @since 0.1
 */
public enum SepaVersion {
    PAIN_008_001_01("pain.008.001.01.xsd"),
    PAIN_008_001_02("pain.008.001.02.xsd"),
    PAIN_008_001_03("pain.008.001.03.xsd"),
    PAIN_008_001_04("pain.008.001.04.xsd"),
    PAIN_008_003_02("pain.008.003.02.xsd");

    final String xsdFilePath;

    SepaVersion(String xsdFilePath) {
        this.xsdFilePath = xsdFilePath;
    }

    public String getXsdFilePath() {
        return xsdFilePath;
    }
}
