package com.educacionit.clase3.modelos;

public abstract class SeleccionFutbol {

	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public void concentrarse() {
		System.out.println(" (Clase Padre) estoy concentrando En la SelecionFutbol");
	}

	public void viajar() {
		System.out.println(" (Clase Padre) estoy viajando En la SelecionFutbol");
	}

	public void partidoFutbol() {
		System.out.println("(Clase Padre) Asiste al Partido de Fùtbol");
	}

	// METODO ABSTRACTO
	public abstract void entrenamiento();

	// constructores
	public SeleccionFutbol() {

	}

	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	// GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
