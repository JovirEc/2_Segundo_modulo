package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement ps = null;
		//---------------------------
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","KrakeDev2024");
			System.out.println("conexión exitosa");
	
			ps = connection.prepareStatement("insert into personas(cedula,nombre,apellido,fecha_nacimiento,hora_nacimiento,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada)"
					+"values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, "5513616123");
			ps.setString(2, "Rosalia");
			ps.setString(3, "Andrade");
			//ps.setDate(4, Date.valueOf("2000-5-5"));
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String fechaStr = "2020/03/22 10:05:04";
			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				//Crea un java.sqlDate, partiendo de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(4, fechaSQL);
				ps.setTime(5, timeSQL);
				
				ps.executeUpdate();	
				System.out.println("ejecuta insert");
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//ps.setDate(4, Date.valueOf("2000-5-5"));
			ps.setString(6, "S");
			ps.setInt(7, 2);
			ps.setDouble(8, 1.56);
			ps.setBigDecimal(9, new BigDecimal(1200.45));
			
			
					
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
