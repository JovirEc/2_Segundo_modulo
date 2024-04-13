package com.krakedev.evaluacion.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.persistencia.HistorialBDD;

@Path("funciones")
public class ServiciosCategoria {

	@Path("probarInsertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Categoria categoriaIns) {
		HistorialBDD his = new HistorialBDD();		
		try {
			his.insertar(categoriaIns);
			return Response.ok().build();
			
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("probarActualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(Categoria categoriaIns) {
		System.out.println("CATE>>><"+categoriaIns);
		HistorialBDD his = new HistorialBDD();		
		try {
			his.actualizar(categoriaIns);
			return Response.ok().build();
			
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("probarBuscar/{idParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorId(@PathParam("idParam") String idBuscar) {
		HistorialBDD his = new HistorialBDD();
		Categoria categoria = null;
		try {
			System.out.println("<<<<Encontró id<<<<");
			categoria = his.buscarPorId(idBuscar);
			return Response.ok(categoria).build();
			
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	
}
