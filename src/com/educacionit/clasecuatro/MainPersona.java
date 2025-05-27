package com.educacionit.clasecuatro;

public class MainPersona {

	public static void main(String[] args) {
	
		
		Domicilio d1 = new Domicilio();
		d1.setCalle("Rivadavia");
		d1.setNumero(2500);
		d1.setLocalidad("Ciudadela");
		
		Domicilio d2 = new Domicilio("Rivadavia", 3000, "Balvanera");
		
		Persona p1 = new Persona();
		p1.setNombre("Ivan");
		p1.setApellido("Chanenko");
		p1.setEdad(25);
		p1.setDomicilio(d1);
		Persona p2 = new Persona("Roberto", "Galati", 33, d2);
		
//		System.out.println("El nombre es : "  + p1.getNombre() + "\n"
//                          +"El appelido es : "+ p1.getApellido()+	"\n"
//                          +"La edad es  : "	  + p1.getEdad()+	"\n"
//                          +"El domicilio es :"+ p1.getDomicilio().getCalle()
//                          + " "               + p1.getDomicilio().getNumero()
//                          + " "               + p1.getDomicilio().getLocalidad()
//				
//				);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}

}
