package pe.bn.com.sate.ope.transversal.dto.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Consulta_Datos_Expediente")
public class DTOConsultaDatosExpediente {

    private String codEmisor;
    private String codUsuario;
    private String numTerminal;
    private String numReferencia;
    private String numCuenta;
    private String fechaExpiracion;
    private String comercio; 
    private String moneda;
    private String fechaTxnTerminal;
    private String horaTxnTerminal;    
    private String reservado;
    private String idTransaccion;
    private String codRespuesta;
    private String descRespuesta;
    
    private String codAutorizacion;
    private String saldoMoneda;
    private String saldoCodBloqueo;
    private String saldoDescBloqueo;
    private String saldoNombreTarjeta;
    private String saldoFechaExpiracion;
    private String saldoLineaCredito;    
    private String saldoDispConsumo;
    
    private String saldoSigDispConsumo;
    private String saldoEfectivo;
    private String saldoDispEfectivo;
    private String saldoSigDispEfectivo;
    private String saldoPagoMinimo;
    private String saldoPagoTotal;
    private String saldoPagoFacturado;
    
    private String saldoFechaLimPago;
    private String saldoCuentaPrincipal;
    private String saldoActual;
    private String saldoSigDispActual;
    private String saldoFechaUltPago;
    private String saldoFechaUltFact;
    private String saldoFechaApertura;
    private String saldoFormaPago;
    private String saldoPorcentajeDE;
    private String saldoFlagPorcDE;
    private String saldoPuntosPlataCons;
    private String saldoSigPuntosPlataCons;
    private String saldoMontoProcesar;
    private String saldoContable;
    private String saldoSigContable;
    private String saldoDiasMora;
    private String saldoImporteMora;
    private String saldoCalificacionCliente;
    private String saldoIndCambioPin;
    private String reservado1;
    private String reservado2;
    private String saldoIndNominada;
    
       
   

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
   
    
    
    
    
    
    
    
//    @XmlElement(name = "NumCuenta")
//    public String getNumCuenta() {
//        return numCuenta;
//    }
//
//    public void setnumCuenta(String numCuenta) {
//        this.numCuenta = numCuenta;
//    }

    @XmlElement(name = "FechaExpiracion")
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
   
    @XmlElement(name = "Comercio")
    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
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
   /******************/

    @XmlElement(name = "NumCuenta")
	public String getNumCuenta() {
		return numCuenta;
	}
	
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	@XmlElement(name = "Moneda")
	public String getMoneda() {
		return moneda;
	}
	
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	@XmlElement(name = "CodAutorizacion")
	public String getCodAutorizacion() {
		return codAutorizacion;
	}

	public void setCodAutorizacion(String codAutorizacion) {
		this.codAutorizacion = codAutorizacion;
	}

	@XmlElement(name = "SaldoMoneda")
	public String getSaldoMoneda() {
		return saldoMoneda;
	}

	public void setSaldoMoneda(String saldoMoneda) {
		this.saldoMoneda = saldoMoneda;
	}

	@XmlElement(name = "SaldoCodBloqueo")
	public String getSaldoCodBloqueo() {
		return saldoCodBloqueo;
	}

	public void setSaldoCodBloqueo(String saldoCodBloqueo) {
		this.saldoCodBloqueo = saldoCodBloqueo;
	}

	@XmlElement(name = "SaldoDescBloqueo")
	public String getSaldoDescBloqueo() {
		return saldoDescBloqueo;
	}

	public void setSaldoDescBloqueo(String saldoDescBloqueo) {
		this.saldoDescBloqueo = saldoDescBloqueo;
	}

	@XmlElement(name = "SaldoNombreTarjeta")
	public String getSaldoNombreTarjeta() {
		return saldoNombreTarjeta;
	}

	public void setSaldoNombreTarjeta(String saldoNombreTarjeta) {
		this.saldoNombreTarjeta = saldoNombreTarjeta;
	}

	@XmlElement(name = "SaldoFechaExpiracion")
	public String getSaldoFechaExpiracion() {
		return saldoFechaExpiracion;
	}

	public void setSaldoFechaExpiracion(String saldoFechaExpiracion) {
		this.saldoFechaExpiracion = saldoFechaExpiracion;
	}

	@XmlElement(name = "SaldoLineaCredito")
	public String getSaldoLineaCredito() {
		return saldoLineaCredito;
	}

	public void setSaldoLineaCredito(String saldoLineaCredito) {
		this.saldoLineaCredito = saldoLineaCredito;
	}

	@XmlElement(name = "SaldoDispConsumo")
	public String getSaldoDispConsumo() {
		return saldoDispConsumo;
	}

	public void setSaldoDispConsumo(String saldoDispConsumo) {
		this.saldoDispConsumo = saldoDispConsumo;
	}

	@XmlElement(name = "SaldoSigDispConsumo")
	public String getSaldoSigDispConsumo() {
		return saldoSigDispConsumo;
	}

	public void setSaldoSigDispConsumo(String saldoSigDispConsumo) {
		this.saldoSigDispConsumo = saldoSigDispConsumo;
	}

	@XmlElement(name = "SaldoEfectivo")
	public String getSaldoEfectivo() {
		return saldoEfectivo;
	}

	public void setSaldoEfectivo(String saldoEfectivo) {
		this.saldoEfectivo = saldoEfectivo;
	}

	
	
	@XmlElement(name = "SaldoDispEfectivo")
	public String getSaldoDispEfectivo() {
		return saldoDispEfectivo;
	}

	public void setSaldoDispEfectivo(String saldoDispEfectivo) {
		this.saldoDispEfectivo = saldoDispEfectivo;
	}

	@XmlElement(name = "SaldoSigDispEfectivo")
	public String getSaldoSigDispEfectivo() {
		return saldoSigDispEfectivo;
	}

	public void setSaldoSigDispEfectivo(String saldoSigDispEfectivo) {
		this.saldoSigDispEfectivo = saldoSigDispEfectivo;
	}

	@XmlElement(name = "SaldoPagoMinimo")
	public String getSaldoPagoMinimo() {
		return saldoPagoMinimo;
	}

	public void setSaldoPagoMinimo(String saldoPagoMinimo) {
		this.saldoPagoMinimo = saldoPagoMinimo;
	}

	@XmlElement(name = "SaldoPagoTotal")
	public String getSaldoPagoTotal() {
		return saldoPagoTotal;
	}

	public void setSaldoPagoTotal(String saldoPagoTotal) {
		this.saldoPagoTotal = saldoPagoTotal;
	}

	@XmlElement(name = "SaldoPagoFacturado")
	public String getSaldoPagoFacturado() {
		return saldoPagoFacturado;
	}

	public void setSaldoPagoFacturado(String saldoPagoFacturado) {
		this.saldoPagoFacturado = saldoPagoFacturado;
	}

	@XmlElement(name = "SaldoFechaLimPago")
	public String getSaldoFechaLimPago() {
		return saldoFechaLimPago;
	}

	public void setSaldoFechaLimPago(String saldoFechaLimPago) {
		this.saldoFechaLimPago = saldoFechaLimPago;
	}

	@XmlElement(name = "SaldoCuentaPrincipal")
	public String getSaldoCuentaPrincipal() {
		return saldoCuentaPrincipal;
	}

	public void setSaldoCuentaPrincipal(String saldoCuentaPrincipal) {
		this.saldoCuentaPrincipal = saldoCuentaPrincipal;
	}

	@XmlElement(name = "SaldoActual")
	public String getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(String saldoActual) {
		this.saldoActual = saldoActual;
	}

	@XmlElement(name = "SaldoSigDispActual")
	public String getSaldoSigDispActual() {
		return saldoSigDispActual;
	}

	public void setSaldoSigDispActual(String saldoSigDispActual) {
		this.saldoSigDispActual = saldoSigDispActual;
	}

	@XmlElement(name = "SaldoFechaUltPago")
	public String getSaldoFechaUltPago() {
		return saldoFechaUltPago;
	}

	public void setSaldoFechaUltPago(String saldoFechaUltPago) {
		this.saldoFechaUltPago = saldoFechaUltPago;
	}

	@XmlElement(name = "SaldoFechaUltFact")
	public String getSaldoFechaUltFact() {
		return saldoFechaUltFact;
	}

	public void setSaldoFechaUltFact(String saldoFechaUltFact) {
		this.saldoFechaUltFact = saldoFechaUltFact;
	}

	@XmlElement(name = "SaldoFechaApertura")
	public String getSaldoFechaApertura() {
		return saldoFechaApertura;
	}

	public void setSaldoFechaApertura(String saldoFechaApertura) {
		this.saldoFechaApertura = saldoFechaApertura;
	}

	@XmlElement(name = "SaldoFormaPago")
	public String getSaldoFormaPago() {
		return saldoFormaPago;
	}

	public void setSaldoFormaPago(String saldoFormaPago) {
		this.saldoFormaPago = saldoFormaPago;
	}

	@XmlElement(name = "SaldoPorcentajeDE")
	public String getSaldoPorcentajeDE() {
		return saldoPorcentajeDE;
	}

	public void setSaldoPorcentajeDE(String saldoPorcentajeDE) {
		this.saldoPorcentajeDE = saldoPorcentajeDE;
	}

	@XmlElement(name = "SaldoFlagPorcDE")
	public String getSaldoFlagPorcDE() {
		return saldoFlagPorcDE;
	}

	public void setSaldoFlagPorcDE(String saldoFlagPorcDE) {
		this.saldoFlagPorcDE = saldoFlagPorcDE;
	}

	@XmlElement(name = "SaldoPuntosPlataCons")
	public String getSaldoPuntosPlataCons() {
		return saldoPuntosPlataCons;
	}

	public void setSaldoPuntosPlataCons(String saldoPuntosPlataCons) {
		this.saldoPuntosPlataCons = saldoPuntosPlataCons;
	}

	@XmlElement(name = "SaldoSigPuntosPlataCons")
	public String getSaldoSigPuntosPlataCons() {
		return saldoSigPuntosPlataCons;
	}

	public void setSaldoSigPuntosPlataCons(String saldoSigPuntosPlataCons) {
		this.saldoSigPuntosPlataCons = saldoSigPuntosPlataCons;
	}

	@XmlElement(name = "SaldoMontoProcesar")
	public String getSaldoMontoProcesar() {
		return saldoMontoProcesar;
	}

	public void setSaldoMontoProcesar(String saldoMontoProcesar) {
		this.saldoMontoProcesar = saldoMontoProcesar;
	}

	@XmlElement(name = "SaldoContable")
	public String getSaldoContable() {
		return saldoContable;
	}

	public void setSaldoContable(String saldoContable) {
		this.saldoContable = saldoContable;
	}

	@XmlElement(name = "SaldoSigContable")
	public String getSaldoSigContable() {
		return saldoSigContable;
	}

	public void setSaldoSigContable(String saldoSigContable) {
		this.saldoSigContable = saldoSigContable;
	}

	@XmlElement(name = "SaldoDiasMora")
	public String getSaldoDiasMora() {
		return saldoDiasMora;
	}

	public void setSaldoDiasMora(String saldoDiasMora) {
		this.saldoDiasMora = saldoDiasMora;
	}

	@XmlElement(name = "SaldoImporteMora")
	public String getSaldoImporteMora() {
		return saldoImporteMora;
	}

	public void setSaldoImporteMora(String saldoImporteMora) {
		this.saldoImporteMora = saldoImporteMora;
	}

	@XmlElement(name = "SaldoCalificacionCliente")
	public String getSaldoCalificacionCliente() {
		return saldoCalificacionCliente;
	}

	public void setSaldoCalificacionCliente(String saldoCalificacionCliente) {
		this.saldoCalificacionCliente = saldoCalificacionCliente;
	}

	@XmlElement(name = "SaldoIndCambioPin")
	public String getSaldoIndCambioPin() {
		return saldoIndCambioPin;
	}

	public void setSaldoIndCambioPin(String saldoIndCambioPin) {
		this.saldoIndCambioPin = saldoIndCambioPin;
	}

	@XmlElement(name = "Reservado1")
	public String getReservado1() {
		return reservado1;
	}

	public void setReservado1(String reservado1) {
		this.reservado1 = reservado1;
	}

	@XmlElement(name = "Reservado2")
	public String getReservado2() {
		return reservado2;
	}

	public void setReservado2(String reservado2) {
		this.reservado2 = reservado2;
	}

	@XmlElement(name = "SaldoIndNominada")
	public String getSaldoIndNominada() {
		return saldoIndNominada;
	}

	public void setSaldoIndNominada(String saldoIndNominada) {
		this.saldoIndNominada = saldoIndNominada;
	}
    
    
	/********************************************************/
	
	
	
	
	
	
    
    
    
    
    
    
    
    
    
    

    
}
