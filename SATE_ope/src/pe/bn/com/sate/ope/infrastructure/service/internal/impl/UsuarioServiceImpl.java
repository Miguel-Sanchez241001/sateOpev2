package pe.bn.com.sate.ope.infrastructure.service.internal.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.service.internal.UsuarioService;
import pe.bn.com.sate.ope.persistence.mapper.internal.UsuarioMapper;
import pe.bn.com.sate.ope.transversal.dto.sate.Usuario;
import pe.bn.com.sate.ope.transversal.util.enums.TipoEstado;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private final static String FLAG_CAMBIO_CLAVE = "1";

	private @Autowired
	UsuarioMapper usuarioMapper;

	@Override
	public Usuario buscarUsuario(String tipoDocumento, String numDocumento) {
		try {
			return usuarioMapper.buscarUsuario(tipoDocumento, numDocumento);
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

	@Override
	public void registrarUsuario(Usuario usuario) {
		try {
			usuario.setEstado(TipoEstado.ACTIVO.getId());
			usuario.setFlagCambioClave(FLAG_CAMBIO_CLAVE);
			usuarioMapper.registrarUsuario(usuario);
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}

	}

	@Override
	public boolean existeUsuarioEmpresa(Usuario usuario, String ruc) {
		try {
			if (usuario.getUsuarioPerfil() == (long) 1) {
				return usuarioMapper.existeRepresentanteEmpresa(
						usuario.getNumeroDocumento(), ruc) != null ? true
						: false;
			} else {
				return usuarioMapper.existeUsuarioEmpresa(
						usuario.getNumeroDocumento(), ruc) != null ? true
						: false;
			}
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

	@Override
	public Usuario buscarUsuarioSinRepresentante(String tipoDocumento,
			String numDocumento) {
		try {
			return usuarioMapper.buscarUsuarioSinRepresentante(tipoDocumento,
					numDocumento);
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

	@Override
	public void actualizaDatosUsuario(Usuario usuario) {
		try {
			usuarioMapper.actualizarUsuario(usuario);
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}
}
