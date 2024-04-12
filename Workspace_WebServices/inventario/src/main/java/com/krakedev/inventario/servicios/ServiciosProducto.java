package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProducto {

	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar (Producto producto) {
		System.out.println(producto);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar (Producto producto) {
		System.out.println(producto);
	}
	
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Producto[] recuperarTodos() {	
	//public ArrayList<Producto> recuperarTodos () {
		ArrayList<Producto> productos = new ArrayList<Producto>();

		Categoria categoria1 = new Categoria(01,"Vegetales");
		Categoria categoria2 = new Categoria(02,"Frutas");
		Categoria categoria3 = new Categoria(03,"Carnes");
		
		Producto producto1 = new Producto("0001","Tomate",categoria1,0.50,100);
		Producto producto2 = new Producto("0002","Manzana",categoria2,0.25,50);
		Producto producto3 = new Producto("0003","Lomo de cerdo",categoria3,3.50,20);
		
		productos.add(producto1);
		productos.add(producto2);
		productos.add(producto3);
		
		return new Producto[]{producto1, producto2, producto3};
		//return productos;
	}
}
