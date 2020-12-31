package com.educacionitTelecom.controlador;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FormControlador")
public class FormControlador extends HttpServlet{
	public FormControlador() {}
		@Override
		protected void doGet(HttpServletRequest request,
				HttpServletResponse response) throws ServletException,
		IOException{
			response.getWriter().append("Server: ").
			append(request.getContextPath());
			response.setContentType("text/html");
		}
		@Override
		protected void doPost(HttpServletRequest request,
				HttpServletResponse response) throws ServletException,
		IOException {
			doPost(request,response);
		}
	}

