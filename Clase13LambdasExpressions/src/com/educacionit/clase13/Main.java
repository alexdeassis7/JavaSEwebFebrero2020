package com.educacionit.clase13;

public class Main {
	public static void main(String[] args) {
		//Crea una referencia a una instancia de MiValor 
		Mivalor miVal;
		
//		se le asigna una expresion lambda a esa referencia de interzar:
//		Usar lambda en un contexto de asignacion
		miVal = () -> 25.6;
		
		System.out.println("Un valor constante" + miVal.getValor());
		
		Mivalor miVal2 = () -> 3.8 ;
		
		System.out.println("Un valor constante" +miVal2.getValor());
		
		MiValorParam mivalor = (n) -> 1.0/n;
		System.out.println("El Reciproco de 4.0 es :" + mivalor.getValor(4.0));
		
		MiValorParam mivalor3 = (double n) -> 1.0 / n;
		
		System.out.println("El Reciproco de 4.0 es :" + mivalor.getValor(4.0));
		
	}
}
