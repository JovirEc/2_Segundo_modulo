package com.KrakeDev.test;

import com.KrakeDev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha(200,12,12);
		/*fecha1.setAnio(200);
		fecha1.setMes(12);
		fecha1.setDia(12);*/
		
		System.out.println("Año: "+fecha1.getAnio());
		System.out.println("Mes: "+fecha1.getMes());
		System.out.println("Dia: "+fecha1.getDia());
	}

}