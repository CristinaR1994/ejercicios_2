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
public class ProveedorCalificado {
	/**
	 * Atributos de la clase
	 */
	private Date FechaCalificacion;
	private int cal_ID;
	private int pr_ID;
	
	/**
	 * Se implementa la Agregacion
	 */
	private List<Caificacion> caificacions;
	
	private Caificacion caificacion;

	/**
	 * Constructor de la clase 
	 */
	public ProveedorCalificado(List<Caificacion> caificacions,Caificacion caificacion) {
		this.caificacions = caificacions;
		// TODO Auto-generated constructor stub
	}

}
