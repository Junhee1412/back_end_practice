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
   String sql="INSERT INTO member VALUES ( ?, ?, ?, ?)";
   
   
   Connection conn= null;
   PreparedStatement pstmt = null;
   int rs=0;
   boolean isConn = true;
   try{
      
   //db연결
   conn = DriverManager.getConnection(URL,USER,PWD);
   pstmt = conn.prepareStatement(sql);
   
   //쿼리에 입력한 ? 내용 채우기
   pstmt.setString(1, id);
   pstmt.setString(2, pw);
   pstmt.setString(3, name);
   pstmt.setString(4, email);
   
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
	<h1 class='bg-danger text-white'>회원등록하기</h1>
	<c:choose>
		<c:when test="<%= isConn %>">
			<h3>회원이 성공적으로 등록되었습니다.</h3>
			아이디   : <%= id %> <br>
			비밀번호 : <%= pw %> <br>
			회원이름 : <%= name %> <br>
			이메일   : <%= email %> <br>
		</c:when>
		<c:otherwise>
			<h3 class="bg-danger text-white">회원등록이 실패했습니다!!</h3>
		</c:otherwise>
		</c:choose>
		
		<form action="jsp03_insertMember.jsp">
			<input type="submit" class="btn btn-info" value="돌아가기">
			<a href="jsp05_listMember.jsp" class="btn btn-info">회원목록</a>
		</form>
	</div>
</body>
</html>