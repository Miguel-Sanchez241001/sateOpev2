//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consulta3Return" type="{http://bean.mq2.bn}Foto2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consulta3Return"
})
@XmlRootElement(name = "consulta3Response")
public class Consulta3Response {

    @XmlElement(required = true, nillable = true)
    protected Foto2 consulta3Return;

    /**
     * Gets the value of the consulta3Return property.
     * 
     * @return
     *     possible object is
     *     {@link Foto2 }
     *     
     */
    public Foto2 getConsulta3Return() {
        return consulta3Return;
    }

    /**
     * Sets the value of the consulta3Return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Foto2 }
     *     
     */
    public void setConsulta3Return(Foto2 value) {
        this.consulta3Return = value;
    }

}
