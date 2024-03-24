package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;

public class Directorio {

	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	
	//CONSTRUCTOR
	public Directorio() {
		contactos = new ArrayList<Contacto>();
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
	
	//METODOS
	public boolean agregarContacto(Contacto contacto) {
		Contacto existeCedula = buscarPorCedula(contacto.getCedula());
		if(existeCedula != null) {
			return false;
		}else {
			contactos.add(contacto);
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
	
}
