<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인</title>
</head>
<body>
	<section id="container">
		<div id="container_box">
			<section id="content">
				<form method="post">
					<div class="input_area">
						<label for="userId">아이디</label>
						<input type="email" id="userId" name="userId" required="required">		
					</div>
					<div class="input_area">
						<label for="userPass">패스워드</label>
						<input type="password" id="userPass" name="userPass" required="required">		
					</div>
	
					<button type="submit" id="signIn_btn" name="signIn_btn">로그인</button>
					<c:if test="${msg==false }">
						<p style="color:#f000;">로그인에 실패했습니다.</p>
					</c:if>
				</form>
			</section>
		</div>
	</section>
</body>
</html>