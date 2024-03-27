package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Banco {
	ArrayList<Prestamo> prestamos;
	ArrayList<Cliente> clientes;
	//CONSTRUCTOR
	public Banco() {
		prestamos = new ArrayList<Prestamo>();
		clientes = new ArrayList<Cliente>();
	}
	//getters setters
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public Cliente buscarCliente(String cedula) {
		for(Cliente clienteX : clientes) {
			if(cedula.equals(clienteX.getCedula())) {
				return clienteX;
			}
		}
		return null;
	}
	
	public void registrarCliente(Cliente cliente) {
		if(buscarCliente(cliente.getCedula()) == null) {
			clientes.add(cliente);
		}else {
			System.out.println("Cliente ya existe: 1234567890");
		}
	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente clienteX = buscarCliente(cedula);
		if(clienteX == null) {
			System.out.println("No es cliente del Banco");
		}else {
			//clienteX.getPrestamos().add(prestamo);
			prestamos.add(prestamo);
		}
	}
	
	/*public ArrayList<Prestamo> buscarPrestamos(String cedula){
		
		Cliente clienteX = buscarCliente(cedula);
		ArrayList<Prestamo> prestamosCliente = new ArrayList<Prestamo>(); 
		if(clienteX.getPrestamos() != null) {
			for(Prestamo prestamoX : clienteX.getPrestamos()) {
				prestamosCliente.add(prestamoX);
			}
			return prestamosCliente;
		}else {
			return null;
		}
	}*/
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula){
		
		Cliente clienteX = buscarCliente(cedula);
		ArrayList<Prestamo> prestamosCliente = new ArrayList<Prestamo>(); 
		if(prestamos != null) {
			for(Prestamo prestamoX : prestamos) {
				prestamosCliente.add(prestamoX);
			}
			return prestamosCliente;
		}else {
			return null;
		}
	}
	
}
