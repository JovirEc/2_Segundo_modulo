package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;
public class TestItems {

	public static void main(String[] args) {
		Item item1 = new Item();
		Item item2 = new Item();
		
		//OBJETO 1
		item1.setNombre("Laptop");
		item1.setProductosActuales(20);
		item1.imprimir();
		
		item1.vender(5);
		item1.devolver(2);
		item1.imprimir();
		
		
		//OBJETO 2
		item2.setNombre("Celular");
		item2.setProductosActuales(40);
		item2.imprimir();
		
		item2.vender(8);
		item2.devolver(4);
		item2.imprimir();
		
	}

}
