package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado = "E";
	
	//getters setters
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	
	public Telefono (String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		
		if(numero != null && tipo != null) {
			if("Movil".equals(tipo)) {
				if(numero.length() == 10) {
					estado = "C";
				}
			}else if("Convencional".equals(tipo)){
				if(numero.length() == 7) {
					estado = "C";
				}
			}
		}
	}
	
	
	
	
}
