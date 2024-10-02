
package pe.bn.com.sate.ope.infrastructure.service.external.domain.mc;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.bn.com.sate.ope.infrastructure.service.external.domain.mc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ConsultasXML_QNAME = new QName("http://tempuri.org/", "XML");
    private final static QName _AperturaTarjetasResponseAperturaTarjetasResult_QNAME = new QName("http://tempuri.org/", "Apertura_TarjetasResult");
    private final static QName _NominacionTarjetaResponseNominacionTarjetaResult_QNAME = new QName("http://tempuri.org/", "Nominacion_TarjetaResult");
    private final static QName _AnulacionesResponseAnulacionesResult_QNAME = new QName("http://tempuri.org/", "AnulacionesResult");
    private final static QName _ComprasResponseComprasResult_QNAME = new QName("http://tempuri.org/", "ComprasResult");
    private final static QName _ConsultaDatosExpedienteResponseConsultaDatosExpedienteResult_QNAME = new QName("http://tempuri.org/", "Consulta_Datos_ExpedienteResult");
    private final static QName _AnulacionesXml_QNAME = new QName("http://tempuri.org/", "xml");
    private final static QName _AperturaClientesResponseAperturaClientesResult_QNAME = new QName("http://tempuri.org/", "Apertura_ClientesResult");
    private final static QName _ConsultaMovimientosExpedienteResponseConsultaMovimientosExpedienteResult_QNAME = new QName("http://tempuri.org/", "Consulta_Movimientos_ExpedienteResult");
    private final static QName _AutoreversaResponseAutoreversaResult_QNAME = new QName("http://tempuri.org/", "AutoreversaResult");
    private final static QName _ValidacionPinResponseValidacionPinResult_QNAME = new QName("http://tempuri.org/", "Validacion_PinResult");
    private final static QName _ConsultasResponseConsultasResult_QNAME = new QName("http://tempuri.org/", "ConsultasResult");
    private final static QName _ConsultaDatosTarjetaResponseConsultaDatosTarjetaResult_QNAME = new QName("http://tempuri.org/", "Consulta_Datos_TarjetaResult");
    private final static QName _CambioPinResponseCambioPinResult_QNAME = new QName("http://tempuri.org/", "Cambio_PinResult");
    private final static QName _ConsultaMovimientosResponseConsultaMovimientosResult_QNAME = new QName("http://tempuri.org/", "Consulta_MovimientosResult");
    private final static QName _CashInResponseCashInResult_QNAME = new QName("http://tempuri.org/", "Cash_InResult");
    private final static QName _InformacionTarjetaResponseInformacionTarjetaResult_QNAME = new QName("http://tempuri.org/", "Informacion_TarjetaResult");
    private final static QName _GeneracionCVV2ResponseGeneracionCVV2Result_QNAME = new QName("http://tempuri.org/", "Generacion_CVV2Result");
    private final static QName _ReemisionTarjetaResponseReemisionTarjetaResult_QNAME = new QName("http://tempuri.org/", "Reemision_TarjetaResult");
    private final static QName _ModificacionTarjetasResponseModificacionTarjetasResult_QNAME = new QName("http://tempuri.org/", "Modificacion_TarjetasResult");
    private final static QName _ReseteoPinResponseReseteoPinResult_QNAME = new QName("http://tempuri.org/", "Reseteo_PinResult");
    private final static QName _ConsultaSaldosResponseConsultaSaldosResult_QNAME = new QName("http://tempuri.org/", "Consulta_SaldosResult");
    private final static QName _ModificacionClientesResponseModificacionClientesResult_QNAME = new QName("http://tempuri.org/", "Modificacion_ClientesResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.bn.com.sate.ope.infrastructure.service.external.domain.mc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReemisionTarjetaResponse }
     * 
     */
    public ReemisionTarjetaResponse createReemisionTarjetaResponse() {
        return new ReemisionTarjetaResponse();
    }

    /**
     * Create an instance of {@link CashIn }
     * 
     */
    public CashIn createCashIn() {
        return new CashIn();
    }

    /**
     * Create an instance of {@link ConsultaDatosExpediente }
     * 
     */
    public ConsultaDatosExpediente createConsultaDatosExpediente() {
        return new ConsultaDatosExpediente();
    }

    /**
     * Create an instance of {@link CambioPinResponse }
     * 
     */
    public CambioPinResponse createCambioPinResponse() {
        return new CambioPinResponse();
    }

    /**
     * Create an instance of {@link ValidacionPinResponse }
     * 
     */
    public ValidacionPinResponse createValidacionPinResponse() {
        return new ValidacionPinResponse();
    }

    /**
     * Create an instance of {@link ConsultaDatosTarjetaResponse }
     * 
     */
    public ConsultaDatosTarjetaResponse createConsultaDatosTarjetaResponse() {
        return new ConsultaDatosTarjetaResponse();
    }

    /**
     * Create an instance of {@link AperturaTarjetas }
     * 
     */
    public AperturaTarjetas createAperturaTarjetas() {
        return new AperturaTarjetas();
    }

    /**
     * Create an instance of {@link InformacionTarjeta }
     * 
     */
    public InformacionTarjeta createInformacionTarjeta() {
        return new InformacionTarjeta();
    }

    /**
     * Create an instance of {@link NominacionTarjeta }
     * 
     */
    public NominacionTarjeta createNominacionTarjeta() {
        return new NominacionTarjeta();
    }

    /**
     * Create an instance of {@link CashInResponse }
     * 
     */
    public CashInResponse createCashInResponse() {
        return new CashInResponse();
    }

    /**
     * Create an instance of {@link GeneracionCVV2 }
     * 
     */
    public GeneracionCVV2 createGeneracionCVV2() {
        return new GeneracionCVV2();
    }

    /**
     * Create an instance of {@link ReseteoPin }
     * 
     */
    public ReseteoPin createReseteoPin() {
        return new ReseteoPin();
    }

    /**
     * Create an instance of {@link ConsultaMovimientosResponse }
     * 
     */
    public ConsultaMovimientosResponse createConsultaMovimientosResponse() {
        return new ConsultaMovimientosResponse();
    }

    /**
     * Create an instance of {@link ReemisionTarjeta }
     * 
     */
    public ReemisionTarjeta createReemisionTarjeta() {
        return new ReemisionTarjeta();
    }

    /**
     * Create an instance of {@link AperturaClientes }
     * 
     */
    public AperturaClientes createAperturaClientes() {
        return new AperturaClientes();
    }

    /**
     * Create an instance of {@link ConsultaSaldosResponse }
     * 
     */
    public ConsultaSaldosResponse createConsultaSaldosResponse() {
        return new ConsultaSaldosResponse();
    }

    /**
     * Create an instance of {@link CambioPin }
     * 
     */
    public CambioPin createCambioPin() {
        return new CambioPin();
    }

    /**
     * Create an instance of {@link NominacionTarjetaResponse }
     * 
     */
    public NominacionTarjetaResponse createNominacionTarjetaResponse() {
        return new NominacionTarjetaResponse();
    }

    /**
     * Create an instance of {@link ModificacionClientesResponse }
     * 
     */
    public ModificacionClientesResponse createModificacionClientesResponse() {
        return new ModificacionClientesResponse();
    }

    /**
     * Create an instance of {@link ModificacionClientes }
     * 
     */
    public ModificacionClientes createModificacionClientes() {
        return new ModificacionClientes();
    }

    /**
     * Create an instance of {@link ModificacionTarjetasResponse }
     * 
     */
    public ModificacionTarjetasResponse createModificacionTarjetasResponse() {
        return new ModificacionTarjetasResponse();
    }

    /**
     * Create an instance of {@link ConsultaMovimientos }
     * 
     */
    public ConsultaMovimientos createConsultaMovimientos() {
        return new ConsultaMovimientos();
    }

    /**
     * Create an instance of {@link AnulacionesResponse }
     * 
     */
    public AnulacionesResponse createAnulacionesResponse() {
        return new AnulacionesResponse();
    }

    /**
     * Create an instance of {@link Autoreversa }
     * 
     */
    public Autoreversa createAutoreversa() {
        return new Autoreversa();
    }

    /**
     * Create an instance of {@link ConsultaSaldos }
     * 
     */
    public ConsultaSaldos createConsultaSaldos() {
        return new ConsultaSaldos();
    }

    /**
     * Create an instance of {@link AperturaTarjetasResponse }
     * 
     */
    public AperturaTarjetasResponse createAperturaTarjetasResponse() {
        return new AperturaTarjetasResponse();
    }

    /**
     * Create an instance of {@link ReseteoPinResponse }
     * 
     */
    public ReseteoPinResponse createReseteoPinResponse() {
        return new ReseteoPinResponse();
    }

    /**
     * Create an instance of {@link ConsultasResponse }
     * 
     */
    public ConsultasResponse createConsultasResponse() {
        return new ConsultasResponse();
    }

    /**
     * Create an instance of {@link ConsultaDatosExpedienteResponse }
     * 
     */
    public ConsultaDatosExpedienteResponse createConsultaDatosExpedienteResponse() {
        return new ConsultaDatosExpedienteResponse();
    }

    /**
     * Create an instance of {@link ConsultaMovimientosExpediente }
     * 
     */
    public ConsultaMovimientosExpediente createConsultaMovimientosExpediente() {
        return new ConsultaMovimientosExpediente();
    }

    /**
     * Create an instance of {@link AutoreversaResponse }
     * 
     */
    public AutoreversaResponse createAutoreversaResponse() {
        return new AutoreversaResponse();
    }

    /**
     * Create an instance of {@link GeneracionCVV2Response }
     * 
     */
    public GeneracionCVV2Response createGeneracionCVV2Response() {
        return new GeneracionCVV2Response();
    }

    /**
     * Create an instance of {@link Anulaciones }
     * 
     */
    public Anulaciones createAnulaciones() {
        return new Anulaciones();
    }

    /**
     * Create an instance of {@link ConsultaMovimientosExpedienteResponse }
     * 
     */
    public ConsultaMovimientosExpedienteResponse createConsultaMovimientosExpedienteResponse() {
        return new ConsultaMovimientosExpedienteResponse();
    }

    /**
     * Create an instance of {@link Compras }
     * 
     */
    public Compras createCompras() {
        return new Compras();
    }

    /**
     * Create an instance of {@link ConsultaDatosTarjeta }
     * 
     */
    public ConsultaDatosTarjeta createConsultaDatosTarjeta() {
        return new ConsultaDatosTarjeta();
    }

    /**
     * Create an instance of {@link ValidacionPin }
     * 
     */
    public ValidacionPin createValidacionPin() {
        return new ValidacionPin();
    }

    /**
     * Create an instance of {@link ModificacionTarjetas }
     * 
     */
    public ModificacionTarjetas createModificacionTarjetas() {
        return new ModificacionTarjetas();
    }

    /**
     * Create an instance of {@link Consultas }
     * 
     */
    public Consultas createConsultas() {
        return new Consultas();
    }

    /**
     * Create an instance of {@link ComprasResponse }
     * 
     */
    public ComprasResponse createComprasResponse() {
        return new ComprasResponse();
    }

    /**
     * Create an instance of {@link AperturaClientesResponse }
     * 
     */
    public AperturaClientesResponse createAperturaClientesResponse() {
        return new AperturaClientesResponse();
    }

    /**
     * Create an instance of {@link InformacionTarjetaResponse }
     * 
     */
    public InformacionTarjetaResponse createInformacionTarjetaResponse() {
        return new InformacionTarjetaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = Consultas.class)
    public JAXBElement<String> createConsultasXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, Consultas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Apertura_TarjetasResult", scope = AperturaTarjetasResponse.class)
    public JAXBElement<String> createAperturaTarjetasResponseAperturaTarjetasResult(String value) {
        return new JAXBElement<String>(_AperturaTarjetasResponseAperturaTarjetasResult_QNAME, String.class, AperturaTarjetasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = InformacionTarjeta.class)
    public JAXBElement<String> createInformacionTarjetaXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, InformacionTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = ConsultaMovimientosExpediente.class)
    public JAXBElement<String> createConsultaMovimientosExpedienteXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, ConsultaMovimientosExpediente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = ReemisionTarjeta.class)
    public JAXBElement<String> createReemisionTarjetaXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, ReemisionTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Nominacion_TarjetaResult", scope = NominacionTarjetaResponse.class)
    public JAXBElement<String> createNominacionTarjetaResponseNominacionTarjetaResult(String value) {
        return new JAXBElement<String>(_NominacionTarjetaResponseNominacionTarjetaResult_QNAME, String.class, NominacionTarjetaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AnulacionesResult", scope = AnulacionesResponse.class)
    public JAXBElement<String> createAnulacionesResponseAnulacionesResult(String value) {
        return new JAXBElement<String>(_AnulacionesResponseAnulacionesResult_QNAME, String.class, AnulacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ComprasResult", scope = ComprasResponse.class)
    public JAXBElement<String> createComprasResponseComprasResult(String value) {
        return new JAXBElement<String>(_ComprasResponseComprasResult_QNAME, String.class, ComprasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Consulta_Datos_ExpedienteResult", scope = ConsultaDatosExpedienteResponse.class)
    public JAXBElement<String> createConsultaDatosExpedienteResponseConsultaDatosExpedienteResult(String value) {
        return new JAXBElement<String>(_ConsultaDatosExpedienteResponseConsultaDatosExpedienteResult_QNAME, String.class, ConsultaDatosExpedienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "xml", scope = Anulaciones.class)
    public JAXBElement<String> createAnulacionesXml(String value) {
        return new JAXBElement<String>(_AnulacionesXml_QNAME, String.class, Anulaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Apertura_ClientesResult", scope = AperturaClientesResponse.class)
    public JAXBElement<String> createAperturaClientesResponseAperturaClientesResult(String value) {
        return new JAXBElement<String>(_AperturaClientesResponseAperturaClientesResult_QNAME, String.class, AperturaClientesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Consulta_Movimientos_ExpedienteResult", scope = ConsultaMovimientosExpedienteResponse.class)
    public JAXBElement<String> createConsultaMovimientosExpedienteResponseConsultaMovimientosExpedienteResult(String value) {
        return new JAXBElement<String>(_ConsultaMovimientosExpedienteResponseConsultaMovimientosExpedienteResult_QNAME, String.class, ConsultaMovimientosExpedienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AutoreversaResult", scope = AutoreversaResponse.class)
    public JAXBElement<String> createAutoreversaResponseAutoreversaResult(String value) {
        return new JAXBElement<String>(_AutoreversaResponseAutoreversaResult_QNAME, String.class, AutoreversaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "xml", scope = ModificacionClientes.class)
    public JAXBElement<String> createModificacionClientesXml(String value) {
        return new JAXBElement<String>(_AnulacionesXml_QNAME, String.class, ModificacionClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Validacion_PinResult", scope = ValidacionPinResponse.class)
    public JAXBElement<String> createValidacionPinResponseValidacionPinResult(String value) {
        return new JAXBElement<String>(_ValidacionPinResponseValidacionPinResult_QNAME, String.class, ValidacionPinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = ConsultaDatosExpediente.class)
    public JAXBElement<String> createConsultaDatosExpedienteXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, ConsultaDatosExpediente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = GeneracionCVV2 .class)
    public JAXBElement<String> createGeneracionCVV2XML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, GeneracionCVV2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "xml", scope = ModificacionTarjetas.class)
    public JAXBElement<String> createModificacionTarjetasXml(String value) {
        return new JAXBElement<String>(_AnulacionesXml_QNAME, String.class, ModificacionTarjetas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = ConsultaDatosTarjeta.class)
    public JAXBElement<String> createConsultaDatosTarjetaXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, ConsultaDatosTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultasResult", scope = ConsultasResponse.class)
    public JAXBElement<String> createConsultasResponseConsultasResult(String value) {
        return new JAXBElement<String>(_ConsultasResponseConsultasResult_QNAME, String.class, ConsultasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = NominacionTarjeta.class)
    public JAXBElement<String> createNominacionTarjetaXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, NominacionTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "xml", scope = ConsultaMovimientos.class)
    public JAXBElement<String> createConsultaMovimientosXml(String value) {
        return new JAXBElement<String>(_AnulacionesXml_QNAME, String.class, ConsultaMovimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "xml", scope = AperturaClientes.class)
    public JAXBElement<String> createAperturaClientesXml(String value) {
        return new JAXBElement<String>(_AnulacionesXml_QNAME, String.class, AperturaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = ConsultaSaldos.class)
    public JAXBElement<String> createConsultaSaldosXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, ConsultaSaldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Consulta_Datos_TarjetaResult", scope = ConsultaDatosTarjetaResponse.class)
    public JAXBElement<String> createConsultaDatosTarjetaResponseConsultaDatosTarjetaResult(String value) {
        return new JAXBElement<String>(_ConsultaDatosTarjetaResponseConsultaDatosTarjetaResult_QNAME, String.class, ConsultaDatosTarjetaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Cambio_PinResult", scope = CambioPinResponse.class)
    public JAXBElement<String> createCambioPinResponseCambioPinResult(String value) {
        return new JAXBElement<String>(_CambioPinResponseCambioPinResult_QNAME, String.class, CambioPinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Consulta_MovimientosResult", scope = ConsultaMovimientosResponse.class)
    public JAXBElement<String> createConsultaMovimientosResponseConsultaMovimientosResult(String value) {
        return new JAXBElement<String>(_ConsultaMovimientosResponseConsultaMovimientosResult_QNAME, String.class, ConsultaMovimientosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Cash_InResult", scope = CashInResponse.class)
    public JAXBElement<String> createCashInResponseCashInResult(String value) {
        return new JAXBElement<String>(_CashInResponseCashInResult_QNAME, String.class, CashInResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "xml", scope = AperturaTarjetas.class)
    public JAXBElement<String> createAperturaTarjetasXml(String value) {
        return new JAXBElement<String>(_AnulacionesXml_QNAME, String.class, AperturaTarjetas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = CambioPin.class)
    public JAXBElement<String> createCambioPinXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, CambioPin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = Compras.class)
    public JAXBElement<String> createComprasXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, Compras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Informacion_TarjetaResult", scope = InformacionTarjetaResponse.class)
    public JAXBElement<String> createInformacionTarjetaResponseInformacionTarjetaResult(String value) {
        return new JAXBElement<String>(_InformacionTarjetaResponseInformacionTarjetaResult_QNAME, String.class, InformacionTarjetaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Generacion_CVV2Result", scope = GeneracionCVV2Response.class)
    public JAXBElement<String> createGeneracionCVV2ResponseGeneracionCVV2Result(String value) {
        return new JAXBElement<String>(_GeneracionCVV2ResponseGeneracionCVV2Result_QNAME, String.class, GeneracionCVV2Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Reemision_TarjetaResult", scope = ReemisionTarjetaResponse.class)
    public JAXBElement<String> createReemisionTarjetaResponseReemisionTarjetaResult(String value) {
        return new JAXBElement<String>(_ReemisionTarjetaResponseReemisionTarjetaResult_QNAME, String.class, ReemisionTarjetaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Modificacion_TarjetasResult", scope = ModificacionTarjetasResponse.class)
    public JAXBElement<String> createModificacionTarjetasResponseModificacionTarjetasResult(String value) {
        return new JAXBElement<String>(_ModificacionTarjetasResponseModificacionTarjetasResult_QNAME, String.class, ModificacionTarjetasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "xml", scope = CashIn.class)
    public JAXBElement<String> createCashInXml(String value) {
        return new JAXBElement<String>(_AnulacionesXml_QNAME, String.class, CashIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = Autoreversa.class)
    public JAXBElement<String> createAutoreversaXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, Autoreversa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Reseteo_PinResult", scope = ReseteoPinResponse.class)
    public JAXBElement<String> createReseteoPinResponseReseteoPinResult(String value) {
        return new JAXBElement<String>(_ReseteoPinResponseReseteoPinResult_QNAME, String.class, ReseteoPinResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = ReseteoPin.class)
    public JAXBElement<String> createReseteoPinXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, ReseteoPin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Consulta_SaldosResult", scope = ConsultaSaldosResponse.class)
    public JAXBElement<String> createConsultaSaldosResponseConsultaSaldosResult(String value) {
        return new JAXBElement<String>(_ConsultaSaldosResponseConsultaSaldosResult_QNAME, String.class, ConsultaSaldosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Modificacion_ClientesResult", scope = ModificacionClientesResponse.class)
    public JAXBElement<String> createModificacionClientesResponseModificacionClientesResult(String value) {
        return new JAXBElement<String>(_ModificacionClientesResponseModificacionClientesResult_QNAME, String.class, ModificacionClientesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "XML", scope = ValidacionPin.class)
    public JAXBElement<String> createValidacionPinXML(String value) {
        return new JAXBElement<String>(_ConsultasXML_QNAME, String.class, ValidacionPin.class, value);
    }

}
