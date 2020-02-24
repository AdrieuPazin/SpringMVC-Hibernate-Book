<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Cliente</title>
</head>
<body>

	<form action="cadastroCliente" method="post">
		
		<label>Nome:</label>
		<input type="hidden" name="id">
		<input type="text" name="nome">
		
		<label>E-mail:</label>
		<input type="email" name="email">
		
		<input type="submit" value="Enviar">
	
	</form>


</body>
</html>