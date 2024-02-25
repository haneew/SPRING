<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<style>
	table {
		text-align: center;
		margin: auto;
		padding: 0;
		
	}
</style>

<section>

	<table>
		<tr>
			<td><h2>${dto.title }</h2></td>
		</tr>
		
		<tr>
			<td>작성자 : ${dto.writer }</td>
		</tr>
		<tr>
			<td>작성 시간<fmt:formatDate value="${dto.writeDate }" pattern="yyyy년  MM월  dd일 HH시 mm분 ss초"/></td>
		</tr>
		<tr>
			<td><img src="${cpath }/upload/${dto.image}" height="450"></td>
		</tr>
		<tr>
			<td>파일명 : ${dto.image }</td>
		</tr>
		<tr>
			<td><textarea rows="10" cols="90">${dto.content }</textarea></td>
		</tr>
	</table>


<div style="margin: 30px 50px; text-align: right;">
	<a href="${cpath }/review/delete/${dto.idx}"><button>삭제</button></a>
</div>

</section>
</body>
</html>