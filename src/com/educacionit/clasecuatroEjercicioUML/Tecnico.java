package com.educacionit.clasecuatroEjercicioUML;

public class Tecnico extends Planta {

//ATRIBUTOS

public int nivel;
public int salario;

//METODOS

public void calcularSueldo() {}
public void liquidarTec() {}
public void mostrarLiqTec() {}


//CONSTRUCTORES

public Tecnico(int iDPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento,
		String genero, int estrato, String dependencia, String titulo, int fechaVinculacion, int nivel, int salario) {
	super(iDPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, dependencia, titulo,
			fechaVinculacion);
	this.nivel = nivel;
	this.salario = salario;
}

public Tecnico() {
	
}


//GETTERS AND SETTERS

public int getNivel() {
	return nivel;
}
public void setNivel(int nivel) {
	this.nivel = nivel;
}
public int getSalario() {
	return salario;
}
public void setSalario(int salario) {
	this.salario = salario;
}

//TOSTRING

@Override
public String toString() {
	return "Tecnico [nivel=" + nivel + ", salario=" + salario + "]";
}	

	
	
}
