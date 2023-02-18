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
		let resvno = document.getElementById('resvno');
		let jumin = document.getElementById('jumin');
		let vcode = document.getElementById('vcode');
		let hospcode = document.getElementById('hospcode');
		let resvdate = document.getElementById('resvdate');
		let resvtime = document.getElementById('resvtime');
		
		if(resvno.value==''){
			alert('접종예약번호가 입력되지 않았습니다.');
			resvno.focus();
			return false;
		}else if(jumin.value==''){
			alert('주민번호가 입력되지 않았습니다.')
			jumin.focus();
			return false;
		}else if(vcode.value==''){
			alert('백신코드가 입력되지 않았습니다.')
			vcode.focus();
			return false;
		}else if(hospcode.value==''){
			alert('병원코드가 입력되지 않았습니다.')
			hospcode.focus();
			return false;
		}else if(resvdate.value==''){
			alert('예약일자가 입력되지 않았습니다.')
			resvdate.focus();
			return false;
		}else if(resvtime.value==''){
			alert('예약시간이 입력되지 않았습니다.')
			resvtime.focus();
			return false;
		}
	}
	function rewrite(){
		document.getElementById('resvno').value='';
		document.getElementById('jumin').value='';
		document.getElementById('vcode').value='';
		document.getElementById('hospcode').value='';
		document.getElementById('resvdate').value='';
		document.getElementById('resvtime').value='';
		alert('다시작성합니다!');
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
			<li><a href="/test/res/index.jsp">홈으로</a></li>
		</ul>
	</nav>
	<section>
		<article>
			<form action="/test/res/insertRes.jsp" onsubmit="return formcheck();">
				<table>
					<tr><td colspan="3"><h1>백신접종예약</h1></td></tr>
					<tr><th>접종예약번호</th><td><input type="text" id="resvno" name="resvno" maxlength="8" value=""></td><td>예)20210001</td></tr>
					<tr><th>주민번호</th><td><input type="text" id="jumin" name="jumin" maxlength="14"></td><td>예)710101-1000001</td></tr>
					<tr><th>백신코드</th><td><input type="text" id="vcode" name="vcode" maxlength="4"></td><td>예)V001~V003</td></tr>
					<tr><th>병원코드</th><td><input type="text" id="hospcode" name="hospcode" maxlength="4"></td><td>예)H001</td></tr>
					<tr><th>예약일자</th><td><input type="text" id="resvdate" name="resvdate" maxlength="8"></td><td>예)20211231</td></tr>
					<tr><th>예약시간</th><td><input type="text" id="resvtime" name="resvtime" maxlength="4"></td><td>예)1230</td></tr>
					<tr><td colspan="3" style="text-align: center;"><input type="submit" value="등록"/><button type="button" onclick="rewrite()">다시쓰기</button></td></tr>
				</table>
			</form>
		</article>
	</section>
	<footer>
		<p>HRDKIREA Copyright @ 2021 All rights reserved Human Resources Development Service of Korea</p>
	</footer>
	
	
	
</body>
</html>