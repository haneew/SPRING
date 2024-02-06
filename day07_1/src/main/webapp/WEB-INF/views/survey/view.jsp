<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<section>
<div style="text-align: center;">
	<div style="margin: 50px auto;">${dto.title }</div>
	<div style="display: flex; justify-content: space-around;">
		<div>
			<img src="${cpath }/upload/${dto.image1}" height="300">
			<pre>${dto.content1 }</pre>
		</div>
		<div>
			<img src="${cpath }/upload/${dto.image2}" height="300">
			<pre>${dto.content2 }</pre>
		</div>
	</div>
</div>

<form style="text-align: center;">
	<p>
		<label><input type="radio" name="choice" value="1">1</label>
		<label><input type="radio" name="choice" value="2">2</label>
	</p>
	<p><input type="submit" value="선택완료"></p>
</form>
</section>
</body>
</html>