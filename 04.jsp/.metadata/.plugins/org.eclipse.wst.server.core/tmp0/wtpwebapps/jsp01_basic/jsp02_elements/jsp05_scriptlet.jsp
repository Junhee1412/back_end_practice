<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
int sum = 0;
for (int i=0; i<11;i++){
	sum+=i;
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 실습. 1~10까지의 합 -->
	<!-- 표현식 -->
	<h4>1~10까지의 합 = <%= 1+2+3+4+5+6+7+8+9+10 %></h4>
	<h4>1~10까지의 합 = <%= sum	%></h4>
</body>
</html>