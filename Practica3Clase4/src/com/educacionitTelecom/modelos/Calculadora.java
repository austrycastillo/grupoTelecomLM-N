package com.educacionitTelecom.modelos;

public class Calculadora {
	public int dividir(int x,int y) throws DivisionEnCeroException{
		if(y==0) {
			throw new DivisionEnCeroException();
		}
		return x/y;
	}
}
