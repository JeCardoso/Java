<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuario</title>
</head>
<body>

	<h1>Cadastro de Usuário</h1>
	<form action="SalvarUsuario" method="post">
		Codigo:<input readonly="readonly" type="text" id="id" name="id" placeholder="id" value="${user.id}" }/>
		Login:<input type="text" id="usuario" name="usuario" placeholder="usuario" value="${user.login}" }/>
		Senha: <input type="text" id="senha" name="senha" placeholder="senha" value="${user.senha}" />
		<input type="submit" value="Salvar" />
	</form>

	<table>
		<c:forEach items="${usuarios}" var="user">
			<tr>
				<td style="width:150px"><c:out value="${user.id}" /></td>
				<td style="width:150px"><c:out value="${user.login}" /></td>
				<td><c:out value="${user.senha}" /></td>
				<td><a href="SalvarUsuario?acao=editar&user=${user.login}">Editar</a></td>
				<td><a href="SalvarUsuario?acao=delete&user=${user.login}">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>