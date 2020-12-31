package com.educacionitTelecom.miConexionInicial;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 SQL-> Structured Query Language
 MySQL-> El motor, el sistema gestión bd
 DDL-> Definición (create, drop, alter)
 DML-> Manipulación (delete, update, insert, select)
 CRUD-> create read update delete
 JDBC-> Java Database Connectivity->paquete java.sql.*
 DBMS-> Database Manager System
 Interfaz Connection
 */
public class DataBase {
	public DataBase() {
		try {
			// definir la conexion, traer el jar drive y verificar si conecto
			Class.forName("com.mysql.jdbc.Driver");//establecemos con el driver
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/miconexioninicial", "root",
					"");//nos conectamos bd
			if (conexion != null) {
				System.out.println("Estoy conectada yupiiii ;)");
			}
		} catch (Exception e) {
			System.out.println("Erroressss ;(");
			e.printStackTrace();
		}
	}

}
