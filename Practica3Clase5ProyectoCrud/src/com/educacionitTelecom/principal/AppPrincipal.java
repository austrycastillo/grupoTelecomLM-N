package com.educacionitTelecom.principal;

import com.educacionitTelecom.conexion.Conexion;
import com.educacionitTelecom.daos.UsuarioDAO;
import com.educacionitTelecom.modulos.UsuarioVO;

public class AppPrincipal {

	public static void main(String[] args) {
		// Conexion conn = new Conexion();
		UsuarioVO sam = new UsuarioVO(1, "Austry", "Castillo", 16);
		//UsuarioVO sam = new UsuarioVO();
		UsuarioDAO samD = new UsuarioDAO();
		// samD.registrarUsuario(sam);
//		sam = samD.buscarUsuario(2);
//		if (sam != null) {
//			System.out.println("Te muestro el registro solicitado");
//			System.out.println(sam.toString());
//		} else {
//			System.out.println("Usuario no encontrado");
//		}
		//samD.modificarUsuario(sam);
		//samD.eliminarUsuario(4);
		samD.mostrarUsuarios();
	}

}
