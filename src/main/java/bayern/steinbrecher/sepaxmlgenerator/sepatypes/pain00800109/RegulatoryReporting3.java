
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RegulatoryReporting3 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RegulatoryReporting3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DbtCdtRptgInd" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}RegulatoryReportingType1Code" minOccurs="0"/&gt;
 *         &lt;element name="Authrty" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}RegulatoryAuthority2" minOccurs="0"/&gt;
 *         &lt;element name="Dtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}StructuredRegulatoryReporting3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReporting3", propOrder = {
    "dbtCdtRptgInd",
    "authrty",
    "dtls"
})
public class RegulatoryReporting3 {

    @XmlElement(name = "DbtCdtRptgInd")
    @XmlSchemaType(name = "string")
    protected RegulatoryReportingType1Code dbtCdtRptgInd;
    @XmlElement(name = "Authrty")
    protected RegulatoryAuthority2 authrty;
    @XmlElement(name = "Dtls")
    protected List<StructuredRegulatoryReporting3> dtls;

    /**
     * Ruft den Wert der dbtCdtRptgInd-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link RegulatoryReportingType1Code }
     *
     */
    public RegulatoryReportingType1Code getDbtCdtRptgInd() {
        return dbtCdtRptgInd;
    }

    /**
     * Legt den Wert der dbtCdtRptgInd-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link RegulatoryReportingType1Code }
     *
     */
    public void setDbtCdtRptgInd(RegulatoryReportingType1Code value) {
        this.dbtCdtRptgInd = value;
    }

    /**
     * Ruft den Wert der authrty-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link RegulatoryAuthority2 }
     *
     */
    public RegulatoryAuthority2 getAuthrty() {
        return authrty;
    }

    /**
     * Legt den Wert der authrty-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link RegulatoryAuthority2 }
     *
     */
    public void setAuthrty(RegulatoryAuthority2 value) {
        this.authrty = value;
    }

    /**
     * Gets the value of the dtls property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtls property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtls().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredRegulatoryReporting3 }
     *
     *
     */
    public List<StructuredRegulatoryReporting3> getDtls() {
        if (dtls == null) {
            dtls = new ArrayList<StructuredRegulatoryReporting3>();
        }
        return this.dtls;
    }

}
