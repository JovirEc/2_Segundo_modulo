package com.krakedev.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("clientes")
public class ServicioClientes {
	
	@Path("metodo1")
	@GET
	public String saludar() {
		
		return "Hola mundo REST WEB SERVICES";
	}
}
