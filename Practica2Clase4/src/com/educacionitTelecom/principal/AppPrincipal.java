package com.educacionitTelecom.principal;

public class AppPrincipal {
	public static int x = 10;
	public static Integer y = null;
	public static float total;

	public static void main(String[] args) {
		// EJEMPLO 5*****forzada
		try {
			System.out.println("creamos un objeto blabla");
			throw new ArithmeticException();

		} catch (ArithmeticException e) {
			System.out.println("capturada la excepción forzada");
		} finally {
			System.out.println("Fin del bloque");
		}

		// EJEMPLO 4******
//		int num[] = { 4, 8, 19, 32, 64, 128, 256, 512 };
//		int den[] = { 2, 0, 4, 4, 0, 8 };
//		try {
//			for (int i = 0; i < num.length; i++) {
//				try {
//					System.out.println(num[i] + " / " + den[i] + " = " 
//				+ num[i] / den[i]);
//				} catch (ArithmeticException e) {
//					System.out.println("Capturada 1");
//					System.out.println(e.getMessage());
//					System.out.println("No se puede dividir por cero");
//				} 
//			}	
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Capturada 2");
//			System.out.println(e.getMessage());
//			System.out.println("No se encontró ningún elemento");
//		}finally {
//				System.out.println("Finalizando...");
//			}

		// EJEMPLO 3****
//		int num[] = { 4, 8, 19, 32, 64, 128, 256, 512 };
//		int den[] = { 2, 0, 4, 4, 0, 8 };
//		for (int i = 0; i < num.length; i++) {
//			try {
//				System.out.println(num[i] + " / " + den[i] + " = " 
//			+ num[i] / den[i]);
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("Capturada 1");
//				System.out.println(e.getMessage());
//			} catch (ArithmeticException e) {
//				System.out.println("Capturada 2");
//				System.out.println(e.getMessage());
//			} finally {
//				System.out.println("Finalizando...");
//			}
//		}

		// EJEMPLO 2*****
//		try {
//			System.out.println("Antes....");
//			total = x / y;
//			System.out.println("Despues...");
//		} catch (ArithmeticException e) {
//			System.out.println("Capturada!");
//			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			e.printStackTrace();
//			total=0;
//		} catch(NullPointerException e) {
//			total=1;
//			System.out.println(e.getMessage());
//		}finally {
//			System.out.println("Finalizando el programa...");
//		}

		// EJEMPLO 1***
		// try:lanzar los eventos
		// catch:capturar las excepciones
		// finally: opcional, se ejecuta si o si
		// catch (Exception e)
//		try {
//			int x = 20;
//			int y = 0;
//			float total;
//			System.out.println("Antes....");
//			total = x / y;
//			System.out.println("Despues...");
//		} catch (ArithmeticException e) {
//			System.out.println("Capturada!");
//			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			e.printStackTrace();
//		} finally {
//			System.out.println("Finalizando el programa...");
//		}

	}

}
