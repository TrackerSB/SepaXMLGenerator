package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record SepaDocumentDescription(
        MessageId msgId,
        Creditor creditor,
        Collection<DirectDebitTransaction> transactions,
        GregorianCalendar executionDate
) implements SepaDocumentDescriptionBuilder.With {
    /**
     * The maximum length of the name of the party creating the SEPA Direct Debit.
     */
    private static final int MAX_CHAR_NAME_FIELD = 70;
    private static final Logger LOGGER = Logger.getLogger(SepaDocumentDescription.class.getName());

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SepaDocumentDescription that = (SepaDocumentDescription) o;
        boolean equalIban = Objects.equals(msgId(), that.msgId());
        if (equalIban) {
            Map<String, Object> thisAttributes = SepaDocumentDescriptionBuilder.stream(this)
                    .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
            Map<String, Object> thatAttributes = SepaDocumentDescriptionBuilder.stream(that)
                    .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
            for (String attributeName : thisAttributes.keySet()) {
                if (!Objects.equals(thisAttributes.get(attributeName), thatAttributes.get(attributeName))) {
                    LOGGER.log(Level.WARNING, String.format(
                            "%s and %s are considered equal although they differ in attribute \"%s\"",
                            this, that, attributeName));
                }
            }
        }
        return equalIban;
    }

    @Override
    public int hashCode() {
        return Objects.hash(msgId());
    }
}
