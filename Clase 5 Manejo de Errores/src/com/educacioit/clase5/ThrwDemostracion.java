package com.educacioit.clase5;

//lanzar exception manualmente

public class ThrwDemostracion {

	public static void main(String[] args) {
		
		try {
			System.out.println("antes de lanzar la exceptio ");
			throw new ArithmeticException(); //lanzar exception	
		}catch (ArithmeticException e) {
			//Capturamos la exception
			System.out.println("Exception capturada ");
		}
		
		System.out.println("finalizamos el bloque try catch ");
		
	}

}
