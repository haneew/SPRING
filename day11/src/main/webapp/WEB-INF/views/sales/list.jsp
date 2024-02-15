<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>


<section>
	<form method="POST">
		<table class="salesList">
			<tr>
				<th>상품이미지</th>
				<th>상품명</th>
				<th>가격</th>
				<th>판매수량</th>
			</tr>
			<c:forEach var="dto" items="${list }">
			<tr>
				<td><img src="${cpath }/upload/${dto.pimg}" height="100"></td>
				<td><a href="${cpath }/product/view/${dto.idx}">${dto.pname }</a></td>
				<td>${dto.price }</td>
				<td><input type="number" value="svol"></td>
			</tr>
			</c:forEach>
		</table>
	</form>

</section>

</body>
</html>