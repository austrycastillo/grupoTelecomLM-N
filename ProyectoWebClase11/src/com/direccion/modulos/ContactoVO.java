package com.direccion.modulos;

public class ContactoVO {
	private String nombre;
	private String email;
	private String mensaje;

	public ContactoVO(String nombre, String email, String mensaje) {
		this.nombre = nombre;
		this.email = email;
		this.mensaje = mensaje;
	}

	public ContactoVO() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "ContactoVO [nombre=" + nombre + ", email=" + email + ", mensaje=" + mensaje + "]";
	}

}
