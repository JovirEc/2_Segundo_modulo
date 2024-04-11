package com.krakedev.test;

import com.krakedev.servicios.AdminProyectos;

public class TestEliminarProyectos {

	public static void main(String[] args) {

		try {
			AdminProyectos.eliminar(5);
			
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	}

}
