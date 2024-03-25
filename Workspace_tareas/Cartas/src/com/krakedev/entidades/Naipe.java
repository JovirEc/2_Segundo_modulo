package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	//CONSTRUCTOR
	public Naipe () {
		numerosPosibles = new ArrayList<Numero>();
		cartas = new ArrayList<Carta>();
		//Agregar a NUMEROSPOSIBLES
		numerosPosibles.add(new Numero("A",11));
		for(int i=2; i < 11; i++) {
			numerosPosibles.add(new Numero(""+i+"",i));
		}
		numerosPosibles.add(new Numero("J",10));
		numerosPosibles.add(new Numero("Q",10));
		numerosPosibles.add(new Numero("K",10));
		//Agregar a CARTAS
		ArrayList<String> palosConjunto = new ArrayList<String>();
		Palos paloClase = new Palos();
		palosConjunto.add(paloClase.getCorazonRojo());
		palosConjunto.add(paloClase.getCorazonNegro());
		palosConjunto.add(paloClase.getDiamante());
		palosConjunto.add(paloClase.getTrebol());

		for(int i=0; i<4;i++) {
			String paloX = palosConjunto.get(i);
			for(int j=0; j<numerosPosibles.size(); j++) {
				cartas.add(new Carta(numerosPosibles.get(j),paloX));
			}
		}
		
	}
	
	//GETTERS SETTERS
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
		
	//METODOS
	public void imprimirPrueba() {															//PRUEBA BORRAR
		//System.out.println(cartas.get(10).mo);
		cartas.get(13).mostrarInfoCarta();
	}
	
}
