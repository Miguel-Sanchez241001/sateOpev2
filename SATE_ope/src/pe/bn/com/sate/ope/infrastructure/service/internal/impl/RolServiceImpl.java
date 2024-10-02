package pe.bn.com.sate.ope.infrastructure.service.internal.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.service.internal.RolService;
import pe.bn.com.sate.ope.persistence.mapper.internal.RolMapper;
import pe.bn.com.sate.ope.transversal.dto.sate.Rol;

@Service
public class RolServiceImpl implements RolService {

	private @Autowired
	RolMapper rolMapper;

	@Override
	public List<Rol> buscarRoles() {
		try {
			return rolMapper.buscarRoles();
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

	@Override
	public Rol buscarRolPorId(long id) {
		try {
			return rolMapper.buscarRolPorId(id);
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

}
