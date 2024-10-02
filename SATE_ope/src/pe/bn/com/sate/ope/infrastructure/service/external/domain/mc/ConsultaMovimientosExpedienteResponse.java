
package pe.bn.com.sate.ope.infrastructure.service.external.domain.mc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Consulta_Movimientos_ExpedienteResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "consultaMovimientosExpedienteResult"
})
@XmlRootElement(name = "Consulta_Movimientos_ExpedienteResponse")
public class ConsultaMovimientosExpedienteResponse {

    @XmlElementRef(name = "Consulta_Movimientos_ExpedienteResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consultaMovimientosExpedienteResult;

    /**
     * Obtiene el valor de la propiedad consultaMovimientosExpedienteResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsultaMovimientosExpedienteResult() {
        return consultaMovimientosExpedienteResult;
    }

    /**
     * Define el valor de la propiedad consultaMovimientosExpedienteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsultaMovimientosExpedienteResult(JAXBElement<String> value) {
        this.consultaMovimientosExpedienteResult = value;
    }

}
