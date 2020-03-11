package com.educacionit.clase3;

import com.educacionit.clase3.modelos.Passenger;
import com.educacionit.clase3.modelos.Vuelo;
import com.educacionit.clase3.modelos.VueloCarga;

public class AppPrincipal {

	public static void main(String[] args) {
		System.out.println("se crea un vuelo");
		Vuelo v678 = new Vuelo(1);
//		Vuelo v666 = new Vuelo('A');
//		Vuelo v555 = new Vuelo(555);
		System.out.println("se crea un vuelo de carga ");
		VueloCarga vc = new VueloCarga();
		System.out.println("GetAsiento :" + vc.getAsiento());
		vc.agregarPaquete(1, 2, 3);
		vc.agregarPaquete(12, 22, 3);
		vc.agregarPaquete(1, 22, 30);

		System.out.println("espacioCargaUsado : " + vc.espacioCargaUsado);

		Passenger german = new Passenger();
		Passenger santi = new Passenger(3);
		Passenger mariel = new Passenger(5, 1);
		Passenger lucas = new Passenger(1);

		Passenger[] MisPasajeros = new Passenger[4];
		MisPasajeros[0] = german;
		MisPasajeros[1] = santi;
		MisPasajeros[2] = mariel;
		MisPasajeros[3] = lucas;

		Passenger.mostrarListaDePasajeros(MisPasajeros);

		System.out.println("agregando pasajeros :");
		v678.agregarPasajero(santi);
		v678.agregarPasajero(german);
		v678.agregarPasajero(mariel);
		v678.agregarPasajero(lucas);

		System.out.println("total de butacazs " + v678.getAsientos());
		System.out.println("total pasajeros a bordo " + v678.pasajeros);
		System.out.println("TEST VUELOS");

		Vuelo[] flota = new Vuelo[4];
		flota[0] = new Vuelo();
		flota[1] = new VueloCarga();
		flota[2] = new Vuelo();
		flota[3] = new VueloCarga();

		Vuelo f2 = new Vuelo();
		System.out.println(f2.getAsientos());

		Vuelo f3 = new VueloCarga();
		System.out.println(f3.getAsientos());
		//NO SE PUDE
//		VueloCarga f4 = new Vuelo();
		
		
		Object[] misObjetos = new Object[3];
		misObjetos[0] =  new Vuelo();
		misObjetos[1] =  new Passenger();
		misObjetos[2] =  new VueloCarga();
		
		Object er = new Object();

		
		
	}

}
