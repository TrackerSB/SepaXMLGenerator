
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DirectDebitTransactionInformation32 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="DirectDebitTransactionInformation32">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PaymentIdentification6"/>
 *         <element name="PmtTpInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PaymentTypeInformation29" minOccurs="0"/>
 *         <element name="InstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}ChargeBearerType1Code" minOccurs="0"/>
 *         <element name="DrctDbtTx" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}DirectDebitTransaction12" minOccurs="0"/>
 *         <element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PartyIdentification272" minOccurs="0"/>
 *         <element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}BranchAndFinancialInstitutionIdentification8"/>
 *         <element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}CashAccount40" minOccurs="0"/>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PartyIdentification272"/>
 *         <element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}CashAccount40"/>
 *         <element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PartyIdentification272" minOccurs="0"/>
 *         <element name="InstrForCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max140Text" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Purpose2Choice" minOccurs="0"/>
 *         <element name="RgltryRptg" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}RegulatoryReporting3" maxOccurs="10" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}TaxData1" minOccurs="0"/>
 *         <element name="RltdRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}RemittanceLocation8" maxOccurs="10" minOccurs="0"/>
 *         <element name="RmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}RemittanceInformation22" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitTransactionInformation32", propOrder = {
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
public class DirectDebitTransactionInformation32 {

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
    protected DirectDebitTransaction12 drctDbtTx;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification272 ultmtCdtr;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification8 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount40 dbtrAgtAcct;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification272 dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    protected CashAccount40 dbtrAcct;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification272 ultmtDbtr;
    @XmlElement(name = "InstrForCdtrAgt")
    protected String instrForCdtrAgt;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RgltryRptg")
    protected List<RegulatoryReporting3> rgltryRptg;
    @XmlElement(name = "Tax")
    protected TaxData1 tax;
    @XmlElement(name = "RltdRmtInf")
    protected List<RemittanceLocation8> rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation22 rmtInf;
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
     *     {@link DirectDebitTransaction12 }
     *     
     */
    public DirectDebitTransaction12 getDrctDbtTx() {
        return drctDbtTx;
    }

    /**
     * Legt den Wert der drctDbtTx-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitTransaction12 }
     *     
     */
    public void setDrctDbtTx(DirectDebitTransaction12 value) {
        this.drctDbtTx = value;
    }

    /**
     * Ruft den Wert der ultmtCdtr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Legt den Wert der ultmtCdtr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setUltmtCdtr(PartyIdentification272 value) {
        this.ultmtCdtr = value;
    }

    /**
     * Ruft den Wert der dbtrAgt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Legt den Wert der dbtrAgt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.dbtrAgt = value;
    }

    /**
     * Ruft den Wert der dbtrAgtAcct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Legt den Wert der dbtrAgtAcct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDbtrAgtAcct(CashAccount40 value) {
        this.dbtrAgtAcct = value;
    }

    /**
     * Ruft den Wert der dbtr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getDbtr() {
        return dbtr;
    }

    /**
     * Legt den Wert der dbtr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setDbtr(PartyIdentification272 value) {
        this.dbtr = value;
    }

    /**
     * Ruft den Wert der dbtrAcct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Legt den Wert der dbtrAcct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDbtrAcct(CashAccount40 value) {
        this.dbtrAcct = value;
    }

    /**
     * Ruft den Wert der ultmtDbtr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Legt den Wert der ultmtDbtr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setUltmtDbtr(PartyIdentification272 value) {
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
     * This is why there is not a {@code set} method for the rgltryRptg property.
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
     * @return
     *     The value of the rgltryRptg property.
     */
    public List<RegulatoryReporting3> getRgltryRptg() {
        if (rgltryRptg == null) {
            rgltryRptg = new ArrayList<>();
        }
        return this.rgltryRptg;
    }

    /**
     * Ruft den Wert der tax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaxData1 }
     *     
     */
    public TaxData1 getTax() {
        return tax;
    }

    /**
     * Legt den Wert der tax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxData1 }
     *     
     */
    public void setTax(TaxData1 value) {
        this.tax = value;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdRmtInf property.
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
     * {@link RemittanceLocation8 }
     * 
     * 
     * @return
     *     The value of the rltdRmtInf property.
     */
    public List<RemittanceLocation8> getRltdRmtInf() {
        if (rltdRmtInf == null) {
            rltdRmtInf = new ArrayList<>();
        }
        return this.rltdRmtInf;
    }

    /**
     * Ruft den Wert der rmtInf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation22 }
     *     
     */
    public RemittanceInformation22 getRmtInf() {
        return rmtInf;
    }

    /**
     * Legt den Wert der rmtInf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation22 }
     *     
     */
    public void setRmtInf(RemittanceInformation22 value) {
        this.rmtInf = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
