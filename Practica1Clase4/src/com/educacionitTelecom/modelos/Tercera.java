package com.educacionitTelecom.modelos;

import com.educacionitTelecom.interfaces.IPruebita;

public class Tercera implements IPruebita{

	@Override
	public void saludar() {
		System.out.println("Ciao Tercera");
		
	}

	@Override
	public void despedir() {
		System.out.println("Ciao Tercera");
	}

}
