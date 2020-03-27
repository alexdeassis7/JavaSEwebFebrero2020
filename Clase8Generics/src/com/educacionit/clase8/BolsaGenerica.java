package com.educacionit.clase8;

import java.util.ArrayList;
import java.util.Iterator;

public class BolsaGenerica<T> implements Iterable<T> {

	private ArrayList<T> lista = new ArrayList<T>();
	private int tope;

	public BolsaGenerica(int tope) {
		super();
		this.tope = tope;
	}

	public void agregar(T objeto) {

		if (lista.size() <= tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("no caben mas elementos en la bolsa");
		}

	}

	@Override
	public Iterator<T> iterator() {

		return lista.iterator();
	}

}
