package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record PaymentInformationId(
        String value
) implements Validatable {
    /**
     * The count of months the PmtInfId has to be unique.
     */
    private static final int UNIQUE_MONTH_PMTINFID = 3;
    /**
     * The maximum length of payment information id (PmtInfId).
     */
    private static final int MAX_CHAR_PMTINFID = 35;

    public boolean isValid() {
        return value().length() <= MAX_CHAR_PMTINFID;
    }
}
