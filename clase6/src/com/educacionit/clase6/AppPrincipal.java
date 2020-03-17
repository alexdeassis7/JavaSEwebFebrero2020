package com.educacionit.clase6;

import java.util.Scanner;

import com.educacionit.miserrores.MiExcepcion;

public class AppPrincipal {

	public static void main(String[] args) {
		int numeroIngresado = 0;
		
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("por favor ingrese un numero ");
			numeroIngresado = teclado.nextInt();

			if (numeroIngresado >= 0 && numeroIngresado <= 10) {
				
				throw new MiExcepcion(111);
				
			} else if (numeroIngresado >= 10 && numeroIngresado <= 20) {
				
				throw new MiExcepcion(112);
				
			} else if (numeroIngresado >= 20 && numeroIngresado <= 30) {
				
				throw new MiExcepcion(113);
			}

		} catch (MiExcepcion  e ) {
			System.out.println("capturamos nuestra exception ");
			System.out.println(e.getMessage());
			System.out.println("sucedio un error en la Clase AppPricipal");
			
		}
		
		System.out.println("no sucedio un error");
		
		teclado.close();

	}
}
