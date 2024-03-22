package com.krakedev.test;

import com.krakedev.entidades.Curso;
import com.krakedev.entidades.Estudiante;
import com.krakedev.entidades.Materia;
import com.krakedev.entidades.Nota;

public class TestPrueba {

	public static void main(String[] args) {
		
		//ESTUDIANTE 1
		Estudiante estudiante1 = new Estudiante("1234567890", "Juan2", "Perez");
		Materia sociales= new Materia("COD1", "Sociales");
		Materia ciencias= new Materia("FOD1", "Ciencias");
		Nota nota1 = new Nota(sociales, 8.0);
		Nota nota2 = new Nota(ciencias, 9.0);
		
		estudiante1.agregarNota(nota1);
		estudiante1.agregarNota(nota2);
		estudiante1.mostrar();
		
		estudiante1.modificarNota("FOD1", 4.0);
		System.out.println("--Despues de Modificar--");
		estudiante1.mostrar();
		
		double promedioEstudiante1 = estudiante1.calcularPromedioNotasEstudiante();
		System.out.println("Promedio estudiante: "+promedioEstudiante1);
		
		//ESTUDIANTE 2
		Estudiante estudiante2 = new Estudiante("1234567891", "Adrian", "Chalén");
		Materia politica= new Materia("COD2", "Politica");
		Materia economia= new Materia("FOD2", "Economia");
		Nota nota3 = new Nota(politica, 10.0);
		Nota nota4 = new Nota(economia, 9.0);
		
		System.out.println("");
		estudiante2.agregarNota(nota3);
		estudiante2.agregarNota(nota4);
		estudiante2.mostrar();
		
		estudiante2.modificarNota("FOD2", 6.0);
		System.out.println("--Despues de Modificar--");
		estudiante2.mostrar();
		
		double promedioEstudiante2 = estudiante2.calcularPromedioNotasEstudiante();
		System.out.println("Promedio estudiante: "+promedioEstudiante2);
		
		//CURSO PRUEBA METODOS
		Curso paraleloA = new Curso();
			//MATRICULAR
		paraleloA.matricularEstudiante(estudiante1);
		paraleloA.matricularEstudiante(estudiante2);
		System.out.println("");
		paraleloA.mostrar();
		
		double promedioCurso = paraleloA.calcularPromedioCurso();
		System.out.println("");
		System.out.println("Promedio del curso: "+promedioCurso);

	}


}
