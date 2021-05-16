package bayern.steinbrecher.sepaxmlgenerator;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record AccountHolder(String firstname, String lastname, IBAN iban, BIC bic) {
    public String name() {
        return lastname() + ", " + firstname();
    }
}
