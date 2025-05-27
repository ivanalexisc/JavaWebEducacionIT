package com.educacionit.clasecuatroEjercicioUML;

public class Docentes extends Persona {

	//atributos
	public String areaFormacion;
	public String tituloProfesional;
	public String unidadAcademica;
	
	
	
	
	//metodos
	public Docentes(int iDPersona, String nomPersona, String apePersona, String fechaNacimiento,
			String ciudadNacimiento, String genero, int estrato, String areaFormacion, String tituloProfesional,
			String unidadAcademica) {
		super(iDPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato);
		this.areaFormacion = areaFormacion;
		this.tituloProfesional = tituloProfesional;
		this.unidadAcademica = unidadAcademica;
	}

public Docentes() {}


	public String getAreaFormacion() {
		return areaFormacion;
	}


	public void setAreaFormacion(String areaFormacion) {
		this.areaFormacion = areaFormacion;
	}

	
	public String getTituloProfesional() {
		return tituloProfesional;
	}


	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
		
		
	}




	public String getUnidadAcademica() {
		return unidadAcademica;
	}




	public void setUnidadAcademica(String unidadAcademica) {
		this.unidadAcademica = unidadAcademica;
	}

	@Override
	public String toString() {
		return "Docentes [areaFormacion=" + areaFormacion + ", tituloProfesional=" + tituloProfesional
				+ ", unidadAcademica=" + unidadAcademica + "]";
	}

	
	
	
	
}
