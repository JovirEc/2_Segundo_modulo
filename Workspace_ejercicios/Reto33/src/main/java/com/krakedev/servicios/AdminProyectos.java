package com.krakedev.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.entidades.Proyecto;
import com.krakedev.utils.ConexionBDD;

public class AdminProyectos {
	private static final Logger LOGGER = LogManager.getLogger(AdminProyectos.class);
	
	
	public static void insertar(Proyecto proyecto) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Proyecto a insertar: "+proyecto);
		
		try {
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("insert into proyecto (id,proyecto,monto,fecha_inicio,fecha_entrega) values (?,?,?,?,?)");
			ps.setInt(1, proyecto.getId());
			ps.setString(2, proyecto.getProyecto());
			ps.setBigDecimal(3, proyecto.getMonto());
			ps.setDate(4, new java.sql.Date(proyecto.getFecha_inicio().getTime()));
			ps.setDate(5, new java.sql.Date(proyecto.getFecha_entrega().getTime()));
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de infraestructura",e);
				throw new Exception("Error de infraestructura");
			}
		}
	}
	
	public static void actualizar(Proyecto proyecto) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Proyecto por actualizar: "+proyecto);
		
		try {
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("update proyecto set proyecto = ?, monto = ?, fecha_inicio = ?, fecha_entrega = ? where id = ?");
			
			ps.setString(1, proyecto.getProyecto());
			ps.setBigDecimal(2, proyecto.getMonto());
			ps.setDate(3, new java.sql.Date(proyecto.getFecha_inicio().getTime()));
			ps.setDate(4, new java.sql.Date(proyecto.getFecha_entrega().getTime()));
			ps.setInt(5, proyecto.getId());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al actualizar",e);
			throw new Exception("Error al actualizar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de datos",e);
				throw new Exception("Error en la base de datos");
			}
		}
	}
	
	
	
	
	
}
