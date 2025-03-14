
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StructuredRemittanceInformation18 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="StructuredRemittanceInformation18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RfrdDocInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}ReferredDocumentInformation8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RfrdDocAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}RemittanceAmount4" minOccurs="0"/>
 *         <element name="CdtrRefInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}CreditorReferenceInformation3" minOccurs="0"/>
 *         <element name="Invcr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PartyIdentification272" minOccurs="0"/>
 *         <element name="Invcee" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}PartyIdentification272" minOccurs="0"/>
 *         <element name="TaxRmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}TaxData1" minOccurs="0"/>
 *         <element name="GrnshmtRmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Garnishment4" minOccurs="0"/>
 *         <element name="AddtlRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max140Text" maxOccurs="3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation18", propOrder = {
    "rfrdDocInf",
    "rfrdDocAmt",
    "cdtrRefInf",
    "invcr",
    "invcee",
    "taxRmt",
    "grnshmtRmt",
    "addtlRmtInf"
})
public class StructuredRemittanceInformation18 {

    @XmlElement(name = "RfrdDocInf")
    protected List<ReferredDocumentInformation8> rfrdDocInf;
    @XmlElement(name = "RfrdDocAmt")
    protected RemittanceAmount4 rfrdDocAmt;
    @XmlElement(name = "CdtrRefInf")
    protected CreditorReferenceInformation3 cdtrRefInf;
    @XmlElement(name = "Invcr")
    protected PartyIdentification272 invcr;
    @XmlElement(name = "Invcee")
    protected PartyIdentification272 invcee;
    @XmlElement(name = "TaxRmt")
    protected TaxData1 taxRmt;
    @XmlElement(name = "GrnshmtRmt")
    protected Garnishment4 grnshmtRmt;
    @XmlElement(name = "AddtlRmtInf")
    protected List<String> addtlRmtInf;

    /**
     * Gets the value of the rfrdDocInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rfrdDocInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDocInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredDocumentInformation8 }
     * 
     * 
     * @return
     *     The value of the rfrdDocInf property.
     */
    public List<ReferredDocumentInformation8> getRfrdDocInf() {
        if (rfrdDocInf == null) {
            rfrdDocInf = new ArrayList<>();
        }
        return this.rfrdDocInf;
    }

    /**
     * Ruft den Wert der rfrdDocAmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceAmount4 }
     *     
     */
    public RemittanceAmount4 getRfrdDocAmt() {
        return rfrdDocAmt;
    }

    /**
     * Legt den Wert der rfrdDocAmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceAmount4 }
     *     
     */
    public void setRfrdDocAmt(RemittanceAmount4 value) {
        this.rfrdDocAmt = value;
    }

    /**
     * Ruft den Wert der cdtrRefInf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceInformation3 }
     *     
     */
    public CreditorReferenceInformation3 getCdtrRefInf() {
        return cdtrRefInf;
    }

    /**
     * Legt den Wert der cdtrRefInf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceInformation3 }
     *     
     */
    public void setCdtrRefInf(CreditorReferenceInformation3 value) {
        this.cdtrRefInf = value;
    }

    /**
     * Ruft den Wert der invcr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getInvcr() {
        return invcr;
    }

    /**
     * Legt den Wert der invcr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setInvcr(PartyIdentification272 value) {
        this.invcr = value;
    }

    /**
     * Ruft den Wert der invcee-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getInvcee() {
        return invcee;
    }

    /**
     * Legt den Wert der invcee-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setInvcee(PartyIdentification272 value) {
        this.invcee = value;
    }

    /**
     * Ruft den Wert der taxRmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaxData1 }
     *     
     */
    public TaxData1 getTaxRmt() {
        return taxRmt;
    }

    /**
     * Legt den Wert der taxRmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxData1 }
     *     
     */
    public void setTaxRmt(TaxData1 value) {
        this.taxRmt = value;
    }

    /**
     * Ruft den Wert der grnshmtRmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Garnishment4 }
     *     
     */
    public Garnishment4 getGrnshmtRmt() {
        return grnshmtRmt;
    }

    /**
     * Legt den Wert der grnshmtRmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Garnishment4 }
     *     
     */
    public void setGrnshmtRmt(Garnishment4 value) {
        this.grnshmtRmt = value;
    }

    /**
     * Gets the value of the addtlRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlRmtInf property.
     */
    public List<String> getAddtlRmtInf() {
        if (addtlRmtInf == null) {
            addtlRmtInf = new ArrayList<>();
        }
        return this.addtlRmtInf;
    }

}
