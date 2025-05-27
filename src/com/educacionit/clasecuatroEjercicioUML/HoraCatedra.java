package com.educacionit.clasecuatroEjercicioUML;

public class HoraCatedra extends Docentes {

//ATRIBUTOS
	public String ultimoTitulo;
	public int numHoras;
	public int valorContrato;
	public int salario;
	
	
	//METODOS
	
	
	public void calcularSueldo() {}
	public void liquidarHC() {}
	public void mostrarLiqOc() {}
	
	//CONSTRUCTORES
	public HoraCatedra(int iDPersona, String nomPersona, String apePersona, String fechaNacimiento,
			String ciudadNacimiento, String genero, int estrato, String areaFormacion, String tituloProfesional,
			String unidadAcademica, String ultimoTitulo, int numHoras, int valorContrato, int salario) {
		super(iDPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, areaFormacion,
				tituloProfesional, unidadAcademica);
		this.ultimoTitulo = ultimoTitulo;
		this.numHoras = numHoras;
		this.valorContrato = valorContrato;
		this.salario = salario;
	}
	
	public HoraCatedra() {
		
	}
	
	
	//GETTERS SETTERS
	public String getUltimoTitulo() {
		return ultimoTitulo;
	}
	public void setUltimoTitulo(String ultimoTitulo) {
		this.ultimoTitulo = ultimoTitulo;
	}
	public int getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	public int getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(int valorContrato) {
		this.valorContrato = valorContrato;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	//TOString
	
	@Override
	public String toString() {
		return "HoraCatedra [ultimoTitulo=" + ultimoTitulo + ", numHoras=" + numHoras + ", valorContrato="
				+ valorContrato + ", salario=" + salario + "]";
	}
	
	
	
	
	
	

}
