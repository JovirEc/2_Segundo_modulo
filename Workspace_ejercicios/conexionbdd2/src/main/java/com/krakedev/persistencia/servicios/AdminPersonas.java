package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);
	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar: "+persona);
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

					ps.executeUpdate();
					System.out.println("Ejecuta Insert");
			
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
	
	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a actualizar >>> "+persona);
		
		try {
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("update personas set nombre = ?, apellido = ?, estado_civil_codigo = ?, numero_hijos = ?, estatura = ?, cantidad_ahorrada = ?, fecha_nacimiento = ?, hora_nacimiento = ? where cedula = ?");
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setInt(4, persona.getNumeroHijos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getCedula());
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
			
		} finally {
			try {
			con.close();
			} catch (SQLException e) {
			LOGGER.error("Error con la base de datos",e);
			throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Cedula a eliminar >>> "+cedula);
		
		try {
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("delete from personas where cedula = ?");
			ps.setString(1, cedula);
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
			
		} finally {
			try {
			con.close();
			} catch (SQLException e) {
			LOGGER.error("Error con la base de datos",e);
			throw new Exception("Error con la base de datos");
			}
		}
	}
	
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
					try {
						con = ConexionBDD.conectar();
						ps = con.prepareStatement("select * from personas where nombre like ?");
						ps.setString(1, "%"+nombreBusqueda+"%");
						
						rs = ps.executeQuery();
						
						while(rs.next()) {
							String nombre = rs.getString("nombre");
							String cedula = rs.getString("cedula");
							Persona p = new Persona();
							p.setCedula(cedula);
							p.setNombre(nombre);
							personas.add(p);
							
						}
						
					} catch (Exception e) {
						LOGGER.error("Error al consultar por nombre",e);
						throw new Exception("Error al consultar por nombre");
						
					} finally {
						try {
							con.close();
							} catch (SQLException e) {
							LOGGER.error("Error con la base de datos",e);
							throw new Exception("Error con la base de datos");
							}
					}
		
		return personas;
	}
	
	
	public static ArrayList<Persona> buscarPorEstadoCivil(String estado_civil_codigo) throws Exception{
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("select * from personas where estado_civil_codigo = ?");
			ps.setString(1, estado_civil_codigo);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Persona personaX = new Persona();
				String cedula = rs.getString("cedula");
				personaX.setCedula(cedula);
				
				String nombre = rs.getString("nombre");
				personaX.setNombre(nombre);
				
				String apellido = rs.getString("apellido");
				personaX.setApellido(apellido);
				
				Double estatura = rs.getDouble("estatura");
				personaX.setEstatura(estatura);
				
				Date fecha_nacimiento = rs.getDate("fecha_nacimiento");
				personaX.setFechaNacimiento(fecha_nacimiento);
				
				int numero_hijos = rs.getInt("numero_hijos");
				personaX.setNumeroHijos(numero_hijos);
				
				personas.add(personaX);
			}
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por estado_civil_codigo ",e);
			throw new Exception("Error al consultar por estado_civil_codigo ");
			
		} finally {
			try {
				con.close();
				} catch (SQLException e) {
				LOGGER.error("Error con la base de datos",e);
				throw new Exception("Error con la base de datos");
				}
		}
		return personas;
	}
	
	
	public static Persona buscarPorCedula(String cedulaBusqueda) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Persona personaX = null;
		
		try {
			con = ConexionBDD.conectar();
			
			ps = con.prepareStatement("select * from personas where cedula = ?");
			ps.setString(1, cedulaBusqueda);
			
			rs = ps.executeQuery();
			rs.next();
			
			String cedula = rs.getString("cedula");
			String nombre = rs.getString("nombre");
			String apellido = rs.getString("apellido");
			String estadoCivil = rs.getString("estado_civil_codigo");
			int numeroHijos = rs.getInt("numero_hijos");
			double estatura = rs.getDouble("estatura");
			Date fechaNacimiento = rs.getDate("fecha_nacimiento");
			
			personaX = new Persona();
			personaX.setCedula(cedula);
			personaX.setNombre(nombre);
			personaX.setApellido(apellido);
			
			EstadoCivil nuevoEstadoCivil = new EstadoCivil();
			nuevoEstadoCivil.setCodigo(estadoCivil);
			personaX.setEstadoCivil(nuevoEstadoCivil);
			
			personaX.setNumeroHijos(numeroHijos);
			personaX.setEstatura(estatura);
			personaX.setFechaNacimiento(fechaNacimiento);
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar",e);
			throw new Exception("Error al consultar");
		} finally {
			try {
				con.close();
			}catch (SQLException e) {
				LOGGER.error("Error en la base de datos",e);
				throw new Exception("Error en la base de datos");
			}
		}
		
		return personaX;
	}
}
