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
			<p>백신접종 예약을 위한 프로그램이다.</p>
			<p>접종 예약,병워별 접종 건수,예약번호에 따라
			예약조회를 할 수 있도록 프로그램을 작성한다.</p>
		</article>
	</section>
	<footer>
		<p>HRDKIREA Copyright @ 2021 All rights reserved Human Resources Development Service of Korea</p>
	</footer>
	
	
	
</body>
</html>