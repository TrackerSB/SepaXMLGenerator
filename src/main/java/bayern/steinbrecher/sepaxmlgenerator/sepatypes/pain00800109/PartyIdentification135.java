
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PartyIdentification135 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PartyIdentification135"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PostalAddress24" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Party38Choice" minOccurs="0"/&gt;
 *         &lt;element name="CtryOfRes" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="CtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Contact4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification135", propOrder = {
    "nm",
    "pstlAdr",
    "id",
    "ctryOfRes",
    "ctctDtls"
})
public class PartyIdentification135 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PstlAdr")
    protected PostalAddress24 pstlAdr;
    @XmlElement(name = "Id")
    protected Party38Choice id;
    @XmlElement(name = "CtryOfRes")
    protected String ctryOfRes;
    @XmlElement(name = "CtctDtls")
    protected Contact4 ctctDtls;

    /**
     * Ruft den Wert der nm-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNm() {
        return nm;
    }

    /**
     * Legt den Wert der nm-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Ruft den Wert der pstlAdr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PostalAddress24 }
     *
     */
    public PostalAddress24 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Legt den Wert der pstlAdr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PostalAddress24 }
     *
     */
    public void setPstlAdr(PostalAddress24 value) {
        this.pstlAdr = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Party38Choice }
     *
     */
    public Party38Choice getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Party38Choice }
     *
     */
    public void setId(Party38Choice value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der ctryOfRes-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCtryOfRes() {
        return ctryOfRes;
    }

    /**
     * Legt den Wert der ctryOfRes-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCtryOfRes(String value) {
        this.ctryOfRes = value;
    }

    /**
     * Ruft den Wert der ctctDtls-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Contact4 }
     *
     */
    public Contact4 getCtctDtls() {
        return ctctDtls;
    }

    /**
     * Legt den Wert der ctctDtls-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Contact4 }
     *
     */
    public void setCtctDtls(Contact4 value) {
        this.ctctDtls = value;
    }

}
