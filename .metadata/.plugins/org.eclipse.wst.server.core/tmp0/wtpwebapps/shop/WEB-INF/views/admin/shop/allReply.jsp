<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap-theme.min.css">
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/resources/css/admin/shop/allReply.css" />
</head>
<body>
<div id="root">
	<header id="header">
		<div id="header_box">
			<%@ include file="../include/header.jsp" %>
		</div>
	</header>
	
	<nav id="nav">
		<div id="nav_box">
			<%@ include file="../include/nav.jsp" %>
		</div>
	</nav>
	
	<section id="container">
		<aside>
			<%@ include file="../include/aside.jsp" %>
		</aside>
		<div id="container_box">
			<ul>
				<c:forEach items="${reply}" var="reply">
					<li>
						<div class="replyInfo">
							<p>
								<span>작성자</span>${reply.userName} (${reply.userId})
							</p>
							<p>
								<span>작성된 상품</span><a href="/shop/view?n=${reply.gdsNum}">바로가기</a>
							</p>
						</div>
						
						<div class="replyContent">
							${reply.repCon}
						</div>
						
						<div class="replyControll">
							<form method="post">
								<input type="hidden" name="repNum" value="${reply.repNum}"/>
								<button type="submit" class="delete_${reply.repNum}_btn">삭제</button>
							</form>
						</div>
					</li>
				</c:forEach>
			</ul>
		</div>
	</section>
	
	<footer id="footer">
		<div id="footer_box">
			<%@ include file="../include/footer.jsp" %>
		</div>
	</footer>
</div>
</body>
</html>
