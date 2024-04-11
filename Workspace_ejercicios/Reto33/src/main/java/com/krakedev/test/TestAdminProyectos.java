package com.krakedev.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.entidades.Proyecto;
import com.krakedev.servicios.AdminProyectos;
import com.krakedev.utils.Convertidor;

public class TestAdminProyectos {

	public static void main(String[] args) {
		
		Proyecto proyecto1 = new Proyecto();
		
		proyecto1.setId(5);
		proyecto1.setProyecto("Proyecto ecológico turístico");
		proyecto1.setMonto(new BigDecimal(20000.00));
		
		try {
			Date fechaIni = Convertidor.convertirFecha("2020/06/12");
			Date fechaEntr = Convertidor.convertirFecha("2021/08/13");
			proyecto1.setFecha_inicio(fechaIni);
			proyecto1.setFecha_entrega(fechaEntr);
			
			AdminProyectos.insertar(proyecto1);

		} catch (Exception e) {
			System.out.println("Error en sistema "+e.getMessage());
		}

	}

}
