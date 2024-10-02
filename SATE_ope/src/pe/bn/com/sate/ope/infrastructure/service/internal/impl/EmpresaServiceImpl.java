package pe.bn.com.sate.ope.infrastructure.service.internal.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.service.internal.EmpresaService;
import pe.bn.com.sate.ope.persistence.mapper.internal.EmpresaMapper;
import pe.bn.com.sate.ope.transversal.dto.sate.Empresa;

@Service
public class EmpresaServiceImpl implements EmpresaService {

	private @Autowired
	EmpresaMapper empresaMapper;

	@Override
	public Empresa buscarEmpresaPorRUC(String ruc) {
		try {
			return empresaMapper.buscarEmpresaPorRUC(ruc);
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

	@Override
	public Empresa buscarEmpresaAfiliada(String ruc) {
		try {
			return empresaMapper.buscarEmpresaAfiliada(ruc);
		} catch (Exception ex) {
			throw new InternalServiceException(ex.getMessage(), ex);
		}
	}

}
