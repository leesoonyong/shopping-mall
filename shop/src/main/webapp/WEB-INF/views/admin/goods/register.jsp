<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<script src="/resources/ckeditor/ckeditor.js"></script>
<link rel="stylesheet" href="/resources/css/admin/goods/register.css" />
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
			<h2>상품 등록</h2>
			<form method="post" enctype="multipart/form-data">
				<div class="inputArea">
					<label>1차 분류</label>
					<select class="category1">
						<option value="">전체</option>
					</select>
				
					<label>2차 분류</label>
					<select class="category2" name="cateCode"> 
						<option value="">전체</option>
					</select>			
				</div>
				
				<div class="inputArea">
					<label for="gdsName">상품명</label>
					<input type="text" id="gdsName" name="gdsName"/>
				</div>
				<div class="inputArea">
					<label for="gdsPrice">상품가격</label>
					<input type="text" id="gdsPrice" name="gdsPrice"/>
				</div>
				<div class="inputArea">
					<label for="gdsStock">상품수량</label>
					<input type="text" id="gdsStock" name="gdsStock"/>
				</div>
				<div class="inputArea">
					<label for="gdsDes">상품소개</label>
					<textarea rows="5" cols="50" id="gdsDes" name="gdsDes"></textarea>
				</div>
				<script>
					var ckeditor_config = {
						resize_enaleb : false,
						enterMode : CKEDITOR.ENTER_BR,
						shiftEnterMode : CKEDITOR.ENTER_P,
						filebrowserUploadUrl : "/admin/goods/ckUpload"
					};
					
					CKEDITOR.replace("gdsDes", ckeditor_config);
				</script>
				<div class="inputArea">
					<label for="gdsImg">상품 이미지</label>
					<input type="file" id="gdsImg" name="file"/>
					<div class="select_img"><img src=""/></div>
				</div>
				<div class="inputArea">
					<button type="submit" id="register_Btn" class="btn btn-primary">등록</button>
				</div>
			</form>
		</div>
	</section>
	
	<footer id="footer">
		<div id="footer_box">
			<%@ include file="../include/footer.jsp" %>
		</div>
	</footer>
</div>
<script>
//컨트롤러에서 데이터 받기
var jsonData = JSON.parse('${category}');
console.log(jsonData);

var cate1Arr = new Array();
var cate10bj = new Object();


//1차 분류 셀렉트 박스에 삽입할 데이터
for(var i = 0; i< jsonData.length; i++){
	if(jsonData[i].level == "1"){
		cate10bj = new Object();
		cate10bj.cateCode = jsonData[i].cateCode;
		cate10bj.cateName = jsonData[i].cateName;
		cate1Arr.push(cate10bj);
	}
}
//1차 분류 셀렉트 박스에 데이터삽입
var cate1Select = $("select.category1")

for(var i = 0; i < cate1Arr.length; i++) {
 cate1Select.append("<option value='" + cate1Arr[i].cateCode + "'>"
      + cate1Arr[i].cateName + "</option>"); 
}

$(document).on("change","select.category1",function(){
	var cate2Arr = new Array();
	var cate2Obj = new Object();
	
	//2차 분류 셀렉트 박스에 삽입할 데이터 준비
	for(var i = 0; i < jsonData.length; i++){
		if(jsonData[i].level == "2"){
			cate2Obj = new Object();
			cate2Obj.cateCode = jsonData[i].cateCode;
			cate2Obj.cateName = jsonData[i].cateName;
			cate2Obj.cateCodeRef = jsonData[i].cateCodeRef;
			
			cate2Arr.push(cate2Obj);
		}
	}
	
	var cate2Select = $("select.category2")
	/*
	for(var i = 0; i < cate2Arr.length; i++){
		cate2Select.append("<option value='" + cate2Arr[i].cateCode + "'>"
							+ cate2Arr[i].cateName + "</option>");
	}
	*/
	cate2Select.children().remove();
	$("option:selected", this).each(function(){
		var selectVal = $(this).val();
		cate2Select.append("<option value='"+ selectVal +"'>전체</option>");
		
		for(var i = 0; i < cate2Arr.length; i++){
			if(selectVal == cate2Arr[i].cateCodeRef){
				cate2Select.append("<option value='" + cate2Arr[i].cateCode + "'>"
									+ cate2Arr[i].cateName + "</option>");
			}
		}
	})
});

/*상품 이미지 스크립트*/
$("#gdsImg").change(function(){
	if(this.files && this.files[0]){
		var reader = new FileReader;
		reader.onload = function(data){
			$(".select_img img").attr("src", data.target.result).width(500);
		}
		reader.readAsDataURL(this.files[0]);
	}
});

//상품 가격 및 수량에 숫자체크(정규표현식)
var regExp = /[^0-9]/gi;

$("#gdsPrice").keyup(function(){
	numCheck($(this));
})

$("#gdsStock").keyup(function(){
	numCheck($(this));
})

function numCheck(selector){
	var tempVal = selector.val();
	selector.val(tempVal.replace(regExp,""));
}

</script>
</body>
</html>
