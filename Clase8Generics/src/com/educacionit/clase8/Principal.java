package com.educacionit.clase8;

public class Principal {

	public static void main(String[] args) {
	
		
		BolsaGenerica<Chocolate> bolsa = new BolsaGenerica<Chocolate>(3);
		
//		Bolsa bolsa = new Bolsa(5);
//		
		Chocolate c = new Chocolate("milka");
		Chocolate c1 = new Chocolate("ferrero");
		Chocolate c2 = new Chocolate("Cofler");
		bolsa.agregar(c);
		bolsa.agregar(c1);
		bolsa.agregar(c2);
		
		for (Chocolate ch  :  bolsa) {
			System.out.println(ch.getMarca());
		}
		
		
		
		
		
		
		
		
//		
//		Golosina g1 = new Golosina("plinpaff");
//		Golosina g2 = new Golosina("Billiken");
//		
//		bolsa.agregar(c);
//		bolsa.agregar(c1);
//		bolsa.agregar(c2);
//		bolsa.agregar(g1);
//		bolsa.agregar(g2);
//		
//		for(Object o : bolsa) {
//			if (o instanceof Chocolate ) {
//				
//				Chocolate chocolate = (Chocolate)o;
//				System.out.println(chocolate.getMarca());
//			}else {
//				Golosina golosina =(Golosina) o;
//				System.out.println(golosina.getNombre());
//				
//			}
//			
//			
//			
//			
//		}
//		
		

	}

}
