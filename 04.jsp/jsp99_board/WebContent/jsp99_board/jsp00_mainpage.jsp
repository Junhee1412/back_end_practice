<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page import="java.sql.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String bno = request.getParameter("bno");
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
	<h1><%=bno %>번째 글입니다!</h1>
	<%
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mariadb://192.168.0.38:3306/myboard";
		String usr = "root";
		String pwd = "12345";
		String sql = "select * from board where bno='"+bno+"'";
	
		try{
			conn=DriverManager.getConnection(url,usr,pwd);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			if(rs.next()){
%>
				<table class="table tabl-hover" border="1">
					<tr>
						<td>글번호</td>
						<td><%= bno %></td>
					</tr>
					<tr>
						<td>글주제</td>
						<td><%= rs.getString("subject") %></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td><%= rs.getString("writer") %></td>
					</tr>
					<tr>
						<td>작성일자</td>
						<td><%= rs.getString("crtdate") %></td>
					</tr>
					<tr>
						<td>읽은횟수</td>
						<td><%= rs.getString("readcnt") %></td>
					</tr>
					<tr>
						<td>글내용</td>
						<td><%= rs.getString("content") %></td>
					</tr>
				</table>
<%				
				}else{
%>	
				<h3 class="bg-danger text-white"><%= bno %>는 찾지 못했습니다!</h3>
<%			}
		}catch(Exception e){
%>			
			에러 : <%= e.getMessage() %>
<%		}finally{
			try{
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e){
				//dummy
			}
		}
%>
	
	</div>
</body>
</html>