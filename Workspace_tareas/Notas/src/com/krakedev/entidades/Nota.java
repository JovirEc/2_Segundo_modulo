package com.krakedev.entidades;

public class Nota {

	//ATRIBUTOS
		private Materia materia;
		private double calificacion;

	//CONSTRUCTOR
	public Nota(Materia materia, double calificacion) {
		//materia = new Materia();
		this.materia = materia;
		this.calificacion = calificacion;
	}
	
	public Nota(){
		//materia = new Materia();
	}
	
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
		System.out.print(" Materia "+materia.getNombre()+" ["+
						"Codigo:"+materia.getCodigo()+
						" Calificación:"+calificacion+"]");
	}
}
