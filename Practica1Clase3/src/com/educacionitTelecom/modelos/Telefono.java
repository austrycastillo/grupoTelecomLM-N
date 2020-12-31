package com.educacionitTelecom.modelos;

public class Telefono {
	private int id;
	private String tipo;
	private String numero;
	
	public Telefono(int id, String tipo, String numero) {
		
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
	}
	public Telefono() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Telefono [id=" + id + ", tipo=" + tipo + ", numero=" + numero + "]";
	}
}
