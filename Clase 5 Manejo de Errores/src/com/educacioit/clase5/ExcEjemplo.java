package com.educacioit.clase5;

//Una exception puede ser generarda por un metodo y atrapada por otro 
public class ExcEjemplo {
	// metodo que genera una exception de indice fuera de limites
	static void genException() {
		
		int nums[] = new int[4];

		System.out.println("Antes de que se genere la Excepciòn!");

		nums[8] = 10;
		
		System.out.println("Esto no se mostrara !!!");

	}

}
