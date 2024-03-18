package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	//ENCAPSULAMENTO
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	//METODOS
	public void imprimir() {
		System.out.println("****Existencias****");
		System.out.println("PRODUCTO: "+nombre);
		System.out.println("STOCK ACTUAL: "+productosActuales);
		System.out.println("CANTIDAD DEVUELTOS: "+productosDevueltos);
		System.out.println("CANTIDAD VENDIDOS: "+productosVendidos);
		System.out.println("****-----------****");
	}
	
	public void vender(int cantidadVendidos) {
		productosActuales = productosActuales - cantidadVendidos;
		productosVendidos = productosVendidos + cantidadVendidos;
	}
	
	public void devolver(int cantidadDevueltos) {
		productosActuales = productosActuales + cantidadDevueltos;
		productosDevueltos = productosDevueltos + cantidadDevueltos;
		productosVendidos = productosVendidos - cantidadDevueltos;
	}

}
