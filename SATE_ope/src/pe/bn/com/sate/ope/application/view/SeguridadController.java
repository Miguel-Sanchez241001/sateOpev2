package pe.bn.com.sate.ope.application.view;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import pe.bn.com.sate.ope.application.model.SeguridadModel;
import pe.bn.com.sate.ope.infrastructure.service.internal.UsuarioService;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.componentes.Parametros;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesPagina;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEstado;

@Controller("seguridadController")
@Scope("view")
public class SeguridadController implements Serializable {

	private final static Logger logger = Logger
			.getLogger(SeguridadController.class);

	private static final long serialVersionUID = 1L;

	private SeguridadModel seguridadModel;

	@Autowired
	UsuarioService usuarioService;

	@Autowired
	Parametros parametros;

	@PostConstruct
	public void init() {
		// try{
		seguridadModel = new SeguridadModel(
				UsefulWebApplication.obtenerUsuario());
		// }catch (Exception e) {
		// e.printStackTrace();
		// }
	}

	public void cerrarSesion() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext()
				.invalidateSession();
		SecurityContextHolder.clearContext();
		UsefulWebApplication.redireccionar(ConstantesPagina.PAGINA_INDEX);
	}

	public void forzarCierreSesion() {
		FacesContext.getCurrentInstance().getExternalContext()
				.invalidateSession();
		SecurityContextHolder.clearContext();
	}

	/**
	 * @return tiempo de inactividad maximo de una sesión
	 */
	public int tiempoMaximoInactividad() {
		return Integer
				.parseInt(parametros.getSesionExpiradaTiempo() != null ? parametros
						.getSesionExpiradaTiempo() : "10") * 1000 * 60;
	}

	/**
	 * @return mensaje que mostrara el dialogo luego de que expire la sesión
	 */
	public String mensajeSesionExpirada() {
		return ConstantesGenerales.MENSAJE_SESION_EXPIRADA;
	}

	/**
	 * @return url de la pagina de inicio de sesión
	 */
	public String paginaLogin() {
		return ConstantesPagina.PAGINA_INDEX;
	}

	public boolean renderizar(String valor) {
		for (GrantedAuthority sg : SecurityContextHolder.getContext()
				.getAuthentication().getAuthorities()) {
			if (valor.equals(sg.getAuthority())) {
				return true;
			}
		}
		return false;
	}

	public void redireccionar(ActionEvent event) {
		String pagina = (String) event.getComponent().getAttributes()
				.get("pagina");
		try {
			UsefulWebApplication.redireccionar(pagina);
		} catch (IOException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}

	public SeguridadModel getseguridadModel() {
		return seguridadModel;
	}

	public void setseguridadModel(SeguridadModel seguridadModel) {
		this.seguridadModel = seguridadModel;
	}

	public boolean esUsuarioNuevo() {
		if (seguridadModel.getUsuario().getFlagCambioClave()
				.equals(TipoEstado.ACTIVO.getId()))
			return true;
		else
			return false;
	}
}
