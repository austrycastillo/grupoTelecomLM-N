package com.educacionitTelecom.AppPrincipal;

import com.educacionitTelecom.modulos.Restaurant;

public class AppPrincipal {

	public static void main(String[] args) {
		/*Restaurant R1 = new Restaurant();
		R1.nombre = "Maria";
		R1.direccion = "Palermo";
		R1.id = 123;
		R1.setNombre("Kentucky");
		R1.setId(123);
		R1.setDireccion("Mendoza");
		R1.mostrar();
		System.out.println(R1.getDireccion());
		Restaurant.saludar();
		*/
		Restaurant R1 = new Restaurant("McDonalds","Jujuy",525);
		R1.mostrar();
	}

}
