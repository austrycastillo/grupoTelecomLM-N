package com.educacionitTelecom.modelos;

public class Producto {
	private int id;
	private double precio;
	private String descripcion;
	
	public Producto(int id, double precio, String descripcion) {
		
		this.id = id;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	public Producto() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + ", descripcion=" + descripcion + "]";
	}
}
