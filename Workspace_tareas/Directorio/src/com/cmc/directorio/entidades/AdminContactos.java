package com.cmc.directorio.entidades;

public class AdminContactos {
	
	public Contacto buscarMasPesado(Contacto cont1, Contacto cont2) {
		if (cont1.getPeso() > cont2.getPeso()) {
			return cont1;
		}else {
			return cont2;
		}
		
	}
	
	public boolean compararOperadoras(Contacto cont1, Contacto cont2) {
		Telefono telf1 = cont1.getTelefono();
		Telefono telf2 = cont2.getTelefono();
		if (telf1.getOperadora() == telf2.getOperadora()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void activarUsuario(Contacto cont1) {
		Telefono telf1 = cont1.getTelefono();
		if(telf1.isTieneWhatsapp() == true) {
			cont1.setActivo(true);
		}
	}
	
	
}
