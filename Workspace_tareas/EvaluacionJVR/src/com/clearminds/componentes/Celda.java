package com.clearminds.componentes;

public class Celda {
//ATRIBUTOS
	//private Producto producto;
	Producto producto = new Producto();
	private int stock;
	private String codigo;
	
//CONSTRUCTOR
	public Celda(String codigo) {
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
