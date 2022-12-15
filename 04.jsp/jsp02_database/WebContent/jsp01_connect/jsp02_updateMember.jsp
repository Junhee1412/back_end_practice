<%@page import="java.sql.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	
	// 1. 드라이버 로드
   Class.forName("org.mariadb.jdbc.Driver"); // db연결작업
   String URL = "jdbc:mariadb://localhost:3306/jspstudy"; 
   String USER = "root";
   String PWD = "12345";
   String sql="update member set password=?, name=?, email=? where id=?";
   
   
   Connection conn= null;
   PreparedStatement pstmt = null;
   int rs=0;
   try{
      
   //db연결
   conn = DriverManager.getConnection(URL,USER,PWD);
   pstmt = conn.prepareStatement(sql);
   
   //쿼리에 입력한 ? 내용 채우기
   pstmt.setString(1, pw);
   pstmt.setString(2, name);
   pstmt.setString(3, email);
   pstmt.setString(4, id);
   
   //쿼리실행
   rs = pstmt.executeUpdate();
	}catch(Exception e){
		out.write("<h3 class='bg-danger text-white'>" + id + "를 찾지 못했습니다!!</h3>");			
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

		<h1>회원수정</h1>
		
		<%
			if(rs > 0) {
		%>
				<h3 class="bg-info text-white"><%= id %>회원의 정보가 성공적으로 수정되었습니다!!</h3>
				<h3 class="bg-info text-white"><%= rs %>건의 정보가 성공적으로 수정되었습니다!!</h3>
		<%
			} else {
		%>
				<h3 class="bg-danger text-white">회원정보실패!!! <%=id %>를 찾지 못했습니다!!</h3>
		<%
			}
		%>
		
		<a href="jsp05_listMember.jsp" class="btn btn-primary">회원목록</a>
	</div>
</body>
</html>