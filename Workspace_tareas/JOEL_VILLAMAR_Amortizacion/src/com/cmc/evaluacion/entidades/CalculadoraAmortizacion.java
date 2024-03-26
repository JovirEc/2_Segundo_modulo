package com.cmc.evaluacion.entidades;

public class CalculadoraAmortizacion {
	
	//METODOS
	public static double calcularCuota(Prestamo prestamo) {

		double monto = prestamo.getMonto();
		double i = prestamo.getInteres();
			double interes = (i/12)/100;
		int plazo = prestamo.getPlazo();
		double cuota;
		
		cuota = (monto * interes)/(1- Math.pow((1+interes),(-plazo)));
		
		return cuota;
	}
	
	public void generarTabla(Prestamo prestamo) {
		double cuotas = calcularCuota(prestamo);
		
	}
}
