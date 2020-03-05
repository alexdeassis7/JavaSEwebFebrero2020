package com.educacionit.clase3;

public class AppPrincipal {

	public static void main(String[] args) {

		Persona mc = new Persona();
		// mc.edad = -5 ;

		System.out.println("tipo : " + mc.getEdad());

		mc.setEdad(-1);
		
		System.out.println("tipo : " + mc.getEdad());
		
	}

}
