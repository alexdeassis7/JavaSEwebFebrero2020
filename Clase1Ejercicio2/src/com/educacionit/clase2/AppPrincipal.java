package com.educacionit.clase2;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		// un maestro desea saber que porcentaje de hombre y que porcentaje de mujeres
		// tiene dentro de su gfrupo de estudiantes
		int numHombres = 0, numMujeres = 0;
		float totalDeAlumnos = 0;
		//float porcentajeHombre = 0, porcentajeMujeres = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de hombres");
		numHombres = teclado.nextInt();

		System.out.println("Ingrese la cantidad de mujeres");
		numMujeres = teclado.nextInt();

		totalDeAlumnos = numHombres + numMujeres;
		//porcentajeHombre = numHombres * 100 / totalDeAlumnos;
		//porcentajeMujeres = (numMujeres * 100 )/ totalDeAlumnos;

		System.out.println("el porcetaje de hombres es " + numHombres * 100 / totalDeAlumnos + "%");
		System.out.println("el porcetaje de mujeres es " + (numMujeres * 100 )/ totalDeAlumnos + "%");


		
		
		
	}

}
