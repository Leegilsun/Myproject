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
	out.println("당신의 이름은 [" +request.getParameter("person") + "] 이군요 "); 
	out.println("<br>");
	out.println("성별은 " +request.getParameter("sex") + "이군요");
	out.println("<br>");
	out.println("직업은 " +request.getParameter("job") + "이군요");
	out.println("<br>");
	out.println("분야는" +request.getParameter("books") + "이군요");
	out.println("<br>");
	out.println("할말은" +request.getParameter("comments") + "이군요");
%>
</body>
</html>