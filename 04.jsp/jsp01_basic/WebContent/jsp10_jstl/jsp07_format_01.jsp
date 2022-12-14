<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value="ko"></fmt:setLocale> 
<!-- en, ko에 놓으면 WEB-INF에 classes/resource에 message_ko, message가 호출됨 en이 default임 -->
<fmt:bundle basename="resource.message">
	<fmt:message key="TITLE" var="title"/>
</fmt:bundle>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${ title }</title>
</head>
<body>
	<!-- 한글을 유니코드를 변경하기
		native2ascii.exe message_ko.properties.src message_ko.properties
	-->
	<h1>${ title }</h1>
	<fmt:bundle basename="resource.message">
		<fmt:message key="GREETING"/>
		<c:if test="${ !empty param.id }">
			<fmt:message key="VISITOR">
				<fmt:param value="${ param.id }"></fmt:param>
			</fmt:message>
		</c:if>
	</fmt:bundle>
	
</body>
</html>