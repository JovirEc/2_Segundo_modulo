package com.krakedev.evaluacion.servicios;

import java.sql.Connection;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

@Path("bases")
public class ServiciosConexion {
	
	@Path("probarConexion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void probarConn() {
		
		Connection con;
		try {
			con = ConexionBDD.obtenerConexion();
			System.out.println("Se conecto!!");
		} catch (KrakeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			ConexionBDD.obtenerConexion();
		} catch (KrakeException e) {

			e.printStackTrace();
		}*/
	}
}

