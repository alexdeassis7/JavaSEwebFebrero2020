package com.educacionit.programa;

import com.educacionit.modelos.*;

public class AppPrincipal {

	public static void main(String[] args) {
		System.out.println("Welcome to Application");

		// Instanciamos o creamos tres Objetos de la clase Alumno
		// invocamos al metodo constructor Vacio
		Alumno a1 = new Alumno("alex", "de assis", 26);
		Alumno a4 = new Alumno("Juan", "Perez", 33);
		Alumno a5 = new Alumno("Daniela", "Suarez", 45);
		Alumno a2 = new Alumno("Sanchez", 29, "Juan");
		Alumno a3 = new Alumno(33, "Juan");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(a5.toString());

	}

}
