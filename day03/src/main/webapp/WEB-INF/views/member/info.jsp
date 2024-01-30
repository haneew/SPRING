<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<h1>회원 상세 정보</h1>
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<td>아이디</td>
			<td>${dto.userid }</td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td>${dto.userpw }</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${dto.username }</td>
		</tr>
		<tr>
			<td>성별</td>
			<td>${dto.gender }</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>${dto.email }</td>
		</tr>
	</table>
	
	
	
	<p>
		<a href="${cpath }/member/modify/${dto.idx}"><button>정보수정</button></a>
	</p>
</section>
</body>
</html>