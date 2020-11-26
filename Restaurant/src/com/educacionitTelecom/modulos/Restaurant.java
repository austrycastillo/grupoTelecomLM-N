package com.educacionitTelecom.modulos;

public class Restaurant {
//atributos: características, variables
	private String nombre;
	private String direccion;
	private int id;

//métodos: operaciones, funciones
	public Restaurant(String nombre, String direccion, int id) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.id = id;
	}

	public void mostrar() {
		System.out.println("Estoy en mi método mostrar");
		System.out.println("Restaurant " + nombre);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public int getId() {
		return this.id;
	}

	public static void saludar() {
		System.out.println("Holaaaaa");
	}
}
