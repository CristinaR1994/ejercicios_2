/**
 * 
 */
package com.utng.asociaciones;

import java.util.List;

/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class Proveedor {
	/**
	 * Atributos propios de la clase
	 */
	private double pr_ID;
	private String pr_RazonSocial;
	private String pr_contacto;
	private String pr_telefono1;
	private short pr_telefono2;
	private String pr_fax;
	private String pr_email1;
	private String pr_email2;
	private String pr_web;
	private int pr_CUIT;
	
	/**
	 * Se implementa la Agregacion
	 */
	private List<Rubro>rubros;
	private List<Direccion> direccions;

	
	/**
	 * Constructor de la clase
	 */
	public Proveedor(List<Rubro>rubros,List<Direccion> direccions,Caificacion caificacion, Articulo articulo) {
		this.rubros = rubros;
		this.direccions = direccions;
		// TODO Auto-generated constructor stub
	}

}
