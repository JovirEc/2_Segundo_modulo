package com.krakede.evaluacion.entidades;

import java.util.Date;

public class HistorialMovimiento {

	private int id;
	private String idProducto;
	private int cantidad;
	private java.util.Date fechaMovimiento;
	
	//Constructores
	public HistorialMovimiento(int id, String idProducto, int cantidad, Date fechaMovimiento) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.fechaMovimiento = fechaMovimiento;
	}
	public HistorialMovimiento() {
		super();
	}
	
	//Getters setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public java.util.Date getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(java.util.Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
	
	
	@Override
	public String toString() {
		return "HistorialMovimiento [id=" + id + ", idProducto=" + idProducto + ", cantidad=" + cantidad
				+ ", fechaMovimiento=" + fechaMovimiento + "]\n";
	}
	
	
	
}
