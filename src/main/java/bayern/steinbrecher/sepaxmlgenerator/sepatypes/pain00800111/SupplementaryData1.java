
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SupplementaryData1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="SupplementaryData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PlcAndNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max350Text" minOccurs="0"/>
 *         <element name="Envlp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}SupplementaryDataEnvelope1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryData1", propOrder = {
    "plcAndNm",
    "envlp"
})
public class SupplementaryData1 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "Envlp", required = true)
    protected SupplementaryDataEnvelope1 envlp;

    /**
     * Ruft den Wert der plcAndNm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Legt den Wert der plcAndNm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlcAndNm(String value) {
        this.plcAndNm = value;
    }

    /**
     * Ruft den Wert der envlp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryDataEnvelope1 }
     *     
     */
    public SupplementaryDataEnvelope1 getEnvlp() {
        return envlp;
    }

    /**
     * Legt den Wert der envlp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryDataEnvelope1 }
     *     
     */
    public void setEnvlp(SupplementaryDataEnvelope1 value) {
        this.envlp = value;
    }

}
