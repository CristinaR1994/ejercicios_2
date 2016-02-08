/**
 * 
 */
package com.utng.asociaciones;

import java.util.List;

/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class Articulo {
	/**
	 * Atributos propios de la clase
	 */
	private String art_ID;
	private String art_Descripcion;
	private int art_estado;
	private int art_tipo;
	private int art_cantidad;
	private double art_cantidadcritica;
	private double art_cantidaddoble;
	
	/**
	 * Se implementa la Agregacion
	 */
	private List<Rubro>rubros;
	
	//private Precios precios;

	/**
	 * Constructor 
	 */
	public Articulo(List<Rubro>rubros,Precios precios) {
		this.rubros = rubros;
		// TODO Auto-generated constructor stub
	}

}
