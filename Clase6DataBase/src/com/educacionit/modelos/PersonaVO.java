package com.educacionit.modelos;

//VO : Value Object - POJO - DTO Data Transfer Object
//entidades : tablas de la base de datos 

public class PersonaVO {

	private Integer idPersona;
	private Integer edadPersona;
	private String nombrePersona;
	private String profesionPersona;
	private Integer telefonoPersona;

	public PersonaVO() {

	}

	public PersonaVO(Integer idPersona, Integer edadPersona, String nombrePersona, String profesionPersona,
			Integer telefonoPersona) {

		this.idPersona = idPersona;
		this.edadPersona = edadPersona;
		this.nombrePersona = nombrePersona;
		this.profesionPersona = profesionPersona;
		this.telefonoPersona = telefonoPersona;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public Integer getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(Integer edadPersona) {
		this.edadPersona = edadPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getProfesionPersona() {
		return profesionPersona;
	}

	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}

	public Integer getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(Integer telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

}
