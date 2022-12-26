<%@page import="java.sql.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("utf-8");

	String bno = request.getParameter("bno");
	String subject = request.getParameter("subject");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	String crtdate = request.getParameter("crtdate");
	
	// 1. 드라이버 로드
   Class.forName("org.mariadb.jdbc.Driver"); // db연결작업
   String URL = "jdbc:mariadb://localhost:3306/myboard";
   String USER = "root";
   String PWD = "12345";
   String sql="insert into board (subject, writer, crtdate, readcnt, content) VALUES (?,?,now(),0,?)";
   
   Connection conn= null;
   PreparedStatement pstmt = null;
   int rs=0;
   boolean isConn = true;
   try{
      
   //db연결
   conn = DriverManager.getConnection(URL,USER,PWD);
   pstmt = conn.prepareStatement(sql);
   
   //쿼리에 입력한 ? 내용 채우기
   pstmt.setString(1, subject);
   pstmt.setString(2, writer);
   pstmt.setString(3, content);
   
   //쿼리실행
   rs = pstmt.executeUpdate();
	}catch(Exception e){
		//dummy
	}finally{
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(Exception e) {
			out.write("<h3 class='bg-danger text-white'>DB접속 실패!!</h3>");
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">   
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container" align="center">
	<h1 class='bg-danger text-white'>글 등록!</h1>
	<c:choose>
		<c:when test="<%= isConn %>">
			<h3>글이 성공적으로 등록되었습니다.</h3>
			주제 : <%= subject %> <br>
			작성자 : <%= writer %> <br>
			작성내용 : <%= content %><br>
		</c:when>
		<c:otherwise>
			<h3 class="bg-danger text-white">글등록이 실패했습니다!!</h3>
		</c:otherwise>
		</c:choose>
		
		<form action="jsp03_insertForm.jsp">
			<input type="submit" class="btn btn-info" value="돌아가기">
			<a href="jsp05_listForm.jsp" class="btn btn-info">글목록</a>
		</form>
	</div>
</body>
</html>