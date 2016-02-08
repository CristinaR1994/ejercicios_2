/**
 * 
 */
package com.utng.asociaciones2;

import java.util.List;

/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class Orden {
	/**
	 * Atributos propios de la clase
	 */
	private int hora;
	private String mesero;
	/**
	 * Se hace la relación con otras clases
	 */
	private Cliente cliente;
	private List<Bebida> bebidas;
	private List<Platillo>platillos;
	private Pago pago;

	/**
	 * Constructor de la clase
	 */
	public Orden(List<Bebida> bebidas, List<Platillo>platillos) {
		this.bebidas = bebidas;
		this.platillos = platillos;
		// TODO Auto-generated constructor stub
	}

}
