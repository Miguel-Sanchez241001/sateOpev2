package pe.bn.com.sate.ope.infrastructure.facade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.bn.com.sate.ope.infrastructure.exception.ServiceException;
import pe.bn.com.sate.ope.infrastructure.service.internal.TarjetaService;
import pe.bn.com.sate.ope.transversal.dto.sate.SaldoTarjeta;
import pe.bn.com.sate.ope.transversal.dto.sate.Tarjeta;
import pe.bn.com.sate.ope.transversal.dto.ws.DTOConsultaDatosExpediente;
import pe.bn.com.sate.ope.transversal.util.excepciones.InternalExcepcion;

@Component
public class BuscarTarjetaFacade {

	@Autowired
	private TarjetaService tarjetaService;

	@Autowired
	private FWMCProcesos fWMCProcesos;

	public void actualizarSaldoTarjeta(
			String numTarjeta,
			String numCuenta, 
			String tipoMoneda, 
			Date fechaExpiracion)
			throws ServiceException, ParseException {
		//devolver como tarjeta		
		DTOConsultaDatosExpediente consDatoExp = new DTOConsultaDatosExpediente();
		//MGL 
		try {
			consDatoExp = fWMCProcesos.consultaDatosPorExpediente(
					
					numCuenta, 
					tipoMoneda, 
					fechaExpiracion);
			
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			
			
			Tarjeta tarjeta = new Tarjeta();
			tarjeta.setNumTarjeta(numTarjeta);//numTarjeta		
									
			/**/
			if(!consDatoExp.getSaldoFechaApertura().trim().isEmpty()){
				String anio = consDatoExp.getSaldoFechaApertura().substring(0,4);
				String mes = consDatoExp.getSaldoFechaApertura().substring(4,6);
				String dia = consDatoExp.getSaldoFechaApertura().substring(6,8);
				Date fechaApe = new Date();
				try{			    	   
					fechaApe = formato.parse(dia+"/"+mes+"/"+anio);			    	  
				}catch(ParseException e){   
			           e.printStackTrace();
			           // log the exception
			           throw new RuntimeException(e);
			    }				
				tarjeta.setFechaInicioLinea(fechaApe);//saldoTarjeta.getFechaApertura()				
			}	
			
			
			if(!consDatoExp.getSaldoFechaExpiracion().trim().isEmpty()){
				  String fchExpanio =  consDatoExp.getSaldoFechaExpiracion().substring(0,2);			     
			      String fchExpdia =  "01";
			      String fchExpmes  =  consDatoExp.getSaldoFechaExpiracion().substring(2,4);
			      Date fechaExp = new Date();
					try{				    	   
						fechaExp = formato.parse(fchExpdia+"/"+fchExpmes+"/20"+fchExpanio);			    	  
					}catch(ParseException e){   
				           e.printStackTrace();
				           // log the exception
				           throw new RuntimeException(e);
				    }				
				tarjeta.setFechaTerminoLinea(fechaExp);//saldoTarjeta.getFechaExpiracion()
					
			}
					
			tarjeta.setMontoLineaAsignado(Double.parseDouble(consDatoExp.getSaldoLineaCredito()));//saldoTarjeta.getLineaCredito()
			tarjeta.setMontoLineaActual(Double.parseDouble(consDatoExp.getSaldoActual()));//saldoTarjeta.getDispActual()
			tarjeta.setMontoCompraUsado(Double.parseDouble(consDatoExp.getSaldoPagoTotal()));//saldoTarjeta.getPagoTotal()
			
			//tarjeta.setMontoPorProcesar(Double.parseDouble(consDatoExp.getSaldoImporteMora()));//saldoTarjeta.getImporteMora()
			tarjeta.setMontoPorProcesar(Double.parseDouble(consDatoExp.getSaldoMontoProcesar()));

			
			tarjeta.setDispEfectivoUsado(
					Double.parseDouble(consDatoExp.getSaldoEfectivo())	- Double.parseDouble(consDatoExp.getSaldoDispEfectivo()));
			//saldoTarjeta.getEfectivo()	- saldoTarjeta.getDispEfectivo()
			
			tarjetaService.actualizarSaldos(tarjeta);
			
		} catch (InternalExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public void actualizarSaldoTarjeta(String numTarjeta)
//			throws ServiceException {
//		
//		
//		SaldoTarjeta saldoTarjeta = fWMCProcesos
//				.consultarSaldosPorTarjeta(numTarjeta);
//		
//		
//		Tarjeta tarjeta = new Tarjeta();
//		tarjeta.setNumTarjeta(numTarjeta);
//		tarjeta.setFechaInicioLinea(saldoTarjeta.getFechaApertura());
//		tarjeta.setFechaTerminoLinea(saldoTarjeta.getFechaExpiracion());
//		tarjeta.setMontoLineaAsignado(saldoTarjeta.getLineaCredito());
//		tarjeta.setMontoLineaActual(saldoTarjeta.getDispActual());
//		tarjeta.setMontoCompraUsado(saldoTarjeta.getPagoTotal());
//		tarjeta.setMontoPorProcesar(saldoTarjeta.getImporteMora());
//		tarjeta.setDispEfectivoUsado(saldoTarjeta.getEfectivo()
//				- saldoTarjeta.getDispEfectivo());
//		
//		// tarjetaService.actualizarSaldos(tarjeta);
//
//	}
	
	
	
}
