package com.krakedev.servicios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugador;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<String> jugadores;
	//getters setters
	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}
	//Constructor
	public Juego (ArrayList<String> idJugadores) {
		cartasJugador = new ArrayList<ArrayList<Carta>>();
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();
		jugadores = new ArrayList<String>();
		
		jugadores = idJugadores;
		
	}
	
	public void entregarCartas (int cartasPorJugador) {
		int cantidadJugadores = jugadores.size();
		
		for (int i = 0; i < cantidadJugadores; i++) {
			ArrayList<Carta> mazoJugadorX = new ArrayList<Carta>();
			cartasJugador.add(mazoJugadorX);
		}
		
		for (int i = 0; i < cantidadJugadores; i++) {
			ArrayList<Carta> cartasJugadorX = cartasJugador.get(i);
			int contador = i;
			for(int j=0; j < cartasPorJugador; j++) {
				cartasJugadorX.add(naipeBarajado.get(contador));
				contador += cantidadJugadores;
			}	
		}


	}
	
	public int devolverTotal(int idJugador) {
		ArrayList<Carta> jugadorX = cartasJugador.get(idJugador);
		int suma = 0;
		
		for(int i=0; i< jugadorX.size(); i++) {
			int puntuacionCartaX = jugadorX.get(i).getNumero().getValor();
			suma += puntuacionCartaX;
		}
		return suma;
	}
	
	public String determinarGanador() {
		/*String jugador1 = "jugador 1";
		String jugador2 = "jugador 2";
		String jugador3 = "jugador 3";*/
		int jugadorGanador = 0;
		int puntosGanador = 0;
		for(int i=0; i < cartasJugador.size(); i++) {
			int puntosJugadorX = devolverTotal(i);
			if (puntosJugadorX > puntosGanador) {
				puntosGanador = puntosJugadorX;
				jugadorGanador = i;
			}
		}
		return "jugador "+(jugadorGanador+1);
	}
	
}
