package com.educacionitTelecom.practicas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Jugador {
	Set<String> jugadores = new HashSet<>();

	public void agregar() {
		jugadores.add("Lionel Messi");
		jugadores.add("Cristiano Ronaldo");
		jugadores.add("Gerard Piqué");
		jugadores.add("Sadió Mané");
		jugadores.add("Armando Maradona");
	}

	public void mostrarJugadores() {
		Iterator it = jugadores.iterator();
		if (it.hasNext() == false) {
			System.out.println("No hay jugadores registrados");
		} else {
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}

	public void eliminar() {
		jugadores.clear();
		System.out.println("Los jugadores fueron eliminados!");

	}

}
