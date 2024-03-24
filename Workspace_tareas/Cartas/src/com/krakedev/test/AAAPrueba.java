package com.krakedev.test;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Numero;

public class AAAPrueba {

	public static void main(String[] args) {
		Numero numero1 = new Numero("A",11);
		Carta carta1 = new Carta(numero1,"CR");
		carta1.mostrarInfoCarta();
	}

}
