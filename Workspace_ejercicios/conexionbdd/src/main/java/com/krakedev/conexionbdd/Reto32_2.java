package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Reto32_2 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Reto26","postgres","KrakeDev2024");
			
			ps1 = connection.prepareStatement("insert into proyecto (id, proyecto, monto, fecha_inicio, fecha_entrega) values (?,?,?,?,?)");
			ps1.setInt(1, 4);
			ps1.setString(2, "Proyecto de Tecnologías");
			ps1.setBigDecimal(3, new BigDecimal(15000.00));
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr1 = "2023/01/10";
			String fechaStr2 = "2024/08/10";
			try {
				java.util.Date fecha1 = sdf.parse(fechaStr1);				//System.out.println(fecha);
				long fechaMilis1 = fecha1.getTime();						//System.out.println(fechaMilis);
				java.sql.Date fechaSQL1 = new java.sql.Date(fechaMilis1);	//System.out.println(fechaSQL);
				
				ps1.setDate(4, fechaSQL1);

				java.util.Date fecha2 = sdf.parse(fechaStr2);				//System.out.println(fecha);
				long fechaMilis2 = fecha2.getTime();						//System.out.println(fechaMilis);
				java.sql.Date fechaSQL2 = new java.sql.Date(fechaMilis2);
				
				ps1.setDate(5, fechaSQL2);
				
				ps1.executeUpdate();	
				
			} catch (ParseException e) {
				e.printStackTrace();
			}

			ps2 = connection.prepareStatement("insert into proyecto_municipio (proyecto_id,municipio_id) values (?,?)");
			ps2.setInt(1, 4);
			ps2.setInt(2, 8);
			ps2.executeUpdate();
			//System.out.println("insertado");
		
		}catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
			
		}
		
	}

}
