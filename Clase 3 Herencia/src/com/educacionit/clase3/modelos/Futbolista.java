package com.educacionit.clase3.modelos;

public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;

	public void jugarPartido() {
		System.out.println("estoy jugando un partido");
	}

	public void entrenar() {
		System.out.println("estoy entrenando para jugar el partido ");
	}

	//aplicamos polimosrfismo con redefinicion de metodos que se encuentran en la clase padre
	@Override
	public void concentrarse() {
		System.out.println("estoy concentrando En la cancha con los jugadores");
	}
	
	@Override
	public void viajar() {
		System.out.println("estoy viajando con los jugadores en primera clase por que tenemos miedo del corona virus ");
	}

	
	
	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

}
