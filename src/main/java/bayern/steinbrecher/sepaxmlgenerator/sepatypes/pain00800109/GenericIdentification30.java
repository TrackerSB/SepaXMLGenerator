
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GenericIdentification30 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GenericIdentification30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Exact4AlphaNumericText"/&gt;
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text"/&gt;
 *         &lt;element name="SchmeNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericIdentification30", propOrder = {
    "id",
    "issr",
    "schmeNm"
})
public class GenericIdentification30 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Issr", required = true)
    protected String issr;
    @XmlElement(name = "SchmeNm")
    protected String schmeNm;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der issr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Legt den Wert der issr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIssr(String value) {
        this.issr = value;
    }

    /**
     * Ruft den Wert der schmeNm-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSchmeNm() {
        return schmeNm;
    }

    /**
     * Legt den Wert der schmeNm-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSchmeNm(String value) {
        this.schmeNm = value;
    }

}
