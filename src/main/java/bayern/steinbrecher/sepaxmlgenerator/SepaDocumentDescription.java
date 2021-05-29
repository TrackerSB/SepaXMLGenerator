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
        MessageId msgId,
        Creditor creditor,
        Collection<DirectDebitTransaction> transactions,
        GregorianCalendar executionDate
) {
    /**
     * The maximum length of the name of the party creating the SEPA Direct Debit.
     */
    private static final int MAX_CHAR_NAME_FIELD = 70;
}
