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
		out.println("����� �̸��� [" + request.getParameter("name") + "] �̱��� ");
%>
<br>
<%
	String str1 = request.getParameter("name1");
	String str2 = request.getParameter("name2");
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
	out.println("�� ���� ���� "+ (num1+num2) + "�Դϴ�.");
%>
<br>
<input type="button" value="�ڷ�" onclick="history.go(-1)">
</body>
</html>