<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
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
</style>
</head>
<body>

<header>
	<h1 style="text-align: center;"><a href="${cpath }">PRODUCT</a></h1>
	
	<nav>
		<ul>
			<li><a href="${cpath }/product/list">Product</a></li>
			<li><a href="${cpath }/sales/list">Sales</a></li>
		</ul>
	</nav>
	
</header>


</body>
</html>