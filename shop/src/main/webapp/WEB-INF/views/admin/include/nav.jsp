<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<ul>
<c:if test="${member != null}">
	<li>
		<a href="/">일반화면</a>
	</li>
	<li>
		<a href="/member/signOut">로그아웃</a>
	</li>
</c:if>
</ul>