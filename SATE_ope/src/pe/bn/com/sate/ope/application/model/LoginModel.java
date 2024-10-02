package pe.bn.com.sate.ope.application.model;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.imageio.ImageIO;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.Captcha;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.componentes.Teclado;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.enums.TipoDocumento;

@FacesValidator("loginModelValidator")
public class LoginModel implements Serializable, Validator {

	private static final long serialVersionUID = 1L;

	private String ruc;
	private String tipoDocumentoSeleccionado;
	private String numeroDocumento;

	private List<TipoDocumento> listaTipoDocumento;

	private String usernameDomain;

	private List<String> listaTeclas;
	private Teclado teclado;

	private String captchaTexto;
	private Captcha captcha;

	private String rucRecuperar;
	private String tipoDocumentoRecuperar;
	private String numeroDocumentoRecuperar;
	private String correoRecuperar;

	private String vacio = "";

	public LoginModel() {
		inicializarObjetos();
	}
	
	public void inicializarObjetos(){
		listaTipoDocumento = Arrays.asList(TipoDocumento.values());
		listaTeclas = new ArrayList<String>();

		ruc = "";
		tipoDocumentoSeleccionado = "1";
		numeroDocumento = "";
		captchaTexto = "";

		rucRecuperar = "";
		tipoDocumentoRecuperar = "1";
		numeroDocumentoRecuperar = "";
		correoRecuperar = "";

		teclado = new Teclado();
	}

	public void generarUsernameDomain() {
		usernameDomain = ruc + "-" + tipoDocumentoSeleccionado + "-"
				+ numeroDocumento;
	}

	public List<TipoDocumento> getListaTipoDocumento() {
		return listaTipoDocumento;
	}

	public void setListaTipoDocumento(List<TipoDocumento> listaTipoDocumento) {
		this.listaTipoDocumento = listaTipoDocumento;
	}

	public List<String> getListaTeclas() {
		return listaTeclas;
	}

	public void setListaTeclas(List<String> listaTeclas) {
		this.listaTeclas = listaTeclas;
	}

	public String getCaptchaTexto() {
		return captchaTexto;
	}

	public void setCaptchaTexto(String captchaTexto) {
		this.captchaTexto = captchaTexto;
	}

	public String getTipoDocumentoSeleccionado() {
		return tipoDocumentoSeleccionado;
	}

	public void setTipoDocumentoSeleccionado(String tipoDocumentoSeleccionado) {
		if (tipoDocumentoSeleccionado.equals("0"))
			this.tipoDocumentoSeleccionado = "";
		else
			this.tipoDocumentoSeleccionado = tipoDocumentoSeleccionado;
		numeroDocumento = "";
	}

	public int obtenerDocumentoLength(String tipoDocumento) {
		return TipoDocumento.obtenerLength(tipoDocumento);
	}

	public String obtenerDocumentoValidatorMessage(String tipoDocumento) {
		return "El " + TipoDocumento.tipoDocumentoBducLetras(tipoDocumento)
				+ " debe  tener " + TipoDocumento.obtenerLength(tipoDocumento)
				+ " dígitos";
	}

	public String obtenerDocumentoRequiredMessage(String tipoDocumento) {
		return "Ingrese un número de "
				+ TipoDocumento.tipoDocumentoBducLetras(tipoDocumento);
	}

	public Captcha getCaptcha() {
		return captcha;
	}

	public void setCaptcha(Captcha captcha) {
		this.captcha = captcha;
	}

	public String getRucRecuperar() {
		return rucRecuperar;
	}

	public void setRucRecuperar(String rucRecuperar) {
		this.rucRecuperar = rucRecuperar;
	}

	public String getTipoDocumentoRecuperar() {
		return tipoDocumentoRecuperar;
	}

	public void setTipoDocumentoRecuperar(String tipoDocumentoRecuperar) {
		if (tipoDocumentoRecuperar.equals("0"))
			this.tipoDocumentoRecuperar = "";
		else
			this.tipoDocumentoRecuperar = tipoDocumentoRecuperar;

		this.numeroDocumentoRecuperar = "";
	}

	public String getNumeroDocumentoRecuperar() {
		return numeroDocumentoRecuperar;
	}

	public void setNumeroDocumentoRecuperar(String numeroDocumentoRecuperar) {
		this.numeroDocumentoRecuperar = numeroDocumentoRecuperar;
	}

	public String getCorreoRecuperar() {
		return correoRecuperar;
	}

	public void setCorreoRecuperar(String correoRecuperar) {
		this.correoRecuperar = correoRecuperar;
	}

	public String getUsernameDomain() {
		return usernameDomain;
	}

	public void setUsernameDomain(String usernameDomain) {
		this.usernameDomain = usernameDomain;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getVacio() {
		return vacio;
	}

	public void setVacio(String vacio) {
		this.vacio = vacio;
	}

	public void validarTipoNumeroDocumento() {

	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		if (((String) value).equals("0")) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					"Ingresa un tipo de documento", "");
		}
	}


}
