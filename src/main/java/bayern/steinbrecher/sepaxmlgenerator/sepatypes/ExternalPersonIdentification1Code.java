package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record ExternalPersonIdentification1Code(String text)
        implements SepaNode, PersonIdentificationSchemeName1Choice {
}
