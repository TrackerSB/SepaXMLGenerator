package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Optional;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record GroupHeader83(
        Max35Text msgId,
        ISODateTime creDtTm,
        // FIXME <xs:element maxOccurs="2" minOccurs="0" name="Authstn" type="Authorisation1Choice"/>
        Authorisation1Choice authstn,
        Max15NumericText nbOfTxs,
        Optional<DecimalNumber> ctrlSum,
        PartyIdentification135 initgPty,
        Optional<BranchAndFinancialInstitutionIdentification6> fwdgAgt) implements SepaNode {
}
