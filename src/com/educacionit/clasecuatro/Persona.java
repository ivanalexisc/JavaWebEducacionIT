package com.educacionit.clasecuatro;

public class Persona {

	// Atributos
	
	private String nombre;
	private String apellido;
	private int edad;
	private Domicilio domicilio;
	
	
	
	
	
	//Metodos 
	public Persona(String nombre, String apellido, int edad, Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.domicilio = domicilio;
	}

	
	
	
	
	public Persona() {
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	
	@Override
	public String toString() {
		return "El nombre es:" +" "+ nombre + " El apellido es : " + apellido + " La edad es : " + edad
				+ " El  domicilio es " + domicilio.toString();
	}
	
	
	
	
	
}
