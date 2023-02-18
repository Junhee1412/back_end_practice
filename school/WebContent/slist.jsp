<%@include file="db.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>slist</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<section style="position:fixed; top:70px; left:0px; width:100%; height:100%;
background-color:lightgray;">

<h2 style="text-align:center;">학생정보현황</h2>

<form style="display:flex; align-items:center; justify-content:center; text-align:center;">
<table border="1">
	<tr>
		<td>학번</td>
		<td>이름</td>
		<td>주민번호</td>
		<td>학과명</td>
		<td>성별</td>
		<td>전화번호</td>
		<td>이메일</td>
	</tr>
	
	<%
	request.setCharacterEncoding("UTF-8");

	 try{
		 String sql="select stuid,sname,jumin,dept_name,jumin,phone,email "+
	 				"from tbl_student_202210";
		 PreparedStatement pstmt = con.prepareStatement(sql);
		 ResultSet rs= pstmt.executeQuery();
		 while(rs.next()){
			 String jumin = rs.getString(3);
			 String jumin2 = jumin.substring(0,6) + "-" + jumin.substring(6,13);
			 
			 String gender = jumin.substring(6,7); // 3,4가 출력
			 if(gender.equals("3"))gender="남자";
			 else gender="여자";
				 
				 
			 %>
			 <tr>
			 	<td><%=rs.getString(1) %></td>
			 	<td><%=rs.getString(2) %></td>
			 	<td><%=jumin2%></td>
			 	<td><%=rs.getString(4) %></td>
			 	<td><%=gender %></td>
			 	<td><%=rs.getString(6) %></td>
			 	<td><%=rs.getString(7) %></td>
			 </tr>
			 
			 <%
		 }
		 
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	
	
	%>

</table>
</form>
</section>




<jsp:include page="footer.jsp"/>

</body>
</html>