<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Receber os nomes</title>
</head>
<body>

	<!-- Recebe os parametros get/post -->
	<% String nome = "Nome recebido: ";
	out.print(nome + request.getParameter("nome"));%>
	<br/><br/>
	
	<!-- Recebe os parametros get/post por tag Express�o -->
	<%= "Sua idade �: " + request.getParameter("idade")%>
	<br/><br/>
	
	<!-- Devolve uma resposta -->
<%-- 	<% response.sendRedirect("http://www.uol.com.br"); %> --%>
	<br/><br/>
	
	<!-- Resgate de atributo de sess�o -->
	<%= session.getAttribute("curso") %>
	
	<!-- 
	// Pega o caminho at� o arquivo
	request.getContextPath()
	<br/>
	// Pega a configura��o passada de conte�do
	request.getContentType()
	<br/>
	// Pega a porta
	request.getLocalPort()
	<br/>
	// Pega o protocolo utilizado
	request.getProtocol()
	<br/>
	// Pega a query string
	request.getQueryString()
	<br/> -->
	
</body>
</html>