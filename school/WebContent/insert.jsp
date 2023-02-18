<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
</head>
<body>

<jsp:include page="header.jsp"/>
<script type="text/javascript" src="check.js"></script>
<section style="position:fixed; top:70px; left:0px; width:100%; height:100%;
background-color:lightgray;">

<h2 style="text-align:center;">성적입력</h2>

<form action="i_action.jsp" name="frm" style="display:flex; align-items:center; justify-content:center; text-align:center;">
<table border="1">
	<tr>
		<td>학번</td>
		<td><input type="text" name="sid"></td>
	</tr>
	<tr>
		<td>교과코드</td>
		<td>
			<select name="subcode">
				<option value="A001">A001-자바</option>
				<option value="A002">A002-C언어</option>
				<option value="A003">A003-데이터베이스</option>
				<option value="A004">A004-웹프로그래밍</option>
				<option value="A005">A005-영어</option>
			</select>
		</td>
	</tr>	
	<tr>
	<td>중간</td>
	<td><input type="number" name="midscore"></td>	
	</tr>
	<tr>
	<td>기말</td>
	<td><input type="number" name="finalscore"></td>	
	</tr>
	<tr>
	<td>출석</td>
	<td><input type="number" name="attend"></td>	
	</tr>
	<tr>
	<td>레포트</td>
	<td><input type="number" name="report"></td>	
	</tr>
	<tr>
	<td>기타</td>
	<td><input type="number" name="etc"></td>	
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="button" value="등록" onclick="add()">
			<input type="button" value="다시쓰기" onclick="res()">
		</td>
	</tr>
	
</table>


</form>



</section>




<jsp:include page="footer.jsp"/>
</body>
</html>