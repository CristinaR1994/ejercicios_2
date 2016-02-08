/**
 * 
 */
package com.utng.asociaciones2;

/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class Credito extends Pago{
	/**
	 * Atributos propios de la clase
	 */
	private int numeroTdeCredito;
	private String tipo;
	private String nombre;
	/**
	 * Se hace la relación con la clase fechaDeExp
	 */
	private fechaDeExp fechaDeExp;
	
	/**
	 *
	 * @param total
	 * @return
	 */
	public static boolean hacerCargo(double total){
		return false;
	}
	

	/**
	 * 
	 */
	public Credito() {
		// TODO Auto-generated constructor stub
	}

}
