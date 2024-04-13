package com.krakedev.evaluacion.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

public class HistorialBDD {

	public void insertar(Categoria categoria) throws KrakeException {
		
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("insert into categorias (id,nombre) values (?,?)");
			ps.setString(1, categoria.getId());
			ps.setString(2, categoria.getNombre());
			
			ps.executeUpdate();
			
			
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al insertar cliente. Detalle: "+e.getMessage());
		}		
	}
	
	
		
	public void actualizar(Categoria categoria) throws KrakeException {
			
			Connection con = null;
			PreparedStatement ps;
			try {
				con = ConexionBDD.obtenerConexion();
				ps = con.prepareStatement("UPDATE categorias SET id = ?, where nombre = ?");
				ps.setString(1, categoria.getNombre());
				ps.setString(2, categoria.getId());
				
				
				ps.executeUpdate();
				
				
			} catch (KrakeException e) {
				e.printStackTrace();
				throw e;
			} catch (SQLException e) {
				e.printStackTrace();
				throw new KrakeException("Error al actualzar cliente. Detalle: "+e.getMessage());
			}		
		}
	
	public Categoria buscarPorId(String idBuscar) throws KrakeException {
		
		Connection con = null;
		PreparedStatement ps;
		Categoria categoriax = null;
		ResultSet rs = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select * from categorias where id = ?");
			ps.setString(1, idBuscar);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("Existe la categoria");
				String id = rs.getString("id");
				String nombre = rs.getString("nombre");

				categoriax = new Categoria (id,nombre);
			}else {
				System.out.println("No existe la categoria");
			}
			
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al consultar cliente. Detalle: "+e.getMessage());
		}	
		return categoriax;	
	}
	
}
