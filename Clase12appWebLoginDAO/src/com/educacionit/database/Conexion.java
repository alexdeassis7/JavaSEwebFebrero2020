package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static String db = "clientes";
	static String login = "root";
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + db;
	Connection conn = null;

	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("Se logro cone3ctar Exitosamente a la base " + db);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("No se logro establecer la conexion a la db " + db);
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Conexion cn = new Conexion();
	}

	public Connection getConnection() {
		return conn;
	}

	public void deconectar() {
		try {
			conn.close();
			conn = null;
			System.out.println("Se desconecto exitosamente de la base " + db);
		} catch (SQLException e) {
			System.out.println("no se logro cerra la conexion a la base " + db);
			e.printStackTrace();
		}
	}
}
