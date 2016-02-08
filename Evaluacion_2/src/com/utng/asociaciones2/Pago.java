/**
 * 
 */
package com.utng.asociaciones2;

/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class Pago {
	/**
	 * Atributos propios de la clase
	 */
	private double subTotal;
	private double propina;
	private double impuestos;
	/**
	 * Se hace la relación con la clase orden
	 */
	private Orden orden;
	
	/**
	 * 
	 * @param subTotal
	 * @param propina
	 * @param impuestos
	 * @return
	 */
	public static double calculoTotal(double subTotal, double propina, double impuestos){
		
		return 0;
		
	}

	/**
	 * Constructor
	 */
	public Pago() {
		// TODO Auto-generated constructor stub
	}

}
