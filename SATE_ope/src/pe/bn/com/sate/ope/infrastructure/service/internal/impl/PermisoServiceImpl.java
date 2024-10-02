package pe.bn.com.sate.ope.infrastructure.service.internal.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.service.internal.PermisoService;
import pe.bn.com.sate.ope.persistence.mapper.internal.PermisosMapper;
import pe.bn.com.sate.ope.transversal.dto.sate.Permiso;

@Service
public class PermisoServiceImpl implements PermisoService {

	private @Autowired
	PermisosMapper permisosMapper;

	@Override
	public List<Permiso> buscarPermisosPorRole(Long idRol) {
		try {
			return permisosMapper.buscarPermisosPorRol(idRol);
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

}
