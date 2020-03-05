package com.educacionit.clase3;

public class Coche {
	
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	private double precio;
	//atributo de instancia
	public double descuento = 20000; //Constante
	
	
	public Coche(String marca, String modelo, String color, String matricula, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula
				+ ", precio=" + precio + "]";
	}
	
	public String VerEstadoDeAtributos() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula
				+ ", precio=" + precio + "]";
	}

	
	
}
