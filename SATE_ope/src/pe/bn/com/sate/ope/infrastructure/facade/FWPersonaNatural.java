package pe.bn.com.sate.ope.infrastructure.facade;

import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.bn.com.sate.ope.application.view.CrearUsuarioController;
import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceWsReniecException;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec.Identidad2;
import pe.bn.com.sate.ope.infrastructure.service.external.domain.reniec.ServiceReniec2Proxy;
import pe.bn.com.sate.ope.transversal.dto.sate.Cliente;
import pe.bn.com.sate.ope.transversal.dto.sate.Usuario;
import pe.bn.com.sate.ope.transversal.util.ServicioWebUtil;
import pe.bn.com.sate.ope.transversal.util.componentes.Parametros;

@Component
public class FWPersonaNatural {
	private final static Logger logger = Logger
			.getLogger(FWPersonaNatural.class);
	private @Autowired
	Parametros parametros;

	public Cliente buscarCliente(String tipoDocumento, String numeroDocumento) {
		try {
			ServiceReniec2Proxy serviceReniec2Proxy = new ServiceReniec2Proxy();

			ServicioWebUtil.cambiarTiempoEspera(parametros.getConexionTiempo(),
					parametros.getRespuestaTiempo(),
					(BindingProvider) serviceReniec2Proxy._getDescriptor()
							.getProxy());

			Identidad2 vIdentidad2 = serviceReniec2Proxy.consulta7(
					parametros.getSistemaReniec(), parametros.getUserReniec(),
					parametros.getUser1Reniec(),
					parametros.getConsultaReniec(), numeroDocumento);
			Cliente cliente = null;
			/** System.out.println(vIdentidad2.getError().trim()); */
			if (!vIdentidad2.getApellidoPaterno().trim().equals("")) {
				cliente = new Cliente(vIdentidad2, tipoDocumento);
			}
			return cliente;
		} catch (Exception ex) {
			throw new ExternalServiceWsReniecException(ex.getMessage(), ex);
		}
	}

	public Usuario buscarUsuario(String tipoDocumento, String numeroDocumento) {
		try {
			
			logger.info("[FWPersonaNatural] - Iniciando metodo buscarPersonaReniecProxy");
			logger.info("[FWPersonaNatural] - Tipo: "+tipoDocumento+" Nd: "+numeroDocumento);

			ServiceReniec2Proxy serviceReniec2Proxy = new ServiceReniec2Proxy();

			ServicioWebUtil.cambiarTiempoEspera(parametros.getConexionTiempo(),
					parametros.getRespuestaTiempo(),
					(BindingProvider) serviceReniec2Proxy._getDescriptor()
							.getProxy());
logger.info("[FWPersonaNatural] - DatosConsulta: " +
					"Sistema: "+parametros.getSistemaReniec()+
					" UserReniec: "+parametros.getUserReniec()+
					"ClaveApp: "+parametros.getUser1Reniec()+
					"user: "+parametros.getConsultaReniec()+
					"numero: "+numeroDocumento
					);
			Identidad2 vIdentidad2 = serviceReniec2Proxy.consulta7(
					parametros.getSistemaReniec(), parametros.getUserReniec(),
					parametros.getUser1Reniec(),
					parametros.getConsultaReniec(), numeroDocumento);
			logger.info("[FWPersonaNatural] - Exito Consulta Reniec");
	

			Usuario usuario = null;
			/** System.out.println(vIdentidad2.getError().trim()); */
			if (!vIdentidad2.getApellidoPaterno().trim().equals("")) {
				usuario = new Usuario(vIdentidad2, tipoDocumento);
			}
			logger.info("[FWPersonaNatural] - Fin metodo buscarPersonaReniecProxy");

			return usuario;
		} catch (Exception ex) {
			throw new ExternalServiceWsReniecException(ex.getMessage(), ex);
		}
	}
}
