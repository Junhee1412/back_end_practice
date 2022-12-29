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
			<h3>Log In</h3>
			<c:if test="${ !sessionScope.isLoginSuccess }">
				<h5 class="bg-danger text-white">사용자를 찾지 못했습니다!!!</h5>
			</c:if>
			<c:if test="${ sessionScope.matchedPassword != null && !sessionScope.matchedPassword }">
				<h5 class="bg-danger text-white">비밀번호가 틀립니다!!!</h5>
			</c:if>
			
			<p>상세설명......................</p>
			
		</div>
		<br>
		
		<form action="login.do" method="post">
            <div class="row">
	   			<div class="col input-group">
			      	<div class="input-group-text"><i class="fas fa-user"></i></div>
			      	<input type="text" name="id" class="form-control" id="id" value="${ userVO.id }" placeholder="User Id(eMail)...">
			    </div>
	
			    <div class="col input-group">
			      <div class="input-group-text"><i class="fas fa-lock"></i></div>
			      <input type="password" name="password" class="form-control" id="password" value="${ userVO.password }" placeholder="Password..."> 
	   			</div>
	    
			    <div class="col input-group mt-sm-2">
			      <label class="form-check-label">
			        <input class="form-check-input" type="checkbox" name="remember"> Remember me
			      </label>
			    </div>
			    
	  		  	<div class="col input-group justify-right">
			    	<button type="submit" class="btn btn-primary">Submit</button>
			    </div>
			</div>
		</form>	
		
	</div>		
</body>
</html>		















	