<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>



<section style="text-align: center;">
	<h3>로그인</h3>
	<form method="POST">
		<p><input type="text" name="userid" placeholder="ID" required autofocus></p>
		<p><input type="password" name="userpw" placeholder="Password" required></p>
		<p class=""><input type="submit" value="로그인"></p>
		
		<div style="display: flex; justify-content: space-around;">
			<div>
				<a href="${cpath }/account/join">가입하기</a>
			</div>
			<div>
				<a href="${cpath }/account/resetPass">비밀번호 재설정</a>
			</div>
		</div>
	</form>
</section>
</body>
</html>