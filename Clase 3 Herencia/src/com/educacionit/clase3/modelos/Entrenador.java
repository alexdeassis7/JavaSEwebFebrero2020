package com.educacionit.clase3.modelos;

public class Entrenador extends SeleccionFutbol {

	private String IdFederacion;

	public void dirigirPartido() {
		System.out.println("estoy dirigiendo un partido");
	}

	public void dirigirEntrenamiento() {
		System.out.println("estoy dirigiendo un entrenamiento");
	}

	public Entrenador() {

	}

	public Entrenador(String IdFederacion, int id, String nombre, String apellido, int edad) {
		super(id, nombre, apellido, edad);
		this.IdFederacion = IdFederacion;
	}

}
