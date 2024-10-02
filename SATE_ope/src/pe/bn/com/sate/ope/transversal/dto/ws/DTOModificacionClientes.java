package pe.bn.com.sate.ope.transversal.dto.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Modificacion_Cliente")
public class DTOModificacionClientes {

    private String codEmisor;
    private String codUsuario;
    private String numTerminal;
    private String numReferencia;
    private String monedaProducto;
    private String titularApellidos;
    private String titularNombre;
    private String titularGenero;
    private String titularEstadoCivil;
    private String titularNumCelular;
    private String titularTelefonoDomicilio;
    private String titularEmail;
    private String titularTipoDocumento;
    
    private String titularNumDocumento;
    private String tipoDireccionEntrega;
    private String numDependiente;
    private String titularNombreTrabajo;
    private String titularTelefonoTrabajo;
    private String titularAnexoTrabajo;
    private String codUnicoEmisor;
    private String titularProfesion;
    private String memo1;
    private String memo2;
    private String conyugeNombre;
    private String conyugeNumDocumento;
    private String conyugeTelefonoDomicilio;
    private String conyugeNombreTrabajo;
    private String conyugeTelefonoTrabajo;
    private String conyugeAnexoTrabajo;
    
    private String domicilioTipoVia;
    private String domicilioNombreVia;
    private String domicilioNum;
    private String domicilioNumDpto;
    private String domicilioOficina;
    private String domicilioPiso;
    private String domicilioManzana;
    private String domicilioLote;
    private String domicilioNumInterior;
    private String domicilioSector;
    private String domicilioKilometro;
    private String domicilioTipoZona;
    private String domicilioNombreZona;
    private String domicilioReferencia;
    private String domicilioUbigeo;
    
    private String trabajoTipoVia;
    private String trabajoNombreVia;
    private String trabajoNum;
    private String trabajoNumDpto;
    private String trabajoOficina;
    private String trabajoPiso;
    private String trabajoManzana;
    private String trabajoLote;
    private String trabajoNumInterior;
    private String trabajoSector;
    private String trabajoKilometro;
    private String trabajoTipoZona;
    private String trabajoNombreZona;
    private String trabajoReferencia;
    private String trabajoUbigeo;
    
    private String indAutGenCodCliente;
    private String numTarjetaMonedero;
    private String fechaTxnTerminal;
    private String horaTxnTerminal;
    private String reservado;
    private String idTransaccion;
    private String codRespuesta;
    private String descRespuesta;

    // Métodos getter y setter para cada campo
    @XmlElement(name = "CodEmisor")
    public String getCodEmisor() {
        return codEmisor;
    }

    public void setCodEmisor(String codEmisor) {
        this.codEmisor = codEmisor;
    }

    @XmlElement(name = "CodUsuario")
    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    @XmlElement(name = "NumTerminal")
    public String getNumTerminal() {
        return numTerminal;
    }

    public void setNumTerminal(String numTerminal) {
        this.numTerminal = numTerminal;
    }

    @XmlElement(name = "NumReferencia")
    public String getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(String numReferencia) {
        this.numReferencia = numReferencia;
    }

    @XmlElement(name = "MonedaProducto")
    public String getMonedaProducto() {
        return monedaProducto;
    }

    public void setMonedaProducto(String monedaProducto) {
        this.monedaProducto = monedaProducto;
    }

    @XmlElement(name = "TitularApellidos")
    public String getTitularApellidos() {
        return titularApellidos;
    }

    public void setTitularApellidos(String titularApellidos) {
        this.titularApellidos = titularApellidos;
    }

    @XmlElement(name = "TitularNombre")
    public String getTitularNombre() {
        return titularNombre;
    }

    public void setTitularNombre(String titularNombre) {
        this.titularNombre = titularNombre;
    }

    @XmlElement(name = "TitularGenero")
    public String getTitularGenero() {
        return titularGenero;
    }

    public void setTitularGenero(String titularGenero) {
        this.titularGenero = titularGenero;
    }

    @XmlElement(name = "TitularEstadoCivil")
    public String getTitularEstadoCivil() {
        return titularEstadoCivil;
    }

    public void setTitularEstadoCivil(String titularEstadoCivil) {
        this.titularEstadoCivil = titularEstadoCivil;
    }

    @XmlElement(name = "TitularNumCelular")
    public String getTitularNumCelular() {
        return titularNumCelular;
    }

    public void setTitularNumCelular(String titularNumCelular) {
        this.titularNumCelular = titularNumCelular;
    }

    @XmlElement(name = "TitularTelefonoDomicilio")
    public String getTitularTelefonoDomicilio() {
        return titularTelefonoDomicilio;
    }

    public void setTitularTelefonoDomicilio(String titularTelefonoDomicilio) {
        this.titularTelefonoDomicilio = titularTelefonoDomicilio;
    }

    @XmlElement(name = "TitularEmail")
    public String getTitularEmail() {
        return titularEmail;
    }

    public void setTitularEmail(String titularEmail) {
        this.titularEmail = titularEmail;
    }

    @XmlElement(name = "TitularTipoDocumento")
    public String getTitularTipoDocumento() {
        return titularTipoDocumento;
    }

    public void setTitularTipoDocumento(String titularTipoDocumento) {
        this.titularTipoDocumento = titularTipoDocumento;
    }

    @XmlElement(name = "TitularNumDocumento")
    public String getTitularNumDocumento() {
        return titularNumDocumento;
    }

    public void setTitularNumDocumento(String titularNumDocumento) {
        this.titularNumDocumento = titularNumDocumento;
    }

    @XmlElement(name = "TipoDireccionEntrega")
    public String getTipoDireccionEntrega() {
        return tipoDireccionEntrega;
    }

    public void setTipoDireccionEntrega(String tipoDireccionEntrega) {
        this.tipoDireccionEntrega = tipoDireccionEntrega;
    }

    @XmlElement(name = "NumDependiente")
    public String getNumDependiente() {
        return numDependiente;
    }

    public void setNumDependiente(String numDependiente) {
        this.numDependiente = numDependiente;
    }

    @XmlElement(name = "TitularNombreTrabajo")
    public String getTitularNombreTrabajo() {
        return titularNombreTrabajo;
    }

    public void setTitularNombreTrabajo(String titularNombreTrabajo) {
        this.titularNombreTrabajo = titularNombreTrabajo;
    }

    @XmlElement(name = "TitularTelefonoTrabajo")
    public String getTitularTelefonoTrabajo() {
        return titularTelefonoTrabajo;
    }

    public void setTitularTelefonoTrabajo(String titularTelefonoTrabajo) {
        this.titularTelefonoTrabajo = titularTelefonoTrabajo;
    }

    @XmlElement(name = "TitularAnexoTrabajo")
    public String getTitularAnexoTrabajo() {
        return titularAnexoTrabajo;
    }

    public void setTitularAnexoTrabajo(String titularAnexoTrabajo) {
        this.titularAnexoTrabajo = titularAnexoTrabajo;
    }

    @XmlElement(name = "CodUnicoEmisor")
    public String getCodUnicoEmisor() {
        return codUnicoEmisor;
    }

    public void setCodUnicoEmisor(String codUnicoEmisor) {
        this.codUnicoEmisor = codUnicoEmisor;
    }

    @XmlElement(name = "TitularProfesion")
    public String getTitularProfesion() {
        return titularProfesion;
    }

    public void setTitularProfesion(String titularProfesion) {
        this.titularProfesion = titularProfesion;
    }

    @XmlElement(name = "Memo1")
    public String getMemo1() {
        return memo1;
    }

    public void setMemo1(String memo1) {
        this.memo1 = memo1;
    }

    @XmlElement(name = "Memo2")
    public String getMemo2() {
        return memo2;
    }

    public void setMemo2(String memo2) {
        this.memo2 = memo2;
    }

    @XmlElement(name = "ConyugeNombre")
    public String getConyugeNombre() {
        return conyugeNombre;
    }

    public void setConyugeNombre(String conyugeNombre) {
        this.conyugeNombre = conyugeNombre;
    }

    @XmlElement(name = "ConyugeNumDocumento")
    public String getConyugeNumDocumento() {
        return conyugeNumDocumento;
    }

    public void setConyugeNumDocumento(String conyugeNumDocumento) {
        this.conyugeNumDocumento = conyugeNumDocumento;
    }

    @XmlElement(name = "ConyugeTelefonoDomicilio")
    public String getConyugeTelefonoDomicilio() {
        return conyugeTelefonoDomicilio;
    }

    public void setConyugeTelefonoDomicilio(String conyugeTelefonoDomicilio) {
        this.conyugeTelefonoDomicilio = conyugeTelefonoDomicilio;
    }

    @XmlElement(name = "ConyugeNombreTrabajo")
    public String getConyugeNombreTrabajo() {
        return conyugeNombreTrabajo;
    }

    public void setConyugeNombreTrabajo(String conyugeNombreTrabajo) {
        this.conyugeNombreTrabajo = conyugeNombreTrabajo;
    }

    @XmlElement(name = "ConyugeTelefonoTrabajo")
    public String getConyugeTelefonoTrabajo() {
        return conyugeTelefonoTrabajo;
    }

    public void setConyugeTelefonoTrabajo(String conyugeTelefonoTrabajo) {
        this.conyugeTelefonoTrabajo = conyugeTelefonoTrabajo;
    }

    @XmlElement(name = "ConyugeAnexoTrabajo")
    public String getConyugeAnexoTrabajo() {
        return conyugeAnexoTrabajo;
    }

    public void setConyugeAnexoTrabajo(String conyugeAnexoTrabajo) {
        this.conyugeAnexoTrabajo = conyugeAnexoTrabajo;
    }

    @XmlElement(name = "DomicilioTipoVia")
    public String getDomicilioTipoVia() {
        return domicilioTipoVia;
    }

    public void setDomicilioTipoVia(String domicilioTipoVia) {
        this.domicilioTipoVia = domicilioTipoVia;
    }

    @XmlElement(name = "DomicilioNombreVia")
    public String getDomicilioNombreVia() {
        return domicilioNombreVia;
    }

    public void setDomicilioNombreVia(String domicilioNombreVia) {
        this.domicilioNombreVia = domicilioNombreVia;
    }

    @XmlElement(name = "DomicilioNum")
    public String getDomicilioNum() {
        return domicilioNum;
    }

    public void setDomicilioNum(String domicilioNum) {
        this.domicilioNum = domicilioNum;
    }

    @XmlElement(name = "DomicilioNumDpto")
    public String getDomicilioNumDpto() {
        return domicilioNumDpto;
    }

    public void setDomicilioNumDpto(String domicilioNumDpto) {
        this.domicilioNumDpto = domicilioNumDpto;
    }

    @XmlElement(name = "DomicilioOficina")
    public String getDomicilioOficina() {
        return domicilioOficina;
    }

    public void setDomicilioOficina(String domicilioOficina) {
        this.domicilioOficina = domicilioOficina;
    }

    @XmlElement(name = "DomicilioPiso")
    public String getDomicilioPiso() {
        return domicilioPiso;
    }

    public void setDomicilioPiso(String domicilioPiso) {
        this.domicilioPiso = domicilioPiso;
    }

    @XmlElement(name = "DomicilioManzana")
    public String getDomicilioManzana() {
        return domicilioManzana;
    }

    public void setDomicilioManzana(String domicilioManzana) {
        this.domicilioManzana = domicilioManzana;
    }

    @XmlElement(name = "DomicilioLote")
    public String getDomicilioLote() {
        return domicilioLote;
    }

    public void setDomicilioLote(String domicilioLote) {
        this.domicilioLote = domicilioLote;
    }

    @XmlElement(name = "DomicilioNumInterior")
    public String getDomicilioNumInterior() {
        return domicilioNumInterior;
    }

    public void setDomicilioNumInterior(String domicilioNumInterior) {
        this.domicilioNumInterior = domicilioNumInterior;
    }

    @XmlElement(name = "DomicilioSector")
    public String getDomicilioSector() {
        return domicilioSector;
    }

    public void setDomicilioSector(String domicilioSector) {
        this.domicilioSector = domicilioSector;
    }

    @XmlElement(name = "DomicilioKilometro")
    public String getDomicilioKilometro() {
        return domicilioKilometro;
    }

    public void setDomicilioKilometro(String domicilioKilometro) {
        this.domicilioKilometro = domicilioKilometro;
    }

    @XmlElement(name = "DomicilioTipoZona")
    public String getDomicilioTipoZona() {
        return domicilioTipoZona;
    }

    public void setDomicilioTipoZona(String domicilioTipoZona) {
        this.domicilioTipoZona = domicilioTipoZona;
    }

    @XmlElement(name = "DomicilioNombreZona")
    public String getDomicilioNombreZona() {
        return domicilioNombreZona;
    }

    public void setDomicilioNombreZona(String domicilioNombreZona) {
        this.domicilioNombreZona = domicilioNombreZona;
    }

    @XmlElement(name = "DomicilioReferencia")
    public String getDomicilioReferencia() {
        return domicilioReferencia;
    }

    public void setDomicilioReferencia(String domicilioReferencia) {
        this.domicilioReferencia = domicilioReferencia;
    }

    @XmlElement(name = "DomicilioUbigeo")
    public String getDomicilioUbigeo() {
        return domicilioUbigeo;
    }

    public void setDomicilioUbigeo(String domicilioUbigeo) {
        this.domicilioUbigeo = domicilioUbigeo;
    }

    @XmlElement(name = "TrabajoTipoVia")
    public String getTrabajoTipoVia() {
        return trabajoTipoVia;
    }

    public void setTrabajoTipoVia(String trabajoTipoVia) {
        this.trabajoTipoVia = trabajoTipoVia;
    }

    @XmlElement(name = "TrabajoNombreVia")
    public String getTrabajoNombreVia() {
        return trabajoNombreVia;
    }

    public void setTrabajoNombreVia(String trabajoNombreVia) {
        this.trabajoNombreVia = trabajoNombreVia;
    }

    @XmlElement(name = "TrabajoNum")
    public String getTrabajoNum() {
        return trabajoNum;
    }

    public void setTrabajoNum(String trabajoNum) {
        this.trabajoNum = trabajoNum;
    }

    @XmlElement(name = "TrabajoNumDpto")
    public String getTrabajoNumDpto() {
        return trabajoNumDpto;
    }

    public void setTrabajoNumDpto(String trabajoNumDpto) {
        this.trabajoNumDpto = trabajoNumDpto;
    }

    @XmlElement(name = "TrabajoOficina")
    public String getTrabajoOficina() {
        return trabajoOficina;
    }

    public void setTrabajoOficina(String trabajoOficina) {
        this.trabajoOficina = trabajoOficina;
    }

    @XmlElement(name = "TrabajoPiso")
    public String getTrabajoPiso() {
        return trabajoPiso;
    }

    public void setTrabajoPiso(String trabajoPiso) {
        this.trabajoPiso = trabajoPiso;
    }

    @XmlElement(name = "TrabajoManzana")
    public String getTrabajoManzana() {
        return trabajoManzana;
    }

    public void setTrabajoManzana(String trabajoManzana) {
        this.trabajoManzana = trabajoManzana;
    }

    @XmlElement(name = "TrabajoLote")
    public String getTrabajoLote() {
        return trabajoLote;
    }

    public void setTrabajoLote(String trabajoLote) {
        this.trabajoLote = trabajoLote;
    }

    @XmlElement(name = "TrabajoNumInterior")
    public String getTrabajoNumInterior() {
        return trabajoNumInterior;
    }

    public void setTrabajoNumInterior(String trabajoNumInterior) {
        this.trabajoNumInterior = trabajoNumInterior;
    }

    @XmlElement(name = "TrabajoSector")
    public String getTrabajoSector() {
        return trabajoSector;
    }

    public void setTrabajoSector(String trabajoSector) {
        this.trabajoSector = trabajoSector;
    }

    @XmlElement(name = "TrabajoKilometro")
    public String getTrabajoKilometro() {
        return trabajoKilometro;
    }

    public void setTrabajoKilometro(String trabajoKilometro) {
        this.trabajoKilometro = trabajoKilometro;
    }

    @XmlElement(name = "TrabajoTipoZona")
    public String getTrabajoTipoZona() {
        return trabajoTipoZona;
    }

    public void setTrabajoTipoZona(String trabajoTipoZona) {
        this.trabajoTipoZona = trabajoTipoZona;
    }

    @XmlElement(name = "TrabajoNombreZona")
    public String getTrabajoNombreZona() {
        return trabajoNombreZona;
    }

    public void setTrabajoNombreZona(String trabajoNombreZona) {
        this.trabajoNombreZona = trabajoNombreZona;
    }

    @XmlElement(name = "TrabajoReferencia")
    public String getTrabajoReferencia() {
        return trabajoReferencia;
    }

    public void setTrabajoReferencia(String trabajoReferencia) {
        this.trabajoReferencia = trabajoReferencia;
    }

    @XmlElement(name = "TrabajoUbigeo")
    public String getTrabajoUbigeo() {
        return trabajoUbigeo;
    }

    public void setTrabajoUbigeo(String trabajoUbigeo) {
        this.trabajoUbigeo = trabajoUbigeo;
    }

    @XmlElement(name = "IndAutGenCodCliente")
    public String getIndAutGenCodCliente() {
        return indAutGenCodCliente;
    }

    public void setIndAutGenCodCliente(String indAutGenCodCliente) {
        this.indAutGenCodCliente = indAutGenCodCliente;
    }

    @XmlElement(name = "NumTarjetaMonedero")
    public String getNumTarjetaMonedero() {
        return numTarjetaMonedero;
    }

    public void setNumTarjetaMonedero(String numTarjetaMonedero) {
        this.numTarjetaMonedero = numTarjetaMonedero;
    }

    @XmlElement(name = "FechaTxnTerminal")
    public String getFechaTxnTerminal() {
        return fechaTxnTerminal;
    }

    public void setFechaTxnTerminal(String fechaTxnTerminal) {
        this.fechaTxnTerminal = fechaTxnTerminal;
    }

    @XmlElement(name = "HoraTxnTerminal")
    public String getHoraTxnTerminal() {
        return horaTxnTerminal;
    }

    public void setHoraTxnTerminal(String horaTxnTerminal) {
        this.horaTxnTerminal = horaTxnTerminal;
    }

    @XmlElement(name = "Reservado")
    public String getReservado() {
        return reservado;
    }

    public void setReservado(String reservado) {
        this.reservado = reservado;
    }

    @XmlElement(name = "IdTransaccion")
    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    @XmlElement(name = "CodRespuesta")
    public String getCodRespuesta() {
        return codRespuesta;
    }

    public void setCodRespuesta(String codRespuesta) {
        this.codRespuesta = codRespuesta;
    }

    @XmlElement(name = "DescRespuesta")
    public String getDescRespuesta() {
        return descRespuesta;
    }

    public void setDescRespuesta(String descRespuesta) {
        this.descRespuesta = descRespuesta;
    }

    @Override
    public String toString() {
        return "DTOModificacionClientes [codEmisor=" + codEmisor 
            + ", codUsuario=" + codUsuario + ", numTerminal=" + numTerminal 
            + ", numReferencia=" + numReferencia + ", monedaProducto=" + monedaProducto 
            + ", titularApellidos=" + titularApellidos + ", titularNombre=" + titularNombre 
            + ", titularGenero=" + titularGenero + ", titularEstadoCivil=" + titularEstadoCivil 
            + ", titularNumCelular=" + titularNumCelular + ", titularTelefonoDomicilio=" + titularTelefonoDomicilio 
            + ", titularEmail=" + titularEmail + ", titularTipoDocumento=" + titularTipoDocumento 
            + ", titularNumDocumento=" + titularNumDocumento + ", tipoDireccionEntrega=" + tipoDireccionEntrega 
            + ", numDependiente=" + numDependiente + ", titularNombreTrabajo=" + titularNombreTrabajo 
            + ", titularTelefonoTrabajo=" + titularTelefonoTrabajo + ", titularAnexoTrabajo=" + titularAnexoTrabajo 
            + ", codUnicoEmisor=" + codUnicoEmisor + ", titularProfesion=" + titularProfesion 
            + ", memo1=" + memo1 + ", memo2=" + memo2 + ", conyugeNombre=" + conyugeNombre 
            + ", conyugeNumDocumento=" + conyugeNumDocumento + ", conyugeTelefonoDomicilio=" + conyugeTelefonoDomicilio 
            + ", conyugeNombreTrabajo=" + conyugeNombreTrabajo + ", conyugeTelefonoTrabajo=" + conyugeTelefonoTrabajo 
            + ", conyugeAnexoTrabajo=" + conyugeAnexoTrabajo + ", domicilioTipoVia=" + domicilioTipoVia 
            + ", domicilioNombreVia=" + domicilioNombreVia + ", domicilioNum=" + domicilioNum 
            + ", domicilioNumDpto=" + domicilioNumDpto + ", domicilioOficina=" + domicilioOficina 
            + ", domicilioPiso=" + domicilioPiso + ", domicilioManzana=" + domicilioManzana 
            + ", domicilioLote=" + domicilioLote + ", domicilioNumInterior=" + domicilioNumInterior 
            + ", domicilioSector=" + domicilioSector + ", domicilioKilometro=" + domicilioKilometro 
            + ", domicilioTipoZona=" + domicilioTipoZona + ", domicilioNombreZona=" + domicilioNombreZona 
            + ", domicilioReferencia=" + domicilioReferencia + ", domicilioUbigeo=" + domicilioUbigeo 
            + ", trabajoTipoVia=" + trabajoTipoVia + ", trabajoNombreVia=" + trabajoNombreVia 
            + ", trabajoNum=" + trabajoNum + ", trabajoNumDpto=" + trabajoNumDpto 
            + ", trabajoOficina=" + trabajoOficina + ", trabajoPiso=" + trabajoPiso 
            + ", trabajoManzana=" + trabajoManzana + ", trabajoLote=" + trabajoLote 
            + ", trabajoNumInterior=" + trabajoNumInterior + ", trabajoSector=" + trabajoSector 
            + ", trabajoKilometro=" + trabajoKilometro + ", trabajoTipoZona=" + trabajoTipoZona 
            + ", trabajoNombreZona=" + trabajoNombreZona + ", trabajoReferencia=" + trabajoReferencia 
            + ", trabajoUbigeo=" + trabajoUbigeo + ", indAutGenCodCliente=" + indAutGenCodCliente 
            + ", numTarjetaMonedero=" + numTarjetaMonedero + ", fechaTxnTerminal=" + fechaTxnTerminal 
            + ", horaTxnTerminal=" + horaTxnTerminal + ", reservado=" + reservado 
            + ", idTransaccion=" + idTransaccion + ", codRespuesta=" + codRespuesta 
            + ", descRespuesta=" + descRespuesta + "]";
    }
}
