<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
   <title>Spring Framework</title>
   <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">   
   <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" 
      integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" 
      crossorigin="anonymous">
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>   
</head>
<body>
   <div class="container" align="center">
      <div class="mt-4 p-5 bg-primary text-white rounded">
         <h3>Board_Select!!!!</h3>
         <p>쓴거 보셈</p>
               </div>
        <table class="table table-hover">
			<thead>
				<th scope="col">글 번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자</th>
				<th scope="col">내용</th>
				<th scope="col">작성일자</th>
				<th scope="col">조회수</th>
			</thead>
			<tbody>
				<tr>
					<td scope="row">${ board.getSeq() }</td>
					<td>${ board.getTitle() }</a></td>
					<td>${ board.getWriter() }</td>
					<td>${ board.getContent() }</td>
					<td>${ board.getRegdate() }</td>
					<td>${ board.getCnt() }</td>
				</tr>
			</tbody>
		</table>
      <br>
       <div style="display:inline; white-space:nowrap;">
	  	<form action="updateBoard.bo" method="get">
	  		<input type="hidden" name="seq" id="seq" value="${board.getSeq()}"> 
			<button type="submit" class="btn btn-primary" >수정하기</button>
		</form>
		<form action="deleteBoard.bo" method="get">
			<input type="hidden" name="seq" id="seq" value="${board.getSeq()}"> 
			<button type="submit" class="btn btn-danger" >삭제하기</button>
		</form>
	</div>
   </div>      
</body>
</html>   