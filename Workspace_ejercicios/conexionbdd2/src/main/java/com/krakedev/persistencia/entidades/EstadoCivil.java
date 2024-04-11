package com.krakedev.persistencia.entidades;

public class EstadoCivil {

		private String codigo;
		private String descripcion;
		
		
//Constructor
		public EstadoCivil() {
		}
		public EstadoCivil(String codigo, String descripcion) {
			super();
			this.codigo = codigo;
			this.descripcion = descripcion;
		}
//getter setters
		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
//toString
		@Override
		public String toString() {
			return "EstadoCivil [codigo=" + codigo + ", descripcion=" + descripcion + "]";
		}
}

