package com.educacionit.leerfichero;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class EscribeFichero {
	public static void main(String[] args) {
		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("C:\\Users\\Alex\\Documents\\archivoClase12.txt", true );
			
			pw = new PrintWriter(fichero);
			
			String textoIngresado = null;
			
			textoIngresado = JOptionPane.showInputDialog("Ingrese el mensaje a guardar en el archivo ");
			
			for(int i = 0 ; i < 10 ; i++) 
				pw.println(textoIngresado);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
		}finally {
			try {
				if(null != fichero)
					fichero.close();
				
			}catch (Exception e2) {
				e2.printStackTrace();
				System.out.println(e2.getMessage());
			}
		}

	}

}
