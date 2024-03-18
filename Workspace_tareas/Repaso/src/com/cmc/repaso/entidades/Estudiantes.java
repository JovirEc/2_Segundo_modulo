package com.cmc.repaso.entidades;

public class Estudiantes {
	public String nombre;
	public double nota;
	public String resultado;
	
	public Estudiantes (String nombre) {
		this.nombre = nombre;
	}
	
	public void calificar(double nota) {
		this.nota = nota;
		if (nota < 8) {
			this.resultado = "F";
		}else {
			this.resultado = "A";
		}
	}
	
	
	
}
