package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record Creditor(CreditorId creditorId, AccountHolder accountHolder) {
    public boolean isValid() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
