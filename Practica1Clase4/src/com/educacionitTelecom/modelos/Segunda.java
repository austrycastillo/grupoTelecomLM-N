package com.educacionitTelecom.modelos;

import com.educacionitTelecom.interfaces.IPruebita;

public class Segunda implements IPruebita{

	@Override
	public void saludar() {
		System.out.println("Hello Segunda");		
	}

	@Override
	public void despedir() {
		System.out.println("Bay Segunda!");		
	}

}
