package com.educacionitTelecom.principal;

import com.educacionitTelecom.modelos.Cliente;
import com.educacionitTelecom.modelos.Domicilio;
import com.educacionitTelecom.modelos.Producto;
import com.educacionitTelecom.modelos.Telefono;

public class AppPrincipal {

	public static void main(String[] args) {
		Telefono telefono = new Telefono(1, "Hogar", "4952-5814");
		Telefono telefono2=new Telefono(2,"Laboral","8569-1232");
		Domicilio domicilio = new Domicilio(2, "Rivadavia", "CABA", 25);
		Cliente cliente = new Cliente(891, "Juan", "Mendez", telefono, domicilio, 25);
		Cliente cliente2=new Cliente(523,"ANA","castellano",telefono2,domicilio,65);
		Producto producto = new Producto(85, 250.90, "pizza de peperoni con morrón");
		System.out.println(cliente);
		System.out.println(producto);
		System.out.println(cliente2);
		System.out.println(cliente2.getNombreCompleto());
		/*
		 ARMAR: clase superclase () que tenga 3 hijas, 
		 utilicen constructores, setters, getters, toString,
		 atributos de clase(otras clases)
		 */
		
	}

}
