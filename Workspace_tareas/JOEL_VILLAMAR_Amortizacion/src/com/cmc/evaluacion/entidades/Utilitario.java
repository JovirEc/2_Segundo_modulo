package com.cmc.evaluacion.entidades;

public class Utilitario {
	public static double redondear(double numero) {
		double numeroRedondeado = Math.round(numero * 100)/100d;
		return numeroRedondeado;
	}
}
