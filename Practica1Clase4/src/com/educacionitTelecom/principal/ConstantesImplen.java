package com.educacionitTelecom.principal;

import com.educacionitTelecom.interfaces.IConstantes;
import com.educacionitTelecom.interfaces.IPruebita;

public class ConstantesImplen implements IConstantes, IPruebita {

	public static void main(String[] args) {
//		int numeros[] = new int[MAX];
//		for (int i = MIN; i < 99; i++) {
//			if (i >= MAX) {
//				System.out.println(MENSAJEERROR);
//			} else {
//				numeros[i] = i;
//				System.out.println(numeros[i]);
//			}
//		}

		int num1 = 20;
		System.out.println(num1);
		long num2 = num1;
		System.out.println(num2);
		short num3 = (short) num1;
		System.out.println(num3);
		float num4 = num2;
		System.out.println(num4);
		String a = "10";
		System.out.println(a);
		int b = Integer.parseInt(a);
		System.out.println(b);
	}

	@Override
	public void saludar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void despedir() {
		// TODO Auto-generated method stub

	}

}
