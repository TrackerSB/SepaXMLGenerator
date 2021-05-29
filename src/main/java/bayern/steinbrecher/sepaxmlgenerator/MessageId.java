package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.regex.Pattern;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record MessageId(
        String value
) implements Validatable {
    /**
     * The count of days the MessageId has to be unique.
     */
    private static final int UNIQUE_DAYS_MESSAGEID = 15;
    /**
     * The maximum length of the message id.
     */
    private static final int MAX_CHAR_MESSAGE_ID = 35;
    /**
     * Regex for checking whether a message id is valid. Which characters are supported by Sepa is taken from
     * http://www.sepaforcorporates.com/sepa-implementation/valid-xml-characters-sepa-payments/
     */
    private static final String MESSAGE_ID_REGEX = "([a-zA-Z0-9]|/| |-|\\?|:|\\(|\\)|\\.|,|'|\\+)*";
    private static final Pattern MESSAGE_ID_PATTERN = Pattern.compile(MESSAGE_ID_REGEX);

    public boolean isValid() {
        return value() != null
                && MESSAGE_ID_PATTERN.matcher(value()).matches()
                && value().length() <= MAX_CHAR_MESSAGE_ID;
    }
}
