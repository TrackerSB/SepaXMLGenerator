
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Garnishment4 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Garnishment4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}GarnishmentType1"/>
 *         <element name="Grnshee" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PartyIdentification272" minOccurs="0"/>
 *         <element name="GrnshmtAdmstr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PartyIdentification272" minOccurs="0"/>
 *         <element name="RefNb" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max140Text" minOccurs="0"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}ISODate" minOccurs="0"/>
 *         <element name="RmtdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FmlyMdclInsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MplyeeTermntnInd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Garnishment4", propOrder = {
    "tp",
    "grnshee",
    "grnshmtAdmstr",
    "refNb",
    "dt",
    "rmtdAmt",
    "fmlyMdclInsrncInd",
    "mplyeeTermntnInd"
})
public class Garnishment4 {

    @XmlElement(name = "Tp", required = true)
    protected GarnishmentType1 tp;
    @XmlElement(name = "Grnshee")
    protected PartyIdentification272 grnshee;
    @XmlElement(name = "GrnshmtAdmstr")
    protected PartyIdentification272 grnshmtAdmstr;
    @XmlElement(name = "RefNb")
    protected String refNb;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "RmtdAmt")
    protected ActiveOrHistoricCurrencyAndAmount rmtdAmt;
    @XmlElement(name = "FmlyMdclInsrncInd")
    protected Boolean fmlyMdclInsrncInd;
    @XmlElement(name = "MplyeeTermntnInd")
    protected Boolean mplyeeTermntnInd;

    /**
     * Ruft den Wert der tp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GarnishmentType1 }
     *     
     */
    public GarnishmentType1 getTp() {
        return tp;
    }

    /**
     * Legt den Wert der tp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GarnishmentType1 }
     *     
     */
    public void setTp(GarnishmentType1 value) {
        this.tp = value;
    }

    /**
     * Ruft den Wert der grnshee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getGrnshee() {
        return grnshee;
    }

    /**
     * Legt den Wert der grnshee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setGrnshee(PartyIdentification272 value) {
        this.grnshee = value;
    }

    /**
     * Ruft den Wert der grnshmtAdmstr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getGrnshmtAdmstr() {
        return grnshmtAdmstr;
    }

    /**
     * Legt den Wert der grnshmtAdmstr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setGrnshmtAdmstr(PartyIdentification272 value) {
        this.grnshmtAdmstr = value;
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
     * Ruft den Wert der rmtdAmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRmtdAmt() {
        return rmtdAmt;
    }

    /**
     * Legt den Wert der rmtdAmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setRmtdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rmtdAmt = value;
    }

    /**
     * Ruft den Wert der fmlyMdclInsrncInd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFmlyMdclInsrncInd() {
        return fmlyMdclInsrncInd;
    }

    /**
     * Legt den Wert der fmlyMdclInsrncInd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFmlyMdclInsrncInd(Boolean value) {
        this.fmlyMdclInsrncInd = value;
    }

    /**
     * Ruft den Wert der mplyeeTermntnInd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMplyeeTermntnInd() {
        return mplyeeTermntnInd;
    }

    /**
     * Legt den Wert der mplyeeTermntnInd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMplyeeTermntnInd(Boolean value) {
        this.mplyeeTermntnInd = value;
    }

}
