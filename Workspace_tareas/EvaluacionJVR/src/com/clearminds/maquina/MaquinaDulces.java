package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
//asdasd
	Celda celda1 = new Celda("");
	Celda celda2 = new Celda("");
	Celda celda3 = new Celda("");
	Celda celda4 = new Celda("");
	/*private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;*/
	private double saldo;
//METODOS
	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		celda1.setCodigo(cod1);
		celda2.setCodigo(cod2);
		celda3.setCodigo(cod3);
		celda4.setCodigo(cod4);
	}
	
	public void mostrarConfiguracion () {
		System.out.println("CELDA #1: "+celda1.getCodigo());
		System.out.println("CELDA #2: "+celda2.getCodigo());
		System.out.println("CELDA #3: "+celda3.getCodigo());
		System.out.println("CELDA #4: "+celda4.getCodigo());
	}
	
	public Celda buscarCelda (String cod) {
		if(celda1.getCodigo() == cod) {
			return celda1;
		}else if(celda2.getCodigo() == cod){
			return celda2;
		}else if(celda3.getCodigo() == cod) {
			return celda3;
		}else if(celda4.getCodigo() == cod) {
			return celda4;
		}else {
			return null;
		}
	}
	
	public void cargarProducto (Producto prod, String cod, int stk) {
		Celda celdaRecuperada = buscarCelda(cod);
		celdaRecuperada.ingresarProducto(prod, stk);
	}
	
	public void mostrarProductos () {
		System.out.println("----"+celda1.getProducto().getNombre()+"----");
		System.out.println("Código: "+celda1.getCodigo());
		System.out.println("Stock: "+celda1.getStock());
		System.out.println("Precio: "+celda1.getProducto().getPrecio());
		System.out.println("");
		System.out.println("--------------");
		System.out.println("Saldo: "+saldo);
	}
	
	public Producto buscarProductoEnCelda (String cod) {
		
		Celda celdaEncontrada = buscarCelda(cod);
		if(celdaEncontrada != null) {
			return celdaEncontrada.getProducto();
		}else {
			return null;
		}
	}
	
	public double consultarPrecio (String cod) {
		Celda celdaEncontrada = buscarCelda(cod);
		return celdaEncontrada.getProducto().getPrecio();
	}
	
	public Celda buscarCeldaProducto (String codP) {
		if(celda1.getProducto().getCodigo() == codP) {
			return celda1;
		}else if(celda2.getProducto().getCodigo() == codP) {
			return celda2;
		}else if(celda3.getProducto().getCodigo() == codP) {
			return celda3;
		}else if(celda4.getProducto().getCodigo() == codP) {
			return celda4;
		}else {
			return null;
		}
	}
	
	public void incrementarProductos (String codP, int cantItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codP);
		celdaEncontrada.setStock(cantItems);
	}
	
	public void vender (String cod) {
		Celda celdaEncontrada = buscarCelda(cod);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		
	}
	
	public double venderConCambio (String cod, double valorIngresado) {
		Celda celdaEncontrada = buscarCelda(cod);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		double vuelto = valorIngresado - celdaEncontrada.getProducto().getPrecio();
		return vuelto;
	}

}
