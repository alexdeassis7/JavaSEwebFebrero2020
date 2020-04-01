package com.educacionit.colas;

import java.util.LinkedList;
import java.util.Queue;

public class AppLinkedList {

	public static void main(String[] args) {

		Queue queue = new LinkedList();

//	System.out.println("Eliminar: " +queue.remove());
		queue.offer("item5");
		queue.add("item1");
		queue.add("item2");
		queue.offer("item3");
		queue.offer("item4");
		
		System.out.println("observamos el elemento que esta en la primer posicion  de la cola ");
		System.out.println(queue.peek());
		
		while( !queue.isEmpty()) {
			System.out.print(queue.remove() + " - ");
		}
		System.out.println("\n" +queue.peek());

	}

}
