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
         <h3>Board Insert~</h3>
         <p>글쓰고 빨리 지나가세요</p>
		</div>
	</div>
			<form action="insertBoard.bo" method="post">
 				<div class="input-group-text mb-3">
					<div class="input-group-text"><i class="fas fa-user"></i></div>
					<input type="text" name="title" class="form-control" id="title" required placeholder="제목....">
				</div>
				
				<div class="input-group-text mb-3">
					<div class="input-group-text"><i class="fas fa-user"></i></div>
					<input type="text" name="writer" class="form-control" id="writer" required placeholder="작성자명...">
				</div>
				
				<div class="input-group-text mb-3">
					<div class="input-group-text"><i class="fas fa-user"></i></div>
					<input type="text" name="content" class="form-control" id="content" required placeholder="내용....">
				</div>
				<button type="submit" class="btn btn-primary">글작성</button>

			</form>
</body>
</html>   