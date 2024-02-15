<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>



<section>


<div style="text-align: center;">
	<div><h2>${dto.pname }</h2></div>
	<div><img src="${cpath }/upload/${dto.pimg}" height="450"></div>
	<div>가격 : ${dto.price } 원</div>
	<div>수량 : ${dto.pvol } 개</div>
</div>
<div style="display: flex; justify-content: space-around;">
	<div>
		<a href="${cpath }/product/modify/${dto.idx}"><button>수량수정</button></a>
	</div>
	<div>
		<a href="${cpath }/product/delete/${dto.idx}"><button>삭제</button></a>
	</div>
</div>

</section>
</body>
</html>