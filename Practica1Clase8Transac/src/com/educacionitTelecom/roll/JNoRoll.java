package com.educacionitTelecom.roll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JNoRoll {

	public static void main(String[] args) {
		Connection conn = Conexion.getConnection();
		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;
		try {
			String sql1 = "INSERT INTO personas (nombre,apellido,email) VALUES (?,?,?)";
			String sql2 = "INSERT INTO clientes (nombre,edad) VALUES (?,?)";
			stmt1 = conn.prepareStatement(sql1);
			stmt2 = conn.prepareStatement(sql2);
			System.out.println("Primer insert en personas");
			stmt1.setString(1, "Carlos");
			stmt1.setString(2, "Monte");
			stmt1.setString(3, "cc@correo.com");
			stmt1.execute();

			System.out.println("Segundo insert en personas");
			stmt1.setString(1, "Petra");
			stmt1.setString(2, "Mon");
			stmt1.setString(3, "pp@correo.com");
			stmt1.execute();

			System.out.println("Tercer insert en personas");
			stmt1.setString(1, "Petronila");
			stmt1.setString(2, "Zomzom");
			stmt1.setString(3, "z@correo.com");
			stmt1.execute();

			System.out.println("****Primer insert en clientes");
			stmt2.setString(1, "Flor");
			stmt2.setInt(2, 20);
			stmt2.execute();
		} catch (SQLException e) {
			System.out.println("Error " + e.getMessage());
		} finally {
			System.out.println("cerrando la conexión");
			try {
				if (stmt1 != null) {
					stmt1.close();
				}
				if (stmt2 != null) {
					stmt2.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("Ups! algo sucedió" + e.getMessage());
			}
		}
	}

}
