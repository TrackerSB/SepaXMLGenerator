package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record OtherContact1(
        Max4Text chanlTp,
        Optional<Max128Text> id) implements SepaNode {
}
