<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Procesar formulario</title>
</head>
<body>
<%
String email = request.getParameter("email");
if (email.matches("^[a-zA-Z0-9]+@[a-z]+\\.(com|es|edu)$")) {
%>
<p>El correo electrónico es válido.</p>
<%
} else {
%>
<p>El correo electrónico no es válido.</p>
<%
}
%>
</body>
</html>
