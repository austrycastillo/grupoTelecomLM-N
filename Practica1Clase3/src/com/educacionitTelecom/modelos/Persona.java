package com.educacionitTelecom.modelos;

abstract public class Persona {
	protected int id;
	protected String nombre;
	protected String apellido;
	protected Telefono telefono;
	protected Domicilio domicilio;

	public Persona(int id, String nombre, String apellido, Telefono telefono, Domicilio domicilio) {
		setId(id);
		setNombre(nombre);
		setApellido(apellido);
		setTelefono(telefono);
		setDomicilio(domicilio);

	}

	public Persona() {
	}

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public String getNombreCompleto() {
		return this.nombre.substring(0, 1).toUpperCase() + this.nombre.substring(1).toLowerCase()
				+ ", " + this.apellido.substring(0, 1).toUpperCase() + this.apellido.substring(1).toLowerCase(); 

	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", domicilio=" + domicilio + "]";
	}

}
