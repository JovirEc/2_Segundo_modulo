package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;
public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto("LAPIZ",0.50);
		Producto producto2 = new Producto("BORRADOR",0.25);
		
		producto2.setPrecio(-0.30);

		System.out.println("Su producto "+producto1.getNombre()+" con un valor de $"+producto1.getPrecio()+" esta a un precio promocional de: $"+producto1.calcularPrecioPromo(15));
		System.out.println("Su producto "+producto2.getNombre()+" con un valor de $"+producto2.getPrecio()+" esta a un precio promocional de: $"+producto2.calcularPrecioPromo(15));
		
	}

}
