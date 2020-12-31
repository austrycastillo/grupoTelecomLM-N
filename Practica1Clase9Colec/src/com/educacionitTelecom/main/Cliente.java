package com.educacionitTelecom.main;

public class Cliente implements Comparable<Cliente>{
	private int id;
	private String nombre;
	public Cliente(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	public Cliente() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + "]";
	}
	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}
	
	
}
