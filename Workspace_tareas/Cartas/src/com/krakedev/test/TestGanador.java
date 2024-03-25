package com.krakedev.test;

import java.util.ArrayList;

import com.krakedev.servicios.Juego;
import com.krakedev.servicios.Jugadores;

public class TestGanador {

    public static void main(String[] args) {

        Jugadores jugadores = new Jugadores();
        ArrayList<String> listaJugadores = new ArrayList<>();
        listaJugadores.add("jugador 1");
        listaJugadores.add("jugador 2");
        listaJugadores.add("jugador 3");
        jugadores.setJugadores(listaJugadores);

        Juego juego = new Juego(jugadores.getJugadores());
        juego.entregarCartas(5);//entrega las 5 cartas a cada jugador dentro del mismo método. y las guarda en 3 array

        for (int i = 0; i < jugadores.getJugadores().size(); i++) {
            int total = juego.devolverTotal(i); //devuevle la suma de sus cartas
            System.out.println("Total del jugador " + (i + 1) + ": " + total);
        }

        String ganador = juego.determinarGanador();
        System.out.println("El ganador es: " + ganador);
    }
}
