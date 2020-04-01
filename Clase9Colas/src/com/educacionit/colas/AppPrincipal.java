package com.educacionit.colas;

import java.util.PriorityQueue;

public class AppPrincipal {

	public static void main(String[] args) {
	//creamos un objeto de la clase priorityQueue
		PriorityQueue<Integer> cola1 = new PriorityQueue<Integer>();
		
		//cargamos objetos en la cola de prioridades 
		//offer(): retorna true si pudo encolar el elemento o de lo contrario retorna false
		cola1.offer(70);
		cola1.offer(120);
		cola1.offer(6);
		cola1.offer(25);		
//		add(): si no puede agregar el elemento lanza IllegalStateException
		
		//metodo peek ; retorna sin desescolar el primer elemento si existe
		//si no existe , retorna null
		//metodo element() ; retorna sin desescolar el primer elemento si existe
				//si no existe , retorna un 		NoSuchElementException
//		System.out.println("Peek():"+cola1.peek());
		System.out.println("element():"+cola1.element());
		//6 - 25 - 70 - 120
		//metodo poll () : desensecola y retorna un elemento
		//si existe , si no existe , retorna null
		
//		metodo Remove(): desencola y retorna un elemento si existe ,si no existe ,retorna un
//		NoSuchElementException
		while( !cola1.isEmpty()) {
//			System.out.print(cola1.poll() + " - ");
			System.out.print(cola1.remove() + " - ");
		}
//		3System.out.print(cola1.remove() + " - ");
		
		System.out.println("\n Peek():"+cola1.peek());
		System.out.println("element():"+cola1.element());
		

	}

}
