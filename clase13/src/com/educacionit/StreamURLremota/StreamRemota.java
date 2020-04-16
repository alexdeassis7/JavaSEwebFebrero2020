package com.educacionit.StreamURLremota;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class StreamRemota {
	public static void main(String[] args) {
		/*
		 * Como setear proxies Properties systemSetting = System.getProperties();
		 * systemSetting.put("proxySet" , "true"); systemSetting.put("http.proxyHost" ,
		 * "192.15.15.2"); systemSetting.put("http.proxyPort","8080");
		 */
		try {
			URL url = new URL("https://github.com/alexdeassis7/ArquitecturaJava2019/blob/master/README.md");
			BufferedReader elBUFFER = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
			boolean eof = false;
			String unaLinea;
			while (!eof) {
				unaLinea = elBUFFER.readLine();
				if (unaLinea != null) {
					System.out.println(unaLinea);
				} else {
					eof = true;
				}
			}
		} catch (MalformedURLException e) {
			System.out.println("La url no existe ");
		} catch (IOException e2) {
			System.out.println("no pudimos leer tu url de internet");
		}

	}

}
