
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CustomerDirectDebitInitiationV09 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CustomerDirectDebitInitiationV09"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}GroupHeader83"/&gt;
 *         &lt;element name="PmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}PaymentInstruction37" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDirectDebitInitiationV09", propOrder = {
    "grpHdr",
    "pmtInf",
    "splmtryData"
})
public class CustomerDirectDebitInitiationV09 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader83 grpHdr;
    @XmlElement(name = "PmtInf", required = true)
    protected List<PaymentInstruction37> pmtInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Ruft den Wert der grpHdr-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link GroupHeader83 }
     *
     */
    public GroupHeader83 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Legt den Wert der grpHdr-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link GroupHeader83 }
     *
     */
    public void setGrpHdr(GroupHeader83 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the pmtInf property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInf property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInf().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstruction37 }
     *
     *
     */
    public List<PaymentInstruction37> getPmtInf() {
        if (pmtInf == null) {
            pmtInf = new ArrayList<PaymentInstruction37>();
        }
        return this.pmtInf;
    }

    /**
     * Gets the value of the splmtryData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     *
     *
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
