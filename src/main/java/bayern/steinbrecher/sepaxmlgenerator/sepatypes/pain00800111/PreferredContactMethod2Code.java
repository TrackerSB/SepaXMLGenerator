
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PreferredContactMethod2Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>{@code
 * <simpleType name="PreferredContactMethod2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MAIL"/>
 *     <enumeration value="FAXX"/>
 *     <enumeration value="LETT"/>
 *     <enumeration value="CELL"/>
 *     <enumeration value="ONLI"/>
 *     <enumeration value="PHON"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PreferredContactMethod2Code")
@XmlEnum
public enum PreferredContactMethod2Code {

    MAIL,
    FAXX,
    LETT,
    CELL,
    ONLI,
    PHON;

    public String value() {
        return name();
    }

    public static PreferredContactMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
