package com.educacionitTelecom.AppPrincipal;

import com.educacionitTelecom.modelos.Gym;

public class AppPrincipal {

	public static void main(String[] args) {
		/*
		 * Gym obj1=new Gym(); obj1.nombre="Megatlon"; obj1.direccion="Av. Las Heras";
		 * obj1.cantidadSocios=20; obj1.horarios="desde las 10 a las 20 horas";
		 */
		Gym obj2 = new Gym();
		obj2.setCantidadSocios(100);
		obj2.setDireccion("Tigre");
		obj2.setNombre("El Gym de la Costa");
		obj2.setHorarios("24 horas");
		obj2.mostrar();

		Gym obj3 = new Gym("Gym acción", "Jujuy", "de 14 a 16 horas", 20);

	}

}
