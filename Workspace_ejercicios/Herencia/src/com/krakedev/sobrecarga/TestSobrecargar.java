package com.krakedev.sobrecarga;

import com.krakedev.herencia.Gato;

public class TestSobrecargar {

	public static void main(String[] args) {
		Gato gatito = new Gato();
		gatito.maullar();
		gatito.maullar("Triste");
	}
}
