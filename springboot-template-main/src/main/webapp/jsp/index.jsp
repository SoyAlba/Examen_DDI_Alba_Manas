<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hola mundo</h1>

		<form:form action="comprobarPalabra" method="post" modelAttribute="word">
            <span>Palabra:</span>
            <form:input path="word" type="hidden" name="word"/>
            <form:input path="wordIndex" type="text" name="wordIndex"/>
            <br/>
			<input type="submit"/>
		</form:form>
</body>
</html>