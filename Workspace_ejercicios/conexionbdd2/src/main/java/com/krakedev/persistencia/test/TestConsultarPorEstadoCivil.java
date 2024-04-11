package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultarPorEstadoCivil {

	public static void main(String[] args) {

		ArrayList<Persona> personas;
		try {
			personas = AdminPersonas.buscarPorEstadoCivil("U");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
