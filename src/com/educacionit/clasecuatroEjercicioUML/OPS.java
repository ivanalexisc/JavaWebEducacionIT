package com.educacionit.clasecuatroEjercicioUML;

public class OPS extends Administrativos {

//ATRIBUTOS
	
	public String fechaVinculacion;
	public int numMeses;
	public int valorContrato;
	public int salario;
	
	
	
	//METODOS 
	
	public void liquidarValorContrato() {}
	public void mostrarLiqOPS() {}
	
	//CONSTRUCTORES
	public OPS(int iDPersona, String nomPersona, String apePersona, String fechaNacimiento, String ciudadNacimiento,
			String genero, int estrato, String dependencia, String titulo, String fechaVinculacion, int numMeses,
			int valorContrato, int salario) {
		super(iDPersona, nomPersona, apePersona, fechaNacimiento, ciudadNacimiento, genero, estrato, dependencia,
				titulo);
		this.fechaVinculacion = fechaVinculacion;
		this.numMeses = numMeses;
		this.valorContrato = valorContrato;
		this.salario = salario;
	}
	
	
	public OPS() {
		
	}
	//GETTERS Y SETTERS 
	
	public String getFechaVinculacion() {
		return fechaVinculacion;
	}
	public void setFechaVinculacion(String fechaVinculacion) {
		this.fechaVinculacion = fechaVinculacion;
	}
	public int getNumMeses() {
		return numMeses;
	}
	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
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
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "OPS [fechaVinculacion=" + fechaVinculacion + ", numMeses=" + numMeses + ", valorContrato="
				+ valorContrato + ", salario=" + salario + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
