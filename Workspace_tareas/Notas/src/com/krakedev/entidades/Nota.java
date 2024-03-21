package com.krakedev.entidades;

public class Nota {

	//ATRIBUTOS
		private Materia materia; // new Materia();
		private double calificacion;

	//CONSTRUCTOR
	public Nota(Materia materia, double calificacion) {
		this.materia = materia;
		this.calificacion = calificacion;
	}
	
	//public Nota(){}
	
	//GETTER SETTERS
	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
		
	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
			this.calificacion = calificacion;
	}
		
	//METODOS
	public void mostrar() {
		System.out.println("Materia ["
						+" Codigo:"+materia.getCodigo()+
						" Nombre:"+materia.getNombre()+
						"] Calificación:"+calificacion);
	}
}
