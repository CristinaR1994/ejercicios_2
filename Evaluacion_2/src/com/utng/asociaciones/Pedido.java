/**
 * 
 */
package com.utng.asociaciones;

import java.util.Date;
import java.util.List;

/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class Pedido {
	/**
	 * Atributos propios de la clase
	 */
	private double pe_id;
	private Date pe_fechapedido;
	private Date pe_fechanecesidad;
	private Date pe_fechaprogramada;
	private Date pe_fechaentrega;
	private int pe_estado;
	
	/**
	 * Se implementa la Agregacion
	 */
	private List<Articulo> articulos;
	/**
	 * Constructor con agregacion de la clase Articulo
	 */
	public Pedido(List<Articulo> articulos) {
		this.articulos = articulos;
		// TODO Auto-generated constructor stub
	}

}
