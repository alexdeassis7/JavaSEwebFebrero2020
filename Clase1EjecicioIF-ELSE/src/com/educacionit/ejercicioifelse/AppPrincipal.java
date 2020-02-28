package com.educacionit.ejercicioifelse;

import java.util.Scanner;

public class AppPrincipal {
////Ejercicio 3 :
//Un obrero necesita calcular su salario semanal , el cual se obtiene de la siguiente 
//manera:
//	Si trabaja 40 hs o menos se le paga $16 por hora 
//	si trabaja mas de 40 hs se le paga $16 por cada una de las primeras 40 hs y 20 $
//	por cada hs extra	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int hsTrabajadas = 0, hsExtras = 0, salarioSemanal = 0;

		System.out.println("Por favor ingrese la cantidad de horas trabajadas");
		hsTrabajadas = teclado.nextInt();

		if (hsTrabajadas > 40) {
			hsExtras = hsTrabajadas - 40;
			salarioSemanal = hsExtras * 20 + 40 * 16;

		} else {
			salarioSemanal = hsTrabajadas * 16;
		}
		System.out.println("su salario semana es de " + salarioSemanal);
	}

}
