package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.regex.Pattern;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record BIC(String bic) implements Validatable {
    /**
     * Regex representing all valid BICs.
     */
    private static final String BIC_REGEX = "[A-Z]{6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3})?";
    private static final Pattern BIC_PATTERN = Pattern.compile(BIC_REGEX);

    public boolean isValid() {
        return bic != null
                && BIC_PATTERN.matcher(bic)
                .matches();
    }
}
