
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AddressType2Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>{@code
 * <simpleType name="AddressType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADDR"/>
 *     <enumeration value="PBOX"/>
 *     <enumeration value="HOME"/>
 *     <enumeration value="BIZZ"/>
 *     <enumeration value="MLTO"/>
 *     <enumeration value="DLVY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AddressType2Code")
@XmlEnum
public enum AddressType2Code {

    ADDR,
    PBOX,
    HOME,
    BIZZ,
    MLTO,
    DLVY;

    public String value() {
        return name();
    }

    public static AddressType2Code fromValue(String v) {
        return valueOf(v);
    }

}
