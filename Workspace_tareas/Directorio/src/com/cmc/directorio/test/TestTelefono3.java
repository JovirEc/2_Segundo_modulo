package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminTelefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("Movi","0932457682",21);
		Telefono telf2 = new Telefono("Movi","0988564321",22);
		Telefono telf3 = new Telefono("Claro","0954325789",23);
		
		AdminTelefono comparar = new AdminTelefono();
		int cantidadMovi = comparar.contarMovi(telf1, telf2, telf3);
		
		System.out.println("La cantida de teléfonos MOVI es de: "+cantidadMovi);

	}
}
