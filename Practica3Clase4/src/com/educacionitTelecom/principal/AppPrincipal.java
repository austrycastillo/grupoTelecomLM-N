package com.educacionitTelecom.principal;

import com.educacionitTelecom.modelos.Calculadora;
import com.educacionitTelecom.modelos.DivisionEnCeroException;

public class AppPrincipal {

	public static void main(String[] args) {
		int N1 = 10;
		int N2 = 0;
		Calculadora N3 = new Calculadora();
		try {
			N3.dividir(N1, N2);
		} catch (DivisionEnCeroException e) {
			System.out.println("Capturada");
			e.printStackTrace();
		}
	}

}
