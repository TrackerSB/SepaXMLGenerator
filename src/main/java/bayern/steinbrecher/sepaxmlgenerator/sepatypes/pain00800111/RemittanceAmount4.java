
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800111;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RemittanceAmount4 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="RemittanceAmount4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RmtAmtAndTp" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}DocumentAmount1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AdjstmntAmtAndRsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.11}DocumentAdjustment1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceAmount4", propOrder = {
    "rmtAmtAndTp",
    "adjstmntAmtAndRsn"
})
public class RemittanceAmount4 {

    @XmlElement(name = "RmtAmtAndTp")
    protected List<DocumentAmount1> rmtAmtAndTp;
    @XmlElement(name = "AdjstmntAmtAndRsn")
    protected List<DocumentAdjustment1> adjstmntAmtAndRsn;

    /**
     * Gets the value of the rmtAmtAndTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rmtAmtAndTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRmtAmtAndTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAmount1 }
     * 
     * 
     * @return
     *     The value of the rmtAmtAndTp property.
     */
    public List<DocumentAmount1> getRmtAmtAndTp() {
        if (rmtAmtAndTp == null) {
            rmtAmtAndTp = new ArrayList<>();
        }
        return this.rmtAmtAndTp;
    }

    /**
     * Gets the value of the adjstmntAmtAndRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adjstmntAmtAndRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmntAmtAndRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAdjustment1 }
     * 
     * 
     * @return
     *     The value of the adjstmntAmtAndRsn property.
     */
    public List<DocumentAdjustment1> getAdjstmntAmtAndRsn() {
        if (adjstmntAmtAndRsn == null) {
            adjstmntAmtAndRsn = new ArrayList<>();
        }
        return this.adjstmntAmtAndRsn;
    }

}
