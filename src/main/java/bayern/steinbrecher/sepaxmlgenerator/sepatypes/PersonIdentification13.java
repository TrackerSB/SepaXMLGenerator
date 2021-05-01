package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record PersonIdentification13(
        Optional<DateAndPlaceOfBirth1> dtAndPlcOfBirth,
        Collection<GenericPersonIdentification1> othr) implements SepaNode, Party38Choice {
}
