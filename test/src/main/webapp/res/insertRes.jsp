<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%
	String resvno = request.getParameter("resvno");
	String jumin = request.getParameter("jumin");
	String vcode = request.getParameter("vcode");
	String hospcode = request.getParameter("hospcode");
	String resvdate = request.getParameter("resvdate");
	String resvtime = request.getParameter("resvtime");
	
	Class.forName("oracle.jdbc.OracleDriver");
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","1234");
	PreparedStatement pstmt = null;
	
	int row = 0;
	String sql = "insert into tbl_baccresv_202108 values(?,?,?,?,?,?)";

	try{
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, resvno);
		pstmt.setString(2, jumin);
		pstmt.setString(3, vcode);
		pstmt.setString(4, hospcode);
		pstmt.setString(5, resvdate);
		pstmt.setString(6, resvtime);
		row = pstmt.executeUpdate();
		
		if(row>0){
			%>
			<script>
				alert('작성성공!홈으로 이동합니다');
				location.replace("/test/index.jsp");
			</script>
		<%
		}
		conn.commit();
	}catch(Exception e){
		e.getMessage();
		%>
			<script>
				alert('오류발생!다시 작성해주세요!');
				history.go(-1);
			</script>
		<%
	}finally{
		pstmt.close();
		conn.close();
	}
	
%>
<meta charset="UTF-8">

</head>
<body>

</body>
</html>