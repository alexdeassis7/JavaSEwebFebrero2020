package com.educacionit.escritormejorado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorMejorado {
	public static void main(String[] args) throws IOException {
		File outpuFile = new File("archivoES" + File.separator + "salida" + File.separator + "bufferredWriterOut.txt");
		
		String linea1 = "mensaje de la linea 1";
		String linea2 = "mensaje de la linea 2";
		String linea3 = "mensaje de la linea 3";
		
		BufferedWriter writerMejorado = new BufferedWriter(new FileWriter(outpuFile));
		
		writerMejorado.write(linea1 , 0 , linea1.length());
		writerMejorado.newLine();
		writerMejorado.write(linea2 , 0 , linea2.length());
		writerMejorado.newLine();
		writerMejorado.write(linea3 , 0 , linea3.length());
		writerMejorado.newLine();
		
		writerMejorado.close();
	}
}
