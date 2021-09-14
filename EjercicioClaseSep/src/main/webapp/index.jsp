<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Verificar Informacion</h1>
	<div >
	<form method="get" action="./EjercicioServlet">
		<table style="border: 1px solid black;">
			<tr>
				<td><label>Nombre:</label></td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td><label>Telefono:</label></td>
				<td><input type="text" name="telefono"></td>
			</tr>
			<tr>
				<td style="align:center;"><input type="submit" value="Ingresar"></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>