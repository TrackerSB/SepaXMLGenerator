
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DirectDebitTransaction10 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DirectDebitTransaction10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MndtRltdInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}MandateRelatedInformation14" minOccurs="0"/&gt;
 *         &lt;element name="CdtrSchmeId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PartyIdentification135" minOccurs="0"/&gt;
 *         &lt;element name="PreNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PreNtfctnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ISODate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitTransaction10", propOrder = {
    "mndtRltdInf",
    "cdtrSchmeId",
    "preNtfctnId",
    "preNtfctnDt"
})
public class DirectDebitTransaction10 {

    @XmlElement(name = "MndtRltdInf")
    protected MandateRelatedInformation14 mndtRltdInf;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentification135 cdtrSchmeId;
    @XmlElement(name = "PreNtfctnId")
    protected String preNtfctnId;
    @XmlElement(name = "PreNtfctnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar preNtfctnDt;

    /**
     * Ruft den Wert der mndtRltdInf-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation14 }
     *
     */
    public MandateRelatedInformation14 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Legt den Wert der mndtRltdInf-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation14 }
     *
     */
    public void setMndtRltdInf(MandateRelatedInformation14 value) {
        this.mndtRltdInf = value;
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
     * Ruft den Wert der preNtfctnId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreNtfctnId() {
        return preNtfctnId;
    }

    /**
     * Legt den Wert der preNtfctnId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreNtfctnId(String value) {
        this.preNtfctnId = value;
    }

    /**
     * Ruft den Wert der preNtfctnDt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPreNtfctnDt() {
        return preNtfctnDt;
    }

    /**
     * Legt den Wert der preNtfctnDt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setPreNtfctnDt(XMLGregorianCalendar value) {
        this.preNtfctnDt = value;
    }

}
