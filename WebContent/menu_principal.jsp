<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="dominio.Usuario" %>
<!DOCTYPE html>
<html lang="es">
<head>
	<%@include file="html/header.html"%>
	<title>ModeloApp - Menú Principal</title>
</head>

<body>

	<div class="container">
		<div class="header clearfix">
			<nav>
				<ul class="nav nav-pills pull-right">
					<li role="presentation" class="active"><a href="#">Home</a></li>
					<li role="presentation"><a href="#">About</a></li>
					<li role="presentation"><a href="#">Contact</a></li>
					<li role="presentation"><a href="#"><%= ((Usuario)session.getAttribute("usuario")).getNombre() %></a></li>
				</ul>
			</nav>
			<h3 class="text-muted">Project name</h3>
		</div>

		<div>
			<h1>Menú Principal</h1>
		</div>
		<%@include file = "html/footer.html" %>
	</div> <!-- /container -->

	<%@include file="html/javaScript.html"%>
</body>
</html>