package com.clearminds.maquina;
import java.util.ArrayList;
import com.clearminds.componentes.Celda;

public class MaquinaDulces {
	
	private ArrayList<Celda> celdas;
	private double saldo;
	
	//CONSTRUCTOR
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}
	
	//GETTERS SETTERS
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//MÉTODOS
	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}
	
	public void mostrarConfiguracion() {
		String elementoCodigo;
		for(int i = 0; i<celdas.size(); i++) {
			elementoCodigo = celdas.get(i).getCodigo();
			System.out.println("Celda"+(i+1)+": "+elementoCodigo);
		}
	}
	
	public Celda buscarCelda(String codigoC) {
		Celda celdaEncontrada = null;
		Celda celdaPrincipal = null;
		for(int i = 0; i < celdas.size(); i++) {
			celdaPrincipal = celdas.get(i);
			if (codigoC.equals(celdaPrincipal.getCodigo())) {
				celdaEncontrada = celdaPrincipal;
				return celdaPrincipal;
			}
		}
		return celdaEncontrada;
	}
	
}
