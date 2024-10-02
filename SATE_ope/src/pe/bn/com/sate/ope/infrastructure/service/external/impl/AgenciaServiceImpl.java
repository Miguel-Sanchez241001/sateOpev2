package pe.bn.com.sate.ope.infrastructure.service.external.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.bn.com.sate.ope.infrastructure.exception.ExternalServiceBnTablasException;
import pe.bn.com.sate.ope.infrastructure.service.external.AgenciaService;
import pe.bn.com.sate.ope.persistence.mapper.external.AgenciaMapper;
import pe.bn.com.sate.ope.transversal.dto.tablas.Agencia;

@Service
public class AgenciaServiceImpl implements AgenciaService {

	private @Autowired
	AgenciaMapper agenciaMapper;

	@Override
	public List<Agencia> buscarAgenciasPorUbigeo(String codDepartamento,
			String codProvincia, String codDistrito) {
		try {
			return agenciaMapper.buscarAgenciasPorUbigeo(codDepartamento,
					codProvincia, codDistrito);
		} catch (Exception ex) {
			throw new ExternalServiceBnTablasException(ex.getMessage(),ex);
		}
	}

	@Override
	public Agencia buscarAgenciaPorCodAgencia(String codAgencia) {
		try {
			List<Agencia> listaAgencia = agenciaMapper
					.buscarAgenciaPorCodAgencia(String.format("%04d",
							Long.valueOf(codAgencia)));
			return listaAgencia == null || listaAgencia.isEmpty() ? new Agencia()
					: listaAgencia.get(0);
		} catch (Exception ex) {
			throw new ExternalServiceBnTablasException(ex.getMessage(),ex);
		}
	}

}
