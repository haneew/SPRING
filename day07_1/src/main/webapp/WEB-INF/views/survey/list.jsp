<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>    

<style>
	table {
		border-collapse: collapse;
		width: 800px;
		margin: 20px auto;
	}
	td, th {
		padding: 10px;
	}
	thead > tr {
		background-color: silver;
	}
	tbody > tr {
		border-bottom:  1px solid grey;
	}
	tbody > tr:hover {
		background-color: #eee;
	}
	thead > tr > th:nth-child(1) { width: 10%; }
	thead > tr > th:nth-child(2) { width: 50%; }
	thead > tr > th:nth-child(3) { width: 10%; }
	thead > tr > th:nth-child(4) { width: 15%; }
	tbody > tr > td {
		text-align:  center;
	}
	tbody > tr > td:nth-child(2) {
		text-align: left;
	}
</style>

<section>



	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list }">
				<tr>
					<td>${dto.idx }</td>
					<td>
						<a href="${cpath }/survey/view/${dto.idx}">
							${dto.title }
						</a>
					</td>
					<td>${dto.writer }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	
	
</section>





</body>
</html>