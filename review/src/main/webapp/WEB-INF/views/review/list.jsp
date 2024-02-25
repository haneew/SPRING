<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<style>
	table {
	  width: 800px;
	  border-collapse: collapse;
	  overflow: hidden;
	  box-shadow: 0 0 20px rgba(0,0,0,0.1);
	}
	
	th,
	td {
	  padding: 15px;
	  background-color: rgba(255,255,255,0.2);
	  color: black;
	}
	
	th {
	  text-align: left;
	}
	
	thead {
	  th {
	    background-color: #55608f;
	  }
	}
</style>


<section>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.idx }</td>
				<td><a href="${cpath }/review/view/${dto.idx}">${dto.title }</a></td>
				<td>${dto.writer }</td>
				<td><fmt:formatDate value="${dto.writeDate }" pattern="yyyy년  MM월  dd일"/></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<div style="text-align: right; margin: auto;">
		<a href="${cpath }/review/write"><button>리뷰 작성</button></a>
	</div>
	
</section>


</body>
</html>