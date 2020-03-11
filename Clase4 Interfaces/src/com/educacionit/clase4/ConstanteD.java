package com.educacionit.clase4;

public class ConstanteD implements Iconstantes {

	
	public static void main(String[] args) {
		
		int numeros[] = new int [MAX];
		
		
		for (int i = MIN ; i < 9 ; i++)
		{
			if(i >= MAX) {
				System.out.println(MENSAJEERROR);
			}else {
				numeros[i]=i;
				System.out.print(numeros[i] + "   ");
			}
		}
		
		
	}
	
	
}
