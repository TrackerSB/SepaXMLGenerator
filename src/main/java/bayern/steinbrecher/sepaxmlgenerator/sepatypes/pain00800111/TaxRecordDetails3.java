
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TaxRecordDetails3 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="TaxRecordDetails3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}TaxPeriod3" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}ActiveOrHistoricCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRecordDetails3", propOrder = {
    "prd",
    "amt"
})
public class TaxRecordDetails3 {

    @XmlElement(name = "Prd")
    protected TaxPeriod3 prd;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;

    /**
     * Ruft den Wert der prd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaxPeriod3 }
     *     
     */
    public TaxPeriod3 getPrd() {
        return prd;
    }

    /**
     * Legt den Wert der prd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPeriod3 }
     *     
     */
    public void setPrd(TaxPeriod3 value) {
        this.prd = value;
    }

    /**
     * Ruft den Wert der amt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Legt den Wert der amt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

}
