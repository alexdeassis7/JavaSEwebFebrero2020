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

	// aplicamos polimosrfismo con redefinicion de metodos que se encuentran en la
	// clase padre

	public void partidoFutbol() {
		System.out.println("(Clase Futbolista) Juega un  Partido de Fùtbol");
	}

//	@Override
//	public void viajar() {
//		System.out.println(" (Clase Futbolista ) estoy viajando con los jugadores en primera clase por que tenemos miedo del corona virus ");
//	}

	@Override
	public void entrenamiento() {
		System.out.println("(Clase Futbolista ) : Realiza un entrenamiento ");

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
