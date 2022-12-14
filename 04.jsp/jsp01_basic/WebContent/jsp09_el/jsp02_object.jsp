<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.lec.el.Thermometer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Thermometer thermometer = new Thermometer();
		request.setAttribute("t",thermometer);
	%>
	<h1>섭씨/화씨로 변환하는 온도계 프로그램(V1.0)</h1>
	${ t.getInfo() }<br>
	${ t.getxxx() }<br>
	${ t.setCelsius("Seoul", -7.5) }<br>
	서울의 현재온도는 섭씨 ${ t.getCelsius("Seoul") }도 입니다!<br>
	서울의 현재온도는 화씨 ${ t.getFahreheit("Seoul") }도 입니다!<br>
</body>
</html>