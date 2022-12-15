<%@page import="java.sql.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("utf-8");

	String bno = request.getParameter("bno");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");
	
	// 1. 드라이버 로드
   Class.forName("org.mariadb.jdbc.Driver"); // db연결작업
   String URL = "jdbc:mariadb://192.168.0.38:3306/myboard";
   String USER = "root";
   String PWD = "12345";
   String sql="update board set subject=?, content=?, writer=?, crtdate=now() where bno=?";
   
   
   Connection conn= null;
   PreparedStatement pstmt = null;
   int rs=0;
   try{
      
   //db연결
   conn = DriverManager.getConnection(URL,USER,PWD);
   pstmt = conn.prepareStatement(sql);
   
   //쿼리에 입력한 ? 내용 채우기
   pstmt.setString(1, subject);
   pstmt.setString(2, content);
   pstmt.setString(3, writer);
   pstmt.setString(4, bno);
   
   //쿼리실행
   rs = pstmt.executeUpdate();
	}catch(Exception e){
		out.write("<h3 class='bg-danger text-white'>" + bno + "를 찾지 못했습니다!!</h3>");			
	}finally{
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(Exception e) {
			// dummy
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

		<h1>글수정</h1>
		
		<%
			if(rs > 0) {
		%>
				<h3 class="bg-info text-white"><%= bno %>번글의 정보가 성공적으로 수정되었습니다!!</h3>
		<%
			} else {
		%>
				<h3 class="bg-danger text-white">글정보 찾기실패!!! <%= bno %>를 찾지 못했습니다!!</h3>
		<%
			}
		%>
		
		<a href="jsp05_listForm.jsp" class="btn btn-primary">글목록</a>
	</div>
</body>
</html>