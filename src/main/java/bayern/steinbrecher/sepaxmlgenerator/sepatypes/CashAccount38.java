package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record CashAccount38(
        AccountIdentification4Choice id
        // FIXME Skipped optional data
        // <xs:element maxOccurs="1" minOccurs="0" name="Tp" type="CashAccountType2Choice"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="Ccy" type="ActiveOrHistoricCurrencyCode"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="Nm" type="Max70Text"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="Prxy" type="ProxyAccountIdentification1"/>
) implements SepaNode {
}
