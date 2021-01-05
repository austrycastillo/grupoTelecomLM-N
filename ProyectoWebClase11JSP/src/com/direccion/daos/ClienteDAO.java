package com.direccion.daos;

import java.sql.SQLException;
import java.sql.Statement;

import com.direccion.database.Conexion;
import com.direccion.modulos.ClienteVO;


public class ClienteDAO {
	public void registrarDatos(ClienteVO cliente) {
		Conexion conn = new Conexion();
		try {
			Statement stmt = conn.abrir().createStatement();
			String sql = "INSERT INTO cliente VALUES ('" + cliente.getNombre() + "',"
					+ "'" + cliente.getApellido() + "'," + "'" + cliente.getEdad() + "')";
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
