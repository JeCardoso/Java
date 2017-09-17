<!-- Declara o Bean antes de tudo -->
<jsp:useBean id="calcula" class="beans.BeanCursoJSP" type="beans.BeanCursoJSP" scope="page"  />

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Beans</title>
</head>
<body>
	<h1> Java Beans</h1>
	
	<!-- Chamar o bean ->> id + método criado na classe Beans -->
	<%= calcula.calcular(50) %>
	
	<jsp:setProperty property="*" name="calcula"/>
	
	<h2> Atributos recebidos pelo Bean</h2>
	<jsp:getProperty property="nome" name="calcula"/>
	<br>
	<jsp:getProperty property="ano" name="calcula"/>
	<br>
	<jsp:getProperty property="sexo" name="calcula"/>
	<br>
	
	<h1> Atributos recebidos usando expression linguagem param.nome_atributo ou por sessionScope.atributo </h1>
	Nome: ${param.nome}
	<br/>
	Ano: ${param.ano}
	<br/>
	Sexo: ${sessionScope.sexo}
	<br/>
	
	
</body>
</html>