package com.krakedev.evaluacion.persistencia;

import java.sql.Connection;

import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

public class TestConexionBDD {

	public void probarConexion() {
		Connection con = null;
		
		try {
			con = ConexionBDD.obtenerConexion();
		} catch (KrakeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(con != null) {
			System.out.println("Conexion exitosa");
		}else {
			System.out.println("Error al obtener conexion");
		}
		
		/*try {
			con = ConexionBDD.obtenerConexion();
			if(con != null) {
				System.out.println("Conexion exitosa");
			}else {
				System.out.println("Error al obtener conexion");
			}
		} catch (KrakeException e) {

			e.printStackTrace();
		}*/
		
	}
}
