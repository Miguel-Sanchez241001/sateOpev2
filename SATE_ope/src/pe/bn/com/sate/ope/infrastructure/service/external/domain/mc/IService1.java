
package pe.bn.com.sate.ope.infrastructure.service.external.domain.mc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "IService1", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IService1 {


    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Apertura_Clientes", action = "http://tempuri.org/IService1/Apertura_Clientes")
    @WebResult(name = "Apertura_ClientesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Apertura_Clientes", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.AperturaClientes")
    @ResponseWrapper(localName = "Apertura_ClientesResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.AperturaClientesResponse")
    public String aperturaClientes(
        @WebParam(name = "xml", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Modificacion_Clientes", action = "http://tempuri.org/IService1/Modificacion_Clientes")
    @WebResult(name = "Modificacion_ClientesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Modificacion_Clientes", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ModificacionClientes")
    @ResponseWrapper(localName = "Modificacion_ClientesResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ModificacionClientesResponse")
    public String modificacionClientes(
        @WebParam(name = "xml", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Apertura_Tarjetas", action = "http://tempuri.org/IService1/Apertura_Tarjetas")
    @WebResult(name = "Apertura_TarjetasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Apertura_Tarjetas", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.AperturaTarjetas")
    @ResponseWrapper(localName = "Apertura_TarjetasResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.AperturaTarjetasResponse")
    public String aperturaTarjetas(
        @WebParam(name = "xml", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Modificacion_Tarjetas", action = "http://tempuri.org/IService1/Modificacion_Tarjetas")
    @WebResult(name = "Modificacion_TarjetasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Modificacion_Tarjetas", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ModificacionTarjetas")
    @ResponseWrapper(localName = "Modificacion_TarjetasResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ModificacionTarjetasResponse")
    public String modificacionTarjetas(
        @WebParam(name = "xml", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Consulta_Movimientos", action = "http://tempuri.org/IService1/Consulta_Movimientos")
    @WebResult(name = "Consulta_MovimientosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Consulta_Movimientos", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ConsultaMovimientos")
    @ResponseWrapper(localName = "Consulta_MovimientosResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ConsultaMovimientosResponse")
    public String consultaMovimientos(
        @WebParam(name = "xml", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Anulaciones", action = "http://tempuri.org/IService1/Anulaciones")
    @WebResult(name = "AnulacionesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Anulaciones", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.Anulaciones")
    @ResponseWrapper(localName = "AnulacionesResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.AnulacionesResponse")
    public String anulaciones(
        @WebParam(name = "xml", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Cash_In", action = "http://tempuri.org/IService1/Cash_In")
    @WebResult(name = "Cash_InResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Cash_In", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.CashIn")
    @ResponseWrapper(localName = "Cash_InResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.CashInResponse")
    public String cashIn(
        @WebParam(name = "xml", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Nominacion_Tarjeta", action = "http://tempuri.org/IService1/Nominacion_Tarjeta")
    @WebResult(name = "Nominacion_TarjetaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Nominacion_Tarjeta", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.NominacionTarjeta")
    @ResponseWrapper(localName = "Nominacion_TarjetaResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.NominacionTarjetaResponse")
    public String nominacionTarjeta(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Reemision_Tarjeta", action = "http://tempuri.org/IService1/Reemision_Tarjeta")
    @WebResult(name = "Reemision_TarjetaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Reemision_Tarjeta", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ReemisionTarjeta")
    @ResponseWrapper(localName = "Reemision_TarjetaResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ReemisionTarjetaResponse")
    public String reemisionTarjeta(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Consultas", action = "http://tempuri.org/IService1/Consultas")
    @WebResult(name = "ConsultasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Consultas", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.Consultas")
    @ResponseWrapper(localName = "ConsultasResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ConsultasResponse")
    public String consultas(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Consulta_Saldos", action = "http://tempuri.org/IService1/Consulta_Saldos")
    @WebResult(name = "Consulta_SaldosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Consulta_Saldos", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ConsultaSaldos")
    @ResponseWrapper(localName = "Consulta_SaldosResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ConsultaSaldosResponse")
    public String consultaSaldos(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Compras", action = "http://tempuri.org/IService1/Compras")
    @WebResult(name = "ComprasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Compras", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.Compras")
    @ResponseWrapper(localName = "ComprasResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ComprasResponse")
    public String compras(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Cambio_Pin", action = "http://tempuri.org/IService1/Cambio_Pin")
    @WebResult(name = "Cambio_PinResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Cambio_Pin", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.CambioPin")
    @ResponseWrapper(localName = "Cambio_PinResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.CambioPinResponse")
    public String cambioPin(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Validacion_Pin", action = "http://tempuri.org/IService1/Validacion_Pin")
    @WebResult(name = "Validacion_PinResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Validacion_Pin", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ValidacionPin")
    @ResponseWrapper(localName = "Validacion_PinResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ValidacionPinResponse")
    public String validacionPin(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Autoreversa", action = "http://tempuri.org/IService1/Autoreversa")
    @WebResult(name = "AutoreversaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Autoreversa", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.Autoreversa")
    @ResponseWrapper(localName = "AutoreversaResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.AutoreversaResponse")
    public String autoreversa(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Reseteo_Pin", action = "http://tempuri.org/IService1/Reseteo_Pin")
    @WebResult(name = "Reseteo_PinResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Reseteo_Pin", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ReseteoPin")
    @ResponseWrapper(localName = "Reseteo_PinResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ReseteoPinResponse")
    public String reseteoPin(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Informacion_Tarjeta", action = "http://tempuri.org/IService1/Informacion_Tarjeta")
    @WebResult(name = "Informacion_TarjetaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Informacion_Tarjeta", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.InformacionTarjeta")
    @ResponseWrapper(localName = "Informacion_TarjetaResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.InformacionTarjetaResponse")
    public String informacionTarjeta(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Generacion_CVV2", action = "http://tempuri.org/IService1/Generacion_CVV2")
    @WebResult(name = "Generacion_CVV2Result", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Generacion_CVV2", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.GeneracionCVV2")
    @ResponseWrapper(localName = "Generacion_CVV2Response", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.GeneracionCVV2Response")
    public String generacionCVV2(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Consulta_Datos_Tarjeta", action = "http://tempuri.org/IService1/Consulta_Datos_Tarjeta")
    @WebResult(name = "Consulta_Datos_TarjetaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Consulta_Datos_Tarjeta", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ConsultaDatosTarjeta")
    @ResponseWrapper(localName = "Consulta_Datos_TarjetaResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ConsultaDatosTarjetaResponse")
    public String consultaDatosTarjeta(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Consulta_Movimientos_Expediente", action = "http://tempuri.org/IService1/Consulta_Movimientos_Expediente")
    @WebResult(name = "Consulta_Movimientos_ExpedienteResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Consulta_Movimientos_Expediente", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ConsultaMovimientosExpediente")
    @ResponseWrapper(localName = "Consulta_Movimientos_ExpedienteResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ConsultaMovimientosExpedienteResponse")
    public String consultaMovimientosExpediente(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

    /**
     * 
     * @param xml
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Consulta_Datos_Expediente", action = "http://tempuri.org/IService1/Consulta_Datos_Expediente")
    @WebResult(name = "Consulta_Datos_ExpedienteResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Consulta_Datos_Expediente", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ConsultaDatosExpediente")
    @ResponseWrapper(localName = "Consulta_Datos_ExpedienteResponse", targetNamespace = "http://tempuri.org/", className = "pe.bn.com.sate.ope.infrastructure.service.external.domain.mc.ConsultaDatosExpedienteResponse")
    public String consultaDatosExpediente(
        @WebParam(name = "XML", targetNamespace = "http://tempuri.org/")
        String xml);

}
