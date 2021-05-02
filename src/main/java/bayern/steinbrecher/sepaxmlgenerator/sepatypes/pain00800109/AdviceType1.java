
package bayern.steinbrecher.sepaxmlgenerator.sepatypes.pain00800109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r AdviceType1 complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AdviceType1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CdtAdvc" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}AdviceType1Choice" minOccurs="0"/&gt;
 *         &lt;element name="DbtAdvc" type="{urn:iso:std:iso:20022:tech:xsd:pain.008.001.09}AdviceType1Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdviceType1", propOrder = {
    "cdtAdvc",
    "dbtAdvc"
})
public class AdviceType1 {

    @XmlElement(name = "CdtAdvc")
    protected AdviceType1Choice cdtAdvc;
    @XmlElement(name = "DbtAdvc")
    protected AdviceType1Choice dbtAdvc;

    /**
     * Ruft den Wert der cdtAdvc-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AdviceType1Choice }
     *
     */
    public AdviceType1Choice getCdtAdvc() {
        return cdtAdvc;
    }

    /**
     * Legt den Wert der cdtAdvc-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AdviceType1Choice }
     *
     */
    public void setCdtAdvc(AdviceType1Choice value) {
        this.cdtAdvc = value;
    }

    /**
     * Ruft den Wert der dbtAdvc-Eigenschaft ab.
     *
     * @return
     *     possible object is
     *     {@link AdviceType1Choice }
     *
     */
    public AdviceType1Choice getDbtAdvc() {
        return dbtAdvc;
    }

    /**
     * Legt den Wert der dbtAdvc-Eigenschaft fest.
     *
     * @param value
     *     allowed object is
     *     {@link AdviceType1Choice }
     *
     */
    public void setDbtAdvc(AdviceType1Choice value) {
        this.dbtAdvc = value;
    }

}
