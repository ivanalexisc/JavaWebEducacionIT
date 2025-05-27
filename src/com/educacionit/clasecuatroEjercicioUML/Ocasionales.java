package com.educacionit.clasecuatroEjercicioUML;

public class Ocasionales extends Docentes {

	//ATRIBUTOS
	
	public String ultimoTitulo;
	public int numMeses;
	public int salario;
	
	
	
	// METODOS
	public void calcularSueldo() {};
	public void liquidarOC() {};
	public void mostrarLiqOc() {};
	
	
	
	public Ocasionales(int iDPersona, String nomPersona, String apePersona, String fechaNacimiento,
			String ciudadNacimiento, String genero, int estrato, String areaFormacion, String tituloProfesional,
			String unidadAcademica, String ultimoTitulo, int numMeses, int salario) {
		super(iDPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, areaFormacion,
				tituloProfesional, unidadAcademica);
		this.ultimoTitulo = ultimoTitulo;
		this.numMeses = numMeses;
		this.salario = salario;
	}
	
	public Ocasionales() {}
	public String getUltimoTitulo() {
		return ultimoTitulo;
	}
	public void setUltimoTitulo(String ultimoTitulo) {
		this.ultimoTitulo = ultimoTitulo;
	}
	public int getNumMeses() {
		return numMeses;
	}
	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Ocasionales [ultimoTitulo=" + ultimoTitulo + ", numMeses=" + numMeses + ", salario=" + salario + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
