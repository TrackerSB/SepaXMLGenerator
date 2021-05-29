package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.time.LocalDate;
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
public record DirectDebitMandate(
        String id,
        AccountHolder owner,
        LocalDate signed
) implements DirectDebitMandateBuilder.With {
    private static final Logger LOGGER = Logger.getLogger(DirectDebitMandate.class.getName());

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DirectDebitMandate that = (DirectDebitMandate) o;
        boolean equalIban = Objects.equals(id(), that.id());
        if (equalIban) {
            Map<String, Object> thisAttributes = DirectDebitMandateBuilder.stream(this)
                    .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
            Map<String, Object> thatAttributes = DirectDebitMandateBuilder.stream(that)
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
        return Objects.hash(id());
    }
}
