package com.educacionit.copiador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copiador {
	public static void main(String[] args) throws IOException {
		File outputFile = new File("archivoES" + File.separator + "salida" + File.separator + "destino.txt");
		File inputFile = new File("archivoES" + File.separator + "entrada" + File.separator + "fuente.txt");
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int unCaracter;
		System.out.println("estamos copiado su archivo en el destino !");
		while ((unCaracter = in.read()) != -1) {
			out.write(unCaracter);
		}
		in.close();
		out.close();
		System.out.print("El Archivo ah sido copiado con exito en el destino");

	}
}
