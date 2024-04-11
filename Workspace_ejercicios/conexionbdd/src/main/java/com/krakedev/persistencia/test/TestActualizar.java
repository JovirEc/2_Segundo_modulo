package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakede.persistencia.utils.Convertidor;
import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestActualizar {
	
	public static void main(String[] args) {
		
		EstadoCivil ec = new EstadoCivil("U","UNION LIBRE");
		Persona p = new Persona("1425353628","JJ","RR",ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2020/12/23");
			Date horaNac = Convertidor.convertirHora("15:23");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(1230.45));
			p.setNumeroHijos(25);
			
			AdminPersonas.actualizar(p);
			
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	}
}
