package com.educacionit.clase4;

public class Test {

	public static void main(String[] args) {

		SeriesNumericaDeTresEnTres obj = new SeriesNumericaDeTresEnTres();
		SerieNumericaDeDosEnDos dosOb = new SerieNumericaDeDosEnDos();

		// REFERENCIAS A INTERFACES

		ISeriesNumericas ob;

		for (int j = 0; j < 5; j++) {
			ob = dosOb;
			System.out.println("Ref , Siguiente valor DeDos es : " + ob.getSiguiente());

			ob = obj;
			System.out.println("Ref , siguiente valor DeTres es : " + ob.getSiguiente());
		}


		for (int i = 0; i < 5; i++) 
			System.out.println("Siguiente valor es :" + dosOb.getSiguiente());
		
			System.out.println("\n Reiniciando la Serie");
			dosOb.reiniciar();
		

		for (int i = 0; i < 5; i++) 
			System.out.println("Siguiente valor es :" + dosOb.getSiguiente());
			
			System.out.println("\n Reiniciando la Serie");
			dosOb.setComenzar(50);
		

		for (int i = 0; i < 5; i++) {
			System.out.println("Siguiente valor es :" + dosOb.getSiguiente());
		}

	}

}
