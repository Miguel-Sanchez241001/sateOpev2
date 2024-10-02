package pe.bn.com.sate.ope.application.view;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.SocketTimeoutException;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.security.web.WebAttributes;
import org.springframework.stereotype.Controller;

import pe.bn.com.sate.ope.application.model.LoginModel;
import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceMCProcesosException;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.exception.ServiceException;
import pe.bn.com.sate.ope.infrastructure.facade.FWMCProcesos;
import pe.bn.com.sate.ope.infrastructure.facade.InterfaceGatewayFacade;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.novatronic.captcha.Captcha;
import pe.bn.com.sate.ope.infrastructure.service.internal.CaptchaService;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;
import pe.bn.com.sate.ope.transversal.util.excepciones.InternalExcepcion;
import pe.bn.com.sate.ope.transversal.util.excepciones.LoginException;

/**
 * Controlador para la gestión del login de usuarios.
 */
@Controller("loginController")
@Scope("view")
public class LoginController implements PhaseListener, Serializable {

    private final static Logger logger = Logger.getLogger(LoginController.class);

    private static final long serialVersionUID = 1L;
    private LoginModel loginModel;
    @Autowired
    private CaptchaService captchaService;

    @Autowired
    private InterfaceGatewayFacade fWInterfaceGateway;
    private @Autowired
	FWMCProcesos fwmcProcesos;
    /**
     * Inicializa el modelo de login y genera un captcha.
     */
    @PostConstruct
    public void init() {
        loginModel = new LoginModel();
        generarCaptcha();
    }

    /**
     * Inicia la sesión del usuario validando el captcha y redireccionando
     * a la autenticación de login.
     */
    public void iniciarSesion() {
        logger.info("[loginController] - Iniciando método iniciarSesion");

     // TODO VALIDAR CATCHAP 
       //MGL
         if (true) {
        //if (captchaService.validarCaptcha(loginModel.getCaptcha(), loginModel.getCaptchaTexto())) {
        
        
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
            RequestDispatcher dispatcher = ((ServletRequest) context.getRequest()).getRequestDispatcher("/login_autenticacion");
            try {
                dispatcher.forward((ServletRequest) context.getRequest(), (ServletResponse) context.getResponse());
            } catch (ServletException e1) {
                logger.error("Error en ServletException: " + e1.getMessage());
            } catch (IOException e1) {
                logger.error("Error en IOException: " + e1.getMessage());
            }
            FacesContext.getCurrentInstance().responseComplete();
        } else {
            UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_ERROR, "Captcha no coincide", "");
        }
        logger.info("[loginController] - Fin método iniciarSesion");
 
    }

    /**
     * Verifica si el usuario está logeado.
     *
     * @return true si el usuario está autenticado, false en caso contrario.
     */
    public boolean estaLogeado() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            this.redireccionar();
            return true;
        }
        return false;
    }

    
    
    public void validarConexionTest() {
    	try {
			fwmcProcesos.conexionTest();
		} catch (ExternalServiceMCProcesosException | InternalExcepcion e) {
			e.printStackTrace();
		}
    }
    
    public void prueba() {
       
    	System.out.println("entro a prueba");
    	try {
			fwmcProcesos.consultaDatosCliente(1);
		} catch (ExternalServiceMCProcesosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InternalExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
    }

    
    /**
     * Redirecciona al usuario a la página principal.
     */
    private void redireccionar() {
        try {
            UsefulWebApplication.redireccionar("/principal.jsf");
            UsefulWebApplication.actualizarComponente("formlog");
        } catch (IOException e) {
            logger.error("Error en redireccionar: " + e.getMessage());
        }
    }

    public LoginModel getLoginModel() {
        return loginModel;
    }

    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public void afterPhase(PhaseEvent arg0) {
    }

    @Override
    public void beforePhase(PhaseEvent arg0) {
        Exception e = (Exception) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
                .remove(WebAttributes.AUTHENTICATION_EXCEPTION);

        FacesContext ctx = FacesContext.getCurrentInstance();
        HttpServletRequest servletRequest = (HttpServletRequest) ctx.getExternalContext().getRequest();
        String fullURI = servletRequest.getRequestURI();

        if (fullURI.equals("/SATE_ope/index.jsf")) {
            if (e instanceof LoginException) {
                logger.info("Excepción de login: " + e.getMessage());
                UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_ERROR, e.getMessage(), "");
                UsefulWebApplication.actualizarComponente("formlog");
            }
            if (ctx.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
                estaLogeado();
            } else {
                // generarCaptcha();
            }
        }
    }

    /**
     * Genera un captcha y lo configura en el modelo de login.
     */
    public void generarCaptcha() {
        try {
            BufferedImage image;
            Captcha captcha = captchaService.generarCaptcha();
            image = captcha.getImage();
            loginModel.setCaptcha(captcha);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "jpeg", baos);
            baos.flush();

            byte[] encoded = Base64.encode(baos.toByteArray());
            logger.info("Captcha generado: " + new String(encoded).substring(0, 10));

            UsefulWebApplication.ejecutar("cargarCaptcha('" + new String(encoded) + "')");
        } catch (IOException e) {
            logger.error("Error generando captcha: " + e.getMessage());
            UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_ERROR, "Ocurrió un error, intente nuevamente", "Ocurrió un error, intente nuevamente");
        }
    }

    /**
     * Recupera la clave del usuario y la envía a su correo.
     */
    public void recuperarClave() {
        try {
            logger.info("[loginController] - Inicio método recuperarClave");

            fWInterfaceGateway.recuperarClave(loginModel.getRucRecuperar(), loginModel.getTipoDocumentoRecuperar(),
                    loginModel.getNumeroDocumentoRecuperar(), loginModel.getCorreoRecuperar());
            UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_INFO, "Clave reiniciada y enviada a su correo laboral", "");
            limpiarFormularioRecuperarClave();
            logger.info("[loginController] - Fin método recuperarClave");
        } catch (InternalServiceException ise) {
            logger.error("Error en InternalServiceException: " + ise.getMessage());
            UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_ERROR,  ise.getMessage(), ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
        } catch (ServiceException se) {
            logger.error("Error en ServiceException: " + se.getMessage());
            UsefulWebApplication.mostrarMensajeJSF(ConstantesGenerales.SEVERITY_ERROR, ConstantesGenerales.ERROR_PERSISTENCE_EXTERNAL_WEB_SERVICE_SIMM, ConstantesGenerales.ERROR_PERSISTENCE_GENERAL);
        }
    }

    /**
     * Limpia el formulario de recuperación de clave.
     */
    private void limpiarFormularioRecuperarClave() {
        loginModel.setRucRecuperar("");
        loginModel.setTipoDocumentoRecuperar("");
        loginModel.setNumeroDocumentoRecuperar("");
        loginModel.setCorreoRecuperar("");
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RENDER_RESPONSE;
    }
}
