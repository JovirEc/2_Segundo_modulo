package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		//CONTACTOS
		Contacto cont1 = new Contacto(
				"Joel"
				,"Villamar"
				,new Telefono("Movi","0984521326",50)
				,55.5);
		
		Contacto cont2 = new Contacto(
				"Angel"
				,"Gorotiza"
				,new Telefono("Claro","0956478253",51)
				,60.2
				);
		//INVOCAMOS MÉTODOS
		AdminContactos contacto = new AdminContactos();
		Contacto resultadoMasPesado = contacto.buscarMasPesado(cont1, cont2);
		resultadoMasPesado.imprimir();
		
		boolean resultadoOperadoras = contacto.compararOperadoras(cont1, cont2);
		System.out.println("Misma operadora: "+resultadoOperadoras);
		
		
		
	}

}
