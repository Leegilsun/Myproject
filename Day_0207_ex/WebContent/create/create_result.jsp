<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 가입 성공</title>
</head>
<body>
<%
	String msg = (String) request.getAttribute("msg");
	out.println(msg);
%>
<input type="button" value="로그인" onclick="location.href='login.jsp'">
</body>
</html>