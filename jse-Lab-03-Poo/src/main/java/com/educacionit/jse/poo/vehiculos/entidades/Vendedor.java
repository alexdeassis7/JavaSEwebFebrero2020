/*
 * Vendedor.java
 *
 */
package com.educacionit.jse.poo.vehiculos.entidades;

import com.educacionit.jse.poo.base.entidades.Persona;

/**
 *
 * @author Sebastian S. Sanga <SebastianSanga@educacionIT.com.ar>
 */
public class Vendedor extends Persona {
	// Atributos
	private int cantAutosVendidos;

    /**
     * Creates a new instance of Vendedor
     */
    public Vendedor() {
    }

    public Vendedor(String nombre, String apellido, String nroDocumento, int cantAutosVendidos) {
        super(nombre, apellido, nroDocumento);
        setCantAutosVendidos(cantAutosVendidos);
    }


    public String toString() {
        return super.toString() + ", autos vendidos: " + cantAutosVendidos;
    }

    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }

}
