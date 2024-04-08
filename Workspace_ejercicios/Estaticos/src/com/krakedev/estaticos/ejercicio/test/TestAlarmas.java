package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma alarma1 = new Alarma(DiasSemana.LUNES,5,00);
		Alarma alarma2 = new Alarma(DiasSemana.MARTES,11,6);
		Alarma alarma3 = new Alarma(DiasSemana.VIERNES,12,03);
		
		AdminAlarmas grupoAlarmas = new AdminAlarmas();
		grupoAlarmas.agregarAlarma(alarma1);
		grupoAlarmas.agregarAlarma(alarma2);
		grupoAlarmas.agregarAlarma(alarma3);
		
		ArrayList<Alarma> alarmasActuales = grupoAlarmas.getAlarmas();
		System.out.println(alarmasActuales);
		
		
		
	}

}
