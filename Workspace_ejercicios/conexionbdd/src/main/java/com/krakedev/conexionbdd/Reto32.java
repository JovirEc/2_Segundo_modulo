package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Reto32 {

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
			ps1.setDate(4, Date.valueOf("2023-01-10"));
			ps1.setDate(5, Date.valueOf("2024-08-10"));
			ps1.executeUpdate();

			ps2 = connection.prepareStatement("insert into proyecto_municipio (proyecto_id,municipio_id) values (?,?)");
			ps2.setInt(1, 4);
			ps2.setInt(2, 8);
			ps2.executeUpdate();
			System.out.println("insertado");
		
		}catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
			
		}
		
	}

}
