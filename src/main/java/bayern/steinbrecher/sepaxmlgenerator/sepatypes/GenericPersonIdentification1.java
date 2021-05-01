package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record GenericPersonIdentification1(
        Max35Text id,
        Optional<PersonIdentificationSchemeName1Choice> schmeNm,
        Optional<Max35Text> issr) implements SepaNode{
}
