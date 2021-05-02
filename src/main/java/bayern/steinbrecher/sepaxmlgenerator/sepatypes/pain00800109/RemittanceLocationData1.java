
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RemittanceLocationData1 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RemittanceLocationData1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}RemittanceLocationMethod2Code"/&gt;
 *         &lt;element name="ElctrncAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max2048Text" minOccurs="0"/&gt;
 *         &lt;element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}NameAndAddress16" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocationData1", propOrder = {
    "mtd",
    "elctrncAdr",
    "pstlAdr"
})
public class RemittanceLocationData1 {

    @XmlElement(name = "Mtd", required = true)
    @XmlSchemaType(name = "string")
    protected RemittanceLocationMethod2Code mtd;
    @XmlElement(name = "ElctrncAdr")
    protected String elctrncAdr;
    @XmlElement(name = "PstlAdr")
    protected NameAndAddress16 pstlAdr;

    /**
     * Ruft den Wert der mtd-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link RemittanceLocationMethod2Code }
     *
     */
    public RemittanceLocationMethod2Code getMtd() {
        return mtd;
    }

    /**
     * Legt den Wert der mtd-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link RemittanceLocationMethod2Code }
     *
     */
    public void setMtd(RemittanceLocationMethod2Code value) {
        this.mtd = value;
    }

    /**
     * Ruft den Wert der elctrncAdr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getElctrncAdr() {
        return elctrncAdr;
    }

    /**
     * Legt den Wert der elctrncAdr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setElctrncAdr(String value) {
        this.elctrncAdr = value;
    }

    /**
     * Ruft den Wert der pstlAdr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link NameAndAddress16 }
     *
     */
    public NameAndAddress16 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Legt den Wert der pstlAdr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link NameAndAddress16 }
     *
     */
    public void setPstlAdr(NameAndAddress16 value) {
        this.pstlAdr = value;
    }

}
