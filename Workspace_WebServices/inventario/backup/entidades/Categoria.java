package com.krakede.evaluacion.entidades;

public class Categoria {

	private String id;
	private String nombre;
	
	//Constructores
	public Categoria(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public Categoria() {
		super();
	}
	
	//Getters setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + "]\n";
	}
	
	
}
