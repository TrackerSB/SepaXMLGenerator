
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Party38Choice complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Party38Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}OrganisationIdentification29"/&gt;
 *         &lt;element name="PrvtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PersonIdentification13"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party38Choice", propOrder = {
    "orgId",
    "prvtId"
})
public class Party38Choice {

    @XmlElement(name = "OrgId")
    protected OrganisationIdentification29 orgId;
    @XmlElement(name = "PrvtId")
    protected PersonIdentification13 prvtId;

    /**
     * Ruft den Wert der orgId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link OrganisationIdentification29 }
     *
     */
    public OrganisationIdentification29 getOrgId() {
        return orgId;
    }

    /**
     * Legt den Wert der orgId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification29 }
     *
     */
    public void setOrgId(OrganisationIdentification29 value) {
        this.orgId = value;
    }

    /**
     * Ruft den Wert der prvtId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PersonIdentification13 }
     *
     */
    public PersonIdentification13 getPrvtId() {
        return prvtId;
    }

    /**
     * Legt den Wert der prvtId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PersonIdentification13 }
     *
     */
    public void setPrvtId(PersonIdentification13 value) {
        this.prvtId = value;
    }

}
