package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

public record PaymentIdentification6(
        // FIXME Skipped optional data
        // <xs:element maxOccurs="1" minOccurs="0" name="InstrId" type="Max35Text"/>
        Max35Text endToEndId
        // <xs:element maxOccurs="1" minOccurs="0" name="UETR" type="UUIDv4Identifier"/>
) implements SepaNode{
}
