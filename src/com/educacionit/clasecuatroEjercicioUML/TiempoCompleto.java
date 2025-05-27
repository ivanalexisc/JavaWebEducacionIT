package com.educacionit.clasecuatroEjercicioUML;

public class TiempoCompleto extends Docentes {

	//ATRIBUTOS
	public String categoria;
	public int puntos;
	public int salario;
	
	
	
	//METODOS
	
	public void calcularSueldo() {}
	public void liquidarTC() {}
	
	
	
	
	public TiempoCompleto(int iDPersona, String nomPersona, String apePersona, String fechaNacimiento,
			String ciudadNacimiento, String genero, int estrato, String areaFormacion, String tituloProfesional,
			String unidadAcademica, String categoria, int puntos, int salario) {
		super(iDPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, areaFormacion,
				tituloProfesional, unidadAcademica);
		this.categoria = categoria;
		this.puntos = puntos;
		this.salario = salario;
	}
	
	public TiempoCompleto() {}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "TiempoCompleto [categoria=" + categoria + ", puntos=" + puntos + ", salario=" + salario + "]";
	}
	
	
	
	
	
	
}
