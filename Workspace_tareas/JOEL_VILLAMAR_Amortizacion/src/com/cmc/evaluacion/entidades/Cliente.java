package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Cliente {
	String cedula;
	String nombre;
	String apellido;
	ArrayList<Prestamo> prestamos;
	
	//CONSTRUCTOR
	
	public Cliente (String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		
		prestamos = new ArrayList<Prestamo>();
		}
	//GETTERS SETTERS
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	//METODOS
	public void mostrarCliente () {
		System.out.println("Cliente registrado: "+nombre+" "+apellido+"[cedula="+cedula+", nombre="+nombre+", apellido="+apellido);
	}
	 
}
