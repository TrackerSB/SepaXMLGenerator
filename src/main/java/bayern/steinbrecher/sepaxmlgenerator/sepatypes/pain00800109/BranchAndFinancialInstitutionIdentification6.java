
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r BranchAndFinancialInstitutionIdentification6 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BranchAndFinancialInstitutionIdentification6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}FinancialInstitutionIdentification18"/&gt;
 *         &lt;element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}BranchData3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification6", propOrder = {
    "finInstnId",
    "brnchId"
})
public class BranchAndFinancialInstitutionIdentification6 {

    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification18 finInstnId;
    @XmlElement(name = "BrnchId")
    protected BranchData3 brnchId;

    /**
     * Ruft den Wert der finInstnId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification18 }
     *
     */
    public FinancialInstitutionIdentification18 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Legt den Wert der finInstnId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification18 }
     *
     */
    public void setFinInstnId(FinancialInstitutionIdentification18 value) {
        this.finInstnId = value;
    }

    /**
     * Ruft den Wert der brnchId-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link BranchData3 }
     *
     */
    public BranchData3 getBrnchId() {
        return brnchId;
    }

    /**
     * Legt den Wert der brnchId-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link BranchData3 }
     *
     */
    public void setBrnchId(BranchData3 value) {
        this.brnchId = value;
    }

}
