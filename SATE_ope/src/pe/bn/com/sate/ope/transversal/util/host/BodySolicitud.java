package pe.bn.com.sate.ope.transversal.util.host;

import pe.bn.com.sate.ope.transversal.util.constantes.ConstantesGenerales;

public class BodySolicitud extends WSData {

	// private static LoggerBn log3 =
	// LoggerBn.getInstance(BodySolicitud.class.getName());

	public void initHost(String bodyInPut) {
		this.campos = new Campo[2];
		try {

			int num = -1;
			this.campos[++num] = new Campo("msgnoHost", Campo.CHARACTER, 4);
			this.campos[++num] = new Campo("msjeHost", Campo.CHARACTER,
					(bodyInPut.length() - 4));

		} catch (Exception e) {
			e.printStackTrace();
			// log3.error(e,"","");
		}
	}

	public void init() {
		this.campos = new Campo[12];
		try {
			// TODO: TRAMA QUE ENVIAMOS
			int num = -1;
			this.campos[++num] = new Campo("DFH-TOPERACION", Campo.CHARACTER, 2);
			this.campos[++num] = new Campo("DFH-MODULO", Campo.CHARACTER, 4);
			this.campos[++num] = new Campo("DFH-TIMESTAMP", Campo.CHARACTER, 26);
			this.campos[++num] = new Campo("DFH-CCANAL", Campo.CHARACTER, 4);
			this.campos[++num] = new Campo("DFH-CTERM", Campo.CHARACTER, 20);
			this.campos[++num] = new Campo("DFH-CEMPRESA", Campo.CHARACTER, 11);
			this.campos[++num] = new Campo("DFH-CIC", Campo.CHARACTER, 12);
			this.campos[++num] = new Campo("DFH-TIPDOC", Campo.CHARACTER, 1);
			this.campos[++num] = new Campo("DFH-NUMDOC", Campo.CHARACTER, 12);
			this.campos[++num] = new Campo("DFH-CLAVE-6", Campo.CHARACTER, 6);
			this.campos[++num] = new Campo("DFH-CLAVE-6-ANT", Campo.CHARACTER,6);
			this.campos[++num] = new Campo("DFH-CUSUARIO", Campo.CHARACTER, 7);

		} catch (Exception e) {
			e.printStackTrace();
			// log3.error(e,"","");
		}

	}

	public void initOk(String bodyInPut) {
		this.campos = new Campo[18];
		try {

			int num = -1;
			int tamanoEnBlanco = 9629;
			// TODO: TRAMA QUE RECIBIMOS
			this.campos[++num] = new Campo("DFH-TOPERACION", Campo.CHARACTER, 2);
			this.campos[++num] = new Campo("DFH-MODULO", Campo.CHARACTER, 4);
			this.campos[++num] = new Campo("DFH-TIMESTAMP", Campo.CHARACTER, 26);
			this.campos[++num] = new Campo("DFH-CCANAL", Campo.CHARACTER, 4);
			this.campos[++num] = new Campo("DFH-CTERM", Campo.CHARACTER, 20);
			this.campos[++num] = new Campo("DFH-CEMPRESA", Campo.CHARACTER, 11);
			this.campos[++num] = new Campo("DFH-CIC", Campo.CHARACTER, 12);
			this.campos[++num] = new Campo("DFH-TIPDOC", Campo.CHARACTER, 1);
			this.campos[++num] = new Campo("DFH-NUMDOC", Campo.CHARACTER, 12);
			this.campos[++num] = new Campo("DFH-CLAVE-6", Campo.CHARACTER, 6);
			this.campos[++num] = new Campo("DFH-CLAVE-6-ANT", Campo.CHARACTER,
					6);
			this.campos[++num] = new Campo("DFH-CUSUARIO", Campo.CHARACTER, 7);
			this.campos[++num] = new Campo("DFH-FILLER", Campo.CHARACTER, 78);
			this.campos[++num] = new Campo("DFH-CERROR", Campo.CHARACTER, 4);
			this.campos[++num] = new Campo("DFH-MSJ", Campo.CHARACTER, 60);
			this.campos[++num] = new Campo("BLANCO", Campo.CHARACTER,
					tamanoEnBlanco);
			this.campos[++num] = new Campo("msgnoHost", Campo.CHARACTER, 4);
			this.campos[++num] = new Campo("msjeHost", Campo.CHARACTER,
					bodyInPut.length() - (tamanoEnBlanco + 257));

		} catch (Exception e) {
			e.printStackTrace();
			// log3.error(e,"","");
		}

	}

	public void cargarData(String tOperacion, String modulo, String timeStamp,
			String cCanal, String cTerm, String cEmpresa, String cic,
			String tipoDoc, String numDoc, String clave, String claveAnt,
			String cUsuario) throws Exception {

		int num = -1;

		init();

		this.campos[++num].setString(tOperacion);
		this.campos[++num].setString(modulo);
		this.campos[++num].setString(timeStamp);
		this.campos[++num].setString(cCanal);
		this.campos[++num].setString(cTerm);
		this.campos[++num].setString(cEmpresa);
		this.campos[++num].setString(cic);
		this.campos[++num].setString(tipoDoc);
		this.campos[++num].setString(numDoc);
		this.campos[++num].setString(clave);
		this.campos[++num].setString(claveAnt);
		this.campos[++num].setString(cUsuario);

	}

	public void FillBoby(String bodyInPut) throws Exception {
		init();
		super.FillBoby(bodyInPut);

	}

	public void FillBobyOk(String bodyInPut) throws Exception {
		initOk(bodyInPut);
		super.FillBoby(bodyInPut);

	}

	public void FillBobyHost(String bodyInPut) throws Exception {
		initHost(bodyInPut);
		super.FillBoby(bodyInPut);

	}

}
