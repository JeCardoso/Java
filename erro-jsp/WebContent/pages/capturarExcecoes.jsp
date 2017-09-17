<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Capturar Erros</title>
</head>
<body>
	<h1>Captando exceções</h1>
	
	<input type="text" value="valor informado" id="valor">
	<input type="button" onclick="testarExcecao();" value="Testar Exceção">
	
	<script type="text/javascript">
		function testarExcecao(){
			var valorInformado = $('#valor').val();
			
			$.ajax({
				method: "POST",
				url: "capturarExcecoes", // para qual servlet
				data: {valorParametro: valorInformado}
			})
			.done(function(response){ // resposta ok
				alert("Sucesso: "response);		
			})
			.fail(function(chr, status, erroThrown){ // resposta erro
				alert("Falha: "+ xhr.responseText);	// mostra a resposta do servlet	
			});
			
		}
		
		/* .always(function(response){ // sempre capta o retorno
		alert(response);		
}*/
	</script>
</body>
</html>