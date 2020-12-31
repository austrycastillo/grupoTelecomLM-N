package com.educacionitTelecom.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		// Colección <tipoDatos> identificador = new Implementación <tipoDatos>();
//		Set <String> hashset = new HashSet<String>();
//		hashset.add("uno");
//		hashset.add("cuatro");
//		hashset.add("dos");
//		hashset.add("tres");
//		hashset.add("tres");
//		System.out.println("Está vacío? " + hashset.isEmpty());
//		System.out.println("El tamaño es: " + hashset.size());
//		System.out.println(hashset);
//		hashset.remove("uno");
//		System.out.println("El tamaño es: " + hashset.size());
//		System.out.println(hashset);

		// HashSet
//		Set hashset = new HashSet();
//		long inicioHashSet = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//			hashset.add(i);
//		}
//		long finHashSet = System.currentTimeMillis();
//		System.out.println("Tiempo del Hashset: " + (finHashSet - inicioHashSet));
//		// TreeSet
//		Set treeset = new TreeSet();
//		long inicioTreeSet = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//			treeset.add(i);
//		}
//		long finTreeSet = System.currentTimeMillis();
//		System.out.println("Tiempo del Treeset: " + (finTreeSet - inicioTreeSet));
//		// LinkedHashSet
//		Set linkedhashset = new LinkedHashSet();
//		long inicioLinkedHashSet = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//			linkedhashset.add(i);
//		}
//		long finLinkedHashSet = System.currentTimeMillis();
//		System.out.println("Tiempo del LinkedHashSet: " + (finLinkedHashSet - inicioLinkedHashSet));

		// Set instanciando a la clase Personas
//		Persona Sam = new Persona("Samuel", "Contreras", 12);
//		Persona Ful = new Persona("Fulano", "De Tal", 100);
//		Persona Cle = new Persona("Cleopatra", "Ni idea", 800);
//		Persona Juan = new Persona("Juan", "Perez", 40);
//		Set <Persona> datos = new HashSet<Persona>();
//		datos.add(Sam);
//		datos.add(Ful);
//		datos.add(Cle);
//		datos.add(Juan);
//		System.out.println(datos.size());
//		System.out.println(datos);
//		Iterator it = datos.iterator();
//		while(it.hasNext()) {
//			Persona valor = (Persona) it.next();
//			System.out.println(valor.getNombre());
//		}
		//***********CHEQUEAR********
//		Persona Sam = new Persona("Samuel", "Contreras", 12);
//		Persona Ful = new Persona("Fulano", "De Tal", 100);
//		Set  treeset = new TreeSet();
//		treeset.add(Sam);
//		treeset.add(Ful);
//		
//		System.out.println(treeset.size());
//		System.out.println(treeset);
		
//		List miLista = new ArrayList<>();
//		Object obj1 = new Object();
//		Object obj2 = new Object();
//		Object obj3 = new Object();
//		miLista.add(obj1);
//		miLista.add(obj2);
//		miLista.add(obj3);
//		miLista.add(obj1);
//		miLista.add(obj2);
//		miLista.add(obj3);
//		System.out.println("La lista está vacía ? " + miLista.isEmpty());
//		System.out.println("Cuántos elementos tiene? " + miLista.size());
//		
//		List miLista2 = new LinkedList<>();
//		miLista2.add("uno");
//		miLista2.add("dos");
//		miLista2.add("tres");
//		System.out.println("La lista 2 está vacía ? " + miLista2.isEmpty());
//		System.out.println("Cuántos elementos tiene la lista 2? " 
//		+ miLista2.size());
		
		//GENERICOS
//		List nombre = new ArrayList();
//		nombre.add("Luna");
//		nombre.add(5);
//		String pila = (String) nombre.get(0);
//		System.out.println(pila);
//		
//		List <String> apellido = new ArrayList<String>();
//		apellido.add("Perez");
//		apellido.add("Cordoba");
//		System.out.println(apellido.get(0));
		
		//colas
//		Queue person = new LinkedList<>();
//		person.add("Amalia");
//		person.add("Pedro");
//		person.offer("Caro");
//		person.offer("Melina");
//		System.out.println(person.contains("Melina"));
//		try {
//			System.out.println("Elimina a " + person.remove());
//		}catch(NoSuchElementException e) {
//			System.out.println("No existen elementos");
//		}
//		System.out.println(person.peek());
//		System.out.println("Elimina " + person.poll());
//		System.out.println(person);
		
//		Queue <Integer> cola = new PriorityQueue<Integer>();
//		cola.add(70);
//		cola.add(2);
//		cola.add(120);
//		while(!cola.isEmpty()) {
//			System.out.println(cola.poll());
//		}
		
		//mapas
		//HashMap
//		Map<Integer,String> mapa = new HashMap<Integer,String>();
//		mapa.put(1, "uno");
//		mapa.put(2, "dos");
//		mapa.put(3, "tres");
//		mapa.put(4, "cuatro");
//		mapa.put(5, "cinco");
//		mapa.put(6, "seis");
//		System.out.println(mapa);
//		Iterator it = mapa.keySet().iterator();
//		while(it.hasNext()) {
//			Integer key = (Integer) it.next();
//			System.out.println("Clave: " + key + " -> Valor: " + mapa.get(key));
//		}
		
		//TreeMap
//		Map<Integer,String> mapa2 = new TreeMap<Integer,String>();
//		mapa2.put(6, "uno");
//		mapa2.put(2, "dos");
//		mapa2.put(3, "tres");
//		mapa2.put(4, "cuatro");
//		mapa2.put(5, "cinco");
//		mapa2.put(1, "seis");
//		System.out.println(mapa2);
//		Iterator it2 = mapa2.keySet().iterator();
//		while(it2.hasNext()) {
//			Integer key = (Integer) it2.next();
//			System.out.println("Clave: " + key + " -> Valor: " + mapa2.get(key));
//		}
		
		//LinkedHashMap
//		Map<Integer,String> mapa3 = new LinkedHashMap<Integer,String>();
//		mapa3.put(6, "uno");
//		mapa3.put(2, "dos");
//		mapa3.put(3, "tres");
//		mapa3.put(4, "cuatro");
//		mapa3.put(5, "cinco");
//		mapa3.put(1, "seis");
//		System.out.println(mapa3);
//		Iterator it3 = mapa3.keySet().iterator();
//		while(it3.hasNext()) {
//			Integer key = (Integer) it3.next();
//			System.out.println("Clave: " + key + " -> Valor: " + mapa3.get(key));
//		}
//		
		
		
//		List<String> nombres = Arrays.asList("Juan","Ana","Diego","Carlos");
//		System.out.println("Lista original " + nombres);
//		
//		Collections.sort(nombres);
//		System.out.println("Lista con sort " + nombres);
		
		Set<Cliente> obj = new TreeSet<>();
		obj.add(new Cliente(1,"Shakira"));
		obj.add(new Cliente(2,"Charly García"));
		obj.add(new Cliente(3,"Pol Granch"));
		System.out.println(obj);
		
		
		
		
		
		
		

	}

}
