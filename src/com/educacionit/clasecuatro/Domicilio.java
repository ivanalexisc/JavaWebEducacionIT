package com.educacionit.clasecuatro;

public class Domicilio {

	//atributos
	
	private String calle;
	private int numero;
	private String localidad;
	
	
	//metodos
	
	public Domicilio(String calle, int numero, String localidad) {
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
	}
	
	
	
	
	
	public Domicilio() {
		
	}

	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}





	@Override
	public String toString() {
		return " calle=" + calle + ", numero=" + numero + ", localidad=" + localidad  ;
	}
	
	
	
	
	
}
