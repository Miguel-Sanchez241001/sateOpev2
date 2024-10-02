package pe.bn.com.sate.ope.infrastructure.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.bn.com.sate.ope.infrastructure.exception.InternalServiceException;
import pe.bn.com.sate.ope.infrastructure.exception.ServiceException;
import pe.bn.com.sate.ope.infrastructure.service.internal.EmpresaService;
import pe.bn.com.sate.ope.infrastructure.service.internal.TarjetaService;
import pe.bn.com.sate.ope.persistence.mapper.internal.AsignacionMapper;
import pe.bn.com.sate.ope.persistence.mapper.internal.CargoMapper;
import pe.bn.com.sate.ope.persistence.mapper.internal.TransaccionMapper;
import pe.bn.com.sate.ope.transversal.dto.sate.Asignacion;
import pe.bn.com.sate.ope.transversal.dto.sate.Cargo;
import pe.bn.com.sate.ope.transversal.dto.sate.TarjetaResumen;
import pe.bn.com.sate.ope.transversal.dto.sate.Transaccion;
import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;
import pe.bn.com.sate.ope.transversal.util.excepciones.InternalExcepcion;

@Component
public class ReporteResumenFacade {

	private @Autowired
	TarjetaService tarjetaService;

	private @Autowired
	TransaccionMapper transaccionMapper;

	private @Autowired
	CargoMapper cargoMapper;

	private @Autowired
	EmpresaService empresaService;
	
	private @Autowired
	AsignacionMapper asignacionMapper;

	public List<TarjetaResumen> obtenerListaTarjetas(String fechaInicio,
			String fechaFin) throws ServiceException {
		return tarjetaService.obtenerListaTarjetas(
				empresaService.buscarEmpresaPorRUC(
						UsefulWebApplication.obtenerUsuario().getRuc())
						.getCuentaCorriente(), fechaInicio, fechaFin);

	}

	public List<Transaccion> obtenerListaTransacciones(String fechaInicio,
			String fechaFin) throws ServiceException {
		return transaccionMapper.obtenerlistaTransacciones(
				empresaService.buscarEmpresaPorRUC(
						UsefulWebApplication.obtenerUsuario().getRuc())
						.getCuentaCorriente(), fechaInicio, fechaFin);
	}

	public List<Cargo> obtenerListaCargos(String fechaInicio, String fechaFin)
			throws ServiceException {
		return cargoMapper.obtenerlistaCargos(
				empresaService.buscarEmpresaPorRUC(
						UsefulWebApplication.obtenerUsuario().getRuc())
						.getCuentaCorriente(), fechaInicio, fechaFin);
	}

	
	public List<Asignacion> obtenerAsignacionesPorTarjeta(String numTarjeta )
			throws InternalExcepcion {
		try {
			return asignacionMapper.obtenerAsignacionesPorTarjeta(numTarjeta);
		} catch (Exception ex) {
			throw new InternalExcepcion(ex.getMessage(), ex);
		}
		
	}

	public List<Asignacion> obtenerAsignacionesPorDocumento(String tipoDocumento, String numDocumento)
			throws InternalExcepcion {
		try {
			return asignacionMapper.obtenerAsignacionesPorDocumento(tipoDocumento, numDocumento);
		} catch (Exception ex) {
			throw new InternalExcepcion(ex.getMessage(), ex);
		}
		
	}


}
