/**
 * 
 */
package com.utng.ayc;

import java.util.ArrayList;
import java.util.List;



/**
 * @author Juana Cristina Rodriguez Vazquez
 *
 */
public class Persona {
	/**
	 * Atributo propio de la clase
	 */
	public String nombre;
	/**
	 * Se hace la relación con otras clases
	 */
	private Coche coche;
	private List<Corazon> corazons;
	
	/**
	 * Construcor de la clase
	 */
	public Persona(String nom) {
		this.corazons = new ArrayList<Corazon>(); {
		};
		// TODO Auto-generated constructor stub
	}
	
	public void asignaCoche(Coche c){
		
		
	}
	

}
