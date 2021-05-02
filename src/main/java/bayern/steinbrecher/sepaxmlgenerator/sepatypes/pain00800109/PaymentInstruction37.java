
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PaymentInstruction37 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PaymentInstruction37"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text"/&gt;
 *         &lt;element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PaymentMethod2Code"/&gt;
 *         &lt;element name="ReqdAdvcTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}AdviceType1" minOccurs="0"/&gt;
 *         &lt;element name="BtchBookg" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}BatchBookingIndicator" minOccurs="0"/&gt;
 *         &lt;element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max15NumericText" minOccurs="0"/&gt;
 *         &lt;element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}DecimalNumber" minOccurs="0"/&gt;
 *         &lt;element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PaymentTypeInformation29" minOccurs="0"/&gt;
 *         &lt;element name="ReqdColltnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ISODate"/&gt;
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PartyIdentification135"/&gt;
 *         &lt;element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}CashAccount38"/&gt;
 *         &lt;element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}BranchAndFinancialInstitutionIdentification6"/&gt;
 *         &lt;element name="CdtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}CashAccount38" minOccurs="0"/&gt;
 *         &lt;element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ChargeBearerType1Code" minOccurs="0"/&gt;
 *         &lt;element name="ChrgsAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}CashAccount38" minOccurs="0"/&gt;
 *         &lt;element name="ChrgsAcctAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/&gt;
 *         &lt;element name="CdtrSchmeId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="DrctDbtTxInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}DirectDebitTransactionInformation23" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstruction37", propOrder = {
    "pmtInfId",
    "pmtMtd",
    "reqdAdvcTp",
    "btchBookg",
    "nbOfTxs",
    "ctrlSum",
    "pmtTpInf",
    "reqdColltnDt",
    "cdtr",
    "cdtrAcct",
    "cdtrAgt",
    "cdtrAgtAcct",
    "ultmtCdtr",
    "chrgBr",
    "chrgsAcct",
    "chrgsAcctAgt",
    "cdtrSchmeId",
    "drctDbtTxInf"
})
public class PaymentInstruction37 {

    @XmlElement(name = "PmtInfId", required = true)
    protected String pmtInfId;
    @XmlElement(name = "PmtMtd", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethod2Code pmtMtd;
    @XmlElement(name = "ReqdAdvcTp")
    protected AdviceType1 reqdAdvcTp;
    @XmlElement(name = "BtchBookg")
    protected Boolean btchBookg;
    @XmlElement(name = "NbOfTxs")
    protected String nbOfTxs;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation29 pmtTpInf;
    @XmlElement(name = "ReqdColltnDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdColltnDt;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification135 cdtr;
    @XmlElement(name = "CdtrAcct", required = true)
    protected CashAccount38 cdtrAcct;
    @XmlElement(name = "CdtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    protected CashAccount38 cdtrAgtAcct;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification135 ultmtCdtr;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccount38 chrgsAcct;
    @XmlElement(name = "ChrgsAcctAgt")
    protected BranchAndFinancialInstitutionIdentification6 chrgsAcctAgt;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentification135 cdtrSchmeId;
    @XmlElement(name = "DrctDbtTxInf", required = true)
    protected List<DirectDebitTransactionInformation23> drctDbtTxInf;

    /**
     * Ruft den Wert der pmtInfId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPmtInfId() {
        return pmtInfId;
    }

    /**
     * Legt den Wert der pmtInfId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPmtInfId(String value) {
        this.pmtInfId = value;
    }

    /**
     * Ruft den Wert der pmtMtd-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentMethod2Code }
     *
     */
    public PaymentMethod2Code getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Legt den Wert der pmtMtd-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentMethod2Code }
     *
     */
    public void setPmtMtd(PaymentMethod2Code value) {
        this.pmtMtd = value;
    }

    /**
     * Ruft den Wert der reqdAdvcTp-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AdviceType1 }
     *
     */
    public AdviceType1 getReqdAdvcTp() {
        return reqdAdvcTp;
    }

    /**
     * Legt den Wert der reqdAdvcTp-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AdviceType1 }
     *
     */
    public void setReqdAdvcTp(AdviceType1 value) {
        this.reqdAdvcTp = value;
    }

    /**
     * Ruft den Wert der btchBookg-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isBtchBookg() {
        return btchBookg;
    }

    /**
     * Legt den Wert der btchBookg-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setBtchBookg(Boolean value) {
        this.btchBookg = value;
    }

    /**
     * Ruft den Wert der nbOfTxs-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Legt den Wert der nbOfTxs-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNbOfTxs(String value) {
        this.nbOfTxs = value;
    }

    /**
     * Ruft den Wert der ctrlSum-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Legt den Wert der ctrlSum-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
    }

    /**
     * Ruft den Wert der pmtTpInf-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation29 }
     *
     */
    public PaymentTypeInformation29 getPmtTpInf() {
        return pmtTpInf;
    }

    /**
     * Legt den Wert der pmtTpInf-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation29 }
     *
     */
    public void setPmtTpInf(PaymentTypeInformation29 value) {
        this.pmtTpInf = value;
    }

    /**
     * Ruft den Wert der reqdColltnDt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getReqdColltnDt() {
        return reqdColltnDt;
    }

    /**
     * Legt den Wert der reqdColltnDt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setReqdColltnDt(XMLGregorianCalendar value) {
        this.reqdColltnDt = value;
    }

    /**
     * Ruft den Wert der cdtr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *
     */
    public PartyIdentification135 getCdtr() {
        return cdtr;
    }

    /**
     * Legt den Wert der cdtr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *
     */
    public void setCdtr(PartyIdentification135 value) {
        this.cdtr = value;
    }

    /**
     * Ruft den Wert der cdtrAcct-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *
     */
    public CashAccount38 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Legt den Wert der cdtrAcct-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *
     */
    public void setCdtrAcct(CashAccount38 value) {
        this.cdtrAcct = value;
    }

    /**
     * Ruft den Wert der cdtrAgt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Legt den Wert der cdtrAgt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *
     */
    public void setCdtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtrAgt = value;
    }

    /**
     * Ruft den Wert der cdtrAgtAcct-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *
     */
    public CashAccount38 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * Legt den Wert der cdtrAgtAcct-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *
     */
    public void setCdtrAgtAcct(CashAccount38 value) {
        this.cdtrAgtAcct = value;
    }

    /**
     * Ruft den Wert der ultmtCdtr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *
     */
    public PartyIdentification135 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Legt den Wert der ultmtCdtr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *
     */
    public void setUltmtCdtr(PartyIdentification135 value) {
        this.ultmtCdtr = value;
    }

    /**
     * Ruft den Wert der chrgBr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Legt den Wert der chrgBr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *
     */
    public void setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
    }

    /**
     * Ruft den Wert der chrgsAcct-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *
     */
    public CashAccount38 getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Legt den Wert der chrgsAcct-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *
     */
    public void setChrgsAcct(CashAccount38 value) {
        this.chrgsAcct = value;
    }

    /**
     * Ruft den Wert der chrgsAcctAgt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *
     */
    public BranchAndFinancialInstitutionIdentification6 getChrgsAcctAgt() {
        return chrgsAcctAgt;
    }

    /**
     * Legt den Wert der chrgsAcctAgt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *
     */
    public void setChrgsAcctAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.chrgsAcctAgt = value;
    }

    /**
     * Ruft den Wert der cdtrSchmeId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *
     */
    public PartyIdentification135 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Legt den Wert der cdtrSchmeId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *
     */
    public void setCdtrSchmeId(PartyIdentification135 value) {
        this.cdtrSchmeId = value;
    }

    /**
     * Gets the value of the drctDbtTxInf property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the drctDbtTxInf property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrctDbtTxInf().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectDebitTransactionInformation23 }
     *
     *
     */
    public List<DirectDebitTransactionInformation23> getDrctDbtTxInf() {
        if (drctDbtTxInf == null) {
            drctDbtTxInf = new ArrayList<DirectDebitTransactionInformation23>();
        }
        return this.drctDbtTxInf;
    }

}
