package com.krakedev.test;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;
import com.krakedev.entidades.Random;

//import com.krakedev.entidades.Naipe;

//import com.krakedev.entidades.Carta;
//import com.krakedev.entidades.Numero;
//import com.krakedev.entidades.Palos;

public class AAAPrueba {

	public static void main(String[] args) {
		/*Palos palo = new Palos();
		String corazonN = palo.getCorazonNegro();
		Numero numero1 = new Numero("A",11);
		
		Carta carta1 = new Carta(numero1,corazonN);
		carta1.mostrarInfoCarta();*/
		
		/*Naipe naipe1 = new Naipe();
		naipe1.imprimirPrueba();*/
		
		//System.out.println("Random: "+Random.obtenerPosicion());
		
		//Naipe naipeInicial = new Naipe();
		//naipeInicial.barajar();
		/*ArrayList<Carta> naipeX = new Naipe().barajar(); 
		int cartasBarajadas = naipeX.size();		
		System.out.println("Numero cartas random: "+cartasBarajadas);
		System.out.println("Carta 1: "+naipeX.get(0).getNumero().getNumeroCarta()+"-"+naipeX.get(0).getPalo());
		System.out.println("Carta 52: "+naipeX.get(51).getNumero().getNumeroCarta()+"-"+naipeX.get(51).getPalo());*/
		int variable1 = 2;
		for(int i=0; i<2; i++) {
			int variable2 = i;
			for(int j=0; j<3; j++) {
				System.out.println(variable2);
				variable2 += variable1;
				
			}
		}
		
	}

}
