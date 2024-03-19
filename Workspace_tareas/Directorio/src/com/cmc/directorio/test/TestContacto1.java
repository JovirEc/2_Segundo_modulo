package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("Claro","0986482432",40);
		Contacto c = new Contacto("Joel","Villamar",telef,55.5);
		
		System.out.println("***  CONTACTO  ***");
		System.out.println("------------------");
		System.out.println("Nombre: "+c.getNombre());
		System.out.println("Apellido: "+c.getApellido());
		System.out.println("Peso: "+c.getPeso());
		System.out.println("Telefono: "+telef.getNumero());
		System.out.println("Operadora: "+telef.getOperadora());
		System.out.println("Código: "+telef.getCodigo());
		System.out.println("¿Tiene Whatsapp?: "+telef.isTieneWhatsapp());
		System.out.println("------------------");

	}

}
