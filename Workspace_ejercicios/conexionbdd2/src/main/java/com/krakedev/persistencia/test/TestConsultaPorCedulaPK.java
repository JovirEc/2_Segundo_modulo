package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaPorCedulaPK {

	public static void main(String[] args) {
		
		Persona persona = null;
		try {
			persona = AdminPersonas.buscarPorCedula("7890123456");
			System.out.println(persona);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
