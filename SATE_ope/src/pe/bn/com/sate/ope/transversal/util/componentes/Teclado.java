package pe.bn.com.sate.ope.transversal.util.componentes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pe.bn.com.sate.ope.transversal.util.UsefulWebApplication;

public class Teclado {

	private List<String> listaTeclas;
	private String clave;

	public Teclado() {
		listaTeclas = new ArrayList<String>();
		clave = "";
		generarTeclado();
	}

	private void generarTeclado() {
		listaTeclas.clear();
		listaTeclas.add("0");
		listaTeclas.add("1");
		listaTeclas.add("2");
		listaTeclas.add("3");
		listaTeclas.add("4");
		listaTeclas.add("5");
		listaTeclas.add("6");
		listaTeclas.add("7");
		listaTeclas.add("8");
		listaTeclas.add("9");
		Collections.shuffle(listaTeclas);
	}

	public void escribirTecla(long posicion) {
		if (clave.length() < 6) {
			clave += listaTeclas.get((int) posicion);
			System.out.println(clave);
		}
	}

	public void limpiar() {
		clave = "";
	}

	public List<String> getListaTeclas() {
		return listaTeclas;
	}

	public void setListaTeclas(List<String> listaTeclas) {
		this.listaTeclas = listaTeclas;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
