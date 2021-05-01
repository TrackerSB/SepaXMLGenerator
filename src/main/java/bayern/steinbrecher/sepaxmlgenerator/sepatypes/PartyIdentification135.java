package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record PartyIdentification135(
        Optional<Max140Text> nm,
        Optional<PostalAddress24> pstlAdr,
        Optional<Party38Choice> id,
        Optional<CountryCode> ctryOfRes,
        Optional<Contact4> ctctDtls) implements SepaNode {
}
