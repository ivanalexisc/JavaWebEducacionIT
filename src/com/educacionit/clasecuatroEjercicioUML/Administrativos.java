package com.educacionit.clasecuatroEjercicioUML;

public class Administrativos extends Persona {

	//ATRIBUTOS
	public String dependencia;
	public String titulo;
	
	//METODOS
	
	public Administrativos(int iDPersona, String nomPersona, String apePersona, String fechaNacimiento,
			String ciudadNacimiento, String genero, int estrato, String dependencia, String titulo) {
		super(iDPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato);
		this.dependencia = dependencia;
		this.titulo = titulo;
	}
	
	public Administrativos() {}

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Administrativos [dependencia=" + dependencia + ", titulo=" + titulo + "]";
	}
	
	
	
	
}
