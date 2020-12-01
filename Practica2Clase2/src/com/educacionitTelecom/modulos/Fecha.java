package com.educacionitTelecom.modulos;

import java.util.Calendar;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		if (!verificarFecha()) {
			declarar();

		}

	}

	@Override
	public String toString() {
		return "La Fecha agregada es [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void declarar() {
		// asignamos desde el sistema
		Calendar fechaSys = Calendar.getInstance();
		setDia(fechaSys.get(Calendar.DAY_OF_MONTH));
		setMes(fechaSys.get(Calendar.MONTH) + 1);
		setAnio(fechaSys.get(Calendar.YEAR));
	}

	public void declarar(int d) {
		Calendar fechaSys = Calendar.getInstance();
		setDia(d);
		setMes(fechaSys.get(Calendar.MONTH) + 1);
		setAnio(fechaSys.get(Calendar.YEAR));
	}

	public void declarar(int d, int m) {
		Calendar fechaSys = Calendar.getInstance();
		setDia(d);
		setMes(m);
		setAnio(fechaSys.get(Calendar.YEAR));

	}

	public boolean verificarFecha() {
		boolean diaC, mesC, anioC;
		mesC = ((mes >= 1) && (mes <= 12));
		anioC = ((anio > 0) && (anio < 2030));
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaC = ((dia >= 1) && (dia <= 29));
			} else {
				diaC = ((dia >= 1) && (dia <= 28));
			}
		case 4:
		case 6:
		case 9:
		case 11:
			diaC = ((dia >= 1) && (dia <= 30));
			break;
		default:
			diaC = ((dia >= 1) && (dia <= 31));
			break;
		}
		return diaC && mesC && anioC;
	}

	public boolean esBisiesto() {
		return ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0));
	}
}
