package com.educacionit.clase3.modelos;

public class Passenger {

	// atributos encapsulados de la clase pasajero
	private int bolsos;
	private int bolsosPagos;
	private double tarifaXbolso;
	private double totalaPagar;
	private int totalEquipaje;

	// conscructor 0 vacio! ,
	public Passenger() {

	}

	// conscructor 1,recibe un parametro
	// e invoca al constructor 3 (private)
	public Passenger(int bolsos) {

		this(bolsos > 1 ? 50.0d : 25.0d);
		this.bolsos = bolsos;
		totalaPagar = bolsos * tarifaXbolso;
		totalEquipaje = bolsos;

	}

	// conscructor 2 recibe dos parametros , a su vez llama al constructor 1
	public Passenger(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalaPagar = bolsos * tarifaXbolso;

	}

	// conscructor 3 ,recibe un parametro Double
	private Passenger(double tarifabolso) {
		this.tarifaXbolso = tarifabolso;
	}

	public static void mostrarListaDePasajeros(Passenger listaPasajeros[]) {
		for (Passenger p1 : listaPasajeros) {
			System.out.println("************************************************************");
			System.out.println(" PASAJERO , tarifa por bolso = " + p1.getTarifaXbolso());
			System.out.println(" PASAJERO , total a pagar = " + p1.getTotalaPagar());
			System.out.println(" PASAJERO , ttotalEquipaje = " + p1.getTotalEquipaje());
		}

	}

	public int getBolsos() {
		return bolsos;
	}

	public int getBolsosPagos() {
		return bolsosPagos;
	}

	public double getTarifaXbolso() {
		return tarifaXbolso;
	}

	public double getTotalaPagar() {
		return totalaPagar;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}

}
