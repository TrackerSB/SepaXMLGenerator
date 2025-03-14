
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GenericPersonIdentification2 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="GenericPersonIdentification2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max256Text"/>
 *         <element name="SchmeNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PersonIdentificationSchemeName1Choice" minOccurs="0"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPersonIdentification2", propOrder = {
    "id",
    "schmeNm",
    "issr"
})
public class GenericPersonIdentification2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SchmeNm")
    protected PersonIdentificationSchemeName1Choice schmeNm;
    @XmlElement(name = "Issr")
    protected String issr;

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
     * Ruft den Wert der schmeNm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationSchemeName1Choice }
     *     
     */
    public PersonIdentificationSchemeName1Choice getSchmeNm() {
        return schmeNm;
    }

    /**
     * Legt den Wert der schmeNm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationSchemeName1Choice }
     *     
     */
    public void setSchmeNm(PersonIdentificationSchemeName1Choice value) {
        this.schmeNm = value;
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

}
