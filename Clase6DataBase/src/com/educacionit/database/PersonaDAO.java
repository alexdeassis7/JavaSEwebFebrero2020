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

	public void modificarPersona(PersonaVO miPersona) {

		Conexion conex = new Conexion();
		try {

//			String consulta = "UPDATE persona SET id = ? , nombre = ? , edad = ? , profesion = ? , telefono = ? WHERE id = ?";
			String consulta = "UPDATE persona SET nombre = ? WHERE id = ?";

			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);

//			estatuto.setInt(1, miPersona.getIdPersona());
			estatuto.setString(1, miPersona.getNombrePersona());
//			estatuto.setInt(3, miPersona.getEdadPersona());
//			estatuto.setString(4, miPersona.getProfesionPersona());
//			estatuto.setInt(5, miPersona.getTelefonoPersona());
			estatuto.setInt(2, miPersona.getIdPersona());

			estatuto.executeUpdate();

			JOptionPane.showMessageDialog(null, "Se Ha Modificado Correctamente el registro ", "Confirmacion",
					JOptionPane.INFORMATION_MESSAGE);

			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se modifico ningun registro ");
		}

	}

	public void eliminarPersona(int codigo) {
		Conexion conex = new Conexion();

		try {
//			String consulta = "DELETE from persona where id = ?";
//			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
//			estatuto.setInt(1, codigo);
//			
			Statement estatuto = conex.getConnection().createStatement();
			
			int devolucion = estatuto.executeUpdate("DELETE from persona where id =  " + codigo );
			System.out.println(devolucion);
			if(devolucion != 0)
				JOptionPane.showMessageDialog(null, "Se ah Eliminado correctamente el registro con id " + codigo,"Informacion ", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "no se elimino ningun registro  " + codigo,"Informacion ", JOptionPane.INFORMATION_MESSAGE);
				
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al eliminar ", "Error", JOptionPane.ERROR_MESSAGE);

		}

	}
//	CRUD END

}
