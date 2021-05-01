package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record Contact4(
        Optional<NamePrefix2Code> nmPrfx,
        Optional<Max140Text> nm,
        Optional<PhoneNumber> phneNb,
        Optional<PhoneNumber> mobNb,
        Optional<PhoneNumber> faxNb,
        Optional<Max2048Text> emailAdr,
        Optional<Max35Text> emailPurp,
        Optional<Max35Text> jobTitl,
        Optional<Max35Text> rspnsblty,
        Optional<Max70Text> dept,
        Collection<OtherContact1> othr,
        Optional<PreferredContactMethod1Code> prefrdMtd) implements SepaNode{
}
