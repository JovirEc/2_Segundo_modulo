package com.krakedev.test;

import com.krakedev.entidades.Curso;
import com.krakedev.entidades.Estudiante;
import com.krakedev.entidades.Materia;
import com.krakedev.entidades.Nota;

public class TestPrueba {

	public static void main(String[] args) {
		
		//Curso curso1 = new Curso();
		Estudiante estudiante1 = new Estudiante("1234567890", "Juan2", "Perez");
		Materia sociales= new Materia("COD1", "Sociales");
		Materia ciencias= new Materia("FOD2", "Ciencias");
		Nota nota1 = new Nota(sociales, 10.0);
		Nota nota2 = new Nota(ciencias, 9.0);
		
		estudiante1.agregarNota(nota1);
		estudiante1.agregarNota(nota2);
		
		estudiante1.mostrar();
		estudiante1.modificarNota("FOD2", 7.00);
		
		System.out.println("");
		System.out.println("--Despues de Modificar--");
		
		estudiante1.mostrar();
		/*estudiante.agregarNota(nota1);
		estudiante.modificarNota("3", 10.00);
		estudiante.mostrar();*/
	}


}
