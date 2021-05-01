package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.time.LocalDateTime;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record ISODateTime(LocalDateTime dateTime) implements SepaNode {
}
