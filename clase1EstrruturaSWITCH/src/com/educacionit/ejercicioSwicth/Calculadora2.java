package com.educacionit.ejercicioSwicth;

import javax.swing.JOptionPane;

public class Calculadora2 {
	//Atributos de la clase 
	public int resultado, numero1, numero2;

	// metodos de la clase calculadora
	// funcion sumar
	public int sumar(int numero1, int numero2) {
		resultado = numero1 + numero2;
		return resultado;
	}

	public int restar(int numero1, int numero2) {
		resultado = numero1 - numero2;
		return resultado;
	}

	public int multiplicar(int numero1, int numero2) {
		resultado = numero1 * numero2;
		return resultado;
	}

	public float dividir(int numero1, int numero2) {
		if (numero2 == 0) {
			return 0;
		} else {
			return numero1 / numero2;
		}

	}

	// procedimiento de solicitud de datos
	public void solicitarNumeros() {
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 1 "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero 2 "));
		realizarOperacionAritmetica();
	}
	
	
	//metodo procedimiento 
	public void imprimirResultadoPorPantalla(float resultadoAmostrar, String operacion) {
		JOptionPane.showMessageDialog(null, operacion + "  : " + resultadoAmostrar);
	}
	
	
	

	public void realizarOperacionAritmetica() {
		int opcionIngresada = 0;
		opcionIngresada = Integer.parseInt(JOptionPane
				.showInputDialog("ingrese una opcion \n 1-sumar \\n 2-dividir\\n 3-multiplicar\\n 4-restar"));
		switch (opcionIngresada) {
		case 1:
			imprimirResultadoPorPantalla(sumar(numero1, numero2), "sumar");
			break;
		case 2:
			imprimirResultadoPorPantalla(dividir(numero1, numero2), "dividir");
			break;
		case 3:
			imprimirResultadoPorPantalla(multiplicar(numero1, numero2), "multiplicar ");
			break;
		case 4:
			imprimirResultadoPorPantalla(restar(numero1, numero2), "restar ");
			break;
		default:
			JOptionPane.showMessageDialog(null, "la opcion " + opcionIngresada + " no es valida ");
			break;

		}

	}

}
