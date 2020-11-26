package com.educacionitTelecom.modulos;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		/*
		 * variables: int, char, float,double, String,boolean,byte,long
		 */
		int num = 10;
		/*
		 * operadores: +*-/ % = += -= ++ -- > >= < <= == != && || !
		 * 
		 * int []num2=new int[10]; num2[0]=26; num2[1]=500; int []num3= {1,2,3};
		 * 
		 * if(num4<5) { System.out.println(num4); }else {
		 * System.out.println("no es menor"); }
		 * 
		 * boolean resp = num4<5 ? true : false; int num4=2; switch(num4) { case 1:
		 * System.out.println("El número es 1"); break; case 2:
		 * System.out.println("El número es 2"); break; case 3:
		 * System.out.println("El número es 3"); break; default:
		 * System.out.println("es otro número"); } while(x<=10) { System.out.println(x);
		 * x++; }
		 * 
		 * int x=100; do { System.out.println(x); x++; }while(x<=10);
		 * 
		 * 
		 * for(int i=0;i<=10;i++) { System.out.println(i); }
		 * 
		 * int[] vecNumeros = { 11, -22, 33, -44, 55, -66, 77, -88, 99 }; int
		 * totalPositivos = 0, totalNegativos = 0; for (int i = 0; i <
		 * vecNumeros.length; i++) { // positivos if (vecNumeros[i] > 0) {
		 * totalPositivos++; } else { totalNegativos++; } }
		 * System.out.println("Positivos:" + totalPositivos);
		 * System.out.println("Negativos:" + totalNegativos);
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe tu usuario");
		String usuario = teclado.next();
		System.out.println("Escribe ahora tu clave");
		int clave = teclado.nextInt();

		if (usuario.equals("admin") && clave == 123) {
			System.out.println("Bienvenido ;)");
		} else {
			System.out.println("Datos incorrectos");
		}

	}

}
