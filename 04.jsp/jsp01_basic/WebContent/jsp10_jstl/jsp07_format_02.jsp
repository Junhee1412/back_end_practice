<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>formatNumber 태그</h1>
	<c:set var="price" value="1000"/>
	<fmt:formatNumber value="${price}" type="number"/><br>
	<fmt:formatNumber value="${price}" type="currency" currencySymbol="$"/><br>
	<fmt:formatNumber value="${price}" type="currency"/><hr/>
	
	<h3>formatDate태그</h3>
	<c:set var="now" value="<%= new java.util.Date() %>"/>
	<p>${now}</p>
	<fmt:formatDate value="${now}" type="date"/><br>
	<fmt:formatDate value="${now}" type="time"/><br>
	<fmt:formatDate value="${now}" pattern="a hh:mm:ss"/><br>
	<hr/>
</body>
</html>