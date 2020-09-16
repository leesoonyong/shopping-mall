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
<link rel="stylesheet" href="/resources/css/user/shop/view.css" />
<script>

	function replyList(){
		var gdsNum = ${view.gdsNum};
		$.getJSON("/shop/view/replyList" + "?n=" + gdsNum, function(data){
			var str = "";
			$(data).each(function(){
				
				console.log(data);
				
				var repDate = new Date(this.repDate);
				repDate = repDate.toLocaleDateString("ko-US")
				
				str += "<li data-repNum='" + this.repNum + "'>"
					+ "<div class='userInfo'>"
					+ "<span class='userName'>" + this.userName + "</span>"
					+ "<span class='date'>" + repDate + "</span>"
					+ "</div>"
					+ "<div class='replyContent'>" + this.repCon + "</div>"
					
					+ "<c:if test='${member != null}'>"
					+ "<div class='replyFooter'>"
					+ "<button type='button' class='modify' data-repNum='" + this.repNum +"'>수정</button>"
					+ "<button type='button' class='delete' data-repNum='" + this.repNum +"'>삭제</button>"
					+ "</div>"
					+ "</c:if>"
					
					+ "</li>";
			});
			$("section.replyList ol").html(str);
		});
	}
	
	
	
	$(document).on("click", ".delete" , function(){
		var deleteConfirm = confirm("정말로 삭제하시겠습니까?");
		
		if(deleteConfirm){
			
			var data = {repNum : $(this).attr("data-repNum")};
	
			
			$.ajax({
				url : "/shop/view/deleteReply",
				type : "post",
				data : data,
				success : function(result){
					if(result == 1){
						replyList();
					}else{
						alert("작성자 본인만 할 수 있습니다.")
					}
				},
				error : function(){
					alert("로그인하셔야합니다.");
				}
			});
		}
	});
	

</script>
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
		<div id="container_box">
			<section id = "content">
				<form role="form" method="post">
					<input type="hidden" name="gdsNum" value="${view.gdsNum}">
				</form>
				<div class="goods">
					<div class="goodsImg">
						<img src = "${view.gdsImg}">					
					</div>
					
					<div class="goodsInfo">
						<p class="gdsName"><span>상품명</span>${view.gdsName}</p>
						
						<p class="cateName"><span>카테고리</span>${view.cateName}</p>
						
						<p class="gdsPrice">
							<span>가격</span><fmt:formatNumber pattern="###,###,###" value="${view.gdsPrice}"/>원
						</p>	
						
						<p class="gdsStock">
							<span>재고</span><fmt:formatNumber pattern="###,###,###" value="${view.gdsStock}"/>EA
						</p>	
						<c:if test="${view.gdsStock != 0}">
						<p class="cartStock">
							<span>구입 수량</span>
							<button type="button" class="plus">+</button>
							<input type="number"  class="numBox" min="1" max="${view.gdsStock}" value="1" readonly="readonly"/>
							<button type="button" class="minus">-</button>
						</p>
						
						<p class="addToCart">
							<button type="button" class="addCart_btn">카트에 담기</button>
							<script>
								$(".addCart_btn").click(function(){
									var gdsNum = $("#gdsNum").val();
									var cartStock = $(".numBox").val();
									
									var data = {
											gdsNum : gdsNum,
											cartStock : cartStock
									};
									
									$.ajax({
										url : "/shop/view/addCart",
										type : "post",
										data : data,
										success : function(result){
											if(result == 1){
												alert("카트 담기 성공")
												$(".nunBox").val("1");
											} else{
												alert("회원만 사용할 수 있습니다.")
												$(".nunBox").val("1");
											}
										},
										error : function(){
											alert("카드 담기 실패");
										}
									})
								});
							</script>
						</p>
						</c:if>
						<c:if test="${view.gdsStock == 0}">
							<p>상품 수량이 부족합니다.</p>
						</c:if>
					</div>
					
					<div class="gdsDes">${view.gdsDes}</div>
				</div>
				<div id="reply">
					<c:if test="${member == null}">
						<p>리뷰를 남기시려면<a href="/member/signIn">로그인</a>해주세요</p>
					</c:if>
					<c:if test="${member != null}">
					<section class="replyForm">
						<form method="post">
							<input type="hidden" name="gdsNum" id="gdsNum" value="${view.gdsNum}">
							<div class="input_area">
								<textarea name="repCon" id="repCon"></textarea>
							</div>	
							<div class="input_area">
								<button type="button" id="reply_btn">리뷰 남기기</button>
							</div>			
						</form>
					</section>
					</c:if>
					<section class="replyList">
						<ol>
							<%-- 
							<c:forEach items="${reply}" var="reply">
							<li>
								<div class="userInfo">
								<span class="userName">${reply.userName}</span>
								<span class="date"><fmt:formatDate value="${reply.repDate}" pattern="yyyy-MM-dd"/></span>
								</div>
								<div class="replyContent">${reply.repCon}</div>
							</li>
							</c:forEach>
							--%>
						</ol>
						<script>
							replyList();
						</script>
						<script>
							$(document).on("click", ".modify", function(){
								$(".replyModal").fadeIn(200);
								
								var repNum = $(this).attr("data-repNum");
								var repCon = $(this).parent().parent().children(".replyContent").text();
								
								$(".modal_repCon").val(repCon);
								$(".modal_modify_btn").attr("data-repNum", repNum);
								
							});
						</script>
					</section>
				</div>
			</section>	
		</div>
	</section>
	<footer id="footer">
		<div id="footer_box">
			<%@ include file="../include/footer.jsp" %>
		</div>
	</footer>
</div>
<div class="replyModal">
	<div class="modalContent">
		<div>
			<textarea class="modal_repCon" name="modal_repCon" ></textarea>
		</div>
		
		<div>
			<button type="button" class="modal_modify_btn">수정</button>
			<button type="button" class="modal_cancel">취소</button>
		</div>
	</div>
	
	<div class="modalBackGround"></div>
</div>

<script>
	 $(".plus").click(function(){
		   var num = $(".numBox").val();
		   var plusNum = Number(num) + 1;
		   
		   if(plusNum >= ${view.gdsStock}) {
		    $(".numBox").val(num);
		   } else {
		    $(".numBox").val(plusNum);          
		   }
	});
		  
	$(".minus").click(function(){
		   var num = $(".numBox").val();
		   var minusNum = Number(num) - 1;
		   
		   if(minusNum <= 0) {
		    $(".numBox").val(num);
		   } else {
		    $(".numBox").val(minusNum);          
		   }
	});
	
	$("#reply_btn").click(function(){
		var formObj = $(".replyForm form[role='form']");
		var gdsNum = $("#gdsNum").val();
		var repCon = $("#repCon").val();
		
		var data = {
				gdsNum : gdsNum,
				repCon : repCon
		};
		
		$.ajax({
			url : "/shop/view/registReply",
			type : "post",
			data : data,
			success : function(){
				replyList();
				$("#repCon").val("");
			}
		});
	});
	

	
	$(".modal_cancel").click(function(){
		$(".replyModal").fadeOut(200);
	});
	
	
	
	$(".modal_modify_btn").click(function(){
		 var modifyConfirm = confirm("정말로 수정하시겠습니까?");
		 
		 
		 
		 if(modifyConfirm){
			 var data = {repNum : $(this).attr("data-repNum"),
					 	 repCon : $(".modal_repCon").val()};
			 
			 
			 
			 $.ajax({
				 url : "/shop/view/modifyReply",
				 type : "post",
				 data : data,
				 success : function(result){
					 
					 //result 값에 따라 동작
					 if(result == 1){
						 replyList();
						 $(".replyModal").fadeOut(200);
					 }else{
						 alert("작성자 본인만 할 수 있습니다.")
					 }
				 },
				 error : function(){
					 alert("로그인하셔야합니다.")
				 }
			 });			 
		 }
	});	

			
</script>
</body>
</html>