<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 	header, section {
 		width: 900px; 
 		margin: auto; 
	} 
 	nav { 
 		margin: 40px 0; 
 	} 
	ul { 
 	 display: flex; 
 	 padding: 0;
 	 list-style: none; 
 	 justify-content: space-around; 
 	} 
	.a {
	 text-decoration: none;
	}
	

</style>

</head>
<body>

<header>
	<h1 style="text-align: center;"><a href="${cpath }">Review</a></h1>
	
	<div style="height: 30px; text-align: right">
		<c:if test="${not empty login }">
		<p>
			${login.userid }님이 로그인 중
			<a href="${cpath }/account/logout"><button>로그아웃</button></a>
		</p>
		</c:if>
	</div>
	
	<nav>
		<ul>
			<li><a href="${cpath }/account/login">로그인</a></li>
			<li><a href="${cpath }/review/list">리뷰목록</a></li>
		</ul>
	</nav>
</header>
	<hr>

</body>
</html>