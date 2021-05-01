package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record DirectDebitTransactionInformation23(
        // FIXME Skipped optional data
        PaymentIdentification6 pmtId,
        // <xs:element maxOccurs="1" minOccurs="0" name="PmtTpInf" type="PaymentTypeInformation29"/>
        ActiveOrHistoricCurrencyAndAmount instdAmt,
        // <xs:element maxOccurs="1" minOccurs="0" name="ChrgBr" type="ChargeBearerType1Code"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="DrctDbtTx" type="DirectDebitTransaction10"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="UltmtCdtr" type="PartyIdentification135"/>
        BranchAndFinancialInstitutionIdentification6 dbtrAgt,
        // <xs:element maxOccurs="1" minOccurs="0" name="DbtrAgtAcct" type="CashAccount38"/>
        PartyIdentification135 dbtr,
        CashAccount38 dbtrAcct
        // <xs:element maxOccurs="1" minOccurs="0" name="UltmtDbtr" type="PartyIdentification135"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="InstrForCdtrAgt" type="Max140Text"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="Purp" type="Purpose2Choice"/>
        // <xs:element maxOccurs="10" minOccurs="0" name="RgltryRptg" type="RegulatoryReporting3"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="Tax" type="TaxInformation8"/>
        // <xs:element maxOccurs="10" minOccurs="0" name="RltdRmtInf" type="RemittanceLocation7"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="RmtInf" type="RemittanceInformation16"/>
        // <xs:element maxOccurs="unbounded" minOccurs="0" name="SplmtryData" type="SupplementaryData1"/>
) implements SepaNode{
}
