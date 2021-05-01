package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record OrganisationIdentification29(
        Optional<AnyBICDec2014Identifier> anyBIC,
        Optional<LEIIdentifier> lei,
        Collection<GenericOrganisationIdentification1> othr) implements SepaNode, Party38Choice{
}
