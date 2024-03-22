package com.krakedev.entidades;
import java.util.ArrayList;
import java.util.Iterator;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	//CONSTRUCTOR
	
	public Estudiante(String cedula, String nombre, String apellido) {
		notas = new ArrayList<Nota>();
		this.nombre   = nombre;
		this.apellido = apellido;
		this.cedula   = cedula;
	}
	public Estudiante () {
		notas = new ArrayList<Nota>();
	}

	//GETTER SETTERS
	public String getNombre() {
		   return nombre;
	}
	public void   setNombre(String nombre) {
		   this.nombre = nombre;
	}
	public String getApellido() {
		   return apellido;
	}
	public void   setApellido(String apellido) {
		   this.apellido = apellido;
	}
	public String getCedula() {
		   return cedula;
	}
	public void   setCedula(String cedula) {
		   this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		   return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	//METODOS
	public void agregarNota(Nota nuevaNota) {
		String  nuevoCodigo = nuevaNota.getMateria().getCodigo();
		Nota    notaX;
		String  codigoX;
		boolean existeNota  = false;
		
		for(int i=0; i<notas.size(); i++) {
			notaX = notas.get(i);
			codigoX = notaX.getMateria().getCodigo();
			if(nuevoCodigo.equals(codigoX)) {
				existeNota = true;
			}
		}
		
		if(existeNota == false) {
			if(nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <=10) {
				notas.add(nuevaNota);
			}
		}
	}
	
	public void modificarNota(String codigo, double nuevaNota) {
		Nota notaX = null;
		String codigoX = null;
		Nota notaEncontrada = null;
		for(int i = 0; i < notas.size(); i++) {
			notaX = notas.get(i);
			codigoX = notaX.getMateria().getCodigo();
			if(codigo.equals(codigoX)) {
				notaEncontrada = notaX;
			}
		}
		
		if(notaEncontrada != null) {
			if(nuevaNota >= 0 && nuevaNota <= 10) {
				notaX.setCalificacion(nuevaNota);
			}
		}else {
			System.out.println("No se encontró el código");
		}
	}
	
	public double calcularPromedioNotasEstudiante() {
		Nota notaX;
		double calificacionX;
		double suma = 0;
		double promedio;
		
		for(int i = 0; i<notas.size(); i++) {
			notaX = notas.get(i);
			calificacionX = notaX.getCalificacion();
			suma += calificacionX;
		}
		promedio = suma/notas.size();
		return promedio;
	}
	
	public void mostrar() {
		Nota notaX = null;
		System.out.print("Nombre:"+nombre+
					" Apellido:"+apellido+
					" Cédula:"+cedula+
					" Notas:[");
		for(int i=0; i<notas.size(); i++) {
			notaX = notas.get(i);
			notaX.mostrar();
		}
		System.out.print("]");
	}
	
	
}
