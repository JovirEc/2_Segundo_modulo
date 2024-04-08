package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	ArrayList<Alarma> alarmas;
//constructor
	public AdminAlarmas() {
		alarmas = new ArrayList<Alarma>();
	}
//getter
	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
//metodos
	public void agregarAlarma(Alarma alarma) {
		alarmas.add(alarma);
		
	}

	
	
}
