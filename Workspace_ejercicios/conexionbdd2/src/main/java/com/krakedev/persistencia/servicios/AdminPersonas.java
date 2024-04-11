package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	public static void insertar(Persona persona) {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("insert into personas(cedula,nombre,apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"+
					"values (?,?,?,?,?,?,?,?,?)");
					
					ps.setString(1, persona.getCedula());
					ps.setString(2, persona.getNombre());
					ps.setString(3, persona.getApellido());
					ps.setString(4, persona.getEstadoCivil().getCodigo());
					ps.setInt(5, persona.getNumeroHijos());
					ps.setDouble(6, persona.getEstatura());
					ps.setBigDecimal(7, persona.getCantidadAhorrada());
					ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
					ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

					/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					String fechaStr = "2020/03/22 10:05:04";
					Date fecha = null;
					try {
						fecha = sdf.parse(fechaStr);
						System.out.println(fecha);
						long fechaMilis = fecha.getTime();
						System.out.println(fechaMilis);
						java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
						System.out.println(fechaSQL);
						
						Time timeSQL = new Time(fechaMilis);
						System.out.println(timeSQL);
						
						ps.setDate(8, fechaSQL);
						ps.setTime(9, timeSQL);*/
						
						ps.executeUpdate();
						System.out.println("Ejecuta Insert");
						
					/*} catch (ParseException e) {
						e.printStackTrace();
					}*/
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error de infraestructura");
			}
		}
		
	}
}
