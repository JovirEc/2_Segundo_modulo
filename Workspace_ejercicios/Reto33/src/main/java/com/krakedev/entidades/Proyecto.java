package com.krakedev.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Proyecto {

	private int id;
	private String proyecto;
	private BigDecimal monto;
	private Date fechaInicio;
	private Date fechaEntrega;
	
	//CONSTRUCTORS
	public Proyecto() {
		super();
	}
	public Proyecto(int id, String proyecto, BigDecimal monto, Date fechaInicio, Date fechaEntrega) {
		super();
		this.id = id;
		this.proyecto = proyecto;
		this.monto = monto;
		this.fechaInicio = fechaInicio;
		this.fechaEntrega = fechaEntrega;
	}
	
	//GETTERS SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public Date getFecha_inicio() {
		return fechaInicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fechaInicio = fecha_inicio;
	}
	public Date getFecha_entrega() {
		return fechaEntrega;
	}
	public void setFecha_entrega(Date fecha_entrega) {
		this.fechaEntrega = fecha_entrega;
	}
	
	
	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", proyecto=" + proyecto + ", monto=" + monto + ", fechaInicio=" + fechaInicio
				+ ", fechaEntrega=" + fechaEntrega + "]";
	}
}
