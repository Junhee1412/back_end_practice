<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>

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
	h1{
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

<script>
	function formcheck(){
		let resvno = document.getElementById('resvno').value;
		if(resvno==''){
			alert('예약번호를 입력해주세요!');
			return false;
		}
	}
</script>
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
		<form action="/test/res/selectRes.jsp" onsubmit="return formcheck();">
			<table>
				<tr><td colspan="2"><h1>접종예약조회</h1></td></tr>
				<tr><th>예약번호를 입력하세요</th><td><input type="text" id="resvno" name="resvno" maxlength="8"/></td></tr>
				<tr style="text-align: cetner;"><td colspan="2"><input type="submit" value="예약조회"/><button type="button">홈으로</button></td></tr>
			</table>
		</form>
		
	</section>
	<footer>
		<p>HRDKIREA Copyright @ 2021 All rights reserved Human Resources Development Service of Korea</p>
	</footer>
	
	
	
</body>
</html>