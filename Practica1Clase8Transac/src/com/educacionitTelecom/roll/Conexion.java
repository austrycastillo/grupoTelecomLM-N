package com.educacionitTelecom.roll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/transac", "root", "");
			if (conn != null) {
				System.out.println("Estoy conectada!");
			}
			return conn;
		} catch (SQLException e) {
			System.out.println("erroresssss");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("otros erroressssss");
			e.printStackTrace();
		}
		return null;
	}
}
