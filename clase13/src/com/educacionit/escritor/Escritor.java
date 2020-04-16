package com.educacionit.escritor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

	public static void main(String[] args) throws IOException {
		File outpuFile = new File("archivoES" + File.separator + "salida" + File.separator + "destino.txt");

		FileWriter out = new FileWriter(outpuFile);

		String info = "Soy la info del main";

		for (int i = 0; i < info.length(); i++) {
			out.write(info.charAt(i));
		}

		out.close();

		System.out.println("El archivo se escribio con exito !!");

	}

}
