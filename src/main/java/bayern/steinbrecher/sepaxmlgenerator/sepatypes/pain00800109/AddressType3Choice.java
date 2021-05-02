
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r AddressType3Choice complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AddressType3Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}AddressType2Code"/&gt;
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}GenericIdentification30"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType3Choice", propOrder = {
    "cd",
    "prtry"
})
public class AddressType3Choice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected AddressType2Code cd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification30 prtry;

    /**
     * Ruft den Wert der cd-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AddressType2Code }
     *
     */
    public AddressType2Code getCd() {
        return cd;
    }

    /**
     * Legt den Wert der cd-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AddressType2Code }
     *
     */
    public void setCd(AddressType2Code value) {
        this.cd = value;
    }

    /**
     * Ruft den Wert der prtry-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *
     */
    public GenericIdentification30 getPrtry() {
        return prtry;
    }

    /**
     * Legt den Wert der prtry-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *
     */
    public void setPrtry(GenericIdentification30 value) {
        this.prtry = value;
    }

}
