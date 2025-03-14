
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RegulatoryReportingType1Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>{@code
 * <simpleType name="RegulatoryReportingType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRED"/>
 *     <enumeration value="DEBT"/>
 *     <enumeration value="BOTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RegulatoryReportingType1Code")
@XmlEnum
public enum RegulatoryReportingType1Code {

    CRED,
    DEBT,
    BOTH;

    public String value() {
        return name();
    }

    public static RegulatoryReportingType1Code fromValue(String v) {
        return valueOf(v);
    }

}
