package pe.bn.com.sate.ope.infrastructure.service.external.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceBnTablasException;
import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.service.external.UbigeoService;
import pe.bn.com.sate.ope.persistence.mapper.external.UbigeoMapper;
import pe.bn.com.sate.ope.transversal.dto.tablas.Ubigeo;

@Service
public class UbigeoServiceImpl implements UbigeoService {

	private @Autowired
	UbigeoMapper ubigeoMapper;

	@Override
	public List<Ubigeo> buscarDepartamentos() {
		try {
			return ubigeoMapper.buscarDepartamentos();
		} catch (Exception ex) {
			throw new ExternalServiceBnTablasException(ex.getMessage(), ex);
		}
	}

	@Override
	public List<Ubigeo> buscarProvinciasPorDepartamento(String codDepartamento) {
		try {
			return ubigeoMapper
					.buscarProvinciasPorDepartamento(codDepartamento);
		} catch (Exception ex) {
			throw new ExternalServiceBnTablasException(ex.getMessage(), ex);
		}
	}

	@Override
	public List<Ubigeo> buscarDistritosPorProvincia(String codDepartamento,
			String codProvincia) {
		try {
			return ubigeoMapper.buscarDistritosPorProvincia(codDepartamento,
					codProvincia);
		} catch (Exception ex) {
			throw new ExternalServiceBnTablasException(ex.getMessage(), ex);
		}
	}

	@Override
	public Ubigeo buscarLocalidad(String ubigeo, int tipo) {
		try {
			if (tipo == 1) {
				return ubigeoMapper.buscarDepartamento(ubigeo);
			} else if (tipo == 2) {
				return ubigeoMapper.buscarProvincia(ubigeo);
			} else if (tipo == 3) {
				return ubigeoMapper.buscarDistrito(ubigeo);
			}
			return null;
		} catch (Exception ex) {
			throw new ExternalServiceBnTablasException(ex.getMessage(), ex);
		}
	}

}
