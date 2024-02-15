<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	
	<h3>상품 추가</h3>
	
	<form method="POST" enctype="multipart/form-data">
		<div><input type="text" name="pname" placeholder="상품명" required autofocus></div>
		<div><input type="file" name="upload" required></div>
		<div><input type="number" name="price" placeholder="상품가격" required></div>
		<div><input type="number" name="pvol" placeholder="갯수" required></div>
		<div><input type="submit" value="등록"></div>
	</form>


</section>
</body>
</html>