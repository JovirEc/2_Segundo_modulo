package com.krakedev.herencia;

public class Cuenta {
	private String numeroCuenta;
	private double saldo;
	//constructor
	public Cuenta(String numeroCuenta, double saldo) {
		super();
		super.toString();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	//getter setters
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//toString
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
	}
	
	
}
