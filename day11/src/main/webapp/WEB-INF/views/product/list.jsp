<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<style>
	table.productList {
		border: 1px solid black;
		border-collapse: collapse;
		width: 800px;
		margin: 20px auto;
	}
	td, th {
		padding: 5px 10px;
		text-align: center;
	}
	tr {
		border-bottom: 1px solid grey;
	}
	table tr:first-child {
		background-color: #dadada;
	}
</style>

<section>
	<table class="productList">
		<tr>
			<th>상품이미지</th>
			<th>상품명</th>
			<th>가격</th>
			<th>수량</th>
		</tr>
		<c:forEach var="dto" items="${list }">
		<tr>
			<td><img src="${cpath }/upload/${dto.pimg}" height="100"></td>
			<td><a href="${cpath }/product/view/${dto.idx}">${dto.pname }</a></td>
			<td>${dto.price }</td>
			<td>${dto.pvol }</td>
		</tr>
		</c:forEach>
	</table>
	
	
	<div>
		<div style="text-align: right">
			<a href="${cpath }/product/add"><button>상품추가</button></a>
		</div>
	</div>
	
</section>

</body>
</html>