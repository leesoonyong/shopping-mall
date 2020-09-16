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
<link rel="stylesheet" href="/resources/css/admin/goods/view.css" />
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
			<h2>상품 조회</h2>
			<form role="form" method="post">
				<input type="hidden" name="n" value="${goods.gdsNum}">
				<div class="inputArea">
					<label>1차 분류</label>
					<span class="category1"></span>
				
					<label>2차 분류</label>
					<span class="category2">${goods.cateCode}</span>		
				</div>
				
				<div class="inputArea">
					<label for="gdsName">상품명</label>
					<span>${goods.gdsName}</span>
				</div>
				<div class="inputArea">
					<label for="gdsPrice">상품가격</label>
					<span><fmt:formatNumber value="${goods.gdsPrice}" pattern="###,###,###"/></span>
				</div>
				<div class="inputArea">
					<label for="gdsStock">상품수량</label>
					<span>${goods.gdsStock}</span>
				</div>
				<div class="inputArea">
					<label for="gdsDes">상품소개</label>
					<div class="gdsDes">${goods.gdsDes}</div>
				</div>
				<div class="inputArea">
					<label for="gdsImg">이미지</label>
					<p>원본 이미지</p>
					<img src="${goods.gdsImg}" class="oriImg"/>
				</div>
				<div class="inputArea">
					<button type="button" id="modify_Btn" class="btn btn-warning">수정</button>
					<button type="button" id="delete_Btn" class="btn btn-danger">삭제</button>
				</div>
			</form>
		</div>
		<script>
			var formObj = $("form[role='form']");
			$("#modify_Btn").click(function() {
				formObj.attr("action", "/admin/goods/modify");
				formObj.attr("method","get")
				formObj.submit();
			})
			
			$("#delete_Btn").click(function(){
				var con = confirm("정말로 삭제하시겠습니까?");
				
				if(con){
					formObj.attr("action", "/admin/goods/delete");
					formObj.submit();
				}
			});
		</script>
	</section>
	
	<footer id="footer">
		<div id="footer_box">
			<%@ include file="../include/footer.jsp" %>
		</div>
	</footer>
</div>

</body>
</html>
