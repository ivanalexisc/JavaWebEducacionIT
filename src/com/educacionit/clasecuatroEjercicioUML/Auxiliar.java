package com.educacionit.clasecuatroEjercicioUML;

public class Auxiliar extends Planta {

//ATRIBUTOS
	
public int nivel;
public int salario;


//METODOS

public void calcularSueldo() {}
public void liquidarAux() {}
public void mostrarLiqAux() {}


//CONSTRUCTORES
public Auxiliar(int iDPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento,
		String genero, int estrato, String dependencia, String titulo, int fechaVinculacion, int nivel, int salario) {
	super(iDPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, dependencia, titulo,
			fechaVinculacion);
	this.nivel = nivel;
	this.salario = salario;
}

public Auxiliar() {
	
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
	return "Auxiliar [nivel=" + nivel + ", salario=" + salario + "]";
}


	
	
	
}
