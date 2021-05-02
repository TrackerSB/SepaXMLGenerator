
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Document complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CstmrDrctDbtInitn" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}CustomerDirectDebitInitiationV09"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cstmrDrctDbtInitn"
})
public class Document {

    @XmlElement(name = "CstmrDrctDbtInitn", required = true)
    protected CustomerDirectDebitInitiationV09 cstmrDrctDbtInitn;

    /**
     * Ruft den Wert der cstmrDrctDbtInitn-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link CustomerDirectDebitInitiationV09 }
     *
     */
    public CustomerDirectDebitInitiationV09 getCstmrDrctDbtInitn() {
        return cstmrDrctDbtInitn;
    }

    /**
     * Legt den Wert der cstmrDrctDbtInitn-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link CustomerDirectDebitInitiationV09 }
     *
     */
    public void setCstmrDrctDbtInitn(CustomerDirectDebitInitiationV09 value) {
        this.cstmrDrctDbtInitn = value;
    }

}
