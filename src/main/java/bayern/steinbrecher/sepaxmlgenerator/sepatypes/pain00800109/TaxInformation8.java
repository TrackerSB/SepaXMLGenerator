
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
 * <p>Java-Klasse für TaxInformation8 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TaxInformation8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}TaxParty1" minOccurs="0"/&gt;
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}TaxParty2" minOccurs="0"/&gt;
 *         &lt;element name="AdmstnZone" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RefNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TtlTaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="TtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Number" minOccurs="0"/&gt;
 *         &lt;element name="Rcrd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}TaxRecord2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInformation8", propOrder = {
    "cdtr",
    "dbtr",
    "admstnZone",
    "refNb",
    "mtd",
    "ttlTaxblBaseAmt",
    "ttlTaxAmt",
    "dt",
    "seqNb",
    "rcrd"
})
public class TaxInformation8 {

    @XmlElement(name = "Cdtr")
    protected TaxParty1 cdtr;
    @XmlElement(name = "Dbtr")
    protected TaxParty2 dbtr;
    @XmlElement(name = "AdmstnZone")
    protected String admstnZone;
    @XmlElement(name = "RefNb")
    protected String refNb;
    @XmlElement(name = "Mtd")
    protected String mtd;
    @XmlElement(name = "TtlTaxblBaseAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlTaxblBaseAmt;
    @XmlElement(name = "TtlTaxAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "Rcrd")
    protected List<TaxRecord2> rcrd;

    /**
     * Ruft den Wert der cdtr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TaxParty1 }
     *
     */
    public TaxParty1 getCdtr() {
        return cdtr;
    }

    /**
     * Legt den Wert der cdtr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TaxParty1 }
     *
     */
    public void setCdtr(TaxParty1 value) {
        this.cdtr = value;
    }

    /**
     * Ruft den Wert der dbtr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link TaxParty2 }
     *
     */
    public TaxParty2 getDbtr() {
        return dbtr;
    }

    /**
     * Legt den Wert der dbtr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link TaxParty2 }
     *
     */
    public void setDbtr(TaxParty2 value) {
        this.dbtr = value;
    }

    /**
     * Ruft den Wert der admstnZone-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdmstnZone() {
        return admstnZone;
    }

    /**
     * Legt den Wert der admstnZone-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdmstnZone(String value) {
        this.admstnZone = value;
    }

    /**
     * Ruft den Wert der refNb-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRefNb() {
        return refNb;
    }

    /**
     * Legt den Wert der refNb-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRefNb(String value) {
        this.refNb = value;
    }

    /**
     * Ruft den Wert der mtd-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMtd() {
        return mtd;
    }

    /**
     * Legt den Wert der mtd-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMtd(String value) {
        this.mtd = value;
    }

    /**
     * Ruft den Wert der ttlTaxblBaseAmt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlTaxblBaseAmt() {
        return ttlTaxblBaseAmt;
    }

    /**
     * Legt den Wert der ttlTaxblBaseAmt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public void setTtlTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxblBaseAmt = value;
    }

    /**
     * Ruft den Wert der ttlTaxAmt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    /**
     * Legt den Wert der ttlTaxAmt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public void setTtlTaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxAmt = value;
    }

    /**
     * Ruft den Wert der dt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Legt den Wert der dt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Ruft den Wert der seqNb-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Legt den Wert der seqNb-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the rcrd property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rcrd property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRecord2 }
     *
     *
     */
    public List<TaxRecord2> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<TaxRecord2>();
        }
        return this.rcrd;
    }

}
