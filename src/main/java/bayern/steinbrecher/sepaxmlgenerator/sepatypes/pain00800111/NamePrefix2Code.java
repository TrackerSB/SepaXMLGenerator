
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NamePrefix2Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>{@code
 * <simpleType name="NamePrefix2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DOCT"/>
 *     <enumeration value="MADM"/>
 *     <enumeration value="MISS"/>
 *     <enumeration value="MIST"/>
 *     <enumeration value="MIKS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NamePrefix2Code")
@XmlEnum
public enum NamePrefix2Code {

    DOCT,
    MADM,
    MISS,
    MIST,
    MIKS;

    public String value() {
        return name();
    }

    public static NamePrefix2Code fromValue(String v) {
        return valueOf(v);
    }

}
