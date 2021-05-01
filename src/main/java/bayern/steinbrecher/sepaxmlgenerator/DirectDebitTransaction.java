package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record DirectDebitTransaction(DirectDebitMandate mandate, String purpose, double amount) {
    public boolean isValid() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
