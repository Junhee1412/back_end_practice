<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>

<style>
	*{
		margin:0 0;
	}
	
	body{
		height: 940px;
	}
	
	header{
		height: 10%; 
	}
	section{
		height: 80%;
	}
	
	footer{
		background: black;
		color:white;
		height: 10%;
	}
	header h1{
		text-align: center;
	}
	
	ul{
		list-style: none;
		display: flex;
		background: gray;
	}
	ul li{
		margin: 0 10px;
	}
	
	a, a:active{
		text-decoration: none;
		color: black;
	}
	a:hover{
		color:blue;
	}
	
	table{
		margin: 0 auto;
	}
	


	
</style>
</head>
<body>
	<header>
		<h1>백신접종예약 프로그램 ver 2021</h1>
	</header>
	<nav>
		<ul>
			<li><a href="/test/res/insertResForm.jsp">백신접종예약</a></li>
			<li><a href="/test/res/selectResForm.jsp">접종예약조회</a></li>
			<li><a href="/test/res/avgRes.jsp">접종인원통계</a></li>
			<li><a href="/test/index.jsp">홈으로</a></li>
		</ul>
	</nav>
	<section>
		<article>
			<table>
				<tr><td colspan="3"><h1>병원별접종건수통계</h1></td></tr>
			<%
				String sql ="select h.hospcode, h.hospname, count(r.resvno) avc from tbl_baccresv_202108 r,  tbl_hosp_202108 h where r.hospcode=h.hospcode group by h.hospcode, h.hospname";
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","1234");
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				int sum = 0;
				
				while(rs.next()){
				%>
				<tr><td width="100px;"><%=rs.getString("hospcode")%></td><td width="100px;"><%=rs.getString("hospname")%></td><td width="100px;"><%=rs.getString("avc")%></td></tr>
				<%
				sum+=Integer.parseInt(rs.getString("avc"));
				}		
			%>
				<tr><td></td><td>총누계</td><td><%=sum %></td></tr>
			</table>
		</article>
	</section>
	<footer>
		<p>HRDKIREA Copyright @ 2021 All rights reserved Human Resources Development Service of Korea</p>
	</footer>
	
	
	
</body>
</html>