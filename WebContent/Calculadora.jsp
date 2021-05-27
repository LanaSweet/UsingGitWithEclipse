<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"
    	 import="modelos.CalculadoraModelo" %>
    	 
<% 
	modelo = (CalculadoraModelo)request.getAttribute("modelo");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Calculo del IMC</title>
	</head>
	<body>
	
	<%=modelo.mensaje %>
	
		<form method="POST" action="/CalculoIMC/Calculadora">
			<fieldset>
			<legend>Introduzca sus datos:</legend>
			<div>
				<input type="number" name="altura" step="0.01" placeholder="Altura en metros" value="<%=modelo.altura%>"/>
			</div>
			<div>
				<input type="number" name="peso" step="0.01" placeholder="Peso en kilos" value="<%=modelo.peso%>"/>
			</div>
			<div>
				<input type="number" readonly value="<%=modelo.imc%>"/>
			</div>
			<div>
				<button>Calcular</button>
			</div>
			
			</fieldset>
		</form>
	</body>
</html>
	
<%! 
	CalculadoraModelo modelo;  
	%>	

	
	