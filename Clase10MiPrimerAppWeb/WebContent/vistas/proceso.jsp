<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.educacionit.controllers.PersonaVO" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	
	PersonaVO p1 = new PersonaVO();
		String mail = request.getParameter("email");
		String nombreDeUsuario = request.getParameter("uname");
		String genero = request.getParameter("gender");
		String[] curso = request.getParameterValues("course");

		
		
		out.write("<h2> datos recibidos correctamente son los siguiente : </h2><br>");
		out.write("<h2> " + mail + "</h2><br>");
		out.write("<h2> " + nombreDeUsuario + "</h2><br>");
		out.write("<h2>" + genero + " </h2><br>");
		
		
		
	%>
	<p> La hora del servidor es:  <% out.print(new Date()); %> </p>
</body>
</html>