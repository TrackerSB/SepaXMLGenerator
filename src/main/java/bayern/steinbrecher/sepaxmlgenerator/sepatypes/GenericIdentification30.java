package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record GenericIdentification30(
        Exact4AlphaNumericText id,
        Max35Text issr,
        Optional<Max35Text> schmeNm) implements SepaNode, AddressType3Choice {
}
