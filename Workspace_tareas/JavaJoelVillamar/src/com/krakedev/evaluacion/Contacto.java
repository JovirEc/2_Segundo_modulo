package com.krakedev.evaluacion;

public class Contacto {

		private String cedula;
		private String nombre;
		private String apellido;
		private Direccion direccion;
		
		//---CONSTRUCTOR
		public Contacto(String cedula, String nombre, String apellido) {
			this.cedula = cedula;
			this.nombre = nombre;
			this.apellido = apellido;
		}
		
		//---GETTERS SETTERS
		public String getCedula() {
			return cedula;
		}
		public void setCedula(String cedula) {
			this.cedula = cedula;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public Direccion getDireccion() {
			return direccion;
		}
		public void setDireccion(Direccion direccion) {
			this.direccion = direccion;
		}
		
		//---METODO
		public void imprimir() {
			String callePrincipal = "";
			String calleSecundaria = "";
			System.out.println("--Información del Contacto--");
			System.out.println("Cedula: "+cedula);
			System.out.println("Nombre: "+nombre);
			System.out.println("Apellido: "+apellido);
			
			if(direccion != null) {
				System.out.println("Dirección: ");
				System.out.println("  Calle Principal:  "+callePrincipal);
				System.out.println("  Calle Secundaria: "+calleSecundaria);
			}else {
				System.out.println("No tiene asociada una dirección.");
			}
			System.out.println("");
		}
		
		
}
