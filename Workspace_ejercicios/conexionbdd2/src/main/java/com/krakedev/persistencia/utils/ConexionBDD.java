package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String USUARIO = "postgres";
	private final static String PASSWORD = "KrakeDev2024";
	private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);
	
	public static Connection conectar() throws Exception{
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,USUARIO,PASSWORD);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new Exception("Error en la infraestructura");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error eal conectarse, revise usuario y clave");
		}
		
		return connection;
		
	}
}
