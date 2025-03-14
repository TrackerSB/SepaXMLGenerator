
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ReferredDocumentInformation8 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="ReferredDocumentInformation8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}DocumentType1" minOccurs="0"/>
 *         <element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}Max35Text" minOccurs="0"/>
 *         <element name="RltdDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}DateAndType1" minOccurs="0"/>
 *         <element name="LineDtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}DocumentLineInformation2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredDocumentInformation8", propOrder = {
    "tp",
    "nb",
    "rltdDt",
    "lineDtls"
})
public class ReferredDocumentInformation8 {

    @XmlElement(name = "Tp")
    protected DocumentType1 tp;
    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "RltdDt")
    protected DateAndType1 rltdDt;
    @XmlElement(name = "LineDtls")
    protected List<DocumentLineInformation2> lineDtls;

    /**
     * Ruft den Wert der tp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType1 }
     *     
     */
    public DocumentType1 getTp() {
        return tp;
    }

    /**
     * Legt den Wert der tp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType1 }
     *     
     */
    public void setTp(DocumentType1 value) {
        this.tp = value;
    }

    /**
     * Ruft den Wert der nb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Legt den Wert der nb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNb(String value) {
        this.nb = value;
    }

    /**
     * Ruft den Wert der rltdDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DateAndType1 }
     *     
     */
    public DateAndType1 getRltdDt() {
        return rltdDt;
    }

    /**
     * Legt den Wert der rltdDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndType1 }
     *     
     */
    public void setRltdDt(DateAndType1 value) {
        this.rltdDt = value;
    }

    /**
     * Gets the value of the lineDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentLineInformation2 }
     * 
     * 
     * @return
     *     The value of the lineDtls property.
     */
    public List<DocumentLineInformation2> getLineDtls() {
        if (lineDtls == null) {
            lineDtls = new ArrayList<>();
        }
        return this.lineDtls;
    }

}
