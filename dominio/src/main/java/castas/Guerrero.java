package castas;
import dominio.*;
import habilidades.*;


public class Guerrero extends Casta {
	/*
	 * Ver de que forma puedo hacer ademas de agregarlas puedan afectar al personaje
	 * 
	 * */
	public Guerrero(){
		super.nombre = "Guerrero";
		this.agregarHabilidad(new Fuerza());
		this.agregarHabilidad(new Valentia());
	}
	
	
	

}
