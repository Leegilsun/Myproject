<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>답은 곱하기다</title>
</head>
<body>
나는 mult
<br><br>
<%
	int result = Integer.parseInt(request.getParameter("result"));
	
	out.println(result);
%>
</body>
</html>