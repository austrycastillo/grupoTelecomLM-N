package com.educacionitTelecom.roll;

//IGUAL AL ANTERIOR JNoRoll PERO MANEJANDO TRANSACCIONES
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JRoll {

	public static void main(String[] args) {
		Connection conn = Conexion.getConnection();
		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;
		try {
			conn.setAutoCommit(false);//método, quitar el automático, asegurar la atomicidad
			String sql1 = "INSERT INTO personas (nombre,apellido,email) VALUES (?,?,?)";
			String sql2 = "INSERT INTO clientes (nombre,edad) VALUES (?,?)";
			stmt1 = conn.prepareStatement(sql1);
			stmt2 = conn.prepareStatement(sql2);
			System.out.println("Primer insert en personas");
			stmt1.setString(1, "Uno");
			stmt1.setString(2, "aja");
			stmt1.setString(3, "cc@correo.com");
			stmt1.execute();

			System.out.println("Segundo insert en personas");
			stmt1.setString(1, "Dos");
			stmt1.setString(2, "Laja");
			stmt1.setString(3, "pp@correo.com");
			stmt1.execute();

			System.out.println("Tercer insert en personas");
			stmt1.setString(1, "Tres");
			stmt1.setString(2, "Gos");
			stmt1.setString(3, "z@correo.com");
			stmt1.execute();

			System.out.println("****Primer insert en clientes");
			stmt2.setString(1, "Uno");
			//stmt2.setInt(2, 20);
			stmt2.execute();
			conn.commit();//confirmar, impacta los cambios en bd
		} catch (SQLException e) {
			System.out.println("Error " + e.getMessage());
			if (conn != null) {
				System.out.println("Preparando y ejecutando el Roll Back");
				try {
					conn.rollback();//vuelve atras todo
				} catch (SQLException er) {
					System.out.println("Ohoh no puedo deshacer el roll " + er.getMessage());
				}
			}
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
