<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="result.jsp">
		이름 : <input type="text" name="name"> 
		<br> 
		<input type="submit" value="확인"> 
		<input type="reset" value="취소">
	</form>
	<!-- form태그는 type이 submit인 버튼이 눌릴경구 form태그 내부의 모든 엘리먼트의 값을 각 엘리먼트의 name의 값을 파라미터 이름으로, 엘리먼트의 값을 파라미터의 값으로 가지고 action속성값의 url로 요청 전달 -->
	<!-- submit타입을 가진 input엘리먼트는 버튼이 클릭되면 form태그가 가지는 action속성의 값으로 url요청을 날림 -->
	<!-- form태그 내부의 엘리먼트들의 name을 파라미터의 키 값으로 value를 파라미터의 값으로 가져감 -->
	<br>
</body>
</html>