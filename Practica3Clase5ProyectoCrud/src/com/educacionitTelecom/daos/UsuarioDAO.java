package com.educacionitTelecom.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.educacionitTelecom.conexion.Conexion;
import com.educacionitTelecom.modulos.UsuarioVO;

public class UsuarioDAO {
	public void registrarUsuario(UsuarioVO usuario) {
		// 1 - definir la conexion
		Conexion conn = new Conexion();
		try {
			// 2 - crear el statement
			Statement stmt = conn.abrir().createStatement();
			// 3 -armar la sentencia sql
			String sql = "INSERT INTO usuarios (nombre,apellido,edad)" + "VALUES ('" + usuario.getNombre() + "','"
					+ usuario.getApellido() + "','" + usuario.getEdad() + "')";
			// 4 - ejecutar
			stmt.execute(sql);
			System.out.println("Se registró correctamente " + usuario.getNombre());
			// 5 - cerrar el statement
			stmt.close();
		} catch (SQLException e) {
			System.out.println("No podemos registrar a " + usuario.getNombre());
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalizandooo");
			// 6 - cerrar la conexión
			conn.cerrar();
		}
	}

	public UsuarioVO buscarUsuario(int codigo) {
		// definir la conexión
		Conexion conn = new Conexion();
		// crear un objeto vacio
		UsuarioVO usuario = new UsuarioVO();
		// variable boolean para saber si existe el usuario
		boolean existe = false;
		try {
			String sql = "SELECT *FROM usuarios WHERE id = ?";
			// statement
			PreparedStatement stmt = conn.abrir().prepareStatement(sql);
			// setear el dato incognito
			stmt.setInt(1, codigo);
			// hacer un resulSet y ejecutamos
			ResultSet result = stmt.executeQuery();
			// recorremos el set
			while (result.next()) {
				existe = true;
				usuario.setId(result.getInt("id"));
				usuario.setNombre(result.getString("nombre"));
				usuario.setApellido(result.getString("apellido"));
				usuario.setEdad(result.getInt("edad"));
			}
			// cerrar result y statement
			result.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Error no puedo encontrar el usuario");
			System.out.println(e.getMessage());

		} finally {
			System.out.println("Finalizandooo");
			// cerrar la conexión
			conn.cerrar();
		}
		if (existe) {
			return usuario;
		} else {
			return null;
		}

	}

	public void modificarUsuario(UsuarioVO usuario) {
		// conexion
		Conexion conn = new Conexion();
		try {
			// el query
			String sql = "UPDATE usuarios SET nombre = ?, apellido = ?, edad = ? WHERE id = ?";
			// statement
			PreparedStatement stmt = conn.abrir().prepareStatement(sql);
			stmt.setString(1, usuario.getNombre());
			stmt.setString(2, usuario.getApellido());
			stmt.setInt(3, usuario.getEdad());
			stmt.setInt(4, usuario.getId());
			// ejecutamos
			stmt.executeUpdate();
			System.out.println("Actualizamos la data de " + usuario.getNombre());
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Error no puedo modificar");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalizandooo");
			// cerrar la conexión
			conn.cerrar();
		}
	}

	public void eliminarUsuario(int codigo) {
		Conexion conn = new Conexion();
		try {
			Statement stmt = conn.abrir().createStatement();
			String sql = "DELETE FROM usuarios WHERE id = '" + codigo + "'";
			stmt.execute(sql);
			System.out.println("Eliminando...");
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Error no puedo eliminar");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalizandooo");
			// cerrar la conexión
			conn.cerrar();
		}
	}
	
	public void mostrarUsuarios() {
		//conexión
		Conexion conn = new Conexion();
		try {
			//query
			String sql = "SELECT *FROM usuarios";
			//statement
			PreparedStatement stmt = conn.abrir().prepareStatement(sql);
			//resulSet
			ResultSet result = stmt.executeQuery();
			//loops
			while(result.next()) {
				System.out.println("id: " + result.getInt("id") 
				+ " - Nombre: " + result.getString("nombre")
				+ " - Apellido: " + result.getString("apellido")
				+ " - Edad: " + result.getInt("edad"));
			}
			result.close();
			stmt.close();
		}catch (SQLException e) {
			System.out.println("Error no puedo mostrar datos");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalizandooo");
			// cerrar la conexión
			conn.cerrar();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
