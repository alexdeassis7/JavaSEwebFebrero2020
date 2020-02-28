package com.educacionit.clase1;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		// comentario de linea
		// Ejercicio 1 :
		/*
		 * Suponga que un individuo desea invertir su capital en un banco y desea saber
		 * cuanto dinero ganara despuès de un mes si el banco le paga a razòn de 2%
		 * mensual
		 */
		//definimos las variablea a utilizar  :
		double ganacia = 0;
		double capitalInicial = 0;
		Scanner teclado = new Scanner(System.in);//defino un scanner para capturar los datos del teclado 
		//solicitamos datos al usuario 
		System.out.println("por favor ingrese el capital que invertira ");
		//capturamos el dato ingresado
		capitalInicial = teclado.nextDouble();
		//calculamos la ganancia obtenida 
		ganacia = capitalInicial * 0.02;
		//mostramos el total de dinero a retirar
		System.out.println("usted recibira un total de " + (ganacia + capitalInicial) + " pesos");
		
		
		
		
		
	}
}
