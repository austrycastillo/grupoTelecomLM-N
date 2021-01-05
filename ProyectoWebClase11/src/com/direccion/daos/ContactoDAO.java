package com.direccion.daos;

import java.sql.SQLException;
import java.sql.Statement;

import com.direccion.modulos.ContactoVO;

import database.Conexion;

public class ContactoDAO {
	public void registrarDatos(ContactoVO contacto) {
		Conexion conn = new Conexion();
		try {
			Statement stmt = conn.abrir().createStatement();
			String sql = "INSERT INTO contacto (nombre,email,mensaje)" + " VALUES ('" + contacto.getNombre() + "',"
					+ "'" + contacto.getEmail() + "'," + "'" + contacto.getMensaje() + "')";
			stmt.execute(sql);
			System.out.println("se registró correctamente");
			stmt.close();
		} catch (SQLException e) {
			System.out.println("No podemos registrar" + e.getMessage());
		} finally {
			System.out.println("Terminado el proceso");
			conn.cerrar();
		}
	}
}
