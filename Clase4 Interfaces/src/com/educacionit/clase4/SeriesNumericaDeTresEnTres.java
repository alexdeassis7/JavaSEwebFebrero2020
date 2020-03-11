package com.educacionit.clase4;

public class SeriesNumericaDeTresEnTres implements ISeriesNumericas {

	int iniciar;
	int valor;
	int anterior;

	SeriesNumericaDeTresEnTres() {
		iniciar = 0;
		valor = 0;
	}

	@Override
	public int getSiguiente() {
		anterior = valor;
		valor += 3;
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
		anterior = valor-3 ;
	}

	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;
		anterior = x - 3;
	}

//metodo propio de la clase
	public int getAnterior() {
		return anterior;
	}

}
