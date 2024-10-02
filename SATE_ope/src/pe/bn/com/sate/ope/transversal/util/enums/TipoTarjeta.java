package pe.bn.com.sate.ope.transversal.util.enums;

import java.util.ArrayList;
import java.util.List;

public enum TipoTarjeta {
	BLACK("MC CORP BLK","531013"),
	CORPORATE("MC CORP","530927");
	String descripcion;
	String codigoBim;
	TipoTarjeta(String descripcion, String codigoBim) {
		this.descripcion = descripcion;
		this.codigoBim = codigoBim;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigoBim() {
		return codigoBim;
	}
	public void setCodigoBim(String codigoBim) {
		this.codigoBim = codigoBim;
	}
	public static List<TipoTarjeta> buscarTipoTarjeta() {
		List<TipoTarjeta> listaTipoTarjeta = new ArrayList<TipoTarjeta>();
		listaTipoTarjeta.add(TipoTarjeta.CORPORATE);
		listaTipoTarjeta.add(TipoTarjeta.BLACK);
 		return listaTipoTarjeta;
	}
}
