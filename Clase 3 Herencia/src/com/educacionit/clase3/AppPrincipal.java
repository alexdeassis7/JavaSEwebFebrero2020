package com.educacionit.clase3;

import java.util.ArrayList;

import com.educacionit.clase3.modelos.Entrenador;
import com.educacionit.clase3.modelos.Futbolista;
import com.educacionit.clase3.modelos.Masajista;
import com.educacionit.clase3.modelos.SeleccionFutbol;

public class AppPrincipal {

	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {

		SeleccionFutbol delBosque = new Entrenador("20", 1, "Vicente", "Del Bosque", 49);
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 27, 6, "delantero derecho");
		SeleccionFutbol raulMartinez = new Masajista(5, "Licenciado en Fisioterapia Deportiva", 3, "Raùl", "Martinez",
				45);

		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		integrantes.add(delBosque);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienza una con centracion (Todos ejecutan el mismo mètodo )");

		for (SeleccionFutbol auxiliar : integrantes) {
			
			System.out.println(auxiliar.getNombre() + " " + auxiliar.getApellido() + "-> ");
			auxiliar.concentrarse();

		}
		
		
		System.out.println("***************************************************");
		// VIAJE
		System.out.println("Todos los integrantes viajan a jugar un partido  (Todos ejecutan el mismo mètodo )");

		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido() + "-> ");
			integrante.viajar();
		}

		System.out.println("***************************************************");
		
		
		//ENTRENAMIENTO
		System.out.println("Todos los integrantes entrenan para  jugar un partido  (Todos ejecutan el mismo mètodo )");
//		FOR EACH
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido() + "-> ");
			integrante.entrenamiento();
		}

		System.out.println("***************************************************");
		
		
		// PARTIDO DE FUTBOL
		System.out.println("Todos los integrantes cumplen sus funcion en  un partido  (Todos ejecutan el mismo mètodo )");

		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido() + "-> ");
			integrante.partidoFutbol();
		}

		
		
		
		
		
		
		
		
		
		// no podemos intanciar objetos de clases abstractar ERROOOR
		// SeleccionFutbol sc = new SeleccionFutbol();

		// sc.concentrarse();
		// sc.viajar();

		// Arraylist de objetos Seleccion de futbol .
		// Independientemente de la clase hija a la que pertenezca el objeto

		/**
		 * Futbolista iniesta = new Futbolista(3, "Andres", "Iniesta", 25, 8, "delantero
		 * derecho"); // invocamos a metodos de la clase hija iniesta.jugarPartido();
		 * iniesta.entrenar(); // invocamos a metodos redefinidos en clase hija
		 * iniesta.concentrarse(); iniesta.viajar();
		 * System.out.println("*******************************************"); Entrenador
		 * delBosque = new Entrenador("15", 2, "Andres", "delbosque", 52); // invocamos
		 * a metodos de la clase padre (SIN POLIMORFISMO) delBosque.viajar();
		 * delBosque.concentrarse(); // invocamos a metodos de la clase hija
		 * delBosque.dirigirEntrenamiento(); delBosque.dirigirPartido();
		 */

	}

}
