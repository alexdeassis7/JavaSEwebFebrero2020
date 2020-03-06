package com.educacionit.clase3;

import com.educacionit.clase3.modelos.Entrenador;
import com.educacionit.clase3.modelos.Futbolista;

public class AppPrincipal {

	public static void main(String[] args) {

		Futbolista iniesta = new Futbolista(3, "Andres", "Iniesta", 25, 8, "delantero derecho");
		// invocamos a metodos de la clase hija
		iniesta.jugarPartido();
		iniesta.entrenar();
		// invocamos a metodos redefinidos en clase hija
		iniesta.concentrarse();
		iniesta.viajar();
		System.out.println("*******************************************");
		Entrenador delBosque  = new Entrenador("15", 2, "Andres", "delbosque", 52);
		// invocamos a metodos de la clase padre (SIN POLIMORFISMO)
		delBosque.viajar();
		delBosque.concentrarse();
		// invocamos a metodos de la clase hija
		delBosque.dirigirEntrenamiento();
		delBosque.dirigirPartido();
		
		

	}

}
