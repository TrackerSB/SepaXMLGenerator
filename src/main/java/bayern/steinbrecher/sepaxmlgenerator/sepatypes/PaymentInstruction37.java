package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.util.Collection;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record PaymentInstruction37(
        Max35Text pmtInfId,
        PaymentMethod2Code pmtMtd,
        // <xs:element maxOccurs="1" minOccurs="0" name="ReqdAdvcTp" type="AdviceType1"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="BtchBookg" type="BatchBookingIndicator"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="NbOfTxs" type="Max15NumericText"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="CtrlSum" type="DecimalNumber"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="PmtTpInf" type="PaymentTypeInformation29"/>
        ISODate reqdColltnDt,
        PartyIdentification135 cdtr,
        CashAccount38 cdtrAcct,
        BranchAndFinancialInstitutionIdentification6 cdtrAgt,
        // <xs:element maxOccurs="1" minOccurs="0" name="CdtrAgtAcct" type="CashAccount38"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="UltmtCdtr" type="PartyIdentification135"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="ChrgBr" type="ChargeBearerType1Code"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="ChrgsAcct" type="CashAccount38"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="ChrgsAcctAgt"
        // type="BranchAndFinancialInstitutionIdentification6"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="CdtrSchmeId" type="PartyIdentification135"/>
        Collection<DirectDebitTransactionInformation23> drctDbtTxInf
) implements SepaNode {
    // FIXME Skipped optional data
}
