package com.krakedev.composicion;

public class AdminProducto {
	
	//Recbie 2 productos
	//Retorna el de mayor precio
	//Si tienen el mismo precio retornal null
	
	public Producto buscarMasCaro(Producto p1, Producto p2) {
		if (p1.getPrecio()>p2.getPrecio()) {
			return p1;
		}else if(p2.getPrecio()>p1.getPrecio()) {
			return p2;
		}else {
			return null;
		}
	}

}
