<%@page import="java.sql.*"%>
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
		let resvno = document.getElementById('resvno');
		if(resvno.value==''){
			alert('예약번호를 입력해주세요!');
			resvno.focus();
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
	
			<%String resvno = request.getParameter("resvno");
			System.out.print(resvno);
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","1234");
			PreparedStatement pstmt = null;
			ResultSet rs=null;
			String sql = "select pname, r.jumin jumin, tel, resvdate, resvtime, hospname, hosptel, hospaddr, vcode from tbl_baccresv_202108 r,tbl_hosp_202108 h,tbl_jumin_201808 j where r.jumin = j.jumin and r.hospcode=h.hospcode and r.resvno = ?";
			
			try{
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, resvno);
			rs = pstmt.executeQuery();
			if(rs.next()){                                      
				System.out.print("확인용");
				String pname = rs.getString("pname");
				String jumin = rs.getString("jumin");
				String tel = rs.getString("tel");
				String resvdate = rs.getString("resvdate");
				String resvtime = rs.getString("resvtime");
				String hospname = rs.getString("hospname");
				String hosptel = rs.getString("hosptel");
				String hospaddr = rs.getString("hospaddr");
				String vcode = rs.getString("vcode");
				String gender = null;
				
				String vcname = null;
				
				switch(vcode){
					case "V001" : vcname="A백신";break;
					case "V002" : vcname="B백신";break;
					case "V003" : vcname="C백신";break;
				}

				char g = jumin.split("-")[1].charAt(0);
				System.out.print(g);	
				if(g=='1'){
					gender = "남자";
				}else if(g=='2'){
					gender = "여자";
				}
				
				
				%>
				<table>
				<tr><td colspan="10"><h1>예약번호:<%=resvno %>의 접종예약조회</h1></td></tr>
				<tr><th>이름</th><th>주민번호</th><th>성별</th><th>전화번호</th><th>예약일자</th><th>예약시간</th><th>병원명</th><th>대표전화</th><th>병원주소</th><th>백신종류</th></tr>
				<tr><td><%=pname%></td><td><%=jumin%></td><td><%=gender %></td><td><%=tel%></td><td><%=resvdate%></td><td><%=resvtime%></td><td><%=hospname%></td><td><%=hosptel%></td><td><%=hospaddr%></td><td><%=vcname%></td></tr>
			</table>
			<% 
			}else{
				%>
					<h1>입력된 결과가 없습니다!</h1>
					<button onclick="history.go(-1)">이전으로 돌아가기</button>
				<% 
			}
			}catch(Exception e){
				e.printStackTrace();
			}
			
			%>
		
	</section>
	<footer>
		<p>HRDKIREA Copyright @ 2021 All rights reserved Human Resources Development Service of Korea</p>
	</footer>
	
	
	
</body>
</html>