package com.educacioit.clase5;

import java.io.IOException;

public class AppPrincipal {
	public static void main(String[] args) {
//		palabras claves de manejo de errores
//		try , catch , throw ,throws  y  finally

		int nums[] = new int[4];
		
		try {
			
			ExcEjemplo.genException();
			
		}catch (ArrayIndexOutOfBoundsException e) {
			// capturo el error
			System.out.println("indice fuera de los limites");
		}
		
		System.out.println("Despuès de que se genere la Exception");
		
		
		
		
	}
}
