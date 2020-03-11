package com.educacionit.clase4;

public class SerieNumericaDeDosEnDos implements ISeriesNumericas {
	int iniciar;
	int valor;
	int anterior;
	SerieNumericaDeDosEnDos() {
		iniciar = 0;
		valor = 0;
	}
	@Override
	public int getSiguiente() {
		anterior = valor;
		valor += 2;
		return valor;
	}
	@Override
	public void reiniciar() {
		valor = iniciar;
		anterior = valor-2 ;
		
	}
	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;
		anterior = x - 2;
	}
//metodo propio de la clase
	public int getAnterior() {
		return anterior;
	}

}
