
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Contact13 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Contact13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NmPrfx" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}NamePrefix2Code" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max140Text" minOccurs="0"/>
 *         <element name="PhneNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PhoneNumber" minOccurs="0"/>
 *         <element name="MobNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PhoneNumber" minOccurs="0"/>
 *         <element name="FaxNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PhoneNumber" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max2048Text" minOccurs="0"/>
 *         <element name="EmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max256Text" minOccurs="0"/>
 *         <element name="EmailPurp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max35Text" minOccurs="0"/>
 *         <element name="JobTitl" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max35Text" minOccurs="0"/>
 *         <element name="Rspnsblty" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max35Text" minOccurs="0"/>
 *         <element name="Dept" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max70Text" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}OtherContact1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrefrdMtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PreferredContactMethod2Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact13", propOrder = {
    "nmPrfx",
    "nm",
    "phneNb",
    "mobNb",
    "faxNb",
    "urlAdr",
    "emailAdr",
    "emailPurp",
    "jobTitl",
    "rspnsblty",
    "dept",
    "othr",
    "prefrdMtd"
})
public class Contact13 {

    @XmlElement(name = "NmPrfx")
    @XmlSchemaType(name = "string")
    protected NamePrefix2Code nmPrfx;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "MobNb")
    protected String mobNb;
    @XmlElement(name = "FaxNb")
    protected String faxNb;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "EmailPurp")
    protected String emailPurp;
    @XmlElement(name = "JobTitl")
    protected String jobTitl;
    @XmlElement(name = "Rspnsblty")
    protected String rspnsblty;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "Othr")
    protected List<OtherContact1> othr;
    @XmlElement(name = "PrefrdMtd")
    @XmlSchemaType(name = "string")
    protected PreferredContactMethod2Code prefrdMtd;

    /**
     * Ruft den Wert der nmPrfx-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix2Code }
     *     
     */
    public NamePrefix2Code getNmPrfx() {
        return nmPrfx;
    }

    /**
     * Legt den Wert der nmPrfx-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix2Code }
     *     
     */
    public void setNmPrfx(NamePrefix2Code value) {
        this.nmPrfx = value;
    }

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
     * Ruft den Wert der phneNb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Legt den Wert der phneNb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhneNb(String value) {
        this.phneNb = value;
    }

    /**
     * Ruft den Wert der mobNb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobNb() {
        return mobNb;
    }

    /**
     * Legt den Wert der mobNb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobNb(String value) {
        this.mobNb = value;
    }

    /**
     * Ruft den Wert der faxNb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNb() {
        return faxNb;
    }

    /**
     * Legt den Wert der faxNb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNb(String value) {
        this.faxNb = value;
    }

    /**
     * Ruft den Wert der urlAdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Legt den Wert der urlAdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
    }

    /**
     * Ruft den Wert der emailAdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAdr() {
        return emailAdr;
    }

    /**
     * Legt den Wert der emailAdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAdr(String value) {
        this.emailAdr = value;
    }

    /**
     * Ruft den Wert der emailPurp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPurp() {
        return emailPurp;
    }

    /**
     * Legt den Wert der emailPurp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPurp(String value) {
        this.emailPurp = value;
    }

    /**
     * Ruft den Wert der jobTitl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitl() {
        return jobTitl;
    }

    /**
     * Legt den Wert der jobTitl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitl(String value) {
        this.jobTitl = value;
    }

    /**
     * Ruft den Wert der rspnsblty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnsblty() {
        return rspnsblty;
    }

    /**
     * Legt den Wert der rspnsblty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspnsblty(String value) {
        this.rspnsblty = value;
    }

    /**
     * Ruft den Wert der dept-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Legt den Wert der dept-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherContact1 }
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<OtherContact1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

    /**
     * Ruft den Wert der prefrdMtd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PreferredContactMethod2Code }
     *     
     */
    public PreferredContactMethod2Code getPrefrdMtd() {
        return prefrdMtd;
    }

    /**
     * Legt den Wert der prefrdMtd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredContactMethod2Code }
     *     
     */
    public void setPrefrdMtd(PreferredContactMethod2Code value) {
        this.prefrdMtd = value;
    }

}
