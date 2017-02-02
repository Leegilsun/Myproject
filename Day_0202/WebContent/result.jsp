<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	if(request.getParameter("name") != null)
		out.println("당신의 이름은 [" + request.getParameter("name") + "] 이군요 ");
%>
<br>
<%
	String str1 = request.getParameter("name1");
	String str2 = request.getParameter("name2");
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
	out.println("두 수의 합은 "+ (num1+num2) + "입니다.");
%>
<br>
<input type="button" value="뒤로" onclick="history.go(-1)">
</body>
</html>