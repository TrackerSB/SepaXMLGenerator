
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ClearingSystemIdentification2Choice complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ClearingSystemIdentification2Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ExternalClearingSystemIdentification1Code"/&gt;
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingSystemIdentification2Choice", propOrder = {
    "cd",
    "prtry"
})
public class ClearingSystemIdentification2Choice {

    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Ruft den Wert der cd-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCd() {
        return cd;
    }

    /**
     * Legt den Wert der cd-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Ruft den Wert der prtry-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Legt den Wert der prtry-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrtry(String value) {
        this.prtry = value;
    }

}