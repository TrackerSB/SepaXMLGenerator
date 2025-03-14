
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RemittanceLocationMethod2Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>{@code
 * <simpleType name="RemittanceLocationMethod2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FAXI"/>
 *     <enumeration value="EDIC"/>
 *     <enumeration value="URID"/>
 *     <enumeration value="EMAL"/>
 *     <enumeration value="POST"/>
 *     <enumeration value="SMSM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RemittanceLocationMethod2Code")
@XmlEnum
public enum RemittanceLocationMethod2Code {

    FAXI,
    EDIC,
    URID,
    EMAL,
    POST,
    SMSM;

    public String value() {
        return name();
    }

    public static RemittanceLocationMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
