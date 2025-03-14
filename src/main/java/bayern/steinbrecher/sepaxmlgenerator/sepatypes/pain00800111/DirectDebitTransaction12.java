
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DirectDebitTransaction12 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="DirectDebitTransaction12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MndtRltdInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}MandateRelatedInformation16" minOccurs="0"/>
 *         <element name="CdtrSchmeId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PartyIdentification272" minOccurs="0"/>
 *         <element name="PreNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max35Text" minOccurs="0"/>
 *         <element name="PreNtfctnDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitTransaction12", propOrder = {
    "mndtRltdInf",
    "cdtrSchmeId",
    "preNtfctnId",
    "preNtfctnDt"
})
public class DirectDebitTransaction12 {

    @XmlElement(name = "MndtRltdInf")
    protected MandateRelatedInformation16 mndtRltdInf;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentification272 cdtrSchmeId;
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
     *     {@link MandateRelatedInformation16 }
     *     
     */
    public MandateRelatedInformation16 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Legt den Wert der mndtRltdInf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation16 }
     *     
     */
    public void setMndtRltdInf(MandateRelatedInformation16 value) {
        this.mndtRltdInf = value;
    }

    /**
     * Ruft den Wert der cdtrSchmeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Legt den Wert der cdtrSchmeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setCdtrSchmeId(PartyIdentification272 value) {
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
