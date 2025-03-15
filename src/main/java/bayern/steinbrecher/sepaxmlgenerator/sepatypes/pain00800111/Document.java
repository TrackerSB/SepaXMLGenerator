
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Document complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CstmrDrctDbtInitn" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}CustomerDirectDebitInitiationV11"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cstmrDrctDbtInitn"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "CstmrDrctDbtInitn", required = true)
    protected CustomerDirectDebitInitiationV11 cstmrDrctDbtInitn;

    /**
     * Ruft den Wert der cstmrDrctDbtInitn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDirectDebitInitiationV11 }
     *     
     */
    public CustomerDirectDebitInitiationV11 getCstmrDrctDbtInitn() {
        return cstmrDrctDbtInitn;
    }

    /**
     * Legt den Wert der cstmrDrctDbtInitn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDirectDebitInitiationV11 }
     *     
     */
    public void setCstmrDrctDbtInitn(CustomerDirectDebitInitiationV11 value) {
        this.cstmrDrctDbtInitn = value;
    }

}
