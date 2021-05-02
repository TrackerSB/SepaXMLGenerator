
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AmendmentInformationDetails13 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AmendmentInformationDetails13"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlMndtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlCdtrSchmeId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlCdtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}CashAccount38" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}CashAccount38" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlDbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}CashAccount38" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlFnlColltnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Frequency36Choice" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlRsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}MandateSetupReason1Choice" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlTrckgDays" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Exact2NumericText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendmentInformationDetails13", propOrder = {
    "orgnlMndtId",
    "orgnlCdtrSchmeId",
    "orgnlCdtrAgt",
    "orgnlCdtrAgtAcct",
    "orgnlDbtr",
    "orgnlDbtrAcct",
    "orgnlDbtrAgt",
    "orgnlDbtrAgtAcct",
    "orgnlFnlColltnDt",
    "orgnlFrqcy",
    "orgnlRsn",
    "orgnlTrckgDays"
})
public class AmendmentInformationDetails13 {

    @XmlElement(name = "OrgnlMndtId")
    protected String orgnlMndtId;
    @XmlElement(name = "OrgnlCdtrSchmeId")
    protected PartyIdentification135 orgnlCdtrSchmeId;
    @XmlElement(name = "OrgnlCdtrAgt")
    protected BranchAndFinancialInstitutionIdentification6 orgnlCdtrAgt;
    @XmlElement(name = "OrgnlCdtrAgtAcct")
    protected CashAccount38 orgnlCdtrAgtAcct;
    @XmlElement(name = "OrgnlDbtr")
    protected PartyIdentification135 orgnlDbtr;
    @XmlElement(name = "OrgnlDbtrAcct")
    protected CashAccount38 orgnlDbtrAcct;
    @XmlElement(name = "OrgnlDbtrAgt")
    protected BranchAndFinancialInstitutionIdentification6 orgnlDbtrAgt;
    @XmlElement(name = "OrgnlDbtrAgtAcct")
    protected CashAccount38 orgnlDbtrAgtAcct;
    @XmlElement(name = "OrgnlFnlColltnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orgnlFnlColltnDt;
    @XmlElement(name = "OrgnlFrqcy")
    protected Frequency36Choice orgnlFrqcy;
    @XmlElement(name = "OrgnlRsn")
    protected MandateSetupReason1Choice orgnlRsn;
    @XmlElement(name = "OrgnlTrckgDays")
    protected String orgnlTrckgDays;

    /**
     * Ruft den Wert der orgnlMndtId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrgnlMndtId() {
        return orgnlMndtId;
    }

    /**
     * Legt den Wert der orgnlMndtId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrgnlMndtId(String value) {
        this.orgnlMndtId = value;
    }

    /**
     * Ruft den Wert der orgnlCdtrSchmeId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *
     */
    public PartyIdentification135 getOrgnlCdtrSchmeId() {
        return orgnlCdtrSchmeId;
    }

    /**
     * Legt den Wert der orgnlCdtrSchmeId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *
     */
    public void setOrgnlCdtrSchmeId(PartyIdentification135 value) {
        this.orgnlCdtrSchmeId = value;
    }

    /**
     * Ruft den Wert der orgnlCdtrAgt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *
     */
    public BranchAndFinancialInstitutionIdentification6 getOrgnlCdtrAgt() {
        return orgnlCdtrAgt;
    }

    /**
     * Legt den Wert der orgnlCdtrAgt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *
     */
    public void setOrgnlCdtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.orgnlCdtrAgt = value;
    }

    /**
     * Ruft den Wert der orgnlCdtrAgtAcct-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *
     */
    public CashAccount38 getOrgnlCdtrAgtAcct() {
        return orgnlCdtrAgtAcct;
    }

    /**
     * Legt den Wert der orgnlCdtrAgtAcct-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *
     */
    public void setOrgnlCdtrAgtAcct(CashAccount38 value) {
        this.orgnlCdtrAgtAcct = value;
    }

    /**
     * Ruft den Wert der orgnlDbtr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *
     */
    public PartyIdentification135 getOrgnlDbtr() {
        return orgnlDbtr;
    }

    /**
     * Legt den Wert der orgnlDbtr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *
     */
    public void setOrgnlDbtr(PartyIdentification135 value) {
        this.orgnlDbtr = value;
    }

    /**
     * Ruft den Wert der orgnlDbtrAcct-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *
     */
    public CashAccount38 getOrgnlDbtrAcct() {
        return orgnlDbtrAcct;
    }

    /**
     * Legt den Wert der orgnlDbtrAcct-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *
     */
    public void setOrgnlDbtrAcct(CashAccount38 value) {
        this.orgnlDbtrAcct = value;
    }

    /**
     * Ruft den Wert der orgnlDbtrAgt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *
     */
    public BranchAndFinancialInstitutionIdentification6 getOrgnlDbtrAgt() {
        return orgnlDbtrAgt;
    }

    /**
     * Legt den Wert der orgnlDbtrAgt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *
     */
    public void setOrgnlDbtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.orgnlDbtrAgt = value;
    }

    /**
     * Ruft den Wert der orgnlDbtrAgtAcct-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *
     */
    public CashAccount38 getOrgnlDbtrAgtAcct() {
        return orgnlDbtrAgtAcct;
    }

    /**
     * Legt den Wert der orgnlDbtrAgtAcct-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *
     */
    public void setOrgnlDbtrAgtAcct(CashAccount38 value) {
        this.orgnlDbtrAgtAcct = value;
    }

    /**
     * Ruft den Wert der orgnlFnlColltnDt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getOrgnlFnlColltnDt() {
        return orgnlFnlColltnDt;
    }

    /**
     * Legt den Wert der orgnlFnlColltnDt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setOrgnlFnlColltnDt(XMLGregorianCalendar value) {
        this.orgnlFnlColltnDt = value;
    }

    /**
     * Ruft den Wert der orgnlFrqcy-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Frequency36Choice }
     *
     */
    public Frequency36Choice getOrgnlFrqcy() {
        return orgnlFrqcy;
    }

    /**
     * Legt den Wert der orgnlFrqcy-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Frequency36Choice }
     *
     */
    public void setOrgnlFrqcy(Frequency36Choice value) {
        this.orgnlFrqcy = value;
    }

    /**
     * Ruft den Wert der orgnlRsn-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link MandateSetupReason1Choice }
     *
     */
    public MandateSetupReason1Choice getOrgnlRsn() {
        return orgnlRsn;
    }

    /**
     * Legt den Wert der orgnlRsn-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link MandateSetupReason1Choice }
     *
     */
    public void setOrgnlRsn(MandateSetupReason1Choice value) {
        this.orgnlRsn = value;
    }

    /**
     * Ruft den Wert der orgnlTrckgDays-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrgnlTrckgDays() {
        return orgnlTrckgDays;
    }

    /**
     * Legt den Wert der orgnlTrckgDays-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrgnlTrckgDays(String value) {
        this.orgnlTrckgDays = value;
    }

}
