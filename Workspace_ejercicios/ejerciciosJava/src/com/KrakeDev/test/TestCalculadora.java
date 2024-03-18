package com.KrakeDev.test;

import com.KrakeDev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromediar;
		
		calcu = new Calculadora();
		resultadoSuma = calcu.sumar(5, 8);
		resultadoResta = calcu.restar(10, 3);
		resultadoMultiplicacion = calcu.multiplicar(10, 5);
		resultadoDivision = calcu.dividir(10, 2);
		resultadoPromediar = calcu.promediar(10, 8, 9);
		
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("RESULTADO DE LA MULTIPLICACIÓN: "+resultadoMultiplicacion);
		System.out.println("RESULTADO DE LA DIVISION: "+resultadoDivision);
		System.out.println("RESULTADO DEL PROMEDIO: "+resultadoPromediar);
		calcu.mostrarResultado();
	}

}