package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record DateAndPlaceOfBirth1(
        ISODate birthDt,
        Optional<Max35Text> prvcOfBirth,
        Max35Text cityOfBrith,
        CountryCode ctryOfBirth) implements SepaNode {
}
