package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record BIC(String bic) {
    public boolean isValid() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
