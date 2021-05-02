
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AdviceType1Code.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AdviceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADWD"/&gt;
 *     &lt;enumeration value="ADND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "AdviceType1Code")
@XmlEnum
public enum AdviceType1Code {

    ADWD,
    ADND;

    public String value() {
        return name();
    }

    public static AdviceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
