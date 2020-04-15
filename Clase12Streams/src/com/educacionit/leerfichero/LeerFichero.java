package com.educacionit.leerfichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerFichero {

	public static void main(String[] args) {

//FileReader //no contriene metodo que permitan leer lineas completas  , pero si BUfferedReader
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			archivo = new File("C:\\Users\\Alex\\Documents\\archivoClase12.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
