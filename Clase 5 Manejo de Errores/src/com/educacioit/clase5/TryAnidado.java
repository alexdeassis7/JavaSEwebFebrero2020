package com.educacioit.clase5;

public class TryAnidado {

	public static void main(String[] args) {

		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 0, 0, 0, 4, 0 , 8 };

		try {// TRY EXTERNO
			for (int i = 0; i < nums.length; i++) {
				try {// try anidado

					System.out.println(nums[i] + " / " + denom[i] + " = " + nums[i] / denom[i]);

				} catch (ArithmeticException e) {
					// capturamos la Exception
					System.out.println("No se puede dividir por cero en los numeros reales!");
				}
			}
			
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Capturando la exceptio
			System.out.println("Algo ocurrio ");
			System.out.println("ERRORRRRRR : Programa finalizado");
			
		}

	}

}
