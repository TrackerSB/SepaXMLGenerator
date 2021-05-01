package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.time.LocalDate;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record ISODate(LocalDate date) {
}
