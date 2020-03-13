package com.educacioit.clase5;

public class ExcDemostracion {

	public static void main(String[] args) {
		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < nums.length ; i++) {
			try {
				System.out.println(nums[i] + " / " +denom[i] + " = " + nums[i]/denom[i]);
				
			}catch (ArrayIndexOutOfBoundsException e) {
				// Capturamos la exception (sub clase)
				System.out.println("no se encontro ningùn elemento.");
				
			}catch (Throwable e) {
				// Capturamos la exception (superclase)
				System.out.println("Alguna excepciòn ocurriò");
				System.out.println("mensaje:" +e.getMessage());
			}
			
			
		}
		
	}

}