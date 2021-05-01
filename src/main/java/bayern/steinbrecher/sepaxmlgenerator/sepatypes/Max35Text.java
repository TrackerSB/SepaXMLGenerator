package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record Max35Text(String text) implements SepaNode, OrganisationIdentificationSchemeName1Choice,
        PersonIdentificationSchemeName1Choice {
}
