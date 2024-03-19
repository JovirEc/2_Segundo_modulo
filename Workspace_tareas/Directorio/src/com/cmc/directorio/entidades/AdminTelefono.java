package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensajeria(Telefono telf) {
		if(telf.getOperadora()=="Movi") {
			telf.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
		int contador = 0;
		
		if(telf1.getOperadora() == "Movi") {
			contador = contador + 1;
		}
		if(telf2.getOperadora() == "Movi") {
			contador = contador + 1;
		}
		if(telf3.getOperadora() == "Movi") {
			contador = contador + 1;
		}
		
		return contador;
	}

}
