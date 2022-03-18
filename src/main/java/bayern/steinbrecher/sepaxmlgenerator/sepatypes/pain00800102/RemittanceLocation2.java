
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800102;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r RemittanceLocation2 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RemittanceLocation2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RmtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RmtLctnMtd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}RemittanceLocationMethod2Code" minOccurs="0"/&gt;
 *         &lt;element name="RmtLctnElctrncAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}Max2048Text" minOccurs="0"/&gt;
 *         &lt;element name="RmtLctnPstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.02}NameAndAddress10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocation2", propOrder = {
    "rmtId",
    "rmtLctnMtd",
    "rmtLctnElctrncAdr",
    "rmtLctnPstlAdr"
})
public class RemittanceLocation2 {

    @XmlElement(name = "RmtId")
    protected String rmtId;
    @XmlElement(name = "RmtLctnMtd")
    @XmlSchemaType(name = "string")
    protected RemittanceLocationMethod2Code rmtLctnMtd;
    @XmlElement(name = "RmtLctnElctrncAdr")
    protected String rmtLctnElctrncAdr;
    @XmlElement(name = "RmtLctnPstlAdr")
    protected NameAndAddress10 rmtLctnPstlAdr;

    /**
     * Ruft den Wert der rmtId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtId() {
        return rmtId;
    }

    /**
     * Legt den Wert der rmtId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmtId(String value) {
        this.rmtId = value;
    }

    /**
     * Ruft den Wert der rmtLctnMtd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceLocationMethod2Code }
     *     
     */
    public RemittanceLocationMethod2Code getRmtLctnMtd() {
        return rmtLctnMtd;
    }

    /**
     * Legt den Wert der rmtLctnMtd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceLocationMethod2Code }
     *     
     */
    public void setRmtLctnMtd(RemittanceLocationMethod2Code value) {
        this.rmtLctnMtd = value;
    }

    /**
     * Ruft den Wert der rmtLctnElctrncAdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtLctnElctrncAdr() {
        return rmtLctnElctrncAdr;
    }

    /**
     * Legt den Wert der rmtLctnElctrncAdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmtLctnElctrncAdr(String value) {
        this.rmtLctnElctrncAdr = value;
    }

    /**
     * Ruft den Wert der rmtLctnPstlAdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress10 }
     *     
     */
    public NameAndAddress10 getRmtLctnPstlAdr() {
        return rmtLctnPstlAdr;
    }

    /**
     * Legt den Wert der rmtLctnPstlAdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress10 }
     *     
     */
    public void setRmtLctnPstlAdr(NameAndAddress10 value) {
        this.rmtLctnPstlAdr = value;
    }

}
