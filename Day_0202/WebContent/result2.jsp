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
	out.println("����� �̸��� [" +request.getParameter("person") + "] �̱��� "); 
	out.println("<br>");
	out.println("������ " +request.getParameter("sex") + "�̱���");
	out.println("<br>");
	out.println("������ " +request.getParameter("job") + "�̱���");
	out.println("<br>");
	String[] books = request.getParameterValues("books");
	for(int i=0; i<books.length; i++) {
		out.println("�оߴ� " +books[i] + "�̱���");
	}
	out.println("<br>");
	out.println("�Ҹ���" +request.getParameter("comments") + "�̱���");
%>
</body>
</html>