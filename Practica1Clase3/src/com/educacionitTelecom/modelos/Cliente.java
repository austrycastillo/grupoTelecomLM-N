package com.educacionitTelecom.modelos;

public class Cliente extends Persona{
	private int numeroCliente;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nombre, String apellido, Telefono telefono, Domicilio domicilio, int numeroCliente) {
		super(id, nombre, apellido, telefono, domicilio);
		// TODO Auto-generated constructor stub
		setNumeroCliente(numeroCliente);
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	@Override
	public String toString() {
		
		return "Cliente [numeroCliente=" + numeroCliente + ", id=" + id + ", nombre=" + nombre + ", apellido="
				+ apellido + ", telefono=" + telefono + ", domicilio=" + domicilio + "]";
	}
}
