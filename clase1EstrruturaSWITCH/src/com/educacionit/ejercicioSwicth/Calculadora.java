package com.educacionit.ejercicioSwicth;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {

		int numeroUno = 0, numeroDos = 0, resultado = 0, opcionIngresada = 0;
		boolean flag = false;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Welcome to App");
		System.out.println("Que operacion aritmetica desea realizar ");
		System.out.println("1.SUMAR \n2.RESTAR \n3.DIVIDIR \n4.MULTIPLICAR");
		opcionIngresada = teclado.nextInt();

		switch (opcionIngresada) {
		case 1:
			System.out.println("Usted selecciono la suma");
			System.out.println("ingrese el numero 1");
			numeroUno = teclado.nextInt();
			System.out.println("ingrese el numero 2");
			numeroDos = teclado.nextInt();
			resultado = numeroUno + numeroDos;
			System.out.println("el resultado es " + resultado);
			break;
		case 2:
			System.out.println("Usted selecciono la resta");
			System.out.println("ingrese el numero 1");
			numeroUno = teclado.nextInt();
			System.out.println("ingrese el numero 2");
			numeroDos = teclado.nextInt();
			resultado = numeroUno - numeroDos;
			System.out.println("el resultado es " + resultado);
			break;

		case 3:
			// validar cuando sea cero--...
			System.out.println("Usted selecciono la div");
			System.out.println("ingrese el numero 1");
			numeroUno = teclado.nextInt();

			do {
				if (flag) {
					System.out.println("no podemos dividir por cero en los numeros reales , intente nuevamente ");
					System.out.println("ingrese numero dos de nuevo por favor");
				} else {
					System.out.println("ingrese el numero 2");
				}
				numeroDos = teclado.nextInt();
				flag = true;
			} while (numeroDos == 0);

			resultado = numeroUno / numeroDos;
			System.out.println("el resultado es " + resultado);
			break;
		case 4:
			System.out.println("Usted selecciono la multi");
			System.out.println("ingrese el numero 1");
			numeroUno = teclado.nextInt();
			System.out.println("ingrese el numero 2");
			numeroDos = teclado.nextInt();
			resultado = numeroUno * numeroDos;
			System.out.println("el resultado es " + resultado);
			break;

		default:
			System.out.println("Opcion ingresada es incorrecta");
			break;
		}

		System.out.println("fin del programa ");

	}
}
