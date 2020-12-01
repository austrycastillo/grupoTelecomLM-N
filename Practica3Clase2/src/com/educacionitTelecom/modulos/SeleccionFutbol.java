package com.educacionitTelecom.modulos;

public class SeleccionFutbol {
	protected Integer id;
	protected String nombre;
	protected String apellido;
	protected Integer edad;

	public SeleccionFutbol(Integer id, String nombre, String apellido, Integer edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public SeleccionFutbol() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void concentrarse() {
		System.out.println("Estoy concentrado");
	}

	public void viajar() {
		System.out.println("Estoy en un viaje de trabajo");
	}
}
