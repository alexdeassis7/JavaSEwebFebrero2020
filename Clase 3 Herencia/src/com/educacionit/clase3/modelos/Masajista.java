package com.educacionit.clase3.modelos;

public class Masajista extends SeleccionFutbol {

	private int aniosdeExperiencia;
	private String titulacion;
	

//	public void viajar() {
//		System.out.println("estoy viajando a dar masajes");
//	}

	public void darMasaje() {
		System.out.println("estoy dando masajes en un partido");
	}
	
	//Especializamos - reEscribimos
	@Override
	public void entrenamiento() {
		System.out.println("(Clase masajista) Da Asistencia en el entrenamiento ");
		
		
	}

	public Masajista(int aniosdeExperiencia ,String titulacion, int id, String nombre, String apellido, int edad) {
		super(id, nombre, apellido, edad);
		this.titulacion = titulacion;
		this.aniosdeExperiencia = aniosdeExperiencia;
		
		
	}

	
	
	
}
