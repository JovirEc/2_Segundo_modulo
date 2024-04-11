package com.krakedev.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/Reto26";
	private final static String USUARIO = "postgres";
	private final static String PASSWORD = "KrakeDev2024";
	private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);
	
	public static Connection conectar() throws Exception{
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,USUARIO,PASSWORD);
			LOGGER.debug("Conexion exitosa");
			
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la infraestructura",e);
			throw new Exception("Error en la infraestructura");
		} catch (SQLException e) {
			LOGGER.error("Error al conectarse, revise usuario y clave");
			throw new Exception("Error eal conectarse, revise usuario y clave");
		}
		
		return connection;
		
	}
}
