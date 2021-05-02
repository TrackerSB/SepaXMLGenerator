
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StructuredRegulatoryReporting3 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StructuredRegulatoryReporting3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max10Text" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="Inf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}Max35Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRegulatoryReporting3", propOrder = {
    "tp",
    "dt",
    "ctry",
    "cd",
    "amt",
    "inf"
})
public class StructuredRegulatoryReporting3 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "Inf")
    protected List<String> inf;

    /**
     * Ruft den Wert der tp-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTp() {
        return tp;
    }

    /**
     * Legt den Wert der tp-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTp(String value) {
        this.tp = value;
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
     * Ruft den Wert der ctry-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Legt den Wert der ctry-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Ruft den Wert der cd-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCd() {
        return cd;
    }

    /**
     * Legt den Wert der cd-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Ruft den Wert der amt-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Legt den Wert der amt-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the inf property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the inf property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInf().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getInf() {
        if (inf == null) {
            inf = new ArrayList<String>();
        }
        return this.inf;
    }

}
