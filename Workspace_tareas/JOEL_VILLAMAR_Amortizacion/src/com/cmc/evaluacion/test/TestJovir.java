package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Prestamo;

public class TestJovir {

	public static void main(String[] args) {
		Prestamo prestamo = new Prestamo(5000,10,10);
		System.out.println(prestamo.getCuotas().size());
		
	}

}
