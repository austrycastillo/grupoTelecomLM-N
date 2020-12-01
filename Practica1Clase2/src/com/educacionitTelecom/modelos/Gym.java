package com.educacionitTelecom.modelos;

public class Gym {
	// atributos
	private String nombre;
	private String direccion;
	private String horarios;
	private int cantidadSocios;

	public Gym(String nombre, String direccion, String horarios, int cantidadSocios) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.horarios = horarios;
		this.cantidadSocios = cantidadSocios;
	}
	public Gym() {
		
	}
	public Gym(String nombre) {
		this.nombre = nombre;
		
	}
	public Gym(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public Gym(String nombre, String direccion, String horarios) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.horarios = horarios;
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHorarios() {
		return horarios;
	}

	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}

	public int getCantidadSocios() {
		return cantidadSocios;
	}

	public void setCantidadSocios(int cantidadSocios) {
		this.cantidadSocios = cantidadSocios;
	}

	// métodos
	public void mostrar() {
		System.out.println("Estoy mostrando los datos del gym");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Dirección: " + this.direccion);
		System.out.println("Horarios: " + this.horarios);
		System.out.println("Cantidad de socios: " + this.cantidadSocios);
	}

}
