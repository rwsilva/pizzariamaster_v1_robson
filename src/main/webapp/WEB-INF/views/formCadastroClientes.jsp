<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Clientes</title>
</head>
<body>

	<h3>Adicionar Clientes</h3>

	<form action="adicionaCliente" method="post">

	
		Código:<input type="text" name="cli_id" maxlength="10" size="12"><br>
		Nome:<input type="text" name="cli_nome" maxlength="55" size="60"><br>
		Rua:<input type="text" name="cli_rua" maxlength="55" size="60"><br>
		Bairro:<input type="text" name="cli_bairro" maxlength="55" size="60"><br>
		Telefone:<input type="text" name="cli_telefone" maxlength="10" size="12"><br>
		Data:<input type="text" name="cli_data_cad" maxlength="12" size="10">
		
		<br>
		<br>
		Buscar:<input type="text" name="buscar" maxlength="55" size="60">
		<br>
		<br>
		<br>
		<br>
		<input type="submit" value="Novo">
		<input type="submit" value="Salvar">
		<input type="submit" value="Editar">
	</form>

</body>
</html>