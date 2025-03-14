
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Authorisation1Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>{@code
 * <simpleType name="Authorisation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AUTH"/>
 *     <enumeration value="FDET"/>
 *     <enumeration value="FSUM"/>
 *     <enumeration value="ILEV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Authorisation1Code")
@XmlEnum
public enum Authorisation1Code {

    AUTH,
    FDET,
    FSUM,
    ILEV;

    public String value() {
        return name();
    }

    public static Authorisation1Code fromValue(String v) {
        return valueOf(v);
    }

}
