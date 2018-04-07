<%@page
	import="net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer.Prefixing"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>CÓDIGO</th>
			<th>NOME</th>
			<th>RUA</th>
			<th>BAIRRO</th>
			<th>TELEFONE</th>
		</tr>

		<c:forEach items="${todosCliente}" var="cliente">
			<tr>
				<td>${cliente.cli_id}</td>
				<td>${cliente.cli_nome}</td>
				<td>${cliente.cli_rua}</td>
				<td>${cliente.cli_bairro}</td>
				<td>${cliente.cli_telefone}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>