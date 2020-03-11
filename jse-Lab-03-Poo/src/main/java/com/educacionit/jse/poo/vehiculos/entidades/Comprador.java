/*
 * Comprador.java
 *
 */
package com.educacionit.jse.poo.vehiculos.entidades;

import com.educacionit.jse.poo.base.entidades.Persona;

/**
 *
 * @author Sebastian S. Sanga <SebastianSanga@educacionIT.com.ar>
 */
public class Comprador extends Persona {
	// Atributos
	private double presupuesto;

    /**
     * Creates a new instance of Comprador
     */
    public Comprador() {
    }

    public Comprador(String nombre, String apellido, String nroDocumento, double presupuesto) {
        super(nombre, apellido, nroDocumento);
        setPresupuesto(presupuesto);
    }


    public String toString() {
        return super.toString() + " Presupuesto: $" + getPresupuesto();
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

}
