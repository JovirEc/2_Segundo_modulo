package com.krakedev.entidades;

public class Numero {
	private String numeroCarta;
	private int valor;
	//CONSTRUCTOR
	public Numero(String numeroCarta, int valor) {
		this.numeroCarta = numeroCarta;
		this.valor = valor;
	}
	//GETSETTERS
	public String getNumeroCarta() {
		return numeroCarta;
	}
	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	//MÉTODOS
	public void mostrarInfoNumero() {
		System.out.println(numeroCarta+"-"+valor);
	}
}
