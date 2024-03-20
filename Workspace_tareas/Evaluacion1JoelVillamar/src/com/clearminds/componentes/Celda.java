package com.clearminds.componentes;

public class Celda {
//ATRIBUTOS
	private Producto producto;
	private int stock;
	private String codigo;
	
//CONSTRUCTOR
	public Celda(String codigo) {
//*********************************** producto = new Producto();
		this.codigo = codigo;
	}
	
//GETTERS SETTERS
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
//METODOS
	public void ingresarProducto (Producto prod, int stck) {
		producto = prod;
		stock = stck;
	}

	
	
}
