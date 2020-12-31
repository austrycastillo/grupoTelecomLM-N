package com.educacionitTelecom.modelos;

import com.educacionitTelecom.interfaces.IPruebita;

public class Primera implements IPruebita{

	@Override
	public void saludar() {
		System.out.println("Hola primera");
	}

	@Override
	public void despedir() {
		System.out.println("Chao primera");		
	}

}
