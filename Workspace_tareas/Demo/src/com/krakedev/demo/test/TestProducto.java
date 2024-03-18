package com.krakedev.demo.test;

import com.krakedev.demo.Producto;
public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto(25447,"Cepillo");
		producto1.setDescripcion("Utencilio de limpieza");
		producto1.setPeso(1.5);
		
		System.out.println("******Caracteristicas del producto*****");
		System.out.println("Nombre del producto: "+producto1.getNombre());
		System.out.println("Codigo: "+producto1.getCodigo());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Peso: "+producto1.getPeso());

		
	}

}
