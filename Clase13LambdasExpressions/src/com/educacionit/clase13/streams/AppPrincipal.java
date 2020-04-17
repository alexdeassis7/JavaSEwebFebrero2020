package com.educacionit.clase13.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AppPrincipal {
	public static void main(String[] args) {

//		####################### MAP ############
		String[] myVector = new String[] { "alex", "marian", "pablo", "exe", "german" };

		for (int i = 0; i < myVector.length; i++) {
			System.out.println(myVector[i]);
		}

		Stream<String> myStream = Arrays.stream(myVector);

		// s -> s.toUpperCase()
		// se llama al metodo map
		Stream<String> myNewStream = myStream.map(s -> s.toUpperCase());

		String[] myNewArray = myNewStream.toArray(String[]::new);

//		String[]::new
//		public String[] create (int size) {
//			return new String [size];
//		}
		for (int i = 0; i < myNewArray.length; i++) {
			System.out.println(myNewArray[i]);
		}

//		####################### FILTER ############

		List<Integer> listaDeNumeros = new ArrayList<Integer>();
		listaDeNumeros.add(44);
		listaDeNumeros.add(66);
		listaDeNumeros.add(55);
		listaDeNumeros.add(5);
		listaDeNumeros.add(67);
		listaDeNumeros.add(89);
		listaDeNumeros.add(5);
		listaDeNumeros.add(5);

		Stream st = listaDeNumeros.stream();

		// contamos cuantas veces aparece el 5 en la lista

		System.out.println("Ocurrencias :");
		System.out.println(st.filter(Predicate.isEqual(44)).count());

//		####################### REDUCE ############	
		int myArray[] = { 1, 5, 8 };
		int sum = Arrays.stream(myArray).sum();

		System.out.println("La suma es " + sum);
		String[] myArray2 = {"Soy", "El" , "Ultimo", "Tema", "Del" ,"Curso" ,"Sorry "};
		for (String string : myArray2) {
			System.out.println(string);
		}
		
		String result = Arrays.stream(myArray2).reduce("", (a,b) -> a+ b);
		
		System.out.println("Resultado del Reduce :"  + result);
		
		
	}

}
