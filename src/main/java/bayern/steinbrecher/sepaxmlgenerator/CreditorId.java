package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record CreditorId(String value) implements Validatable {
    private static final String SEPA_BUSINESS_CODE = "ZZZ";

    public boolean isValid() {
        boolean isValid;
        if (value() == null) {
            isValid = false;
        } else {
            String trimmedCreditorId = value().replaceAll(" ", "");
            isValid = trimmedCreditorId.contains(SEPA_BUSINESS_CODE)
                    && new IBAN(trimmedCreditorId.replace(SEPA_BUSINESS_CODE, "")).isValid();
        }
        return isValid;
    }
}
