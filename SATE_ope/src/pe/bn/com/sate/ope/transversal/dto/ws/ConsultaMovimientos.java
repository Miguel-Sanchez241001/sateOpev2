package pe.bn.com.sate.ope.transversal.dto.ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import pe.bn.com.sate.ope.transversal.dto.sate.MovimientoTarjeta;
import pe.bn.com.sate.ope.transversal.util.Fecha;

@XmlRootElement(name = "Consulta_Movimientos")
public class ConsultaMovimientos {

	@XmlElement(name = "CodEmisor")
	private String CodEmisor;

	@XmlElement(name = "CodUsuario")
	private String CodUsuario;

	@XmlElement(name = "NumTerminal")
	private String NumTerminal;

	@XmlElement(name = "NumTarjetaMonedero")
	private String NumTarjetaMonedero;

	@XmlElement(name = "NumReferencia")
	private String NumReferencia;

	@XmlElement(name = "FechaExpiracion")
	private String FechaExpiracion;

	@XmlElement(name = "Comercio")
	private String Comercio;

	@XmlElement(name = "Moneda")
	private String Moneda;

	@XmlElement(name = "FechaTxnTerminal")
	private String FechaTxnTerminal;

	@XmlElement(name = "HoraTxnTerminal")
	private String HoraTxnTerminal;

	@XmlElement(name = "Reservado")
	private String Reservado;

	@XmlElement(name = "IdTransaccion")
	private String IdTransaccion;

	@XmlElement(name = "CodRespuesta")
	private String CodRespuesta;

	@XmlElement(name = "DescRespuesta")
	private String DescRespuesta;

	@XmlElement(name = "CodAutorizacion")
	private String CodAutorizacion;

	@XmlElement(name = "MoviMoneda")
	private String MoviMoneda;

	@XmlElement(name = "MoviCodBloqueo")
	private String MoviCodBloqueo;

	@XmlElement(name = "MoviDescBloqueo")
	private String MoviDescBloqueo;

	@XmlElement(name = "MoviNombreTarjeta")
	private String MoviNombreTarjeta;

	@XmlElement(name = "MoviFechaExpiracion")
	private String MoviFechaExpiracion;

	@XmlElement(name = "MoviUltMovimientos")
	private String MoviUltMovimientos;

	@XmlElement(name = "Mov1FechaTxn")
	private String Mov1FechaTxn;

	@XmlElement(name = "Mov1DesTxn")
	private String Mov1DesTxn;

	@XmlElement(name = "Mov1MonOriginalTxn")
	private String Mov1MonOriginalTxn;

	@XmlElement(name = "Mov1MontoTxn")
	private String Mov1MontoTxn;

	@XmlElement(name = "Mov1SigMontoTxn")
	private String Mov1SigMontoTxn;

	@XmlElement(name = "Mov1TipoTarjeta")
	private String Mov1TipoTarjeta;

	@XmlElement(name = "Mov1Filler")
	private String Mov1Filler;

	@XmlElement(name = "Mov2FechaTxn")
	private String Mov2FechaTxn;

	@XmlElement(name = "Mov2DesTxn")
	private String Mov2DesTxn;

	@XmlElement(name = "Mov2MonOriginalTxn")
	private String Mov2MonOriginalTxn;

	@XmlElement(name = "Mov2MontoTxn")
	private String Mov2MontoTxn;

	@XmlElement(name = "Mov2SigMontoTxn")
	private String Mov2SigMontoTxn;

	@XmlElement(name = "Mov2TipoTarjeta")
	private String Mov2TipoTarjeta;

	@XmlElement(name = "Mov2Filler")
	private String Mov2Filler;

	@XmlElement(name = "Mov3FechaTxn")
	private String Mov3FechaTxn;

	@XmlElement(name = "Mov3DesTxn")
	private String Mov3DesTxn;

	@XmlElement(name = "Mov3MonOriginalTxn")
	private String Mov3MonOriginalTxn;

	@XmlElement(name = "Mov3MontoTxn")
	private String Mov3MontoTxn;

	@XmlElement(name = "Mov3SigMontoTxn")
	private String Mov3SigMontoTxn;

	@XmlElement(name = "Mov3TipoTarjeta")
	private String Mov3TipoTarjeta;

	@XmlElement(name = "Mov3Filler")
	private String Mov3Filler;

	@XmlElement(name = "Mov4FechaTxn")
	private String Mov4FechaTxn;

	@XmlElement(name = "Mov4DesTxn")
	private String Mov4DesTxn;

	@XmlElement(name = "Mov4MonOriginalTxn")
	private String Mov4MonOriginalTxn;

	@XmlElement(name = "Mov4MontoTxn")
	private String Mov4MontoTxn;

	@XmlElement(name = "Mov4SigMontoTxn")
	private String Mov4SigMontoTxn;

	@XmlElement(name = "Mov4TipoTarjeta")
	private String Mov4TipoTarjeta;

	@XmlElement(name = "Mov4Filler")
	private String Mov4Filler;

	@XmlElement(name = "Mov5FechaTxn")
	private String Mov5FechaTxn;

	@XmlElement(name = "Mov5DesTxn")
	private String Mov5DesTxn;

	@XmlElement(name = "Mov5MonOriginalTxn")
	private String Mov5MonOriginalTxn;

	@XmlElement(name = "Mov5MontoTxn")
	private String Mov5MontoTxn;

	@XmlElement(name = "Mov5SigMontoTxn")
	private String Mov5SigMontoTxn;

	@XmlElement(name = "Mov5TipoTarjeta")
	private String Mov5TipoTarjeta;

	@XmlElement(name = "Mov5Filler")
	private String Mov5Filler;

	@XmlElement(name = "Mov6FechaTxn")
	private String Mov6FechaTxn;

	@XmlElement(name = "Mov6DesTxn")
	private String Mov6DesTxn;

	@XmlElement(name = "Mov6MonOriginalTxn")
	private String Mov6MonOriginalTxn;

	@XmlElement(name = "Mov6MontoTxn")
	private String Mov6MontoTxn;

	@XmlElement(name = "Mov6SigMontoTxn")
	private String Mov6SigMontoTxn;

	@XmlElement(name = "Mov6TipoTarjeta")
	private String Mov6TipoTarjeta;

	@XmlElement(name = "Mov6Filler")
	private String Mov6Filler;

	@XmlElement(name = "Mov7FechaTxn")
	private String Mov7FechaTxn;

	@XmlElement(name = "Mov7DesTxn")
	private String Mov7DesTxn;

	@XmlElement(name = "Mov7MonOriginalTxn")
	private String Mov7MonOriginalTxn;

	@XmlElement(name = "Mov7MontoTxn")
	private String Mov7MontoTxn;

	@XmlElement(name = "Mov7SigMontoTxn")
	private String Mov7SigMontoTxn;

	@XmlElement(name = "Mov7TipoTarjeta")
	private String Mov7TipoTarjeta;

	@XmlElement(name = "Mov7Filler")
	private String Mov7Filler;

	@XmlElement(name = "Mov8FechaTxn")
	private String Mov8FechaTxn;

	@XmlElement(name = "Mov8DesTxn")
	private String Mov8DesTxn;

	@XmlElement(name = "Mov8MonOriginalTxn")
	private String Mov8MonOriginalTxn;

	@XmlElement(name = "Mov8MontoTxn")
	private String Mov8MontoTxn;

	@XmlElement(name = "Mov8SigMontoTxn")
	private String Mov8SigMontoTxn;

	@XmlElement(name = "Mov8TipoTarjeta")
	private String Mov8TipoTarjeta;

	@XmlElement(name = "Mov8Filler")
	private String Mov8Filler;

	@XmlElement(name = "Mov9FechaTxn")
	private String Mov9FechaTxn;

	@XmlElement(name = "Mov9DesTxn")
	private String Mov9DesTxn;

	@XmlElement(name = "Mov9MonOriginalTxn")
	private String Mov9MonOriginalTxn;

	@XmlElement(name = "Mov9MontoTxn")
	private String Mov9MontoTxn;

	@XmlElement(name = "Mov9SigMontoTxn")
	private String Mov9SigMontoTxn;

	@XmlElement(name = "Mov9TipoTarjeta")
	private String Mov9TipoTarjeta;

	@XmlElement(name = "Mov9Filler")
	private String Mov9Filler;

	@XmlElement(name = "Mov10FechaTxn")
	private String Mov10FechaTxn;

	@XmlElement(name = "Mov10DesTxn")
	private String Mov10DesTxn;

	@XmlElement(name = "Mov10MonOriginalTxn")
	private String Mov10MonOriginalTxn;

	@XmlElement(name = "Mov10MontoTxn")
	private String Mov10MontoTxn;

	@XmlElement(name = "Mov10SigMontoTxn")
	private String Mov10SigMontoTxn;

	@XmlElement(name = "Mov10TipoTarjeta")
	private String Mov10TipoTarjeta;

	@XmlElement(name = "Mov10Filler")
	private String Mov10Filler;

	@XmlElement(name = "Mov11FechaTxn")
	private String Mov11FechaTxn;

	@XmlElement(name = "Mov11DesTxn")
	private String Mov11DesTxn;

	@XmlElement(name = "Mov11MonOriginalTxn")
	private String Mov11MonOriginalTxn;

	@XmlElement(name = "Mov11MontoTxn")
	private String Mov11MontoTxn;

	@XmlElement(name = "Mov11SigMontoTxn")
	private String Mov11SigMontoTxn;

	@XmlElement(name = "Mov11TipoTarjeta")
	private String Mov11TipoTarjeta;

	@XmlElement(name = "Mov11Filler")
	private String Mov11Filler;

	@XmlElement(name = "Mov12FechaTxn")
	private String Mov12FechaTxn;

	@XmlElement(name = "Mov12DesTxn")
	private String Mov12DesTxn;

	@XmlElement(name = "Mov12MonOriginalTxn")
	private String Mov12MonOriginalTxn;

	@XmlElement(name = "Mov12MontoTxn")
	private String Mov12MontoTxn;

	@XmlElement(name = "Mov12SigMontoTxn")
	private String Mov12SigMontoTxn;

	@XmlElement(name = "Mov12TipoTarjeta")
	private String Mov12TipoTarjeta;

	@XmlElement(name = "Mov12Filler")
	private String Mov12Filler;

	@XmlElement(name = "Mov13FechaTxn")
	private String Mov13FechaTxn;

	@XmlElement(name = "Mov13DesTxn")
	private String Mov13DesTxn;

	@XmlElement(name = "Mov13MonOriginalTxn")
	private String Mov13MonOriginalTxn;

	@XmlElement(name = "Mov13MontoTxn")
	private String Mov13MontoTxn;

	@XmlElement(name = "Mov13SigMontoTxn")
	private String Mov13SigMontoTxn;

	@XmlElement(name = "Mov13TipoTarjeta")
	private String Mov13TipoTarjeta;

	@XmlElement(name = "Mov13Filler")
	private String Mov13Filler;

	@XmlElement(name = "Mov14FechaTxn")
	private String Mov14FechaTxn;

	@XmlElement(name = "Mov14DesTxn")
	private String Mov14DesTxn;

	@XmlElement(name = "Mov14MonOriginalTxn")
	private String Mov14MonOriginalTxn;

	@XmlElement(name = "Mov14MontoTxn")
	private String Mov14MontoTxn;

	@XmlElement(name = "Mov14SigMontoTxn")
	private String Mov14SigMontoTxn;

	@XmlElement(name = "Mov14TipoTarjeta")
	private String Mov14TipoTarjeta;

	@XmlElement(name = "Mov14Filler")
	private String Mov14Filler;

	@XmlElement(name = "Mov15FechaTxn")
	private String Mov15FechaTxn;

	@XmlElement(name = "Mov15DesTxn")
	private String Mov15DesTxn;

	@XmlElement(name = "Mov15MonOriginalTxn")
	private String Mov15MonOriginalTxn;

	@XmlElement(name = "Mov15MontoTxn")
	private String Mov15MontoTxn;

	@XmlElement(name = "Mov15SigMontoTxn")
	private String Mov15SigMontoTxn;

	@XmlElement(name = "Mov15TipoTarjeta")
	private String Mov15TipoTarjeta;

	@XmlElement(name = "Mov15Filler")
	private String Mov15Filler;

	@XmlElement(name = "Mov16FechaTxn")
	private String Mov16FechaTxn;

	@XmlElement(name = "Mov16DesTxn")
	private String Mov16DesTxn;

	@XmlElement(name = "Mov16MonOriginalTxn")
	private String Mov16MonOriginalTxn;

	@XmlElement(name = "Mov16MontoTxn")
	private String Mov16MontoTxn;

	@XmlElement(name = "Mov16SigMontoTxn")
	private String Mov16SigMontoTxn;

	@XmlElement(name = "Mov16TipoTarjeta")
	private String Mov16TipoTarjeta;

	@XmlElement(name = "Mov16Filler")
	private String Mov16Filler;

	@XmlElement(name = "Mov17FechaTxn")
	private String Mov17FechaTxn;

	@XmlElement(name = "Mov17DesTxn")
	private String Mov17DesTxn;

	@XmlElement(name = "Mov17MonOriginalTxn")
	private String Mov17MonOriginalTxn;

	@XmlElement(name = "Mov17MontoTxn")
	private String Mov17MontoTxn;

	@XmlElement(name = "Mov17SigMontoTxn")
	private String Mov17SigMontoTxn;

	@XmlElement(name = "Mov17TipoTarjeta")
	private String Mov17TipoTarjeta;

	@XmlElement(name = "Mov17Filler")
	private String Mov17Filler;

	@XmlElement(name = "Mov18FechaTxn")
	private String Mov18FechaTxn;

	@XmlElement(name = "Mov18DesTxn")
	private String Mov18DesTxn;

	@XmlElement(name = "Mov18MonOriginalTxn")
	private String Mov18MonOriginalTxn;

	@XmlElement(name = "Mov18MontoTxn")
	private String Mov18MontoTxn;

	@XmlElement(name = "Mov18SigMontoTxn")
	private String Mov18SigMontoTxn;

	@XmlElement(name = "Mov18TipoTarjeta")
	private String Mov18TipoTarjeta;

	@XmlElement(name = "Mov18Filler")
	private String Mov18Filler;

	@XmlElement(name = "Mov19FechaTxn")
	private String Mov19FechaTxn;

	@XmlElement(name = "Mov19DesTxn")
	private String Mov19DesTxn;

	@XmlElement(name = "Mov19MonOriginalTxn")
	private String Mov19MonOriginalTxn;

	@XmlElement(name = "Mov19MontoTxn")
	private String Mov19MontoTxn;

	@XmlElement(name = "Mov19SigMontoTxn")
	private String Mov19SigMontoTxn;

	@XmlElement(name = "Mov19TipoTarjeta")
	private String Mov19TipoTarjeta;

	@XmlElement(name = "Mov19Filler")
	private String Mov19Filler;

	@XmlElement(name = "Mov20FechaTxn")
	private String Mov20FechaTxn;

	@XmlElement(name = "Mov20DesTxn")
	private String Mov20DesTxn;

	@XmlElement(name = "Mov20MonOriginalTxn")
	private String Mov20MonOriginalTxn;

	@XmlElement(name = "Mov20MontoTxn")
	private String Mov20MontoTxn;

	@XmlElement(name = "Mov20SigMontoTxn")
	private String Mov20SigMontoTxn;

	@XmlElement(name = "Mov20TipoTarjeta")
	private String Mov20TipoTarjeta;

	@XmlElement(name = "Mov20Filler")
	private String Mov20Filler;

	// Getter Methods

	public String getCodEmisor() {
		return CodEmisor;
	}

	public String getCodUsuario() {
		return CodUsuario;
	}

	public String getNumTerminal() {
		return NumTerminal;
	}

	public String getNumTarjetaMonedero() {
		return NumTarjetaMonedero;
	}

	public String getNumReferencia() {
		return NumReferencia;
	}

	public String getFechaExpiracion() {
		return FechaExpiracion;
	}

	public String getComercio() {
		return Comercio;
	}

	public String getMoneda() {
		return Moneda;
	}

	public String getFechaTxnTerminal() {
		return FechaTxnTerminal;
	}

	public String getHoraTxnTerminal() {
		return HoraTxnTerminal;
	}

	public String getReservado() {
		return Reservado;
	}

	public String getIdTransaccion() {
		return IdTransaccion;
	}

	public String getCodRespuesta() {
		return CodRespuesta;
	}

	public String getDescRespuesta() {
		return DescRespuesta;
	}

	public String getCodAutorizacion() {
		return CodAutorizacion;
	}

	public String getMoviMoneda() {
		return MoviMoneda;
	}

	public String getMoviCodBloqueo() {
		return MoviCodBloqueo;
	}

	public String getMoviDescBloqueo() {
		return MoviDescBloqueo;
	}

	public String getMoviNombreTarjeta() {
		return MoviNombreTarjeta;
	}

	public String getMoviFechaExpiracion() {
		return MoviFechaExpiracion;
	}

	public String getMoviUltMovimientos() {
		return MoviUltMovimientos;
	}

	public String getMov1FechaTxn() {
		return Mov1FechaTxn;
	}

	public String getMov1DesTxn() {
		return Mov1DesTxn;
	}

	public String getMov1MonOriginalTxn() {
		return Mov1MonOriginalTxn;
	}

	public String getMov1MontoTxn() {
		return Mov1MontoTxn;
	}

	public String getMov1SigMontoTxn() {
		return Mov1SigMontoTxn;
	}

	public String getMov1TipoTarjeta() {
		return Mov1TipoTarjeta;
	}

	public String getMov1Filler() {
		return Mov1Filler;
	}

	public String getMov2FechaTxn() {
		return Mov2FechaTxn;
	}

	public String getMov2DesTxn() {
		return Mov2DesTxn;
	}

	public String getMov2MonOriginalTxn() {
		return Mov2MonOriginalTxn;
	}

	public String getMov2MontoTxn() {
		return Mov2MontoTxn;
	}

	public String getMov2SigMontoTxn() {
		return Mov2SigMontoTxn;
	}

	public String getMov2TipoTarjeta() {
		return Mov2TipoTarjeta;
	}

	public String getMov2Filler() {
		return Mov2Filler;
	}

	public String getMov3FechaTxn() {
		return Mov3FechaTxn;
	}

	public String getMov3DesTxn() {
		return Mov3DesTxn;
	}

	public String getMov3MonOriginalTxn() {
		return Mov3MonOriginalTxn;
	}

	public String getMov3MontoTxn() {
		return Mov3MontoTxn;
	}

	public String getMov3SigMontoTxn() {
		return Mov3SigMontoTxn;
	}

	public String getMov3TipoTarjeta() {
		return Mov3TipoTarjeta;
	}

	public String getMov3Filler() {
		return Mov3Filler;
	}

	public String getMov4FechaTxn() {
		return Mov4FechaTxn;
	}

	public String getMov4DesTxn() {
		return Mov4DesTxn;
	}

	public String getMov4MonOriginalTxn() {
		return Mov4MonOriginalTxn;
	}

	public String getMov4MontoTxn() {
		return Mov4MontoTxn;
	}

	public String getMov4SigMontoTxn() {
		return Mov4SigMontoTxn;
	}

	public String getMov4TipoTarjeta() {
		return Mov4TipoTarjeta;
	}

	public String getMov4Filler() {
		return Mov4Filler;
	}

	public String getMov5FechaTxn() {
		return Mov5FechaTxn;
	}

	public String getMov5DesTxn() {
		return Mov5DesTxn;
	}

	public String getMov5MonOriginalTxn() {
		return Mov5MonOriginalTxn;
	}

	public String getMov5MontoTxn() {
		return Mov5MontoTxn;
	}

	public String getMov5SigMontoTxn() {
		return Mov5SigMontoTxn;
	}

	public String getMov5TipoTarjeta() {
		return Mov5TipoTarjeta;
	}

	public String getMov5Filler() {
		return Mov5Filler;
	}

	public String getMov6FechaTxn() {
		return Mov6FechaTxn;
	}

	public String getMov6DesTxn() {
		return Mov6DesTxn;
	}

	public String getMov6MonOriginalTxn() {
		return Mov6MonOriginalTxn;
	}

	public String getMov6MontoTxn() {
		return Mov6MontoTxn;
	}

	public String getMov6SigMontoTxn() {
		return Mov6SigMontoTxn;
	}

	public String getMov6TipoTarjeta() {
		return Mov6TipoTarjeta;
	}

	public String getMov6Filler() {
		return Mov6Filler;
	}

	public String getMov7FechaTxn() {
		return Mov7FechaTxn;
	}

	public String getMov7DesTxn() {
		return Mov7DesTxn;
	}

	public String getMov7MonOriginalTxn() {
		return Mov7MonOriginalTxn;
	}

	public String getMov7MontoTxn() {
		return Mov7MontoTxn;
	}

	public String getMov7SigMontoTxn() {
		return Mov7SigMontoTxn;
	}

	public String getMov7TipoTarjeta() {
		return Mov7TipoTarjeta;
	}

	public String getMov7Filler() {
		return Mov7Filler;
	}

	public String getMov8FechaTxn() {
		return Mov8FechaTxn;
	}

	public String getMov8DesTxn() {
		return Mov8DesTxn;
	}

	public String getMov8MonOriginalTxn() {
		return Mov8MonOriginalTxn;
	}

	public String getMov8MontoTxn() {
		return Mov8MontoTxn;
	}

	public String getMov8SigMontoTxn() {
		return Mov8SigMontoTxn;
	}

	public String getMov8TipoTarjeta() {
		return Mov8TipoTarjeta;
	}

	public String getMov8Filler() {
		return Mov8Filler;
	}

	public String getMov9FechaTxn() {
		return Mov9FechaTxn;
	}

	public String getMov9DesTxn() {
		return Mov9DesTxn;
	}

	public String getMov9MonOriginalTxn() {
		return Mov9MonOriginalTxn;
	}

	public String getMov9MontoTxn() {
		return Mov9MontoTxn;
	}

	public String getMov9SigMontoTxn() {
		return Mov9SigMontoTxn;
	}

	public String getMov9TipoTarjeta() {
		return Mov9TipoTarjeta;
	}

	public String getMov9Filler() {
		return Mov9Filler;
	}

	public String getMov10FechaTxn() {
		return Mov10FechaTxn;
	}

	public String getMov10DesTxn() {
		return Mov10DesTxn;
	}

	public String getMov10MonOriginalTxn() {
		return Mov10MonOriginalTxn;
	}

	public String getMov10MontoTxn() {
		return Mov10MontoTxn;
	}

	public String getMov10SigMontoTxn() {
		return Mov10SigMontoTxn;
	}

	public String getMov10TipoTarjeta() {
		return Mov10TipoTarjeta;
	}

	public String getMov10Filler() {
		return Mov10Filler;
	}

	public String getMov11FechaTxn() {
		return Mov11FechaTxn;
	}

	public String getMov11DesTxn() {
		return Mov11DesTxn;
	}

	public String getMov11MonOriginalTxn() {
		return Mov11MonOriginalTxn;
	}

	public String getMov11MontoTxn() {
		return Mov11MontoTxn;
	}

	public String getMov11SigMontoTxn() {
		return Mov11SigMontoTxn;
	}

	public String getMov11TipoTarjeta() {
		return Mov11TipoTarjeta;
	}

	public String getMov11Filler() {
		return Mov11Filler;
	}

	public String getMov12FechaTxn() {
		return Mov12FechaTxn;
	}

	public String getMov12DesTxn() {
		return Mov12DesTxn;
	}

	public String getMov12MonOriginalTxn() {
		return Mov12MonOriginalTxn;
	}

	public String getMov12MontoTxn() {
		return Mov12MontoTxn;
	}

	public String getMov12SigMontoTxn() {
		return Mov12SigMontoTxn;
	}

	public String getMov12TipoTarjeta() {
		return Mov12TipoTarjeta;
	}

	public String getMov12Filler() {
		return Mov12Filler;
	}

	public String getMov13FechaTxn() {
		return Mov13FechaTxn;
	}

	public String getMov13DesTxn() {
		return Mov13DesTxn;
	}

	public String getMov13MonOriginalTxn() {
		return Mov13MonOriginalTxn;
	}

	public String getMov13MontoTxn() {
		return Mov13MontoTxn;
	}

	public String getMov13SigMontoTxn() {
		return Mov13SigMontoTxn;
	}

	public String getMov13TipoTarjeta() {
		return Mov13TipoTarjeta;
	}

	public String getMov13Filler() {
		return Mov13Filler;
	}

	public String getMov14FechaTxn() {
		return Mov14FechaTxn;
	}

	public String getMov14DesTxn() {
		return Mov14DesTxn;
	}

	public String getMov14MonOriginalTxn() {
		return Mov14MonOriginalTxn;
	}

	public String getMov14MontoTxn() {
		return Mov14MontoTxn;
	}

	public String getMov14SigMontoTxn() {
		return Mov14SigMontoTxn;
	}

	public String getMov14TipoTarjeta() {
		return Mov14TipoTarjeta;
	}

	public String getMov14Filler() {
		return Mov14Filler;
	}

	public String getMov15FechaTxn() {
		return Mov15FechaTxn;
	}

	public String getMov15DesTxn() {
		return Mov15DesTxn;
	}

	public String getMov15MonOriginalTxn() {
		return Mov15MonOriginalTxn;
	}

	public String getMov15MontoTxn() {
		return Mov15MontoTxn;
	}

	public String getMov15SigMontoTxn() {
		return Mov15SigMontoTxn;
	}

	public String getMov15TipoTarjeta() {
		return Mov15TipoTarjeta;
	}

	public String getMov15Filler() {
		return Mov15Filler;
	}

	public String getMov16FechaTxn() {
		return Mov16FechaTxn;
	}

	public String getMov16DesTxn() {
		return Mov16DesTxn;
	}

	public String getMov16MonOriginalTxn() {
		return Mov16MonOriginalTxn;
	}

	public String getMov16MontoTxn() {
		return Mov16MontoTxn;
	}

	public String getMov16SigMontoTxn() {
		return Mov16SigMontoTxn;
	}

	public String getMov16TipoTarjeta() {
		return Mov16TipoTarjeta;
	}

	public String getMov16Filler() {
		return Mov16Filler;
	}

	public String getMov17FechaTxn() {
		return Mov17FechaTxn;
	}

	public String getMov17DesTxn() {
		return Mov17DesTxn;
	}

	public String getMov17MonOriginalTxn() {
		return Mov17MonOriginalTxn;
	}

	public String getMov17MontoTxn() {
		return Mov17MontoTxn;
	}

	public String getMov17SigMontoTxn() {
		return Mov17SigMontoTxn;
	}

	public String getMov17TipoTarjeta() {
		return Mov17TipoTarjeta;
	}

	public String getMov17Filler() {
		return Mov17Filler;
	}

	public String getMov18FechaTxn() {
		return Mov18FechaTxn;
	}

	public String getMov18DesTxn() {
		return Mov18DesTxn;
	}

	public String getMov18MonOriginalTxn() {
		return Mov18MonOriginalTxn;
	}

	public String getMov18MontoTxn() {
		return Mov18MontoTxn;
	}

	public String getMov18SigMontoTxn() {
		return Mov18SigMontoTxn;
	}

	public String getMov18TipoTarjeta() {
		return Mov18TipoTarjeta;
	}

	public String getMov18Filler() {
		return Mov18Filler;
	}

	public String getMov19FechaTxn() {
		return Mov19FechaTxn;
	}

	public String getMov19DesTxn() {
		return Mov19DesTxn;
	}

	public String getMov19MonOriginalTxn() {
		return Mov19MonOriginalTxn;
	}

	public String getMov19MontoTxn() {
		return Mov19MontoTxn;
	}

	public String getMov19SigMontoTxn() {
		return Mov19SigMontoTxn;
	}

	public String getMov19TipoTarjeta() {
		return Mov19TipoTarjeta;
	}

	public String getMov19Filler() {
		return Mov19Filler;
	}

	public String getMov20FechaTxn() {
		return Mov20FechaTxn;
	}

	public String getMov20DesTxn() {
		return Mov20DesTxn;
	}

	public String getMov20MonOriginalTxn() {
		return Mov20MonOriginalTxn;
	}

	public String getMov20MontoTxn() {
		return Mov20MontoTxn;
	}

	public String getMov20SigMontoTxn() {
		return Mov20SigMontoTxn;
	}

	public String getMov20TipoTarjeta() {
		return Mov20TipoTarjeta;
	}

	public String getMov20Filler() {
		return Mov20Filler;
	}

	// Setter Methods

	public void setCodEmisor(String CodEmisor) {
		this.CodEmisor = CodEmisor;
	}

	public void setCodUsuario(String CodUsuario) {
		this.CodUsuario = CodUsuario;
	}

	public void setNumTerminal(String NumTerminal) {
		this.NumTerminal = NumTerminal;
	}

	public void setNumTarjetaMonedero(String NumTarjetaMonedero) {
		this.NumTarjetaMonedero = NumTarjetaMonedero;
	}

	public void setNumReferencia(String NumReferencia) {
		this.NumReferencia = NumReferencia;
	}

	public void setFechaExpiracion(String FechaExpiracion) {
		this.FechaExpiracion = FechaExpiracion;
	}

	public void setComercio(String Comercio) {
		this.Comercio = Comercio;
	}

	public void setMoneda(String Moneda) {
		this.Moneda = Moneda;
	}

	public void setFechaTxnTerminal(String FechaTxnTerminal) {
		this.FechaTxnTerminal = FechaTxnTerminal;
	}

	public void setHoraTxnTerminal(String HoraTxnTerminal) {
		this.HoraTxnTerminal = HoraTxnTerminal;
	}

	public void setReservado(String Reservado) {
		this.Reservado = Reservado;
	}

	public void setIdTransaccion(String IdTransaccion) {
		this.IdTransaccion = IdTransaccion;
	}

	public void setCodRespuesta(String CodRespuesta) {
		this.CodRespuesta = CodRespuesta;
	}

	public void setDescRespuesta(String DescRespuesta) {
		this.DescRespuesta = DescRespuesta;
	}

	public void setCodAutorizacion(String CodAutorizacion) {
		this.CodAutorizacion = CodAutorizacion;
	}

	public void setMoviMoneda(String MoviMoneda) {
		this.MoviMoneda = MoviMoneda;
	}

	public void setMoviCodBloqueo(String MoviCodBloqueo) {
		this.MoviCodBloqueo = MoviCodBloqueo;
	}

	public void setMoviDescBloqueo(String MoviDescBloqueo) {
		this.MoviDescBloqueo = MoviDescBloqueo;
	}

	public void setMoviNombreTarjeta(String MoviNombreTarjeta) {
		this.MoviNombreTarjeta = MoviNombreTarjeta;
	}

	public void setMoviFechaExpiracion(String MoviFechaExpiracion) {
		this.MoviFechaExpiracion = MoviFechaExpiracion;
	}

	public void setMoviUltMovimientos(String MoviUltMovimientos) {
		this.MoviUltMovimientos = MoviUltMovimientos;
	}

	public void setMov1FechaTxn(String Mov1FechaTxn) {
		this.Mov1FechaTxn = Mov1FechaTxn;
	}

	public void setMov1DesTxn(String Mov1DesTxn) {
		this.Mov1DesTxn = Mov1DesTxn;
	}

	public void setMov1MonOriginalTxn(String Mov1MonOriginalTxn) {
		this.Mov1MonOriginalTxn = Mov1MonOriginalTxn;
	}

	public void setMov1MontoTxn(String Mov1MontoTxn) {
		this.Mov1MontoTxn = Mov1MontoTxn;
	}

	public void setMov1SigMontoTxn(String Mov1SigMontoTxn) {
		this.Mov1SigMontoTxn = Mov1SigMontoTxn;
	}

	public void setMov1TipoTarjeta(String Mov1TipoTarjeta) {
		this.Mov1TipoTarjeta = Mov1TipoTarjeta;
	}

	public void setMov1Filler(String Mov1Filler) {
		this.Mov1Filler = Mov1Filler;
	}

	public void setMov2FechaTxn(String Mov2FechaTxn) {
		this.Mov2FechaTxn = Mov2FechaTxn;
	}

	public void setMov2DesTxn(String Mov2DesTxn) {
		this.Mov2DesTxn = Mov2DesTxn;
	}

	public void setMov2MonOriginalTxn(String Mov2MonOriginalTxn) {
		this.Mov2MonOriginalTxn = Mov2MonOriginalTxn;
	}

	public void setMov2MontoTxn(String Mov2MontoTxn) {
		this.Mov2MontoTxn = Mov2MontoTxn;
	}

	public void setMov2SigMontoTxn(String Mov2SigMontoTxn) {
		this.Mov2SigMontoTxn = Mov2SigMontoTxn;
	}

	public void setMov2TipoTarjeta(String Mov2TipoTarjeta) {
		this.Mov2TipoTarjeta = Mov2TipoTarjeta;
	}

	public void setMov2Filler(String Mov2Filler) {
		this.Mov2Filler = Mov2Filler;
	}

	public void setMov3FechaTxn(String Mov3FechaTxn) {
		this.Mov3FechaTxn = Mov3FechaTxn;
	}

	public void setMov3DesTxn(String Mov3DesTxn) {
		this.Mov3DesTxn = Mov3DesTxn;
	}

	public void setMov3MonOriginalTxn(String Mov3MonOriginalTxn) {
		this.Mov3MonOriginalTxn = Mov3MonOriginalTxn;
	}

	public void setMov3MontoTxn(String Mov3MontoTxn) {
		this.Mov3MontoTxn = Mov3MontoTxn;
	}

	public void setMov3SigMontoTxn(String Mov3SigMontoTxn) {
		this.Mov3SigMontoTxn = Mov3SigMontoTxn;
	}

	public void setMov3TipoTarjeta(String Mov3TipoTarjeta) {
		this.Mov3TipoTarjeta = Mov3TipoTarjeta;
	}

	public void setMov3Filler(String Mov3Filler) {
		this.Mov3Filler = Mov3Filler;
	}

	public void setMov4FechaTxn(String Mov4FechaTxn) {
		this.Mov4FechaTxn = Mov4FechaTxn;
	}

	public void setMov4DesTxn(String Mov4DesTxn) {
		this.Mov4DesTxn = Mov4DesTxn;
	}

	public void setMov4MonOriginalTxn(String Mov4MonOriginalTxn) {
		this.Mov4MonOriginalTxn = Mov4MonOriginalTxn;
	}

	public void setMov4MontoTxn(String Mov4MontoTxn) {
		this.Mov4MontoTxn = Mov4MontoTxn;
	}

	public void setMov4SigMontoTxn(String Mov4SigMontoTxn) {
		this.Mov4SigMontoTxn = Mov4SigMontoTxn;
	}

	public void setMov4TipoTarjeta(String Mov4TipoTarjeta) {
		this.Mov4TipoTarjeta = Mov4TipoTarjeta;
	}

	public void setMov4Filler(String Mov4Filler) {
		this.Mov4Filler = Mov4Filler;
	}

	public void setMov5FechaTxn(String Mov5FechaTxn) {
		this.Mov5FechaTxn = Mov5FechaTxn;
	}

	public void setMov5DesTxn(String Mov5DesTxn) {
		this.Mov5DesTxn = Mov5DesTxn;
	}

	public void setMov5MonOriginalTxn(String Mov5MonOriginalTxn) {
		this.Mov5MonOriginalTxn = Mov5MonOriginalTxn;
	}

	public void setMov5MontoTxn(String Mov5MontoTxn) {
		this.Mov5MontoTxn = Mov5MontoTxn;
	}

	public void setMov5SigMontoTxn(String Mov5SigMontoTxn) {
		this.Mov5SigMontoTxn = Mov5SigMontoTxn;
	}

	public void setMov5TipoTarjeta(String Mov5TipoTarjeta) {
		this.Mov5TipoTarjeta = Mov5TipoTarjeta;
	}

	public void setMov5Filler(String Mov5Filler) {
		this.Mov5Filler = Mov5Filler;
	}

	public void setMov6FechaTxn(String Mov6FechaTxn) {
		this.Mov6FechaTxn = Mov6FechaTxn;
	}

	public void setMov6DesTxn(String Mov6DesTxn) {
		this.Mov6DesTxn = Mov6DesTxn;
	}

	public void setMov6MonOriginalTxn(String Mov6MonOriginalTxn) {
		this.Mov6MonOriginalTxn = Mov6MonOriginalTxn;
	}

	public void setMov6MontoTxn(String Mov6MontoTxn) {
		this.Mov6MontoTxn = Mov6MontoTxn;
	}

	public void setMov6SigMontoTxn(String Mov6SigMontoTxn) {
		this.Mov6SigMontoTxn = Mov6SigMontoTxn;
	}

	public void setMov6TipoTarjeta(String Mov6TipoTarjeta) {
		this.Mov6TipoTarjeta = Mov6TipoTarjeta;
	}

	public void setMov6Filler(String Mov6Filler) {
		this.Mov6Filler = Mov6Filler;
	}

	public void setMov7FechaTxn(String Mov7FechaTxn) {
		this.Mov7FechaTxn = Mov7FechaTxn;
	}

	public void setMov7DesTxn(String Mov7DesTxn) {
		this.Mov7DesTxn = Mov7DesTxn;
	}

	public void setMov7MonOriginalTxn(String Mov7MonOriginalTxn) {
		this.Mov7MonOriginalTxn = Mov7MonOriginalTxn;
	}

	public void setMov7MontoTxn(String Mov7MontoTxn) {
		this.Mov7MontoTxn = Mov7MontoTxn;
	}

	public void setMov7SigMontoTxn(String Mov7SigMontoTxn) {
		this.Mov7SigMontoTxn = Mov7SigMontoTxn;
	}

	public void setMov7TipoTarjeta(String Mov7TipoTarjeta) {
		this.Mov7TipoTarjeta = Mov7TipoTarjeta;
	}

	public void setMov7Filler(String Mov7Filler) {
		this.Mov7Filler = Mov7Filler;
	}

	public void setMov8FechaTxn(String Mov8FechaTxn) {
		this.Mov8FechaTxn = Mov8FechaTxn;
	}

	public void setMov8DesTxn(String Mov8DesTxn) {
		this.Mov8DesTxn = Mov8DesTxn;
	}

	public void setMov8MonOriginalTxn(String Mov8MonOriginalTxn) {
		this.Mov8MonOriginalTxn = Mov8MonOriginalTxn;
	}

	public void setMov8MontoTxn(String Mov8MontoTxn) {
		this.Mov8MontoTxn = Mov8MontoTxn;
	}

	public void setMov8SigMontoTxn(String Mov8SigMontoTxn) {
		this.Mov8SigMontoTxn = Mov8SigMontoTxn;
	}

	public void setMov8TipoTarjeta(String Mov8TipoTarjeta) {
		this.Mov8TipoTarjeta = Mov8TipoTarjeta;
	}

	public void setMov8Filler(String Mov8Filler) {
		this.Mov8Filler = Mov8Filler;
	}

	public void setMov9FechaTxn(String Mov9FechaTxn) {
		this.Mov9FechaTxn = Mov9FechaTxn;
	}

	public void setMov9DesTxn(String Mov9DesTxn) {
		this.Mov9DesTxn = Mov9DesTxn;
	}

	public void setMov9MonOriginalTxn(String Mov9MonOriginalTxn) {
		this.Mov9MonOriginalTxn = Mov9MonOriginalTxn;
	}

	public void setMov9MontoTxn(String Mov9MontoTxn) {
		this.Mov9MontoTxn = Mov9MontoTxn;
	}

	public void setMov9SigMontoTxn(String Mov9SigMontoTxn) {
		this.Mov9SigMontoTxn = Mov9SigMontoTxn;
	}

	public void setMov9TipoTarjeta(String Mov9TipoTarjeta) {
		this.Mov9TipoTarjeta = Mov9TipoTarjeta;
	}

	public void setMov9Filler(String Mov9Filler) {
		this.Mov9Filler = Mov9Filler;
	}

	public void setMov10FechaTxn(String Mov10FechaTxn) {
		this.Mov10FechaTxn = Mov10FechaTxn;
	}

	public void setMov10DesTxn(String Mov10DesTxn) {
		this.Mov10DesTxn = Mov10DesTxn;
	}

	public void setMov10MonOriginalTxn(String Mov10MonOriginalTxn) {
		this.Mov10MonOriginalTxn = Mov10MonOriginalTxn;
	}

	public void setMov10MontoTxn(String Mov10MontoTxn) {
		this.Mov10MontoTxn = Mov10MontoTxn;
	}

	public void setMov10SigMontoTxn(String Mov10SigMontoTxn) {
		this.Mov10SigMontoTxn = Mov10SigMontoTxn;
	}

	public void setMov10TipoTarjeta(String Mov10TipoTarjeta) {
		this.Mov10TipoTarjeta = Mov10TipoTarjeta;
	}

	public void setMov10Filler(String Mov10Filler) {
		this.Mov10Filler = Mov10Filler;
	}

	public void setMov11FechaTxn(String Mov11FechaTxn) {
		this.Mov11FechaTxn = Mov11FechaTxn;
	}

	public void setMov11DesTxn(String Mov11DesTxn) {
		this.Mov11DesTxn = Mov11DesTxn;
	}

	public void setMov11MonOriginalTxn(String Mov11MonOriginalTxn) {
		this.Mov11MonOriginalTxn = Mov11MonOriginalTxn;
	}

	public void setMov11MontoTxn(String Mov11MontoTxn) {
		this.Mov11MontoTxn = Mov11MontoTxn;
	}

	public void setMov11SigMontoTxn(String Mov11SigMontoTxn) {
		this.Mov11SigMontoTxn = Mov11SigMontoTxn;
	}

	public void setMov11TipoTarjeta(String Mov11TipoTarjeta) {
		this.Mov11TipoTarjeta = Mov11TipoTarjeta;
	}

	public void setMov11Filler(String Mov11Filler) {
		this.Mov11Filler = Mov11Filler;
	}

	public void setMov12FechaTxn(String Mov12FechaTxn) {
		this.Mov12FechaTxn = Mov12FechaTxn;
	}

	public void setMov12DesTxn(String Mov12DesTxn) {
		this.Mov12DesTxn = Mov12DesTxn;
	}

	public void setMov12MonOriginalTxn(String Mov12MonOriginalTxn) {
		this.Mov12MonOriginalTxn = Mov12MonOriginalTxn;
	}

	public void setMov12MontoTxn(String Mov12MontoTxn) {
		this.Mov12MontoTxn = Mov12MontoTxn;
	}

	public void setMov12SigMontoTxn(String Mov12SigMontoTxn) {
		this.Mov12SigMontoTxn = Mov12SigMontoTxn;
	}

	public void setMov12TipoTarjeta(String Mov12TipoTarjeta) {
		this.Mov12TipoTarjeta = Mov12TipoTarjeta;
	}

	public void setMov12Filler(String Mov12Filler) {
		this.Mov12Filler = Mov12Filler;
	}

	public void setMov13FechaTxn(String Mov13FechaTxn) {
		this.Mov13FechaTxn = Mov13FechaTxn;
	}

	public void setMov13DesTxn(String Mov13DesTxn) {
		this.Mov13DesTxn = Mov13DesTxn;
	}

	public void setMov13MonOriginalTxn(String Mov13MonOriginalTxn) {
		this.Mov13MonOriginalTxn = Mov13MonOriginalTxn;
	}

	public void setMov13MontoTxn(String Mov13MontoTxn) {
		this.Mov13MontoTxn = Mov13MontoTxn;
	}

	public void setMov13SigMontoTxn(String Mov13SigMontoTxn) {
		this.Mov13SigMontoTxn = Mov13SigMontoTxn;
	}

	public void setMov13TipoTarjeta(String Mov13TipoTarjeta) {
		this.Mov13TipoTarjeta = Mov13TipoTarjeta;
	}

	public void setMov13Filler(String Mov13Filler) {
		this.Mov13Filler = Mov13Filler;
	}

	public void setMov14FechaTxn(String Mov14FechaTxn) {
		this.Mov14FechaTxn = Mov14FechaTxn;
	}

	public void setMov14DesTxn(String Mov14DesTxn) {
		this.Mov14DesTxn = Mov14DesTxn;
	}

	public void setMov14MonOriginalTxn(String Mov14MonOriginalTxn) {
		this.Mov14MonOriginalTxn = Mov14MonOriginalTxn;
	}

	public void setMov14MontoTxn(String Mov14MontoTxn) {
		this.Mov14MontoTxn = Mov14MontoTxn;
	}

	public void setMov14SigMontoTxn(String Mov14SigMontoTxn) {
		this.Mov14SigMontoTxn = Mov14SigMontoTxn;
	}

	public void setMov14TipoTarjeta(String Mov14TipoTarjeta) {
		this.Mov14TipoTarjeta = Mov14TipoTarjeta;
	}

	public void setMov14Filler(String Mov14Filler) {
		this.Mov14Filler = Mov14Filler;
	}

	public void setMov15FechaTxn(String Mov15FechaTxn) {
		this.Mov15FechaTxn = Mov15FechaTxn;
	}

	public void setMov15DesTxn(String Mov15DesTxn) {
		this.Mov15DesTxn = Mov15DesTxn;
	}

	public void setMov15MonOriginalTxn(String Mov15MonOriginalTxn) {
		this.Mov15MonOriginalTxn = Mov15MonOriginalTxn;
	}

	public void setMov15MontoTxn(String Mov15MontoTxn) {
		this.Mov15MontoTxn = Mov15MontoTxn;
	}

	public void setMov15SigMontoTxn(String Mov15SigMontoTxn) {
		this.Mov15SigMontoTxn = Mov15SigMontoTxn;
	}

	public void setMov15TipoTarjeta(String Mov15TipoTarjeta) {
		this.Mov15TipoTarjeta = Mov15TipoTarjeta;
	}

	public void setMov15Filler(String Mov15Filler) {
		this.Mov15Filler = Mov15Filler;
	}

	public void setMov16FechaTxn(String Mov16FechaTxn) {
		this.Mov16FechaTxn = Mov16FechaTxn;
	}

	public void setMov16DesTxn(String Mov16DesTxn) {
		this.Mov16DesTxn = Mov16DesTxn;
	}

	public void setMov16MonOriginalTxn(String Mov16MonOriginalTxn) {
		this.Mov16MonOriginalTxn = Mov16MonOriginalTxn;
	}

	public void setMov16MontoTxn(String Mov16MontoTxn) {
		this.Mov16MontoTxn = Mov16MontoTxn;
	}

	public void setMov16SigMontoTxn(String Mov16SigMontoTxn) {
		this.Mov16SigMontoTxn = Mov16SigMontoTxn;
	}

	public void setMov16TipoTarjeta(String Mov16TipoTarjeta) {
		this.Mov16TipoTarjeta = Mov16TipoTarjeta;
	}

	public void setMov16Filler(String Mov16Filler) {
		this.Mov16Filler = Mov16Filler;
	}

	public void setMov17FechaTxn(String Mov17FechaTxn) {
		this.Mov17FechaTxn = Mov17FechaTxn;
	}

	public void setMov17DesTxn(String Mov17DesTxn) {
		this.Mov17DesTxn = Mov17DesTxn;
	}

	public void setMov17MonOriginalTxn(String Mov17MonOriginalTxn) {
		this.Mov17MonOriginalTxn = Mov17MonOriginalTxn;
	}

	public void setMov17MontoTxn(String Mov17MontoTxn) {
		this.Mov17MontoTxn = Mov17MontoTxn;
	}

	public void setMov17SigMontoTxn(String Mov17SigMontoTxn) {
		this.Mov17SigMontoTxn = Mov17SigMontoTxn;
	}

	public void setMov17TipoTarjeta(String Mov17TipoTarjeta) {
		this.Mov17TipoTarjeta = Mov17TipoTarjeta;
	}

	public void setMov17Filler(String Mov17Filler) {
		this.Mov17Filler = Mov17Filler;
	}

	public void setMov18FechaTxn(String Mov18FechaTxn) {
		this.Mov18FechaTxn = Mov18FechaTxn;
	}

	public void setMov18DesTxn(String Mov18DesTxn) {
		this.Mov18DesTxn = Mov18DesTxn;
	}

	public void setMov18MonOriginalTxn(String Mov18MonOriginalTxn) {
		this.Mov18MonOriginalTxn = Mov18MonOriginalTxn;
	}

	public void setMov18MontoTxn(String Mov18MontoTxn) {
		this.Mov18MontoTxn = Mov18MontoTxn;
	}

	public void setMov18SigMontoTxn(String Mov18SigMontoTxn) {
		this.Mov18SigMontoTxn = Mov18SigMontoTxn;
	}

	public void setMov18TipoTarjeta(String Mov18TipoTarjeta) {
		this.Mov18TipoTarjeta = Mov18TipoTarjeta;
	}

	public void setMov18Filler(String Mov18Filler) {
		this.Mov18Filler = Mov18Filler;
	}

	public void setMov19FechaTxn(String Mov19FechaTxn) {
		this.Mov19FechaTxn = Mov19FechaTxn;
	}

	public void setMov19DesTxn(String Mov19DesTxn) {
		this.Mov19DesTxn = Mov19DesTxn;
	}

	public void setMov19MonOriginalTxn(String Mov19MonOriginalTxn) {
		this.Mov19MonOriginalTxn = Mov19MonOriginalTxn;
	}

	public void setMov19MontoTxn(String Mov19MontoTxn) {
		this.Mov19MontoTxn = Mov19MontoTxn;
	}

	public void setMov19SigMontoTxn(String Mov19SigMontoTxn) {
		this.Mov19SigMontoTxn = Mov19SigMontoTxn;
	}

	public void setMov19TipoTarjeta(String Mov19TipoTarjeta) {
		this.Mov19TipoTarjeta = Mov19TipoTarjeta;
	}

	public void setMov19Filler(String Mov19Filler) {
		this.Mov19Filler = Mov19Filler;
	}

	public void setMov20FechaTxn(String Mov20FechaTxn) {
		this.Mov20FechaTxn = Mov20FechaTxn;
	}

	public void setMov20DesTxn(String Mov20DesTxn) {
		this.Mov20DesTxn = Mov20DesTxn;
	}

	public void setMov20MonOriginalTxn(String Mov20MonOriginalTxn) {
		this.Mov20MonOriginalTxn = Mov20MonOriginalTxn;
	}

	public void setMov20MontoTxn(String Mov20MontoTxn) {
		this.Mov20MontoTxn = Mov20MontoTxn;
	}

	public void setMov20SigMontoTxn(String Mov20SigMontoTxn) {
		this.Mov20SigMontoTxn = Mov20SigMontoTxn;
	}

	public void setMov20TipoTarjeta(String Mov20TipoTarjeta) {
		this.Mov20TipoTarjeta = Mov20TipoTarjeta;
	}

	public void setMov20Filler(String Mov20Filler) {
		this.Mov20Filler = Mov20Filler;
	}

	@Override
	public String toString() {
		return "ConsultaMovimientos [CodEmisor=" + CodEmisor + ", CodUsuario="
				+ CodUsuario + ", NumTerminal=" + NumTerminal
				+ ", NumTarjetaMonedero=" + NumTarjetaMonedero
				+ ", NumReferencia=" + NumReferencia + ", FechaExpiracion="
				+ FechaExpiracion + ", Comercio=" + Comercio + ", Moneda="
				+ Moneda + ", FechaTxnTerminal=" + FechaTxnTerminal
				+ ", HoraTxnTerminal=" + HoraTxnTerminal + ", Reservado="
				+ Reservado + ", IdTransaccion=" + IdTransaccion
				+ ", CodRespuesta=" + CodRespuesta + ", DescRespuesta="
				+ DescRespuesta + ", CodAutorizacion=" + CodAutorizacion
				+ ", MoviMoneda=" + MoviMoneda + ", MoviCodBloqueo="
				+ MoviCodBloqueo + ", MoviDescBloqueo=" + MoviDescBloqueo
				+ ", MoviNombreTarjeta=" + MoviNombreTarjeta
				+ ", MoviFechaExpiracion=" + MoviFechaExpiracion
				+ ", MoviUltMovimientos=" + MoviUltMovimientos
				+ ", Mov1FechaTxn=" + Mov1FechaTxn + ", Mov1DesTxn="
				+ Mov1DesTxn + ", Mov1MonOriginalTxn=" + Mov1MonOriginalTxn
				+ ", Mov1MontoTxn=" + Mov1MontoTxn + ", Mov1SigMontoTxn="
				+ Mov1SigMontoTxn + ", Mov1TipoTarjeta=" + Mov1TipoTarjeta
				+ ", Mov1Filler=" + Mov1Filler + ", Mov2FechaTxn="
				+ Mov2FechaTxn + ", Mov2DesTxn=" + Mov2DesTxn
				+ ", Mov2MonOriginalTxn=" + Mov2MonOriginalTxn
				+ ", Mov2MontoTxn=" + Mov2MontoTxn + ", Mov2SigMontoTxn="
				+ Mov2SigMontoTxn + ", Mov2TipoTarjeta=" + Mov2TipoTarjeta
				+ ", Mov2Filler=" + Mov2Filler + ", Mov3FechaTxn="
				+ Mov3FechaTxn + ", Mov3DesTxn=" + Mov3DesTxn
				+ ", Mov3MonOriginalTxn=" + Mov3MonOriginalTxn
				+ ", Mov3MontoTxn=" + Mov3MontoTxn + ", Mov3SigMontoTxn="
				+ Mov3SigMontoTxn + ", Mov3TipoTarjeta=" + Mov3TipoTarjeta
				+ ", Mov3Filler=" + Mov3Filler + ", Mov4FechaTxn="
				+ Mov4FechaTxn + ", Mov4DesTxn=" + Mov4DesTxn
				+ ", Mov4MonOriginalTxn=" + Mov4MonOriginalTxn
				+ ", Mov4MontoTxn=" + Mov4MontoTxn + ", Mov4SigMontoTxn="
				+ Mov4SigMontoTxn + ", Mov4TipoTarjeta=" + Mov4TipoTarjeta
				+ ", Mov4Filler=" + Mov4Filler + ", Mov5FechaTxn="
				+ Mov5FechaTxn + ", Mov5DesTxn=" + Mov5DesTxn
				+ ", Mov5MonOriginalTxn=" + Mov5MonOriginalTxn
				+ ", Mov5MontoTxn=" + Mov5MontoTxn + ", Mov5SigMontoTxn="
				+ Mov5SigMontoTxn + ", Mov5TipoTarjeta=" + Mov5TipoTarjeta
				+ ", Mov5Filler=" + Mov5Filler + ", Mov6FechaTxn="
				+ Mov6FechaTxn + ", Mov6DesTxn=" + Mov6DesTxn
				+ ", Mov6MonOriginalTxn=" + Mov6MonOriginalTxn
				+ ", Mov6MontoTxn=" + Mov6MontoTxn + ", Mov6SigMontoTxn="
				+ Mov6SigMontoTxn + ", Mov6TipoTarjeta=" + Mov6TipoTarjeta
				+ ", Mov6Filler=" + Mov6Filler + ", Mov7FechaTxn="
				+ Mov7FechaTxn + ", Mov7DesTxn=" + Mov7DesTxn
				+ ", Mov7MonOriginalTxn=" + Mov7MonOriginalTxn
				+ ", Mov7MontoTxn=" + Mov7MontoTxn + ", Mov7SigMontoTxn="
				+ Mov7SigMontoTxn + ", Mov7TipoTarjeta=" + Mov7TipoTarjeta
				+ ", Mov7Filler=" + Mov7Filler + ", Mov8FechaTxn="
				+ Mov8FechaTxn + ", Mov8DesTxn=" + Mov8DesTxn
				+ ", Mov8MonOriginalTxn=" + Mov8MonOriginalTxn
				+ ", Mov8MontoTxn=" + Mov8MontoTxn + ", Mov8SigMontoTxn="
				+ Mov8SigMontoTxn + ", Mov8TipoTarjeta=" + Mov8TipoTarjeta
				+ ", Mov8Filler=" + Mov8Filler + ", Mov9FechaTxn="
				+ Mov9FechaTxn + ", Mov9DesTxn=" + Mov9DesTxn
				+ ", Mov9MonOriginalTxn=" + Mov9MonOriginalTxn
				+ ", Mov9MontoTxn=" + Mov9MontoTxn + ", Mov9SigMontoTxn="
				+ Mov9SigMontoTxn + ", Mov9TipoTarjeta=" + Mov9TipoTarjeta
				+ ", Mov9Filler=" + Mov9Filler + ", Mov10FechaTxn="
				+ Mov10FechaTxn + ", Mov10DesTxn=" + Mov10DesTxn
				+ ", Mov10MonOriginalTxn=" + Mov10MonOriginalTxn
				+ ", Mov10MontoTxn=" + Mov10MontoTxn + ", Mov10SigMontoTxn="
				+ Mov10SigMontoTxn + ", Mov10TipoTarjeta=" + Mov10TipoTarjeta
				+ ", Mov10Filler=" + Mov10Filler + ", Mov11FechaTxn="
				+ Mov11FechaTxn + ", Mov11DesTxn=" + Mov11DesTxn
				+ ", Mov11MonOriginalTxn=" + Mov11MonOriginalTxn
				+ ", Mov11MontoTxn=" + Mov11MontoTxn + ", Mov11SigMontoTxn="
				+ Mov11SigMontoTxn + ", Mov11TipoTarjeta=" + Mov11TipoTarjeta
				+ ", Mov11Filler=" + Mov11Filler + ", Mov12FechaTxn="
				+ Mov12FechaTxn + ", Mov12DesTxn=" + Mov12DesTxn
				+ ", Mov12MonOriginalTxn=" + Mov12MonOriginalTxn
				+ ", Mov12MontoTxn=" + Mov12MontoTxn + ", Mov12SigMontoTxn="
				+ Mov12SigMontoTxn + ", Mov12TipoTarjeta=" + Mov12TipoTarjeta
				+ ", Mov12Filler=" + Mov12Filler + ", Mov13FechaTxn="
				+ Mov13FechaTxn + ", Mov13DesTxn=" + Mov13DesTxn
				+ ", Mov13MonOriginalTxn=" + Mov13MonOriginalTxn
				+ ", Mov13MontoTxn=" + Mov13MontoTxn + ", Mov13SigMontoTxn="
				+ Mov13SigMontoTxn + ", Mov13TipoTarjeta=" + Mov13TipoTarjeta
				+ ", Mov13Filler=" + Mov13Filler + ", Mov14FechaTxn="
				+ Mov14FechaTxn + ", Mov14DesTxn=" + Mov14DesTxn
				+ ", Mov14MonOriginalTxn=" + Mov14MonOriginalTxn
				+ ", Mov14MontoTxn=" + Mov14MontoTxn + ", Mov14SigMontoTxn="
				+ Mov14SigMontoTxn + ", Mov14TipoTarjeta=" + Mov14TipoTarjeta
				+ ", Mov14Filler=" + Mov14Filler + ", Mov15FechaTxn="
				+ Mov15FechaTxn + ", Mov15DesTxn=" + Mov15DesTxn
				+ ", Mov15MonOriginalTxn=" + Mov15MonOriginalTxn
				+ ", Mov15MontoTxn=" + Mov15MontoTxn + ", Mov15SigMontoTxn="
				+ Mov15SigMontoTxn + ", Mov15TipoTarjeta=" + Mov15TipoTarjeta
				+ ", Mov15Filler=" + Mov15Filler + ", Mov16FechaTxn="
				+ Mov16FechaTxn + ", Mov16DesTxn=" + Mov16DesTxn
				+ ", Mov16MonOriginalTxn=" + Mov16MonOriginalTxn
				+ ", Mov16MontoTxn=" + Mov16MontoTxn + ", Mov16SigMontoTxn="
				+ Mov16SigMontoTxn + ", Mov16TipoTarjeta=" + Mov16TipoTarjeta
				+ ", Mov16Filler=" + Mov16Filler + ", Mov17FechaTxn="
				+ Mov17FechaTxn + ", Mov17DesTxn=" + Mov17DesTxn
				+ ", Mov17MonOriginalTxn=" + Mov17MonOriginalTxn
				+ ", Mov17MontoTxn=" + Mov17MontoTxn + ", Mov17SigMontoTxn="
				+ Mov17SigMontoTxn + ", Mov17TipoTarjeta=" + Mov17TipoTarjeta
				+ ", Mov17Filler=" + Mov17Filler + ", Mov18FechaTxn="
				+ Mov18FechaTxn + ", Mov18DesTxn=" + Mov18DesTxn
				+ ", Mov18MonOriginalTxn=" + Mov18MonOriginalTxn
				+ ", Mov18MontoTxn=" + Mov18MontoTxn + ", Mov18SigMontoTxn="
				+ Mov18SigMontoTxn + ", Mov18TipoTarjeta=" + Mov18TipoTarjeta
				+ ", Mov18Filler=" + Mov18Filler + ", Mov19FechaTxn="
				+ Mov19FechaTxn + ", Mov19DesTxn=" + Mov19DesTxn
				+ ", Mov19MonOriginalTxn=" + Mov19MonOriginalTxn
				+ ", Mov19MontoTxn=" + Mov19MontoTxn + ", Mov19SigMontoTxn="
				+ Mov19SigMontoTxn + ", Mov19TipoTarjeta=" + Mov19TipoTarjeta
				+ ", Mov19Filler=" + Mov19Filler + ", Mov20FechaTxn="
				+ Mov20FechaTxn + ", Mov20DesTxn=" + Mov20DesTxn
				+ ", Mov20MonOriginalTxn=" + Mov20MonOriginalTxn
				+ ", Mov20MontoTxn=" + Mov20MontoTxn + ", Mov20SigMontoTxn="
				+ Mov20SigMontoTxn + ", Mov20TipoTarjeta=" + Mov20TipoTarjeta
				+ ", Mov20Filler=" + Mov20Filler + "]";
	}

	public List<MovimientoTarjeta> obtenerMovimientosTarjeta() {
		List<MovimientoTarjeta> movimientoTarjetas = new ArrayList<MovimientoTarjeta>();
		int c = MoviUltMovimientos == null || MoviUltMovimientos.isEmpty() ? 0
				: Integer.parseInt(MoviUltMovimientos.trim());
		if (c > 0) {
			MovimientoTarjeta movimientoTarjeta1 = new MovimientoTarjeta();
			movimientoTarjeta1.setId("1".trim());
			movimientoTarjeta1.setFecha(Fecha.transformarADateMC(Mov1FechaTxn
					.trim()));
			movimientoTarjeta1.setDescripcionTransaccion(Mov1DesTxn.trim());
			movimientoTarjeta1.setMoneda(Mov1MonOriginalTxn.trim());
			movimientoTarjeta1.setMonto(Mov1MontoTxn.trim());
			movimientoTarjeta1.setTipoMonto(Mov1SigMontoTxn.trim());
			movimientoTarjeta1.setTipoTarjeta(Mov1TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta1);
		}
		if (c > 1) {
			MovimientoTarjeta movimientoTarjeta2 = new MovimientoTarjeta();
			movimientoTarjeta2.setId("2".trim());
			movimientoTarjeta2.setFecha(Fecha.transformarADateMC(Mov2FechaTxn
					.trim()));
			movimientoTarjeta2.setDescripcionTransaccion(Mov2DesTxn.trim());
			movimientoTarjeta2.setMoneda(Mov2MonOriginalTxn.trim());
			movimientoTarjeta2.setMonto(Mov2MontoTxn.trim());
			movimientoTarjeta2.setTipoMonto(Mov2SigMontoTxn.trim());
			movimientoTarjeta2.setTipoTarjeta(Mov2TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta2);
		}

		if (c > 2) {
			MovimientoTarjeta movimientoTarjeta3 = new MovimientoTarjeta();
			movimientoTarjeta3.setId("3".trim());
			movimientoTarjeta3.setFecha(Fecha.transformarADateMC(Mov3FechaTxn
					.trim()));
			movimientoTarjeta3.setDescripcionTransaccion(Mov3DesTxn.trim());
			movimientoTarjeta3.setMoneda(Mov3MonOriginalTxn.trim());
			movimientoTarjeta3.setMonto(Mov3MontoTxn.trim());
			movimientoTarjeta3.setTipoMonto(Mov3SigMontoTxn.trim());
			movimientoTarjeta3.setTipoTarjeta(Mov3TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta3);
		}

		if (c > 3) {
			MovimientoTarjeta movimientoTarjeta4 = new MovimientoTarjeta();
			movimientoTarjeta4.setId("4".trim());
			movimientoTarjeta4.setFecha(Fecha.transformarADateMC(Mov4FechaTxn
					.trim()));
			movimientoTarjeta4.setDescripcionTransaccion(Mov4DesTxn.trim());
			movimientoTarjeta4.setMoneda(Mov4MonOriginalTxn.trim());
			movimientoTarjeta4.setMonto(Mov4MontoTxn.trim());
			movimientoTarjeta4.setTipoMonto(Mov4SigMontoTxn.trim());
			movimientoTarjeta4.setTipoTarjeta(Mov4TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta4);
		}

		if (c > 4) {
			MovimientoTarjeta movimientoTarjeta5 = new MovimientoTarjeta();
			movimientoTarjeta5.setId("5".trim());
			movimientoTarjeta5.setFecha(Fecha.transformarADateMC(Mov5FechaTxn
					.trim()));
			movimientoTarjeta5.setDescripcionTransaccion(Mov5DesTxn.trim());
			movimientoTarjeta5.setMoneda(Mov5MonOriginalTxn.trim());
			movimientoTarjeta5.setMonto(Mov5MontoTxn.trim());
			movimientoTarjeta5.setTipoMonto(Mov5SigMontoTxn.trim());
			movimientoTarjeta5.setTipoTarjeta(Mov5TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta5);
		}

		if (c > 5) {
			MovimientoTarjeta movimientoTarjeta6 = new MovimientoTarjeta();
			movimientoTarjeta6.setId("6".trim());
			movimientoTarjeta6.setFecha(Fecha.transformarADateMC(Mov6FechaTxn
					.trim()));
			movimientoTarjeta6.setDescripcionTransaccion(Mov6DesTxn.trim());
			movimientoTarjeta6.setMoneda(Mov6MonOriginalTxn.trim());
			movimientoTarjeta6.setMonto(Mov6MontoTxn.trim());
			movimientoTarjeta6.setTipoMonto(Mov6SigMontoTxn.trim());
			movimientoTarjeta6.setTipoTarjeta(Mov6TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta6);
		}

		if (c > 6) {
			MovimientoTarjeta movimientoTarjeta7 = new MovimientoTarjeta();
			movimientoTarjeta7.setId("7".trim());
			movimientoTarjeta7.setFecha(Fecha.transformarADateMC(Mov7FechaTxn
					.trim()));
			movimientoTarjeta7.setDescripcionTransaccion(Mov7DesTxn.trim());
			movimientoTarjeta7.setMoneda(Mov7MonOriginalTxn.trim());
			movimientoTarjeta7.setMonto(Mov7MontoTxn.trim());
			movimientoTarjeta7.setTipoMonto(Mov7SigMontoTxn.trim());
			movimientoTarjeta7.setTipoTarjeta(Mov7TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta7);
		}

		if (c > 7) {
			MovimientoTarjeta movimientoTarjeta8 = new MovimientoTarjeta();
			movimientoTarjeta8.setId("8".trim());
			movimientoTarjeta8.setFecha(Fecha.transformarADateMC(Mov8FechaTxn
					.trim()));
			movimientoTarjeta8.setDescripcionTransaccion(Mov8DesTxn.trim());
			movimientoTarjeta8.setMoneda(Mov8MonOriginalTxn.trim());
			movimientoTarjeta8.setMonto(Mov8MontoTxn.trim());
			movimientoTarjeta8.setTipoMonto(Mov8SigMontoTxn.trim());
			movimientoTarjeta8.setTipoTarjeta(Mov8TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta8);
		}

		if (c > 8) {
			MovimientoTarjeta movimientoTarjeta9 = new MovimientoTarjeta();
			movimientoTarjeta9.setId("9".trim());
			movimientoTarjeta9.setFecha(Fecha.transformarADateMC(Mov9FechaTxn
					.trim()));
			movimientoTarjeta9.setDescripcionTransaccion(Mov9DesTxn.trim());
			movimientoTarjeta9.setMoneda(Mov9MonOriginalTxn.trim());
			movimientoTarjeta9.setMonto(Mov9MontoTxn.trim());
			movimientoTarjeta9.setTipoMonto(Mov9SigMontoTxn.trim());
			movimientoTarjeta9.setTipoTarjeta(Mov9TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta9);
		}

		if (c > 9) {
			MovimientoTarjeta movimientoTarjeta10 = new MovimientoTarjeta();
			movimientoTarjeta10.setId("10".trim());
			movimientoTarjeta10.setFecha(Fecha.transformarADateMC(Mov10FechaTxn
					.trim()));
			movimientoTarjeta10.setDescripcionTransaccion(Mov10DesTxn.trim());
			movimientoTarjeta10.setMoneda(Mov10MonOriginalTxn.trim());
			movimientoTarjeta10.setMonto(Mov10MontoTxn.trim());
			movimientoTarjeta10.setTipoMonto(Mov10SigMontoTxn.trim());
			movimientoTarjeta10.setTipoTarjeta(Mov10TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta10);
		}

		if (c > 10) {
			MovimientoTarjeta movimientoTarjeta11 = new MovimientoTarjeta();
			movimientoTarjeta11.setId("11".trim());
			movimientoTarjeta11.setFecha(Fecha.transformarADateMC(Mov11FechaTxn
					.trim()));
			movimientoTarjeta11.setDescripcionTransaccion(Mov11DesTxn.trim());
			movimientoTarjeta11.setMoneda(Mov11MonOriginalTxn.trim());
			movimientoTarjeta11.setMonto(Mov11MontoTxn.trim());
			movimientoTarjeta11.setTipoMonto(Mov11SigMontoTxn.trim());
			movimientoTarjeta11.setTipoTarjeta(Mov11TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta11);
		}

		if (c > 11) {
			MovimientoTarjeta movimientoTarjeta12 = new MovimientoTarjeta();
			movimientoTarjeta12.setId("12".trim());
			movimientoTarjeta12.setFecha(Fecha.transformarADateMC(Mov12FechaTxn
					.trim()));
			movimientoTarjeta12.setDescripcionTransaccion(Mov12DesTxn.trim());
			movimientoTarjeta12.setMoneda(Mov12MonOriginalTxn.trim());
			movimientoTarjeta12.setMonto(Mov12MontoTxn.trim());
			movimientoTarjeta12.setTipoMonto(Mov12SigMontoTxn.trim());
			movimientoTarjeta12.setTipoTarjeta(Mov12TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta12);
		}

		if (c > 12) {
			MovimientoTarjeta movimientoTarjeta13 = new MovimientoTarjeta();
			movimientoTarjeta13.setId("13".trim());
			movimientoTarjeta13.setFecha(Fecha.transformarADateMC(Mov13FechaTxn
					.trim()));
			movimientoTarjeta13.setDescripcionTransaccion(Mov13DesTxn.trim());
			movimientoTarjeta13.setMoneda(Mov13MonOriginalTxn.trim());
			movimientoTarjeta13.setMonto(Mov13MontoTxn.trim());
			movimientoTarjeta13.setTipoMonto(Mov13SigMontoTxn.trim());
			movimientoTarjeta13.setTipoTarjeta(Mov13TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta13);
		}

		if (c > 13) {
			MovimientoTarjeta movimientoTarjeta14 = new MovimientoTarjeta();
			movimientoTarjeta14.setId("14".trim());
			movimientoTarjeta14.setFecha(Fecha.transformarADateMC(Mov14FechaTxn
					.trim()));
			movimientoTarjeta14.setDescripcionTransaccion(Mov14DesTxn.trim());
			movimientoTarjeta14.setMoneda(Mov14MonOriginalTxn.trim());
			movimientoTarjeta14.setMonto(Mov14MontoTxn.trim());
			movimientoTarjeta14.setTipoMonto(Mov14SigMontoTxn.trim());
			movimientoTarjeta14.setTipoTarjeta(Mov14TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta14);
		}

		if (c > 14) {
			MovimientoTarjeta movimientoTarjeta15 = new MovimientoTarjeta();
			movimientoTarjeta15.setId("15".trim());
			movimientoTarjeta15.setFecha(Fecha.transformarADateMC(Mov15FechaTxn
					.trim()));
			movimientoTarjeta15.setDescripcionTransaccion(Mov15DesTxn.trim());
			movimientoTarjeta15.setMoneda(Mov15MonOriginalTxn.trim());
			movimientoTarjeta15.setMonto(Mov15MontoTxn.trim());
			movimientoTarjeta15.setTipoMonto(Mov15SigMontoTxn.trim());
			movimientoTarjeta15.setTipoTarjeta(Mov15TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta15);
		}

		if (c > 15) {
			MovimientoTarjeta movimientoTarjeta16 = new MovimientoTarjeta();
			movimientoTarjeta16.setId("16".trim());
			movimientoTarjeta16.setFecha(Fecha.transformarADateMC(Mov16FechaTxn
					.trim()));
			movimientoTarjeta16.setDescripcionTransaccion(Mov16DesTxn.trim());
			movimientoTarjeta16.setMoneda(Mov16MonOriginalTxn.trim());
			movimientoTarjeta16.setMonto(Mov16MontoTxn.trim());
			movimientoTarjeta16.setTipoMonto(Mov16SigMontoTxn.trim());
			movimientoTarjeta16.setTipoTarjeta(Mov16TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta16);
		}

		if (c > 16) {
			MovimientoTarjeta movimientoTarjeta17 = new MovimientoTarjeta();
			movimientoTarjeta17.setId("17".trim());
			movimientoTarjeta17.setFecha(Fecha.transformarADateMC(Mov17FechaTxn
					.trim()));
			movimientoTarjeta17.setDescripcionTransaccion(Mov17DesTxn.trim());
			movimientoTarjeta17.setMoneda(Mov17MonOriginalTxn.trim());
			movimientoTarjeta17.setMonto(Mov17MontoTxn.trim());
			movimientoTarjeta17.setTipoMonto(Mov17SigMontoTxn.trim());
			movimientoTarjeta17.setTipoTarjeta(Mov17TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta17);
		}

		if (c > 17) {
			MovimientoTarjeta movimientoTarjeta18 = new MovimientoTarjeta();
			movimientoTarjeta18.setId("18".trim());
			movimientoTarjeta18.setFecha(Fecha.transformarADateMC(Mov18FechaTxn
					.trim()));
			movimientoTarjeta18.setDescripcionTransaccion(Mov18DesTxn.trim());
			movimientoTarjeta18.setMoneda(Mov18MonOriginalTxn.trim());
			movimientoTarjeta18.setMonto(Mov18MontoTxn.trim());
			movimientoTarjeta18.setTipoMonto(Mov18SigMontoTxn.trim());
			movimientoTarjeta18.setTipoTarjeta(Mov18TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta18);
		}

		if (c > 18) {
			MovimientoTarjeta movimientoTarjeta19 = new MovimientoTarjeta();
			movimientoTarjeta19.setId("19".trim());
			movimientoTarjeta19.setFecha(Fecha.transformarADateMC(Mov19FechaTxn
					.trim()));
			movimientoTarjeta19.setDescripcionTransaccion(Mov19DesTxn.trim());
			movimientoTarjeta19.setMoneda(Mov19MonOriginalTxn.trim());
			movimientoTarjeta19.setMonto(Mov19MontoTxn.trim());
			movimientoTarjeta19.setTipoMonto(Mov19SigMontoTxn.trim());
			movimientoTarjeta19.setTipoTarjeta(Mov19TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta19);
		}

		if (c > 19) {
			MovimientoTarjeta movimientoTarjeta20 = new MovimientoTarjeta();
			movimientoTarjeta20.setId("20".trim());
			movimientoTarjeta20.setFecha(Fecha.transformarADateMC(Mov20FechaTxn
					.trim()));
			movimientoTarjeta20.setDescripcionTransaccion(Mov20DesTxn.trim());
			movimientoTarjeta20.setMoneda(Mov20MonOriginalTxn.trim());
			movimientoTarjeta20.setMonto(Mov20MontoTxn.trim());
			movimientoTarjeta20.setTipoMonto(Mov20SigMontoTxn.trim());
			movimientoTarjeta20.setTipoTarjeta(Mov20TipoTarjeta.trim());
			movimientoTarjetas.add(movimientoTarjeta20);
		}

		return movimientoTarjetas;
	}

}
