
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NameAndAddress18 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="NameAndAddress18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max140Text"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PostalAddress27"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndAddress18", propOrder = {
    "nm",
    "adr"
})
public class NameAndAddress18 {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "Adr", required = true)
    protected PostalAddress27 adr;

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
     * Ruft den Wert der adr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress27 }
     *     
     */
    public PostalAddress27 getAdr() {
        return adr;
    }

    /**
     * Legt den Wert der adr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress27 }
     *     
     */
    public void setAdr(PostalAddress27 value) {
        this.adr = value;
    }

}
