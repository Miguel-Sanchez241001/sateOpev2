package pe.bn.com.sate.ope.persistence.mapper.internal;

import org.apache.ibatis.annotations.Select;

public interface ParametroMapper {

	@Select("SELECT BN_SATE.BNSQ_16_MOV_NUM_REFERENCIA.nextval from dual ")	
	public long obtenerNumeroReferenciaMovimientos(); 
	
	@Select("SELECT BN_SATE.BNSQ_16_SAL_NUM_REFERENCIA.nextval from dual ")	
	public long obtenerNumeroReferenciaSaldos(); 
		
	@Select("SELECT BN_SATE.BNSQ_REFE.nextval FROM DUAL")	
	public long obtenerNumeroReferenciaWS(); 
	
}
