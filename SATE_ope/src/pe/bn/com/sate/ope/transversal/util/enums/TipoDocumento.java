package pe.bn.com.sate.ope.transversal.util.enums;

/**
 * Enumeración para los tipos de documento. 
 * Esta enumeración solo incluye DNI y CARNET DE EXTRANJERÍA.
 */
public enum TipoDocumento {
    DNI("001", "1", "DNI", 8),
    CARNET_EXTRANJERIA("017", "4", "CARNET DE EXTRANJERÍA", 12);

	/*DNI("001", "1", "DNI", 8), CARNET_POLICIA_NACIONAL("002", "2",
			"CARNET DE POLICÍA NACIONAL", 9), CARNET_EXTRANJERIA("017", "4",
			"CARNET DE EXTRANJERÍA", 12), PASAPORTTE("005", "5", "PASAPORTE",
			12), RUC("006", "6", "RUC", 11);*/
	
	
    private String codigoSign;
    private String codigoBduc;
    private String nombre;
    private int length;

    private TipoDocumento(String codigoSign, String codigoBduc, String nombre, int length) {
        this.length = length;
        this.codigoSign = codigoSign;
        this.codigoBduc = codigoBduc;
        this.nombre = nombre;
    }

    /**
     * Retorna el nombre del tipo de documento basado en el código BDUC.
     *
     * @param tipoDocumento Código BDUC del tipo de documento.
     * @return Nombre del tipo de documento.
     */
    public static String tipoDocumentoBducLetras(String tipoDocumento) {
        if (tipoDocumento != null) {
            for (TipoDocumento tipoDocumentoEnum : TipoDocumento.values()) {
                if (tipoDocumento.equals(tipoDocumentoEnum.getCodigoBduc())) {
                    return tipoDocumentoEnum.getNombre();
                }
            }
        }
        return "";
    }

    /**
     * Retorna el nombre del tipo de documento basado en el código SIGN.
     *
     * @param tipoDocumento Código SIGN del tipo de documento.
     * @return Nombre del tipo de documento.
     */
    public static String tipoDocumentoSignLetras(String tipoDocumento) {
        if (tipoDocumento != null) {
            for (TipoDocumento tipoDocumentoEnum : TipoDocumento.values()) {
                if (tipoDocumento.equals(tipoDocumentoEnum.getCodigoSign())) {
                    return tipoDocumentoEnum.getNombre();
                }
            }
        }
        return "";
    }

    /**
     * Retorna la longitud esperada del tipo de documento basado en el código BDUC.
     *
     * @param tipoDocumento Código BDUC del tipo de documento.
     * @return Longitud esperada del tipo de documento.
     */
    public static int obtenerLength(String tipoDocumento) {
        if (tipoDocumento != null) {
            for (TipoDocumento tipoDocumentoEnum : TipoDocumento.values()) {
                if (tipoDocumento.equals(tipoDocumentoEnum.getCodigoBduc())) {
                    return tipoDocumentoEnum.getLength();
                }
            }
        }
        return 0;
    }

    public String getCodigoSign() {
        return codigoSign;
    }

    public void setCodigoSign(String codigoSign) {
        this.codigoSign = codigoSign;
    }

    public String getCodigoBduc() {
        return codigoBduc;
    }

    public void setCodigoBduc(String codigoBduc) {
        this.codigoBduc = codigoBduc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
