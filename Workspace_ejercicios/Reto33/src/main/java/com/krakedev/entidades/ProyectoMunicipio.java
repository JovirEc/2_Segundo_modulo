package com.krakedev.entidades;

public class ProyectoMunicipio {

	private int proyecto_id;
	private int municipio_id;
	
	//CONSTRUCTORS
	public ProyectoMunicipio() {
		super();
	}
	public ProyectoMunicipio(int proyecto_id, int municipio_id) {
		super();
		this.proyecto_id = proyecto_id;
		this.municipio_id = municipio_id;
	}
	//GETTERS SETTERS
	public int getProyecto_id() {
		return proyecto_id;
	}
	public void setProyecto_id(int proyecto_id) {
		this.proyecto_id = proyecto_id;
	}
	public int getMunicipio_id() {
		return municipio_id;
	}
	public void setMunicipio_id(int municipio_id) {
		this.municipio_id = municipio_id;
	}
	
	@Override
	public String toString() {
		return "ProyectoMunicipio [proyecto_id=" + proyecto_id + ", municipio_id=" + municipio_id + "]";
	}
}
