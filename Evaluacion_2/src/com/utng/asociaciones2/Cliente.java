/**
 * 
 */
package com.utng.asociaciones2;

import java.util.List;

/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class Cliente {
	/**
	 * Atributos propios de la clase
	 */
	private int mesa;
	private int comensales;
	
	/**
	 * Se hace la relación con la clase Orden
	 */
	private List<Orden> ordens;

	/**
	 * constructor
	 */
	public Cliente(List<Orden> ordens) {
		// TODO Auto-generated constructor stub
	}

}
