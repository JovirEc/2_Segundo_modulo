package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Contacto cont1 = new Contacto("Byron","Caicedo",new Telefono("Claro","0955223121",70),70.2);
		cont1.imprimir();
		AdminContactos contActivo = new AdminContactos();
		contActivo.activarUsuario(cont1);
		cont1.imprimir();
		
	}

}
