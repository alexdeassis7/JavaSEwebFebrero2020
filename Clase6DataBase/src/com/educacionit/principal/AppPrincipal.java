package com.educacionit.principal;

import javax.swing.JOptionPane;

import com.educacionit.database.Conexion;
import com.educacionit.database.PersonaDAO;
import com.educacionit.modelos.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {

		PersonaVO p1 = new PersonaVO();
		PersonaVO p2 = null;

		Integer idPersona = Integer.parseInt(JOptionPane.showInputDialog("ingrese el id "));
		Integer edadPersona = Integer.parseInt(JOptionPane.showInputDialog("ingrese el edad "));
		String nombrePersona = JOptionPane.showInputDialog("ingrese el nombre ");
		String profesionPersona = JOptionPane.showInputDialog("ingrese el profesion ");
		Integer telefonoPersona = Integer.parseInt(JOptionPane.showInputDialog("ingrese el telefono"));

		p1.setEdadPersona(edadPersona);
		p1.setIdPersona(idPersona);
		p1.setNombrePersona(nombrePersona);
		p1.setProfesionPersona(profesionPersona);
		p1.setTelefonoPersona(telefonoPersona);

		PersonaDAO pd = new PersonaDAO();

		pd.registrarPersona(p1);

		Integer idPersonaBuscada = Integer.parseInt(JOptionPane.showInputDialog("ingrese el id de la persona a buscar por favor"));

		p2 = pd.buscarPersona(idPersonaBuscada);
		
		if (p2 != null)
			JOptionPane.showMessageDialog(null, p2.toString());
		else
			JOptionPane.showMessageDialog(null, "no existe ningun registro en la tabla con el id " + idPersonaBuscada);

	}

}
