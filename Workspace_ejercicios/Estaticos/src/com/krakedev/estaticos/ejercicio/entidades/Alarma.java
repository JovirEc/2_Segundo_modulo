package com.krakedev.estaticos.ejercicio.entidades;

import com.krakedev.estaticos.ejercicio.utils.Util;

public class Alarma {
	private int dia;
	private int hora;
	private int minuto;
//CONSTRUCTOR
	public Alarma(int dia, int hora, int minuto) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}
//GETTERS SETTERS
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	@Override
	public String toString() {
		String diaFormateado = Util.formatearDia(dia);
		String horaFormateada = Util.formatearHora(hora);
		String minutoFormateado = Util.formatearHora(minuto);

		return "Alarma["+diaFormateado+", "+horaFormateada+":"+minutoFormateado+"]";
	}
	
	
}
