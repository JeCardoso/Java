<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL</title>
</head>
<body>

	<!-- Tag JSTL de saída na tela -->
	<c:out value="${'Bem vindo ao JSTL'}" />
	<br/><br/>
	
	<!-- Direciona para o html do google -->
	<%-- <c:import var="google" url="https://www.google.com.br" /> --%>
	<%-- <c:out value="${google}" /> --%>
	
	<!-- Criar variavel -->
	<c:set var="data" scope="page" value="${500*6}" />
	<c:out value="${data}" />
	
	<br/><br/>
	
	<!-- Remover variavel -->
	<c:remove var="data"/>
	
	<!-- Mensagem caso haja erro -->
	<c:catch var="erro" >
		<%= 100/2 %>
	</c:catch>
	
	<!-- Teste -->
	<c:if test="${erro != null}">
		${erro.message}
	</c:if>	
	
	<br/><br/>
	
	<!-- Criar variavel -->
	<c:set var="numero" value="${100/2}" />
	
	<!-- Switch ou if/else encadeado -->
	<c:choose>
		<c:when test="${numero >= 50}">
			<c:out value="${'Maior ou igual que 50'}" />
		</c:when>
		<c:when test="${numero < 50}">
			<c:out value="${'Menor que 50'}" />
		</c:when>
		<c:otherwise>
			<c:out value="${'nao encontrou valor correto'}" />
		</c:otherwise>
	</c:choose>
	
	<br/>
	
	<!-- For ou foreach -->
	<c:forEach var="n" begin="1" end="${numero}">
		<br/> Item: ${n} 
	</c:forEach>
	
	<br/><br/>
	
	<!-- Quebra uma string por caractere bomba -->
	<c:forTokens items="Alex-Fernando-Egidio" delims="-" var="nome">
		<br/>
		Nome: <c:out value="${nome}" />
	</c:forTokens>
	
	<br/><br/>
	
	<!-- Monta uma URL -->
	<c:url value="/pagina_erro.jsp" var="acesso">
		<c:param name="para1" value="111" />
		<c:param name="para2" value="112" />
	</c:url>
	<c:out value="Url montada: ${acesso}" />
	
	<br/><br/>
	
	<!-- Redirecionar para um link -->
	<%-- <c:if test="${numero >= 50}"> --%>
	<%-- <c:redirect url="http://google.com" /> --%>
	<%-- </c:if> --%>
	
	



</body>
</html>