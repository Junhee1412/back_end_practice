<%@page import="java.sql.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<h1>글목록</h1>
		<table class="table table-boarded table-hover">
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일자</th>
				<th>읽은횟수</th>
				<th>글내용</th>
			</tr>
	<%
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn= null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		String URL = "jdbc:mariadb://localhost:3306/myboard";
		String USER = "root";
		String PWD = "12345";
		String sql="select * from board order by bno";
		
		try{
		      
	   //db연결
	   conn = DriverManager.getConnection(URL,USER,PWD);
	   pstmt = conn.prepareStatement(sql);
	   rs = pstmt.executeQuery();
	   
	   	while(rs.next()){
	   		String bno = rs.getString(1);
	   		String subject = rs.getString(2);
	   		String writer = rs.getString(3);
	   		String crtdate = rs.getString(4);
	   		String readcnt = rs.getString(5);
	   		String content = rs.getString(6);
	   		%>
	   		<tr>
	   			<td><a href="jsp02_updateForm.jsp?bno=<%=bno%>"><%= bno %></a></td>
				<td><%= subject %></td>
				<td><%= writer %></td>
				<td><%= crtdate %></td>
				<td><%= readcnt %></td>
				<td><%= content %></td>
				<td><a href="jsp04_deleteForm.jsp?bno=<%=bno%>" class="btn btn-danger">삭제</a></td>
	   		</tr>
	   	<%
	   	}
		}catch(Exception e){
			out.write("<h3 class='bg-danger text-white'>" + e.getMessage() + "를 찾지 못했습니다!!</h3>");			
		}finally{
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {
				// dummy
			}
		}
	%>
		</table>
		<a href="jsp03_insertForm.jsp" class="btn btn-primary mt-sm-2">글 작성하기</a>
	</div>
</body>
</html>