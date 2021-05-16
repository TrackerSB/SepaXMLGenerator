package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Collection;
import java.util.GregorianCalendar;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record SepaDocumentDescription(
        String msgId,
        Creditor creditor,
        Collection<DirectDebitTransaction> transactions,
        GregorianCalendar executionDate) {
}
