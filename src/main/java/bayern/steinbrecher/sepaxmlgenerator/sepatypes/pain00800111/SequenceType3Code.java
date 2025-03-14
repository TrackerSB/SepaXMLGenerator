
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SequenceType3Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>{@code
 * <simpleType name="SequenceType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FRST"/>
 *     <enumeration value="RCUR"/>
 *     <enumeration value="FNAL"/>
 *     <enumeration value="OOFF"/>
 *     <enumeration value="RPRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SequenceType3Code")
@XmlEnum
public enum SequenceType3Code {

    FRST,
    RCUR,
    FNAL,
    OOFF,
    RPRE;

    public String value() {
        return name();
    }

    public static SequenceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
