<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Diretiva de tagLib -->
	<%@ taglib prefix="novaTag" uri="WEB-INF/testetag.tld" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	input{
		display: block;
	}
</style>
</head>
<body>
	<h1>Bem-vindo ao curso de JSP</h1>
	
	<!-- Tag Expressão de escrita -->
	<% out.print("Tag de código java em JSP"); %>
	<br/><br/>
	
	<!-- Tag Expressão de escrita -->
	<%= "Assim se escreve sem print" %>
	<br/><br/><br/>
	
	<h2> Formulario para a página receber nome</h2>
	<form action="receber-nome.jsp" method="post">
		<input type="text" id="nome" name="nome" placeholder="Digite seu nome">
		<input type="text" id="idade" name="idade" placeholder="Digite sua idade">
		<input type="submit" value="Enviar">
	</form>
	<br/>
	
	<h2> Formulario para o JavaBean </h2>
	<form action="java-bean.jsp" method="post">
		<input type="text" id="nome" name="nome" placeholder="Digite seu nome" value="souza">
		<input type="text" id="ano" name="ano" placeholder="Digite o ano" value="1995">
		<input type="submit" value="Enviar">
	</form>
	<br/>
	
	<% session.setAttribute("sexo", "macho"); %>
	
	<!-- Tag declarativa ! -->
	<%! int cont = 2; 	
		public int retorna(int n){
			return n *3;
		}
	%>		
	<%= retorna(4)  %>
	<br/>
	<br/>
	
	<!-- Parametros iniciados no web.xml -->
	<%= "Estado: " + application.getInitParameter("Estado")  %>
	<br/>
	
	<!-- Criando atributo de sessão -->
	<% session.setAttribute("curso", "curso de jsp"); %>
	<br/>
	
	<!-- Tag criada no testetag.tld -->
	<novaTag:minhaTag/>
	
</body>
</html>