package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		Producto productoX;
		
		maquina.agregarCelda(new Celda("A"));
		maquina.agregarCelda(new Celda("B"));
		maquina.agregarCelda(new Celda("C"));
		maquina.agregarCelda(new Celda("D"));
		maquina.agregarCelda(new Celda("E"));
		
		Producto producto1 = new Producto("P1","Papitas",0.85);
		maquina.cargarProducto(producto1, "A", 5);
		Producto producto2 = new Producto("P2","Doritos",0.5);
		maquina.cargarProducto(producto2, "B", 3);
		Producto producto3 = new Producto("P3","Jet",0.25);
		maquina.cargarProducto(producto3, "C", 7);
		Producto producto4 = new Producto("P4","Detodito",0.6);
		maquina.cargarProducto(producto4, "D", 2);
		Producto producto5 = new Producto("P5","Pan",1.5);
		maquina.cargarProducto(producto5, "E", 8);
		
		
		ArrayList<Producto> listadoMenores = maquina.buscarMenores(0.9);
		System.out.println("Productos Menores: "+listadoMenores.size());
		
		//Producto productoX;
		for(int i = 0; i < listadoMenores.size(); i++) {
			productoX = listadoMenores.get(i);
			System.out.println("Nombre: "+productoX.getNombre()+" Precio:"+productoX.getPrecio());
		}
		
	}

}
