package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("Claro","0954682547",30);
		Telefono telf2 = new Telefono("Movi","0975421215",31);
		Telefono telf3 = new Telefono("Claro","0945453232",32);
		Telefono telf4 = new Telefono("Movi","0964878735",33);
		
		AdminTelefono comparar = new AdminTelefono();
		int resultado = comparar.contarClaro(telf1, telf2, telf3, telf4);
		
		System.out.println("La cantidad de teléfonos CLARO es de: "+resultado);

	}
}
