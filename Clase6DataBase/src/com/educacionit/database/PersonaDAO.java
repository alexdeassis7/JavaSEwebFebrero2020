package com.educacionit.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// import java.sql.*;
import javax.swing.JOptionPane;

import com.educacionit.modelos.PersonaVO;

//
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

			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente a " + miPersona.getNombrePersona());
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "no se logro registrar la persona ");

		}

	}

	public PersonaVO buscarPersona(int codigo) {
		Conexion conex = new Conexion();

		PersonaVO persona = new PersonaVO();
		
		boolean existe = false;
		
		try {

			// Statement estatuto = conex.getConnection().createStatement();
			String query = "SELECT * FROM persona where id = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(query);

			consulta.setInt(1, codigo);
			ResultSet res = consulta.executeQuery();

			if (res.next()) {
				
				existe = true;
				System.out.println("se encontro el registro buscado ");
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));

			}
			
			res.close();
			conex.desconectar();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "no se logro buscar la persona en la base de datos ");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		if (existe) {
			return persona;
		} else {
			return null;
		}

	}

}
