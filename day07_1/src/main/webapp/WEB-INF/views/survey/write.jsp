<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
<form method="POST" enctype="multipart/form-data">
	<table>
		<tr>
			<td><input type="text" name="title" placeholder="제목"></td>
		</tr>
		<tr>
			<td><input type="text" name="writer" value="${login.userid }" readonly></td>
		</tr>
		<tr>
			<td><input type="file" name="upload1" required></td>
		</tr>
		<tr>
			<td><textarea name="content1" placeholder="1번 내용 작성"
						style="resize: none; width: 300px; height: 200px;"></textarea></td>
		</tr>
		<tr>
			<td><input type="file" name="upload2" required></td>
		</tr>
		<tr>
			<td><textarea name="content2" placeholder="2번 내용 작성"
						style="resize: none; width: 300px; height: 200px;"></textarea></td>
		</tr>
	</table>
		<input type="submit" value="작성완료">
</form>
</section>


</body>
</html>