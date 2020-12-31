package com.educacionitTelecom.practicasExcep;

import java.io.IOException;

public class AppPruebas {
	private static int metodo() {
		int valor = 0;
		try {
			valor = valor + 1;// valor++;
			valor = valor + Integer.parseInt("W");
			valor++;// valor=valor+1;
			System.out.println("El valor final de mi try es " + valor);
			// 44
			throw new IOException();
		} catch (IOException e) {
			valor = valor + Integer.parseInt("42");
			System.out.println("El valor final de mi catch es " + valor);
			// 43
		}catch (Exception e) {
			valor = valor + Integer.parseInt("42");
			System.out.println("El valor final de mi catch es " + valor);
			// 43
		} finally {
			valor = valor + 1;
			System.out.println("El valor final de mi finally es " + valor);
			// si todo sale bien 45
			// si se dispara una exception 2, 44 ??
		}
		valor++;
		System.out.println("El valor final " + valor);
		return valor;
	}

	public static void main(String[] args) {
		try {
			System.out.println(metodo());
		} catch (Exception e) {
			System.out.println("Exception dentro del main");
			e.printStackTrace();
		}
	}

}
