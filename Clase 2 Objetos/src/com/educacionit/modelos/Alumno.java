package com.educacionit.modelos;

public class Alumno {
	// Cuerpo de la clase {...}

	// Definicion de atributos de la clase alumno
	public String nombre;
	public String apellido;
	public int edad;

	// creamos el constructor Vacio
	public Alumno() {

	}

	// definimos metodos constructor con parametros
	public Alumno(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Alumno( String apellido, int edad,String nombre) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public Alumno( int edad,String nombre) {
		this.nombre = nombre;
		this.edad = edad;
	}


	// metodos : definen el comportamiento de la clase
	// public void NombreDelMetodo(tipop2 nombrep2 , tipop2 nombrep2 , tipopN nombre
	// pN ) {
	// //cuerpode del metodo
	// }
	//

	// metodo to String - funcion
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	

}
