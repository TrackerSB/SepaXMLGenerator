package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.math.BigInteger;
import java.util.regex.Pattern;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record IBAN(
        String value
) implements Validatable {
    /**
     * The maximum length of an IBAN.
     */
    private static final int MAX_CHAR_IBAN = 34;
    /**
     * Length of country code (CC);
     */
    private static final int SEPA_CC_LENGTH = 2;
    /**
     * Length of country code (CC) and checksum together.
     */
    private static final int SEPA_CC_CHECKSUM_LENGTH = SEPA_CC_LENGTH + 2;
    private static final int SEPA_MIN_LENGTH = SEPA_CC_CHECKSUM_LENGTH + 1;
    /**
     * A=10, B=11, C=12 etc.
     */
    private static final int SEPA_SHIFT_CC = 10;
    private static final int IBAN_CHECKSUM_MODULO = 97;
    /**
     * Regex describing a possible valid IBAN (the checksum of the IBAN is not checked by this regex).
     */
    private static final String IBAN_REGEX
            = "[A-Z]{" + SEPA_CC_LENGTH + "}\\d{2," + (MAX_CHAR_IBAN - SEPA_CC_LENGTH) + "}";
    private static final Pattern IBAN_PATTERN = Pattern.compile(IBAN_REGEX);

    public boolean isValid() {
        boolean isValid = false;
        if (value() != null && !value().isEmpty()) {
            String trimmedIban = value().replace(" ", "");
            //Check whether it CAN be a valid IBAN
            if (IBAN_PATTERN.matcher(trimmedIban).matches()) {
                //Check the checksum
                int posAlphabetFirstChar = ((int) trimmedIban.charAt(0)) - ((int) 'A') + SEPA_SHIFT_CC;
                int posAlphabetSecondChar = ((int) trimmedIban.charAt(1)) - ((int) 'A') + SEPA_SHIFT_CC;
                if (trimmedIban.length() >= SEPA_MIN_LENGTH && posAlphabetFirstChar >= SEPA_SHIFT_CC
                        && posAlphabetSecondChar >= SEPA_SHIFT_CC) {
                    trimmedIban = trimmedIban.substring(SEPA_CC_CHECKSUM_LENGTH) + posAlphabetFirstChar
                            + posAlphabetSecondChar + trimmedIban.substring(SEPA_CC_LENGTH, SEPA_CC_CHECKSUM_LENGTH);
                    isValid = new BigInteger(trimmedIban)
                            .mod(BigInteger.valueOf(IBAN_CHECKSUM_MODULO))
                            .equals(BigInteger.ONE);
                }
            }
        }

        return isValid;
    }
}
