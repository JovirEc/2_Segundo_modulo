package com.krakedev.conexionbdd2;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
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
			
			System.out.println("");
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
