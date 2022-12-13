<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%
class student{
	int sno; String sname; String gender; int age;
	
	public student(int sno, String sname, String gender, int age){
		this.sno=sno;
		this.sname=sname;
		this.gender=gender;
		this.age=age;
	}
}

student std = new student(1000, "홍길동", "남자", 43);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%= std.sname %>은 학생번호 <%= std.sno %>번이며 </hr>
	성별은 <%= std.gender %>입니다. 나이는 <%= std.age %> 입니다.</h1>
	
	<!-- 실습. student 객체 생성 후 학생 1명의 정보를 출력하기(h1)
		번호 : 1000
		이름 : 홍길동
		성별 : 남자
		나이 : 43
		
		실습2. ArrayList를 이용해서 학생1명만 출력
		번호 : 2000
		이름 : 소향
		성별 : 여자
		나이 : 44
	 -->
	<%
	ArrayList<String> std2 = new ArrayList<>();
	std2.add("2000");
	std2.add("소향");
	std2.add("여자");
	std2.add("43");
	%>
	<h1>번호는 <%= std2.get(0) %></h1>
	<h1>이름은 <%= std2.get(1) %></h1>
	<h1>성별은 <%= std2.get(2) %></h1>
	<h1>나이는 <%= std2.get(3) %></h1>
</body>
</html>