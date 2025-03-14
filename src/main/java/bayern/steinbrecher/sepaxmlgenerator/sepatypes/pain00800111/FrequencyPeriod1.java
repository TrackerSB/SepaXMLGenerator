
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FrequencyPeriod1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="FrequencyPeriod1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Frequency6Code"/>
 *         <element name="CntPerPrd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}DecimalNumber"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyPeriod1", propOrder = {
    "tp",
    "cntPerPrd"
})
public class FrequencyPeriod1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency6Code tp;
    @XmlElement(name = "CntPerPrd", required = true)
    protected BigDecimal cntPerPrd;

    /**
     * Ruft den Wert der tp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Frequency6Code }
     *     
     */
    public Frequency6Code getTp() {
        return tp;
    }

    /**
     * Legt den Wert der tp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency6Code }
     *     
     */
    public void setTp(Frequency6Code value) {
        this.tp = value;
    }

    /**
     * Ruft den Wert der cntPerPrd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntPerPrd() {
        return cntPerPrd;
    }

    /**
     * Legt den Wert der cntPerPrd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCntPerPrd(BigDecimal value) {
        this.cntPerPrd = value;
    }

}
