package com.educacionitTelecom.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	// atributos
	static String bd = "miconexioninicial";
	static String login = "root";
	static String pass = "";
	static String url = "jdbc:mysql://localhost/" + bd;
	Connection conn = null;

	// constructor
	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");// establecemos con el driver
			conn = DriverManager.getConnection(url, login, pass);
			if (conn != null) {
				System.out.println("Si conecto");
			}
		} catch (SQLException e) {
			System.out.println("Error SQL " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Error Clase " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erron común " + e.getMessage());
		}
	}

	public Connection abrir() {
		return conn;
	}

	public void cerrar() {
		conn = null;
	}
}
