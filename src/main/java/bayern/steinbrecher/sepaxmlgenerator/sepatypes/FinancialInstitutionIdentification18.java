package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record FinancialInstitutionIdentification18() implements SepaNode {
    // FIXME Skipped optional data
    // <xs:element maxOccurs="1" minOccurs="0" name="BICFI" type="BICFIDec2014Identifier"/>
    // <xs:element maxOccurs="1" minOccurs="0" name="ClrSysMmbId" type="ClearingSystemMemberIdentification2"/>
    // <xs:element maxOccurs="1" minOccurs="0" name="LEI" type="LEIIdentifier"/>
    // <xs:element maxOccurs="1" minOccurs="0" name="Nm" type="Max140Text"/>
    // <xs:element maxOccurs="1" minOccurs="0" name="PstlAdr" type="PostalAddress24"/>
    // <xs:element maxOccurs="1" minOccurs="0" name="Othr" type="GenericFinancialIdentification1"/>
}
