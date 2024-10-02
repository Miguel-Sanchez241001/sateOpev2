package pe.bn.com.sate.ope.infrastructure.service.internal;

import pe.bn.com.sate.ope.transversal.dto.sate.Empresa;

public interface EmpresaService {

	public Empresa buscarEmpresaPorRUC(String ruc);
	
	public Empresa buscarEmpresaAfiliada(String ruc);
}
