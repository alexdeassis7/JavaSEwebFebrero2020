package com.educacionit.clase3;

public class Persona {

//	alt + shift + s
//	ctrl + shift + s 
//	RUN APP = ctrl + F11

	private int edad = 18;
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
