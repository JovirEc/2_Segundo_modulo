package com.KrakeDev.test;

import com.KrakeDev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(5);
		Cuadrado c2 = new Cuadrado(6);
		Cuadrado c3 = new Cuadrado(7);
		
		double areaC1;
		double areaC2;
		double areaC3;
		double perimetroC1;
		double perimetroC2;
		double perimetroC3;
		
		/*c1.setLado(5);
		c2.setLado(6);
		c3.setLado(7);*/
		
		areaC1 = c1.calcularArea();
		areaC2 = c2.calcularArea();
		areaC3 = c3.calcularArea();
		perimetroC1 = c1.calcularPerimetro();
		perimetroC2 = c2.calcularPerimetro();
		perimetroC3 = c3.calcularPerimetro();
		
		System.out.println("El área de C1 es "+areaC1+" y su perímetro de "+perimetroC1);
		System.out.println("El área de C2 es "+areaC2+" y su perímetro de "+perimetroC2);
		System.out.println("El área de C3 es "+areaC3+" y su perímetro de "+perimetroC3);
		
	}
	
}