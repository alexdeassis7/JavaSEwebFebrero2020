package com.educacionit.clase8bis;

import java.util.ArrayList;
import java.util.Collection;

public class AppPrincipal {

	public static void main(String[] args) {

		Collection listaMacasCoches = new ArrayList<String>();

		listaMacasCoches.add("Audi");
		listaMacasCoches.add("Porsche");
		listaMacasCoches.add("Aston Martin");

		System.out.println("numero de Elementos en el ArrayList : " + listaMacasCoches.size());

		listaMacasCoches.add("Ford Falcon");
		listaMacasCoches.add("Mercedes");
		listaMacasCoches.add("Rastrojero");
		listaMacasCoches.add("Seat");

		
		
		System.out.println("numero de Elementos en el ArrayList : " + listaMacasCoches.size());

		System.out.println("toString" + listaMacasCoches.toString());
		
		listaMacasCoches.remove("Seat");
		listaMacasCoches.remove("Mercedes");
		listaMacasCoches.remove("lala");
		
		listaMacasCoches.remove("Peugeot");
		
		
		System.out.println("numero de Elementos en el ArrayList despues de eliminar :" + listaMacasCoches.size());
		System.out.println("toString" + listaMacasCoches.toString());
		
	}

}
