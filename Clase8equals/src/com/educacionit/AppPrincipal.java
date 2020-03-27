package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {
//		int a = 8 ;
//		int b = 5 ;
//		int c = 8 ;
//		
//		System.out.println(a == b);
//		System.out.println(a == c);

		Persona p = new Persona("Alex");
		Persona p1 = new Persona("alex");

		System.out.println(p.equals(p1));
		
//		Persona p = new Persona("alex");
//		Persona p1 = p;
//		System.out.println(p == p1);
		

	}

}
