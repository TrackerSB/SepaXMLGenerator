
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r DirectDebitTransactionInformation23 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DirectDebitTransactionInformation23"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PaymentIdentification6"/&gt;
 *         &lt;element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PaymentTypeInformation29" minOccurs="0"/&gt;
 *         &lt;element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ActiveOrHistoricCurrencyAndAmount"/&gt;
 *         &lt;element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ChargeBearerType1Code" minOccurs="0"/&gt;
 *         &lt;element name="DrctDbtTx" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}DirectDebitTransaction10" minOccurs="0"/&gt;
 *         &lt;element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}BranchAndFinancialInstitutionIdentification6"/&gt;
 *         &lt;element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}CashAccount38" minOccurs="0"/&gt;
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PartyIdentification135"/&gt;
 *         &lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}CashAccount38"/&gt;
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="InstrForCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Purpose2Choice" minOccurs="0"/&gt;
 *         &lt;element name="RgltryRptg" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}RegulatoryReporting3" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}TaxInformation8" minOccurs="0"/&gt;
 *         &lt;element name="RltdRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}RemittanceLocation7" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}RemittanceInformation16" minOccurs="0"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitTransactionInformation23", propOrder = {
    "pmtId",
    "pmtTpInf",
    "instdAmt",
    "chrgBr",
    "drctDbtTx",
    "ultmtCdtr",
    "dbtrAgt",
    "dbtrAgtAcct",
    "dbtr",
    "dbtrAcct",
    "ultmtDbtr",
    "instrForCdtrAgt",
    "purp",
    "rgltryRptg",
    "tax",
    "rltdRmtInf",
    "rmtInf",
    "splmtryData"
})
public class DirectDebitTransactionInformation23 {

    @XmlElement(name = "PmtId", required = true)
    protected PaymentIdentification6 pmtId;
    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation29 pmtTpInf;
    @XmlElement(name = "InstdAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount instdAmt;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "DrctDbtTx")
    protected DirectDebitTransaction10 drctDbtTx;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification135 ultmtCdtr;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount38 dbtrAgtAcct;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification135 dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    protected CashAccount38 dbtrAcct;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification135 ultmtDbtr;
    @XmlElement(name = "InstrForCdtrAgt")
    protected String instrForCdtrAgt;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RgltryRptg")
    protected List<RegulatoryReporting3> rgltryRptg;
    @XmlElement(name = "Tax")
    protected TaxInformation8 tax;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation7> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation16 rmtInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Ruft den Wert der pmtId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PaymentIdentification6 }
     *
     */
    public PaymentIdentification6 getPmtId() {
        return pmtId;
    }

    /**
     * Legt den Wert der pmtId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification6 }
     *
     */
    public void setPmtId(PaymentIdentification6 value) {
        this.pmtId = value;
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
     * Ruft den Wert der instdAmt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public ActiveOrHistoricCurrencyAndAmount getInstdAmt() {
        return instdAmt;
    }

    /**
     * Legt den Wert der instdAmt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public void setInstdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.instdAmt = value;
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
     * Ruft den Wert der drctDbtTx-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link DirectDebitTransaction10 }
     *
     */
    public DirectDebitTransaction10 getDrctDbtTx() {
        return drctDbtTx;
    }

    /**
     * Legt den Wert der drctDbtTx-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link DirectDebitTransaction10 }
     *
     */
    public void setDrctDbtTx(DirectDebitTransaction10 value) {
        this.drctDbtTx = value;
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
     * Ruft den Wert der dbtrAgt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Legt den Wert der dbtrAgt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtrAgt = value;
    }

    /**
     * Ruft den Wert der dbtrAgtAcct-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *
     */
    public CashAccount38 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Legt den Wert der dbtrAgtAcct-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *
     */
    public void setDbtrAgtAcct(CashAccount38 value) {
        this.dbtrAgtAcct = value;
    }

    /**
     * Ruft den Wert der dbtr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *
     */
    public PartyIdentification135 getDbtr() {
        return dbtr;
    }

    /**
     * Legt den Wert der dbtr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *
     */
    public void setDbtr(PartyIdentification135 value) {
        this.dbtr = value;
    }

    /**
     * Ruft den Wert der dbtrAcct-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *
     */
    public CashAccount38 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Legt den Wert der dbtrAcct-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *
     */
    public void setDbtrAcct(CashAccount38 value) {
        this.dbtrAcct = value;
    }

    /**
     * Ruft den Wert der ultmtDbtr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *
     */
    public PartyIdentification135 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Legt den Wert der ultmtDbtr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *
     */
    public void setUltmtDbtr(PartyIdentification135 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Ruft den Wert der instrForCdtrAgt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInstrForCdtrAgt() {
        return instrForCdtrAgt;
    }

    /**
     * Legt den Wert der instrForCdtrAgt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInstrForCdtrAgt(String value) {
        this.instrForCdtrAgt = value;
    }

    /**
     * Ruft den Wert der purp-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link Purpose2Choice }
     *
     */
    public Purpose2Choice getPurp() {
        return purp;
    }

    /**
     * Legt den Wert der purp-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link Purpose2Choice }
     *
     */
    public void setPurp(Purpose2Choice value) {
        this.purp = value;
    }

    /**
     * Gets the value of the rgltryRptg property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rgltryRptg property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryRptg().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatoryReporting3 }
     *
     *
     */
    public List<RegulatoryReporting3> getRgltryRptg() {
        if (rgltryRptg == null) {
            rgltryRptg = new ArrayList<RegulatoryReporting3>();
        }
        return this.rgltryRptg;
    }

    /**
     * Ruft den Wert der tax-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TaxInformation8 }
     *
     */
    public TaxInformation8 getTax() {
        return tax;
    }

    /**
     * Legt den Wert der tax-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TaxInformation8 }
     *
     */
    public void setTax(TaxInformation8 value) {
        this.tax = value;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRmtInf property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRmtInf().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocation7 }
     *
     *
     */
    public List<RemittanceLocation7> getRltdRmtInf() {
        if (rltdRmtInf == null) {
            rltdRmtInf = new ArrayList<RemittanceLocation7>();
        }
        return this.rltdRmtInf;
    }

    /**
     * Ruft den Wert der rmtInf-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link RemittanceInformation16 }
     *
     */
    public RemittanceInformation16 getRmtInf() {
        return rmtInf;
    }

    /**
     * Legt den Wert der rmtInf-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation16 }
     *
     */
    public void setRmtInf(RemittanceInformation16 value) {
        this.rmtInf = value;
    }

    /**
     * Gets the value of the splmtryData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     *
     *
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
