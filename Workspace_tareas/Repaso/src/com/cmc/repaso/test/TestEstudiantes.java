package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiantes;
public class TestEstudiantes {

	public static void main(String[] args) {
		Estudiantes estudiante1 = new Estudiantes("Joel");
		Estudiantes estudiante2 = new Estudiantes("Andres");
		
		estudiante1.calificar(10);
		estudiante2.calificar(5);
		
		System.out.println("Estudiante "+estudiante1.nombre+" con nota: "+estudiante1.nota+" con calificacion: "+estudiante1.resultado);
		System.out.println("Estudiante "+estudiante2.nombre+" con nota: "+estudiante2.nota+" con calificacion: "+estudiante2.resultado);
	}

}
