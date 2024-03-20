package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
//CONSTRUCTOR
	public Producto(String codigo, String nombre, double precio) {
	this.nombre = nombre;
	this.precio = precio;
	this.codigo = codigo;
	}
	
	/*public Producto() {
	}*/
//GETTERS SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
//METODOS
	public void incrementarPrecio(int porcentaje) {
		double valorAgregado =(precio * porcentaje) / 100;
		this.precio = precio + valorAgregado;
	}
	
	public void disminuirPrecio(double descuento) {
		this.precio = precio - descuento;
	}
}
