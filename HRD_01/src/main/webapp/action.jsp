<%@page import="DBPKG.Util"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>action</title>
</head>
<body>

<%
request.setCharacterEncoding("UTF-8");

	Connection conn = null;
	Statement stmt = null;
	String mode = request.getParameter("mode");
	
	String custno = request.getParameter("custno");
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	try{
		conn = Util.getConnection();
		stmt = conn.createStatement();
		String sql = "";
		
		switch(mode){
		case "insert":
			sql="insert into member_tbl_02 values(" + custno + "," + 
				"'" + custname + "'," + "'" + phone + "'," + "'" + address + "'," + 
			"to_date('" + joindate + "','yyyy-mm-dd')," +  "'" + grade + "'," + "'"+ city + "')";
			
			stmt.executeUpdate(sql);
%>
	<jsp:forward page="join.jsp"/>			
			
<%
			break;
		case "modify":
			sql= "update member_tbl_02 set " + 
				"custname = '" + custname + "'," + 
				"phone = '" + phone + "'," + 
				"address = '" + address + "'," + 
				"joindate = to_date('" + joindate + "','yyyy-MM-dd')," +
				"grade = '" + grade + "'," + 
				"city = '" + city + "' "+
				"where custno = " + custno;
			
			stmt.executeUpdate(sql);
		%>
			<jsp:forward page="modify.jsp"/>	
		<%
			break;
		}
	}catch(Exception e){
		e.printStackTrace();
	}
%>

</body>
</html>