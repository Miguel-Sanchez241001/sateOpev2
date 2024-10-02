package pe.bn.com.sate.ope.transversal.util.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TipoTarjetaNegocio {

	 	BLACK_VIATICO("VIATICO", "531013", "1"),
	 	BLACK_CAJA("CAJA CHICA", "531013", "2"),
	   	BLACK_ENCARGO("ENCARGO", "531013", "3"),    
	    CORPORATE_VIATICO("VIATICO", "530927", "1"),
	    CORPORATE_CAJA("CAJA CHICA", "530927", "2"),
	    CORPORATE_ENCARGO("ENCARGO", "530927", "3");

	private String descripcion;
	private String codigo;
	private String diseno;

	private TipoTarjetaNegocio(String descripcion, String codigo, String diseno) {
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.diseno = diseno;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDiseno() {
		return diseno;
	}

	public static List<TipoTarjetaNegocio> buscarTipoTarjetaBLACK() {
		List<TipoTarjetaNegocio> listaTipoTarjeta = new ArrayList<TipoTarjetaNegocio>();
		listaTipoTarjeta.add(TipoTarjetaNegocio.BLACK_VIATICO);
 		return listaTipoTarjeta;
	}
	public static List<TipoTarjetaNegocio> buscarTipoTarjetaCORP() {
		List<TipoTarjetaNegocio> listaTipoTarjeta = new ArrayList<TipoTarjetaNegocio>();
 		listaTipoTarjeta.add(TipoTarjetaNegocio.CORPORATE_ENCARGO);
		listaTipoTarjeta.add(TipoTarjetaNegocio.CORPORATE_VIATICO);
 		return listaTipoTarjeta;
	}
	
	
	public static List<TipoTarjetaNegocio> buscarTipoTarjetaUsoExtrajero() {
		return Arrays.asList(values());
	}

	public static String descripcionTipotarjeta(String codigo, String diseno) {
		if (codigo != null && diseno != null)
			for (TipoTarjetaNegocio tipoTarjeta : values()) {
				if (codigo.equals(tipoTarjeta.getCodigo())
						&& diseno.equals(tipoTarjeta.getDiseno())) {
					return tipoTarjeta.getDescripcion();
				}
			}
		return "Ninguno";
	}
    public static TipoTarjetaNegocio fromCodigoYDiseno(String codigo, String diseno) {
        if (codigo != null && diseno != null) {
            for (TipoTarjetaNegocio tipoTarjeta : values()) {
                if (codigo.equals(tipoTarjeta.getCodigo()) && diseno.equals(tipoTarjeta.getDiseno())) {
                    return tipoTarjeta;
                }
            }
        }
        return null; // Devuelve null si no se encuentra ninguna coincidencia
    }

}
