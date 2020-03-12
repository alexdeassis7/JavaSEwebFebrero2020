package com.educacionit.clase3.modelos;
public class Entrenador extends SeleccionFutbol {
	private String IdFederacion;
	public Entrenador() {

	}
	public Entrenador(String IdFederacion, int id, String nombre, String apellido, int edad) {
		super(id, nombre, apellido, edad);
		this.IdFederacion = IdFederacion;
	}
	public void dirigirPartido() {
		System.out.println("estoy dirigiendo un partido");
	}
	public void dirigirEntrenamiento() {
		System.out.println("estoy dirigiendo un entrenamiento");
	}
	// aplicamos polimosrfismo con redefinicion de metodos que se encuentran en la
	// clase padre
	public void partidoFutbol() {
		System.out.println("(Clase Entrenador) Dirige un  Partido de Fùtbol");
	}
	@Override
	public void entrenamiento() {
		System.out.println("(Clase entrenador ) Dirige un entrenamiento");
	}
	public String getIdFederacion() {
		return IdFederacion;
	}
	public void setIdFederacion(String idFederacion) {
		IdFederacion = idFederacion;
	}

}
