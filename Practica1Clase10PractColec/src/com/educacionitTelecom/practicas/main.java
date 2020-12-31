package com.educacionitTelecom.practicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		/*
		 * EJERCICIO 1:
		 * 1- crear una lista que contenga los dias de la semana 2- insertar en el
		 * indice 4 al elemento juernes 3- copia esa lista en una nueva lista 4- buscar
		 * si existe el lunes 5- ordenar la lista 6- mostrar los valores con un iterador
		 */
		// 1- crear una lista que contenga los dias de la semana

		List<String> dias = new ArrayList<String>();
		dias.add("lunes");
		dias.add("martes");
		dias.add("miércoles");
		dias.add("jueves");
		dias.add("viernes");
		dias.add("sábado");
		dias.add("domingo");
		// 2- insertar en el indice 4 al elemento juernes
		dias.add(4, "juernes");

		// 3- copia esa lista en una nueva lista
		List copia = new ArrayList(dias);
//		System.out.println(dias);
//		System.out.println(copia);
		// 4- buscar si existe el lunes
		if (dias.contains("lunes")) {
			System.out.println("Si existe el lunes ;)");
		}else {
			System.out.println("No existe el lunes ;(");
		}
		//5- ordenar la lista
		Collections.sort(dias);
		System.out.println(dias);
		//6- mostrar los valores con un iterador
		Iterator it = dias.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
		 EJERCICIO 2:
		 1-crear una clase para manejar varios métodos para
		 armar un conjunto de jugadores de __
		 2- desarrollar el método agregar para insertar los 
		 jugadores
		 3- realizar otro método con un bucle para mostra 
		 a los jugadores
		 4- eliminar todos los jugadores
		 Probar todo desde el main
		 
		 */
		Jugador objeto = new Jugador();
		objeto.mostrarJugadores();
		objeto.agregar();
		objeto.mostrarJugadores();
		objeto.eliminar();
		objeto.mostrarJugadores();
	}

}
