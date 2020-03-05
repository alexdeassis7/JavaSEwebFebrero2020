package com.educacionit.clase3;

public class AppPrincipla {

	public static void main(String[] args) {
		
//		Coche.descuento = 12;
//		System.out.println("Statico Descuento :" +Coche.descuento);;

		Coche coche1 = new Coche("Seat","Leon","Rojo","1234BBB", 100000);
		System.out.println(coche1.toString());
		coche1.descuento = 90;
		System.out.println("Statico Descuento 1:" + coche1.descuento);;
		
		Coche coche2 = new Coche("Ferrari","Enzo","Rojo","5555JJK", 550000);
		System.out.println(coche2.toString());
		System.out.println("Statico Descuento :2 "+coche2.descuento);;
		
		Coche coche3 = new Coche("Renault","Clio","Gris","4444GFB", 80000);
		System.out.println(coche3.toString());
		System.out.println("Statico Descuento : 3 "+coche3.descuento);;
	}

}
