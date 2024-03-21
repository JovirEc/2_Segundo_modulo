package com.clearminds.maquina;
import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

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
	
	public void cargarProducto(Producto producto, String codigoC, int numItems) {
		Celda celdaRecuperada = buscarCelda(codigoC);
		celdaRecuperada.ingresarProducto(producto, numItems);
	}
	
	public void mostrarProductos() {
		Celda celdaX;
		for(int i = 0; i<celdas.size(); i++) {
			celdaX = celdas.get(i);
			System.out.println("");
			System.out.print("Celda:"+celdaX.getCodigo());
			if(celdaX.getStock() != 0) {
				System.out.print(" Stock:"+celdaX.getStock()+
						" Producto:"+celdaX.getProducto().getCodigo()+
						" Precio:"+celdaX.getProducto().getPrecio());
			}else {
				System.out.print(" Sin Producto asignado");
			}				
		}
	}
	
	
	public Producto buscarProductoEnCelda(String codigoC) {
		Celda elementoCelda = buscarCelda(codigoC);
		Producto productoEncontrado = null;
		if (elementoCelda != null) {
			productoEncontrado = elementoCelda.getProducto();
			return productoEncontrado;
		}
		return productoEncontrado;
	}
	
	public double consultarPrecio(String codigoC) {
		Celda elementoCelda = buscarCelda(codigoC);
		return elementoCelda.getProducto().getPrecio();
	}

}
