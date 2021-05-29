package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.time.LocalDate;

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
}
