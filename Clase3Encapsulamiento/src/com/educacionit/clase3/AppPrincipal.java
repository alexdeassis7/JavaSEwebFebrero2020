package com.educacionit.clase3;

public class AppPrincipal {

	public static void main(String[] args) {

		Persona mc = new Persona();
		// mc.edad = -5 ;

		System.out.println("tipo : " + mc.getEdad());

		mc.setEdad(-1);
		
		System.out.println("tipo : " + mc.getEdad());
		
		//System.out.println("contadorPersonas = "+Persona.contadorPersonas);;
		System.out.println("getContadorPersonas = "+Persona.getContadorPersonas());
		//Persona.contadorPersonas++;
		//System.out.println("contadorPersonas = "+Persona.contadorPersonas);;
		
		Persona p1 = new Persona();
		
		Persona p2 = new Persona();
		
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		Persona p5 = new Persona();
		
		System.out.println(" P1 = getContadorPersonas = "+p1.getContadorPersonas());
		System.out.println(" P2 = getContadorPersonas = "+p2.getContadorPersonas());
		System.out.println(" P3 = getContadorPersonas = "+p3.getContadorPersonas());
	}

}
