
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PaymentIdentification6 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentIdentification6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="EndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text"/&gt;
 *         &lt;element name="UETR" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}UUIDv4Identifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentIdentification6", propOrder = {
    "instrId",
    "endToEndId",
    "uetr"
})
public class PaymentIdentification6 {

    @XmlElement(name = "InstrId")
    protected String instrId;
    @XmlElement(name = "EndToEndId", required = true)
    protected String endToEndId;
    @XmlElement(name = "UETR")
    protected String uetr;

    /**
     * Ruft den Wert der instrId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Legt den Wert der instrId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * Ruft den Wert der endToEndId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Legt den Wert der endToEndId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEndToEndId(String value) {
        this.endToEndId = value;
    }

    /**
     * Ruft den Wert der uetr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUETR() {
        return uetr;
    }

    /**
     * Legt den Wert der uetr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUETR(String value) {
        this.uetr = value;
    }

}
