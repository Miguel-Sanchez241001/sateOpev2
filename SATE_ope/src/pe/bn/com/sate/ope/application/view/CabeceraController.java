package pe.bn.com.sate.ope.application.view;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import pe.bn.com.sate.ope.application.model.CabeceraModel;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.service.internal.EmpresaService;
import pe.bn.com.sate.ope.transversal.dto.sate.Empresa;
import pe.bn.com.sate.ope.transversal.util.DateFormaterUtil;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;

@Controller("cabeceraController")
@Scope("view")
public class CabeceraController {

	private final static Logger logger = Logger
			.getLogger(CabeceraController.class);

	private CabeceraModel cabeceraModel;

	@Autowired
	private EmpresaService empresaService;

	@PostConstruct
	public void init() {
		cabeceraModel = new CabeceraModel();
		obtenerDatosUsuario();
		obtenerFechaHoy();
		cargarDatosEmpresa();
		UsefulWebApplication.ejecutar("esUsuarioNuevo = "
				+ (UsefulWebApplication.obtenerUsuario().getFlagCambioClave()
						.equals("1") ? "true" : "false"));
	}

	private void cargarDatosEmpresa() {
		try {
			Empresa empresa = empresaService
					.buscarEmpresaAfiliada(cabeceraModel.getUsuario().getRuc());

			cabeceraModel.setRazonSocial(empresa.getRazonSocial());
			cabeceraModel.setTipoEmpresa(empresa.getTipo());
		} catch (InternalServiceException ise) {
			UsefulWebApplication.mostrarMensajeJSF(
					ConstantesGenerales.SEVERITY_ERROR,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL,
					ConstantesGenerales.ERROR_PERSISTENCE_INTERNAL);
			logger.error(ise.getMessage());
		}
	}

	public void obtenerDatosUsuario() {
		cabeceraModel.setUsuario(UsefulWebApplication.obtenerUsuario());
	}

	public void obtenerFechaHoy() {
		this.cabeceraModel.setFecha(DateFormaterUtil.fechaHoy());
	}

	public CabeceraModel getCabeceraModel() {
		return cabeceraModel;
	}

	public void setCabeceraModel(CabeceraModel cabeceraModel) {
		this.cabeceraModel = cabeceraModel;
	}

}
