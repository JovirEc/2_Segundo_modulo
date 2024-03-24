package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {

	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private String ultimaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	
	//CONSTRUCTOR
	public Directorio() {
		contactos = new ArrayList<Contacto>();
		fechaModificacion = new Date();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
	}
	
	//GETTERS SETTERS
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}
	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}
	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}
	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	
	//METODOS
	public boolean agregarContacto(Contacto contacto) {
		Contacto existeCedula = buscarPorCedula(contacto.getCedula());
		if(existeCedula != null) {
			return false;
		}else {
			contactos.add(contacto);
			Date fechaActual = new Date();
			SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
			String fechaFormateada = formatoFecha.format(fechaActual);
			ultimaModificacion = fechaFormateada;
			return true;
		}
	}
	
	public Contacto buscarPorCedula(String cedula) {
		String cedulaX;
		for(Contacto contacto : contactos) {
			cedulaX = contacto.getCedula();
			if(cedula.equals(cedulaX)) {
				return contacto;
			}
		}
		return null;
	}
	
	public String consultarUltimaModificacion() {
		return ultimaModificacion;
	}
	
	public int contarPerdidos(){
		int cantidadSinDir = 0;
		
		for(Contacto contacto : contactos) {
			if(contacto.getDireccion() == null) {
				cantidadSinDir += 1;
			}
		}
		return cantidadSinDir;
	}
	
	public int contarFijos() {
		int cantidadConvencional = 0;
		
		for(Contacto contacto : contactos) {
			boolean hayConvencional = false;
			
			ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
			telefonos = contacto.getTelefonos();
			
			for(Telefono telefono : telefonos) {
				if("Convencional".equals(telefono.getTipo()) && "C".equals(telefono.getEstado())) {
					hayConvencional = true;
				}
			}
			if(hayConvencional == true) {
				cantidadConvencional += 1;
			}
		}
		return cantidadConvencional;
	}

	public void depurar() {
		for(Contacto contacto : contactos) {
			if(contacto.getDireccion() != null) {
				correctos.add(contacto);	
			}else {
				incorrectos.add(contacto);
			}
		}
		contactos.clear();
	}
}
