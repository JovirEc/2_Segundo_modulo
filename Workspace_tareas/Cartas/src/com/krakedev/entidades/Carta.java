package com.krakedev.entidades;

public class Carta {
	private Numero numero;
	private String palo;
	
	//CONSTRUCTOR
	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	//GETSETTERS
	public Numero getNumero() {
		return numero;
	}
	public void setNumero(Numero numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	//MÉTODOS
	public void mostrarInfoCarta() {
		System.out.println(numero.getNumeroCarta()+"-"+palo);
	}
	
	
}
