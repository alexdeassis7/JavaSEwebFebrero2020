package com.educacionit.database;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.modelos.PersonaVO;

//Data Acces Object 
public class PersonaDAO {

	// INSERT INTO `persona`(`id`, `nombre`, `edad`, `profesion`, `telefono`) VALUES
	// (,[value-2],[value-3],[value-4],[value-5])
	public void registrarPersona(PersonaVO miPersona) {

		Conexion conex = new Conexion();

		try {
			Statement estatuto = conex.getConnection().createStatement();

			estatuto.executeUpdate("INSERT INTO persona VALUES ('" + miPersona.getIdPersona() + "' ,'"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "')");

			JOptionPane.showMessageDialog(null, "Se haq registrado Exitosamente a " + miPersona.getNombrePersona());
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
	
			e.printStackTrace();
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "no se logro registrar la persona ");

		}

	}

}
