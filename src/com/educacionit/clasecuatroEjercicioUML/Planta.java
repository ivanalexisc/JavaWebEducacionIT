package com.educacionit.clasecuatroEjercicioUML;

public class Planta extends Administrativos {

//ATRIBUTOS
public int fechaVinculacion;


//METODOS

public void mostrarDatosAdminPlanta() {}

//CONSTRUCTORES
public Planta(int iDPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento,
		String genero, int estrato, String dependencia, String titulo, int fechaVinculacion) {
	super(iDPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, dependencia, titulo);
	this.fechaVinculacion = fechaVinculacion;
}

public Planta() {
	
}

//GETTERS AND SETTERS
public int getFechaVinculacion() {
	return fechaVinculacion;
}

public void setFechaVinculacion(int fechaVinculacion) {
	this.fechaVinculacion = fechaVinculacion;
}



//TOSTRING

@Override
public String toString() {
	return "Planta [fechaVinculacion=" + fechaVinculacion + "]";
}









	
	
}
