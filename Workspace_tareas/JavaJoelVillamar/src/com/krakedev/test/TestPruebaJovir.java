package com.krakedev.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPruebaJovir {

	public static void main(String[] args) {
		Date fechaActual = new Date();
		System.out.println(fechaActual);
		SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		String fechaFormateada = formatoFecha.format(fechaActual);
		System.out.println("Fecha: "+fechaFormateada);
		
	}

}
