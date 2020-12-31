package com.educacionitTelecom.principal;

import com.educacionitTelecom.modelos.Primera;
import com.educacionitTelecom.modelos.Segunda;
import com.educacionitTelecom.modelos.Tercera;

public class AppPrincipal {

	public static void main(String[] args) {
		Primera obj1 = new Primera();
		obj1.saludar();
		obj1.despedir();
		Segunda obj2 = new Segunda();
		obj2.saludar();
		obj2.despedir();
		Tercera obj3 = new Tercera();
		obj3.saludar();
		obj3.despedir();
	}

}
