package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class CalculadoraAmortizacion {
	
	//METODOS
	public static double calcularCuota(Prestamo prestamo) {

		double monto = prestamo.getMonto();
				double i = prestamo.getInteres();
		double interes = (i/12)/100;
		int plazo = prestamo.getPlazo();
		double cuota;
		
		cuota = (monto * interes)/(1- Math.pow((1+interes),(-plazo))); //Formula cuota
		
		return cuota;
	}
	
	public static void generarTabla(Prestamo prestamo) {
		double cuotas = calcularCuota(prestamo);
		for(int i=0; i < prestamo.getPlazo(); i++) {
			Cuota cuotaX = new Cuota(i+1);
			cuotaX.setCapital(prestamo.getMonto());                     //SE AGREGÓ CAPITAL
			cuotaX.setCuota(cuotas);
			ArrayList<Cuota> listaCuotas = prestamo.getCuotas();
			listaCuotas.add(cuotaX);
		}
		
		prestamo.getCuotas().get(0).setInicio (prestamo.getCuotas().get(0).getCapital());
		
		ArrayList<Cuota> cuotasX = prestamo.getCuotas();
		for(int i=0; i < cuotasX.size(); i++) {
			Cuota cuotaX = cuotasX.get(i);
			Cuota cuotaSig;
			if((cuotasX.size()-1) != i) {
				cuotaSig = cuotasX.get(i+1);
			}else {
				cuotaSig = null;
			}
			calcularValoresCuota(prestamo.getInteres(),cuotaX,cuotaSig);
		}
	}
	
	public static void calcularValoresCuota(double interes,Cuota cuotaActual,Cuota cuotaSiguiente) {
		double valorInteres = ( (cuotaActual.getInicio()) * (interes/12) ) /100;
		double abonoCapital = cuotaActual.getCuota() - valorInteres;
		double saldo = cuotaActual.getInicio() - abonoCapital;
		
		cuotaActual.setInteres(valorInteres);
		cuotaActual.setAbonoCapital(abonoCapital);
		cuotaActual.setSaldo(saldo);
			
		if(cuotaSiguiente != null) {
			cuotaSiguiente.setInicio(saldo);
		}else {
			double ultimaCuota = cuotaActual.getCuota()+saldo;
			cuotaActual.setCuota(ultimaCuota);
			cuotaActual.setSaldo(0);
		}
	}
	
	public static void mostrarTabla(Prestamo prestamo) {
		ArrayList<Cuota> cuotasX = prestamo.getCuotas();
		for(Cuota cuotaX : cuotasX) {
			cuotaX.mostrarPrestamo();
		}
	}
}


