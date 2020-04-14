package com.educacionit.database;

import java.sql.SQLException;
import java.sql.Statement;

import com.educacionit.models.PersonaVO;

//Capa de acceso a datos 
public class PersonaDAO {

	public boolean registrarPersona(PersonaVO mipersona) {
		Conexion conex = new Conexion();

		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate(
					"INSERT INTO cliente VALUES('" + mipersona.getName() + "','" + mipersona.getPassword() + "')");

			System.out.println("se logro guardar el dato el base correctamente");
			estatuto.close();
			conex.deconectar();
			return true;
		} catch (SQLException e) {
			System.out.println("ERRO EN EL DAO! no se logro persistir el dato ");
			e.printStackTrace();
			return false;
		}

	}

}
