package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Contacto cont1 = new Contacto(
				"Carlos",
				"Mena",
				new Telefono("Movi","0985852532",60),
				65.5);
		Contacto cont2 = new Contacto(
				"Isabela",
				"Pantoja",
				new Telefono("Movi","0954854241",61),
				62.2);
		
		AdminContactos contacto = new AdminContactos();
		Contacto masPesado = contacto.buscarMasPesado(cont1, cont2);
		masPesado.imprimir();
		boolean resultOperadoras = contacto.compararOperadoras(cont1, cont2);
		System.out.println("Misma operadora: "+resultOperadoras);
		
	}

}
