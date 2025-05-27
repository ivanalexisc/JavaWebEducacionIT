package com.educacionit.clasecuatroEjercicioUML;

public class Persona {

	
	//ATRIBUTOS 
	
	public int IDPersona;
	public String nomPersona;
	public String apePersona;
	public String fechaNacimiento;
	public String ciudadNacimiento;
	public String genero;
	public int estrato;
	
	
	
	//metodos 
	
	
	public Persona(int iDPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento,
			String genero, int estrato) {
		IDPersona = iDPersona;
		this.nomPersona = nomPersona;
		this.apePersona = apePersona;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadNacimiento = ciudadNacimiento;
		this.genero = genero;
		this.estrato = estrato;
	}
	
	
	public Persona() {
		
	}




	


	public int getIDPersona() {
		return IDPersona;
	}
	public void setIDPersona(int iDPersona) {
		IDPersona = iDPersona;
	}
	public String getNomPersona() {
		return nomPersona;
	}
	public void setNomPersona(String nomPersona) {
		this.nomPersona = nomPersona;
	}
	public String getApePersona() {
		return apePersona;
	}
	public void setApePersona(String apePersona) {
		this.apePersona = apePersona;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}
	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEstrato() {
		return estrato;
	}
	public void setEstrato(int estrato) {
		this.estrato = estrato;
	}
	
	
	public void mostrarDG() {}
	public void calcularEPS() {}
	public void calcularPension() {}
	public void calcularARL() {}
	public void calcularSENA() {}
	public void calcularCajas() {}
	public void calcularICBF() {}
	public void calcularAuxilio() {}
	
	
	@Override
	public String toString() {
		return "Persona [IDPersona=" + IDPersona + ", nomPersona=" + nomPersona + ", apePersona=" + apePersona
				+ ", fechaNacimiento=" + fechaNacimiento + ", ciudadNacimiento=" + ciudadNacimiento + ", genero="
				+ genero + ", estrato=" + estrato + "]";
	}
	
}
