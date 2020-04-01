package com.educacionit.ejercicio;

//import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		//		HashMap:
		Map<Integer, String> map = new TreeMap<Integer, String>();

		// Agregamos 11 elementos al Map
	
		map.put(15, "Ramos");
		map.put(5, "Puyol");
		map.put(14, "Xabi Alonso");
		map.put(8, "Xavi Hernandez");
		map.put(6, "Iniesta");
		map.put(1, "Casillas");
		map.put(3, "Pique");
		map.put(11, "Capdevila");
		map.put(16, "Busquets");
		map.put(18, "Pedro");
		map.put(7, "Villa");
		
		
		System.out.println("numero de elementos : " + map.size());
		map.remove(5);
		map.remove(7);
		map.remove(16);
		System.out.println("numero de elementos : " + map.size());
		
//		map.clear();
		System.out.println("numero de elementos : " + map.size());
		
        System.out.println("otra forma de recorrerlo ForEach");
        
        for(Entry<Integer, String> jugador : map.entrySet()) {
        	Integer clave = jugador.getKey();
        	String valor = jugador.getValue();
        	System.out.println(clave + " -----> " + valor);
        }
//        
		
//		map.put(7, "Villa");
//		map.put(7, "pepito");
//		Iteradores : contienen solo 3 metodos 
//		1- hasNext()
//		2- next() 
//		3-remove()
		
		// Imprimimos el Map con un Iterator
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave : " + key + " -> Valor: " +map.get(key));
			
		}
//		

	}
}
