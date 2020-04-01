package com.educacionit.metodos;

import java.util.HashMap;
import java.util.Map;

public class Principal {
	public static void main(String[] args) {
		//Declaramos hashMap con clave Integer y value String
		//OJOO!! NO SE ADMITEN TIPO DE DATOS ATOMICOS
		Map< Integer, String> nombreDelMap = new HashMap<Integer, String>(); 
		System.out.println("size() :" + nombreDelMap.size());//retorana el numeroi de elementos del map
		
		//devuelve true si no tenemos elemento en el map de lo contrario devolvera false 
		System.out.println("isEmpty():" + nombreDelMap.isEmpty()); 
		
		// agrega un elemento al map
		nombreDelMap.put(10, "Messi");
		nombreDelMap.put(6, "Riquelme");
		
		//devuelve el valor de la clave enviada por parametro o null si la clave no existiera
		System.out.println("get(10)" +nombreDelMap.get(10));
		System.out.println("get(8)" + nombreDelMap.get(8));
		
		//volvemos a ver el size y consultamos si esta vacio 
		System.out.println("size() :" + nombreDelMap.size());
		System.out.println("isEmpty():" + nombreDelMap.isEmpty()); 
		
		//borramos todos los elementos del map 
		//nombreDelMap.clear();
		
		System.out.println("size() :" + nombreDelMap.size());
		System.out.println("isEmpty():" + nombreDelMap.isEmpty()); 
		
		//borramos el par clave/valor  de la clave pasada por parametro
		nombreDelMap.remove(6);
		System.out.println("size() :" + nombreDelMap.size());
		System.out.println("isEmpty():" + nombreDelMap.isEmpty()); 
		
		//devuelve true si en el map hay una clave que conicida con el parametro enviado 
		System.out.println(" contiene clave ?? " + nombreDelMap.containsKey(10));
		
		//devuelve true si en el map hay un value que conicida con el parametro enviado 
		System.out.println(" contiene valor ?? " + nombreDelMap.containsValue("Messi"));
		
		//Devuelvo una "Collection" con todos los valores del map 
		nombreDelMap.values();
		

		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
