package com.educacionit.clase3.modelos;

//CLASE PADRE 
public  class Vuelo {

	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;

	// inicializador de Bloque
	{
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < getAsiento(); i++) {
			asientosDisponibles[i] = true;
			
		}
		
		System.out.println("se inicializaron todos los asientos del vuelo ");
	}
	
	//DEFINO UN METODO ABSTRACTO
	//public abstract boolean agregarPasajeroConDiscapacidad(Passenger p1) ;
	
	public Vuelo() {

	}

	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;

	}

	public Vuelo(int numVuelo) {
		this.numVuelo = numVuelo;

	}

	public int getAsiento() {
		return 150;
	}

	public int getAsientos() {
		return getAsiento();
	}


	
	
	public void agregarPasajero(Passenger p1) {
		if (asientoDisponible()) {
			// si quedan asientos subimos al pasajero al avion
			pasajeros += 1;
			System.out.println("subimos al pasajero y sus "+ p1.getTotalEquipaje()+ " bolsos  al avion");

		} else {

			faltaAsiento();
		}

	}

	private boolean asientoDisponible() {
		// valido que el numero de pasajeros sean menor a los asientos
		return pasajeros < getAsiento();
	}

	private void faltaAsiento() {
		System.out.println("Ya no nos quedan butacas en este avion , busque otra aerolinea por favor ");
	}

}
