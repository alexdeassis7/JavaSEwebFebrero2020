package com.educacionit.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProcesoLogin")
public class ProcesoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ProcesoLogin() {
    }	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("soy el do get!!!");
		System.out.println("llego la peticion del font end");
		int nombreUsuario = Integer.parseInt(request.getParameter("uname"));
		int password= Integer.parseInt(request.getParameter("pass"));
		
		System.out.println("llegaron las siguientes credenciales al back end : ");
		System.out.println(nombreUsuario + "  "+ password);
			if(nombreUsuario == 36863837 && password == 1234) {
				response.sendRedirect("index.html");				
			}
			
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("soy el do post!!!");
		System.out.println("llego la peticion del font end");
		int nombreUsuario = Integer.parseInt(request.getParameter("uname"));
		int password= Integer.parseInt(request.getParameter("pass"));
		
		System.out.println("llegaron las siguientes credenciales al back end : ");
		System.out.println(nombreUsuario + "  "+ password);
			if(nombreUsuario == 36863837 && password == 1234) {
				response.sendRedirect("index.html");				
			}else {
				response.sendRedirect("Error.html");
			}
			
		
	}

}
