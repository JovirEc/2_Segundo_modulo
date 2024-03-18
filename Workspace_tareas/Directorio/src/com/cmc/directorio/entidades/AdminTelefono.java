package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensajeria(Telefono telf) {
		if(telf.getOperadora()=="Movi") {
			telf.setTieneWhatsapp(true);
		}
	}

}
