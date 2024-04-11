package com.krakedev.Excepciones2;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("inicio");
		String a = null;
		try {
			System.out.println("Abre conexion");
			a.substring(3);
			System.out.println("fin");
		}catch(Exception ex){
			System.out.println("Entra al catch");
		}finally {
			System.out.println("ingresa al finally");
			System.out.println("Cierra conexión");
		}
		System.out.println("fuera del catch");
		
	}

}
