package com.educacionit.models;

//Clase modelo!
public class PersonaVO {
	private int name;
	private int password;

	public PersonaVO() {

	}

	public PersonaVO(int name, int password) {

		this.name = name;
		this.password = password;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}
