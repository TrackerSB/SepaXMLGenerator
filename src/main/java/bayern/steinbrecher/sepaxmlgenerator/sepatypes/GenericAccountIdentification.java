package bayern.steinbrecher.sepaxmlgenerator.sepatypes;

import io.soabase.recordbuilder.core.RecordBuilder;

/**
 * @author Stefan Huber
 * @since 0.1
 */
@RecordBuilder
public record GenericAccountIdentification(
        Max34Text id
        // FIXME Skipped optional data
        // <xs:element maxOccurs="1" minOccurs="0" name="SchmeNm" type="AccountSchemeName1Choice"/>
        // <xs:element maxOccurs="1" minOccurs="0" name="Issr" type="Max35Text"/>
) implements SepaNode, AccountIdentification4Choice {
}
