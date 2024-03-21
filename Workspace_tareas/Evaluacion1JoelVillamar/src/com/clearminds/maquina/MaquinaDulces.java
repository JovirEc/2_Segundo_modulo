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
			if(celdaX.getStock() != 0) {
				System.out.println("Celda:"+celdaX.getCodigo()+
						" Stock:"+celdaX.getStock()+
						" Producto:"+celdaX.getProducto().getNombre()+
						" Precio:"+celdaX.getProducto().getPrecio());
			}else {
				System.out.println("Celda:"+celdaX.getCodigo()+
						" Stock:"+celdaX.getStock()+
						" Sin Producto asignado");
			}				
		}
		System.out.println("");
		System.out.println("Saldo: "+saldo);
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

	public Celda buscarCeldaProducto(String codigoP) {
		Celda celdaElemento = null;
		Celda celdaX;
		String productoX;
		for (int i = 0; i < celdas.size(); i++) {
			celdaX = celdas.get(i);
			if(celdaX.getProducto() != null) {
				productoX = celdaX.getProducto().getCodigo();
				if(codigoP.equals(productoX)) {
					celdaElemento = celdaX;
					return celdaElemento;
				}
			}
			
		}
		return celdaElemento; 
	}
	
	public void incrementarProductos(String codigoC, int numItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoC);
		celdaEncontrada.setStock(numItems);
	}
	
	public void vender(String codigoC) {
		Celda celdaX = buscarCelda(codigoC);
		double precioX;
		
		celdaX.setStock(celdaX.getStock()-1);
		precioX = celdaX.getProducto().getPrecio();
		saldo = saldo + precioX;
	}
	
	public double venderConCambio(String codigoC, double billete) {
		Celda celdaX = buscarCelda(codigoC);
		double precioX = celdaX.getProducto().getPrecio();
		double vuelto;
		
		celdaX.setStock(celdaX.getStock()-1);
		saldo += precioX;
		vuelto = billete - saldo;
		
		return vuelto;
	}
}