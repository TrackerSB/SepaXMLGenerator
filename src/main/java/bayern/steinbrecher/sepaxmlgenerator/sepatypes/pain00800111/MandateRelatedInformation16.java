
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MandateRelatedInformation16 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="MandateRelatedInformation16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MndtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max35Text" minOccurs="0"/>
 *         <element name="DtOfSgntr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}ISODate" minOccurs="0"/>
 *         <element name="AmdmntInd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AmdmntInfDtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}AmendmentInformationDetails15" minOccurs="0"/>
 *         <element name="ElctrncSgntr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max1025Text" minOccurs="0"/>
 *         <element name="FrstColltnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}ISODate" minOccurs="0"/>
 *         <element name="FnlColltnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}ISODate" minOccurs="0"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Frequency36Choice" minOccurs="0"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}MandateSetupReason1Choice" minOccurs="0"/>
 *         <element name="TrckgDays" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Exact2NumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateRelatedInformation16", propOrder = {
    "mndtId",
    "dtOfSgntr",
    "amdmntInd",
    "amdmntInfDtls",
    "elctrncSgntr",
    "frstColltnDt",
    "fnlColltnDt",
    "frqcy",
    "rsn",
    "trckgDays"
})
public class MandateRelatedInformation16 {

    @XmlElement(name = "MndtId")
    protected String mndtId;
    @XmlElement(name = "DtOfSgntr")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfSgntr;
    @XmlElement(name = "AmdmntInd")
    protected Boolean amdmntInd;
    @XmlElement(name = "AmdmntInfDtls")
    protected AmendmentInformationDetails15 amdmntInfDtls;
    @XmlElement(name = "ElctrncSgntr")
    protected String elctrncSgntr;
    @XmlElement(name = "FrstColltnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frstColltnDt;
    @XmlElement(name = "FnlColltnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fnlColltnDt;
    @XmlElement(name = "Frqcy")
    protected Frequency36Choice frqcy;
    @XmlElement(name = "Rsn")
    protected MandateSetupReason1Choice rsn;
    @XmlElement(name = "TrckgDays")
    protected String trckgDays;

    /**
     * Ruft den Wert der mndtId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Legt den Wert der mndtId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMndtId(String value) {
        this.mndtId = value;
    }

    /**
     * Ruft den Wert der dtOfSgntr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfSgntr() {
        return dtOfSgntr;
    }

    /**
     * Legt den Wert der dtOfSgntr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfSgntr(XMLGregorianCalendar value) {
        this.dtOfSgntr = value;
    }

    /**
     * Ruft den Wert der amdmntInd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAmdmntInd() {
        return amdmntInd;
    }

    /**
     * Legt den Wert der amdmntInd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmdmntInd(Boolean value) {
        this.amdmntInd = value;
    }

    /**
     * Ruft den Wert der amdmntInfDtls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentInformationDetails15 }
     *     
     */
    public AmendmentInformationDetails15 getAmdmntInfDtls() {
        return amdmntInfDtls;
    }

    /**
     * Legt den Wert der amdmntInfDtls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentInformationDetails15 }
     *     
     */
    public void setAmdmntInfDtls(AmendmentInformationDetails15 value) {
        this.amdmntInfDtls = value;
    }

    /**
     * Ruft den Wert der elctrncSgntr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElctrncSgntr() {
        return elctrncSgntr;
    }

    /**
     * Legt den Wert der elctrncSgntr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElctrncSgntr(String value) {
        this.elctrncSgntr = value;
    }

    /**
     * Ruft den Wert der frstColltnDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrstColltnDt() {
        return frstColltnDt;
    }

    /**
     * Legt den Wert der frstColltnDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrstColltnDt(XMLGregorianCalendar value) {
        this.frstColltnDt = value;
    }

    /**
     * Ruft den Wert der fnlColltnDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFnlColltnDt() {
        return fnlColltnDt;
    }

    /**
     * Legt den Wert der fnlColltnDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFnlColltnDt(XMLGregorianCalendar value) {
        this.fnlColltnDt = value;
    }

    /**
     * Ruft den Wert der frqcy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Frequency36Choice }
     *     
     */
    public Frequency36Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Legt den Wert der frqcy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency36Choice }
     *     
     */
    public void setFrqcy(Frequency36Choice value) {
        this.frqcy = value;
    }

    /**
     * Ruft den Wert der rsn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public MandateSetupReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Legt den Wert der rsn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public void setRsn(MandateSetupReason1Choice value) {
        this.rsn = value;
    }

    /**
     * Ruft den Wert der trckgDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrckgDays() {
        return trckgDays;
    }

    /**
     * Legt den Wert der trckgDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrckgDays(String value) {
        this.trckgDays = value;
    }

}
