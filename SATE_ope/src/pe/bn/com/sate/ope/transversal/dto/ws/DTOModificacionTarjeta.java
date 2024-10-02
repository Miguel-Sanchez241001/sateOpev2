package pe.bn.com.sate.ope.transversal.dto.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Modificacion_Tarjeta")
public class DTOModificacionTarjeta {

    private String codEmisor;
    private String codUsuario;
    private String numTerminal;
    private String numReferencia;
    private String monedaProducto;
    private String codigoProducto;
    private String numCuentaAsociada;
    private String indAutGenCodCliente;
    private String numTarjetaMonedero;
    private String tipoTarjeta;
    private String secuenciaTarjeta;
    private String tipoEmisionTarjeta;
    private String nombrePlasticoLinea1;
    private String nombrePlasticoLinea2;
    private String codigoBloqueo;
    private String motivoBloqueo;
    private String direccionEnvioTipoVia;
    private String direccionEnvioNombreVia;
    private String direccionEnvioNum;
    private String direccionEnvioNumDpto;
    private String direccionEnvioOficina;
    private String direccionEnvioPiso;
    private String direccionEnvioManzana;
    private String direccionEnvioLote;
    private String direccionEnvioNumInterior;
    private String direccionEnvioSector;
    private String direccionEnvioKilometro;
    private String direccionEnvioTipoZona;
    private String direccionEnvioNombreZona;
    private String direccionEnvioReferencia;
    private String direccionEnvioUbigeo;
    private String indTipoDireccion;
    private String sucursalOriginal;
    private String mandatorio1;
    private String mandatorio2;
    private String sucursalActual;
    private String codigoPromocion;
    private String fechaTxnTerminal;
    private String horaTxnTerminal;
    private String reservado;
    private String idTransaccion;
    private String codRespuesta;
    private String descRespuesta;

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

    @XmlElement(name = "CodigoProducto")
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    @XmlElement(name = "NumCuentaAsociada")
    public String getNumCuentaAsociada() {
        return numCuentaAsociada;
    }

    public void setNumCuentaAsociada(String numCuentaAsociada) {
        this.numCuentaAsociada = numCuentaAsociada;
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

    @XmlElement(name = "TipoTarjeta")
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    @XmlElement(name = "SecuenciaTarjeta")
    public String getSecuenciaTarjeta() {
        return secuenciaTarjeta;
    }

    public void setSecuenciaTarjeta(String secuenciaTarjeta) {
        this.secuenciaTarjeta = secuenciaTarjeta;
    }

    @XmlElement(name = "TipoEmisionTarjeta")
    public String getTipoEmisionTarjeta() {
        return tipoEmisionTarjeta;
    }

    public void setTipoEmisionTarjeta(String tipoEmisionTarjeta) {
        this.tipoEmisionTarjeta = tipoEmisionTarjeta;
    }

    @XmlElement(name = "NombrePlasticoLinea1")
    public String getNombrePlasticoLinea1() {
        return nombrePlasticoLinea1;
    }

    public void setNombrePlasticoLinea1(String nombrePlasticoLinea1) {
        this.nombrePlasticoLinea1 = nombrePlasticoLinea1;
    }

    @XmlElement(name = "NombrePlasticoLinea2")
    public String getNombrePlasticoLinea2() {
        return nombrePlasticoLinea2;
    }

    public void setNombrePlasticoLinea2(String nombrePlasticoLinea2) {
        this.nombrePlasticoLinea2 = nombrePlasticoLinea2;
    }

    @XmlElement(name = "CodigoBloqueo")
    public String getCodigoBloqueo() {
        return codigoBloqueo;
    }

    public void setCodigoBloqueo(String codigoBloqueo) {
        this.codigoBloqueo = codigoBloqueo;
    }

    @XmlElement(name = "MotivoBloqueo")
    public String getMotivoBloqueo() {
        return motivoBloqueo;
    }

    public void setMotivoBloqueo(String motivoBloqueo) {
        this.motivoBloqueo = motivoBloqueo;
    }

    @XmlElement(name = "DireccionEnvioTipoVia")
    public String getDireccionEnvioTipoVia() {
        return direccionEnvioTipoVia;
    }

    public void setDireccionEnvioTipoVia(String direccionEnvioTipoVia) {
        this.direccionEnvioTipoVia = direccionEnvioTipoVia;
    }

    @XmlElement(name = "DireccionEnvioNombreVia")
    public String getDireccionEnvioNombreVia() {
        return direccionEnvioNombreVia;
    }

    public void setDireccionEnvioNombreVia(String direccionEnvioNombreVia) {
        this.direccionEnvioNombreVia = direccionEnvioNombreVia;
    }

    @XmlElement(name = "DireccionEnvioNum")
    public String getDireccionEnvioNum() {
        return direccionEnvioNum;
    }

    public void setDireccionEnvioNum(String direccionEnvioNum) {
        this.direccionEnvioNum = direccionEnvioNum;
    }

    @XmlElement(name = "DireccionEnvioNumDpto")
    public String getDireccionEnvioNumDpto() {
        return direccionEnvioNumDpto;
    }

    public void setDireccionEnvioNumDpto(String direccionEnvioNumDpto) {
        this.direccionEnvioNumDpto = direccionEnvioNumDpto;
    }

    @XmlElement(name = "DireccionEnvioOficina")
    public String getDireccionEnvioOficina() {
        return direccionEnvioOficina;
    }

    public void setDireccionEnvioOficina(String direccionEnvioOficina) {
        this.direccionEnvioOficina = direccionEnvioOficina;
    }

    @XmlElement(name = "DireccionEnvioPiso")
    public String getDireccionEnvioPiso() {
        return direccionEnvioPiso;
    }

    public void setDireccionEnvioPiso(String direccionEnvioPiso) {
        this.direccionEnvioPiso = direccionEnvioPiso;
    }

    @XmlElement(name = "DireccionEnvioManzana")
    public String getDireccionEnvioManzana() {
        return direccionEnvioManzana;
    }

    public void setDireccionEnvioManzana(String direccionEnvioManzana) {
        this.direccionEnvioManzana = direccionEnvioManzana;
    }

    @XmlElement(name = "DireccionEnvioLote")
    public String getDireccionEnvioLote() {
        return direccionEnvioLote;
    }

    public void setDireccionEnvioLote(String direccionEnvioLote) {
        this.direccionEnvioLote = direccionEnvioLote;
    }

    @XmlElement(name = "DireccionEnvioNumInterior")
    public String getDireccionEnvioNumInterior() {
        return direccionEnvioNumInterior;
    }

    public void setDireccionEnvioNumInterior(String direccionEnvioNumInterior) {
        this.direccionEnvioNumInterior = direccionEnvioNumInterior;
    }

    @XmlElement(name = "DireccionEnvioSector")
    public String getDireccionEnvioSector() {
        return direccionEnvioSector;
    }

    public void setDireccionEnvioSector(String direccionEnvioSector) {
        this.direccionEnvioSector = direccionEnvioSector;
    }

    @XmlElement(name = "DireccionEnvioKilometro")
    public String getDireccionEnvioKilometro() {
        return direccionEnvioKilometro;
    }

    public void setDireccionEnvioKilometro(String direccionEnvioKilometro) {
        this.direccionEnvioKilometro = direccionEnvioKilometro;
    }

    @XmlElement(name = "DireccionEnvioTipoZona")
    public String getDireccionEnvioTipoZona() {
        return direccionEnvioTipoZona;
    }

    public void setDireccionEnvioTipoZona(String direccionEnvioTipoZona) {
        this.direccionEnvioTipoZona = direccionEnvioTipoZona;
    }

    @XmlElement(name = "DireccionEnvioNombreZona")
    public String getDireccionEnvioNombreZona() {
        return direccionEnvioNombreZona;
    }

    public void setDireccionEnvioNombreZona(String direccionEnvioNombreZona) {
        this.direccionEnvioNombreZona = direccionEnvioNombreZona;
    }

    @XmlElement(name = "DireccionEnvioReferencia")
    public String getDireccionEnvioReferencia() {
        return direccionEnvioReferencia;
    }

    public void setDireccionEnvioReferencia(String direccionEnvioReferencia) {
        this.direccionEnvioReferencia = direccionEnvioReferencia;
    }

    @XmlElement(name = "DireccionEnvioUbigeo")
    public String getDireccionEnvioUbigeo() {
        return direccionEnvioUbigeo;
    }

    public void setDireccionEnvioUbigeo(String direccionEnvioUbigeo) {
        this.direccionEnvioUbigeo = direccionEnvioUbigeo;
    }

    @XmlElement(name = "IndTipoDireccion")
    public String getIndTipoDireccion() {
        return indTipoDireccion;
    }

    public void setIndTipoDireccion(String indTipoDireccion) {
        this.indTipoDireccion = indTipoDireccion;
    }

    @XmlElement(name = "SucursalOriginal")
    public String getSucursalOriginal() {
        return sucursalOriginal;
    }

    public void setSucursalOriginal(String sucursalOriginal) {
        this.sucursalOriginal = sucursalOriginal;
    }

    @XmlElement(name = "Mandatorio1")
    public String getMandatorio1() {
        return mandatorio1;
    }

    public void setMandatorio1(String mandatorio1) {
        this.mandatorio1 = mandatorio1;
    }

    @XmlElement(name = "Mandatorio2")
    public String getMandatorio2() {
        return mandatorio2;
    }

    public void setMandatorio2(String mandatorio2) {
        this.mandatorio2 = mandatorio2;
    }

    @XmlElement(name = "SucursalActual")
    public String getSucursalActual() {
        return sucursalActual;
    }

    public void setSucursalActual(String sucursalActual) {
        this.sucursalActual = sucursalActual;
    }

    @XmlElement(name = "CodigoPromocion")
    public String getCodigoPromocion() {
        return codigoPromocion;
    }

    public void setCodigoPromocion(String codigoPromocion) {
        this.codigoPromocion = codigoPromocion;
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
        return "DTOModificacionTarjeta [codEmisor=" + codEmisor + ", codUsuario=" + codUsuario 
                + ", numTerminal=" + numTerminal + ", numReferencia=" + numReferencia 
                + ", monedaProducto=" + monedaProducto + ", codigoProducto=" + codigoProducto
                + ", numCuentaAsociada=" + numCuentaAsociada + ", indAutGenCodCliente=" + indAutGenCodCliente
                + ", numTarjetaMonedero=" + numTarjetaMonedero + ", tipoTarjeta=" + tipoTarjeta 
                + ", secuenciaTarjeta=" + secuenciaTarjeta + ", tipoEmisionTarjeta=" + tipoEmisionTarjeta
                + ", nombrePlasticoLinea1=" + nombrePlasticoLinea1 + ", nombrePlasticoLinea2=" + nombrePlasticoLinea2
                + ", codigoBloqueo=" + codigoBloqueo + ", motivoBloqueo=" + motivoBloqueo 
                + ", direccionEnvioTipoVia=" + direccionEnvioTipoVia + ", direccionEnvioNombreVia=" + direccionEnvioNombreVia
                + ", direccionEnvioNum=" + direccionEnvioNum + ", direccionEnvioNumDpto=" + direccionEnvioNumDpto
                + ", direccionEnvioOficina=" + direccionEnvioOficina + ", direccionEnvioPiso=" + direccionEnvioPiso
                + ", direccionEnvioManzana=" + direccionEnvioManzana + ", direccionEnvioLote=" + direccionEnvioLote
                + ", direccionEnvioNumInterior=" + direccionEnvioNumInterior + ", direccionEnvioSector=" + direccionEnvioSector
                + ", direccionEnvioKilometro=" + direccionEnvioKilometro + ", direccionEnvioTipoZona=" + direccionEnvioTipoZona
                + ", direccionEnvioNombreZona=" + direccionEnvioNombreZona + ", direccionEnvioReferencia=" + direccionEnvioReferencia
                + ", direccionEnvioUbigeo=" + direccionEnvioUbigeo + ", indTipoDireccion=" + indTipoDireccion
                + ", sucursalOriginal=" + sucursalOriginal + ", mandatorio1=" + mandatorio1
                + ", mandatorio2=" + mandatorio2 + ", sucursalActual=" + sucursalActual
                + ", codigoPromocion=" + codigoPromocion + ", fechaTxnTerminal=" + fechaTxnTerminal
                + ", horaTxnTerminal=" + horaTxnTerminal + ", reservado=" + reservado
                + ", idTransaccion=" + idTransaccion + ", codRespuesta=" + codRespuesta 
                + ", descRespuesta=" + descRespuesta + "]";
    }
}
