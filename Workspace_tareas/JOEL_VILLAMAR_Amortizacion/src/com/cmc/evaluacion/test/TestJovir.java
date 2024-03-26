package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.CalculadoraAmortizacion;
import com.cmc.evaluacion.entidades.Prestamo;

public class TestJovir {

	public static void main(String[] args) {
		Prestamo prestamo = new Prestamo(5000, 12, 20);
        double cuota = CalculadoraAmortizacion.calcularCuota(prestamo);
        System.out.println("Cuota: " + cuota);
        CalculadoraAmortizacion.generarTabla(prestamo);
        System.out.println(prestamo.getCuotas().size());
	}

}
