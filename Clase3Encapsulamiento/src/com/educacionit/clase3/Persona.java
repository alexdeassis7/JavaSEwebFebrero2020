package com.educacionit.clase3;
//Atajos de teclado :

//alt + shift + s
//ctrl + shift + s 
//RUN APP = ctrl + F11

public class Persona {
	// atributos de la clase persona
	private int edad = 18;
	private String nombre;
	
	private static int contadorPersonas;
	
	public Persona() {
		contadorPersonas++;
	}
	
	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	public static void setContadorPersonas(int contadorPersonas) {
		Persona.contadorPersonas = contadorPersonas;
	}
	public static void incrementarContador() {
		contadorPersonas++;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	// getters and settters
	public void setEdad(int t) {
		// procedimientos
		if (t < 1 || t > 18) {
			System.out.println("no puedes ingresar una edad menor a 0 o mayo a 150");
		} else {
			edad = t;
		}
	}

//	public int getEdad() {
//		// funciones
//		return edad;
//	}
	public int getEdad() {
		return edad;
	}

}
