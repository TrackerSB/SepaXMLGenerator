package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record PostalAddress24(
        Optional<AddressType3Choice> adrTp,
        Optional<Max70Text> dept,
        Optional<Max70Text> subDept,
        Optional<Max70Text> strtNm,
        Optional<Max16Text> bldgNb,
        Optional<Max35Text> bldgNm,
        Optional<Max70Text> flr,
        Optional<Max16Text> pstBx,
        Optional<Max70Text> room,
        Optional<Max16Text> pstCd,
        Optional<Max35Text> twnNm,
        Optional<Max35Text> twnLctnNm,
        Optional<Max35Text> dstrctNm,
        Optional<Max35Text> ctrySubDvsn,
        Optional<CountryCode> ctry,
        Collection<Max70Text> adrLine) implements SepaNode {
}
