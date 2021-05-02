
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Frequency36Choice complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Frequency36Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Frequency6Code"/&gt;
 *         &lt;element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}FrequencyPeriod1"/&gt;
 *         &lt;element name="PtInTm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}FrequencyAndMoment1"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Frequency36Choice", propOrder = {
    "tp",
    "prd",
    "ptInTm"
})
public class Frequency36Choice {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected Frequency6Code tp;
    @XmlElement(name = "Prd")
    protected FrequencyPeriod1 prd;
    @XmlElement(name = "PtInTm")
    protected FrequencyAndMoment1 ptInTm;

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
     * Ruft den Wert der prd-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link FrequencyPeriod1 }
     *
     */
    public FrequencyPeriod1 getPrd() {
        return prd;
    }

    /**
     * Legt den Wert der prd-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link FrequencyPeriod1 }
     *
     */
    public void setPrd(FrequencyPeriod1 value) {
        this.prd = value;
    }

    /**
     * Ruft den Wert der ptInTm-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link FrequencyAndMoment1 }
     *
     */
    public FrequencyAndMoment1 getPtInTm() {
        return ptInTm;
    }

    /**
     * Legt den Wert der ptInTm-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link FrequencyAndMoment1 }
     *
     */
    public void setPtInTm(FrequencyAndMoment1 value) {
        this.ptInTm = value;
    }

}
