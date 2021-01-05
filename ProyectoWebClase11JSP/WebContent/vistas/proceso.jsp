<%@page import="java.sql.SQLException"%>
<%@page import="com.direccion.daos.ClienteDAO"%>
<%@page import="com.direccion.modulos.ClienteVO"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- 
JSP: Java Server Pages
 -->
	<h1>Hola JSP</h1>
	<%=new Date()%>
	<br>
	<br>
	<%
		String nombre = request.getParameter("nombre");
	String apellido = request.getParameter("apellido");
	int edad = Integer.parseInt(request.getParameter("edad"));
	out.print("Datos recibidos, <b>Nombre: </b>" + nombre + "<b> Apellido: </b>" + apellido + "<b> Edad: </b>" + edad);
	ClienteVO a = new ClienteVO(nombre, apellido, edad);
	ClienteDAO dao = new ClienteDAO();
	dao.registrarDatos(a);
	
	%>
</body>
</html>







