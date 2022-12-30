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
         <h3>BoardList!!!!!!!!</h3>
         <p>하기싫은데 억지로 만드는중.....</p>
         	<c:if test="${ boardList.isEmpty() }">
				<h5><p class="bg-danger text-white">등록된 글정보가 존재하지 않습니다!!</p></h5>
			</c:if>
      </div>
      <br>
      
      <table class="table table-hover">
			<thead>
				<th scope="col">글 번호</th>
				<th scope="col">제목</th>
				<th scope="col">작성자</th>
				<th scope="col">내용</th>
				<th scope="col">작성일자</th>
				<th scope="col">조회수</th>
				<th scope="col">삭제</th>
			</thead>
			<tbody>
			<c:forEach var="board" items="${ boardList }">
				<tr>
					<td scope="row">${ board.getSeq() }</td>
					<td><a href="selectBoard.bo?seq=${board.getSeq()}">${ board.getTitle() }</a></td>
					<td>${ board.getWriter() }</td>
					<td>${ board.getContent() }</td>
					<td>${ board.getRegdate() }</td>
					<td>${ board.getCnt() }</td>
					<td align="center">
						<a href="deleteBoard.bo?seq=${ board.getSeq() }" class="btn btn-danger"><i class="fas fa-trash"></i></a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<div class="container">
		<div class="row">
			<div class="col-sm-auto">
				<ul class="pagination justify-content-center">	
					<button type="button" class="btn btn-primary" ><a href="board/board_insert.jsp" style="color:white;text-decoration: none;">글작성하기</a></button>
				&nbsp;&nbsp;&nbsp;&nbsp;
					<c:if test="${ pageVO.getStartPage() != 1 }">
						<li class="page-item"><a href="boardList.bo?p=1" class="page-link"><i class="fas fa-fast-backward"></i></a></li>
						<li class="page-item"><a href="boardList.bo?p=${ pageVO.getStartPage() - 10 }" class="page-link"><i class="fas fa-backward"></i></a></li>				
					</c:if>

					<c:set var="cp" value="${ pageVO.getCurrentPage() }"/>

					<c:forEach var="page" begin="${ pageVO.getStartPage() }" end="${ pageVO.getEndPage() }">
						<li class="page-item ${ (cp==page) ? 'active' : ''}"><a href="boardList.bo?p=${page}" class="page-link">${page}</a></li>
					</c:forEach>

					<c:if test="${ pageVO.getEndPage() < pageVO.getTotalPages() }">
						<li class="page-item"><a href="boardList.bo?p=${ pageVO.getEndPage() + 1 }" class="page-link"><i class="fas fa-forward"></i></a></li>				
						<li class="page-item"><a href="boardList.bo?p=${ pageVO.getTotalPages() }" class="page-link"><i class="fas fa-fast-forward"></i></a></li>				
					</c:if>
				</ul>
			</div>
		</div>
	</div>	
		
		
		
   </div>      
</body>
</html>   