package com.cmc.repaso.entidades;

public class Producto {
	
	private String nombre;
	private double precio;
	
	//CONSTRUCTORES
	public Producto (String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//ENCAPSULAMIENTO
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
		if (precio < 0) {
			this.precio = precio * -1;
		}else {
			this.precio = precio;
		}
	}

	//METODOS
	public double calcularPrecioPromo(int descuento) {
		double descontar = (precio * descuento)/100;
		double precioFinal = precio - descontar;
		return precioFinal;
	}
}
