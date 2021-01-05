package com.direccion.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static String bd = "proyectowebjava";
	static String login = "root";
	static String pass = "";
	static String url = "jdbc:mysql://localhost/" + bd;
	Connection conn = null;

	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, pass);
			if (conn != null) {
				System.out.println("SIII conecto");
			}
		} catch (SQLException e) {
			System.out.println("Nop, error sql " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Nop, error de clase " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Nop, error genérico " + e.getMessage());
		}
	}

	public Connection abrir() {
		return conn;
	}

	public void cerrar() {
		conn = null;
	}
}
