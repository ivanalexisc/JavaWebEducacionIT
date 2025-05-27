package com.educacionit.clasecuatro;

public class MainClaseCuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado e1 = new Empleado();
		// como es privado no se puede hacer lo que esta abajo hay que setear metodos de acceso (getters setters)
		// e1.sueldo = -1000;
		e1.setSueldo(1000);
		System.out.println("El sueldo es : " + e1.getSueldo());
		
	}

}
