package com.educacionit.lectormejorado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorMejorado {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("archivoES" + File.separator + "entrada" + File.separator + "fuente.txt");
		BufferedReader readerMejorado = new BufferedReader(new FileReader(inputFile));
		boolean eof = false;
		String lineaLeida = "";
		while (!eof) {
			lineaLeida = readerMejorado.readLine();
			if (lineaLeida != null) {
				System.out.println(lineaLeida);
			} else {
				eof = true;
			}
		}
		readerMejorado.close();

	}
}