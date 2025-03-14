
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

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
 * <p>Java-Klasse für GroupHeader118 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="GroupHeader118">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max35Text"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}ISODateTime"/>
 *         <element name="Authstn" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Authorisation1Choice" maxOccurs="2" minOccurs="0"/>
 *         <element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max15NumericText"/>
 *         <element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}DecimalNumber" minOccurs="0"/>
 *         <element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PartyIdentification272"/>
 *         <element name="FwdgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}BranchAndFinancialInstitutionIdentification8" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader118", propOrder = {
    "msgId",
    "creDtTm",
    "authstn",
    "nbOfTxs",
    "ctrlSum",
    "initgPty",
    "fwdgAgt"
})
public class GroupHeader118 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "Authstn")
    protected List<Authorisation1Choice> authstn;
    @XmlElement(name = "NbOfTxs", required = true)
    protected String nbOfTxs;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "InitgPty", required = true)
    protected PartyIdentification272 initgPty;
    @XmlElement(name = "FwdgAgt")
    protected BranchAndFinancialInstitutionIdentification8 fwdgAgt;

    /**
     * Ruft den Wert der msgId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Legt den Wert der msgId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Ruft den Wert der creDtTm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Legt den Wert der creDtTm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the authstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Authorisation1Choice }
     * 
     * 
     * @return
     *     The value of the authstn property.
     */
    public List<Authorisation1Choice> getAuthstn() {
        if (authstn == null) {
            authstn = new ArrayList<>();
        }
        return this.authstn;
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
     * Ruft den Wert der initgPty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getInitgPty() {
        return initgPty;
    }

    /**
     * Legt den Wert der initgPty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setInitgPty(PartyIdentification272 value) {
        this.initgPty = value;
    }

    /**
     * Ruft den Wert der fwdgAgt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getFwdgAgt() {
        return fwdgAgt;
    }

    /**
     * Legt den Wert der fwdgAgt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public void setFwdgAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.fwdgAgt = value;
    }

}
