<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>




<section>
	<h3>수량 수정</h3>
	
	상품명 : ${dto.pname }
	<form method="POST">
		
		<input type="number" name="pvol" value="${dto.pvol }">
		<input type="submit" value="수정하기">
	</form>
</section>

</body>
</html>