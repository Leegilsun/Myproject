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
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String type = request.getParameter("type");
	String url = "";
	if(type.equals("1"))
	{
		url = "add.jsp";
	}
	else if(type.equals("2"))
	{
		url = "sub.jsp";
	}
	else if(type.equals("3"))
	{
		url = "mult.jsp";
	}
%>
<jsp:forward page="<%= url %>">
	<jsp:param value="<%=num1 %>" name="num1"/>
	<jsp:param value="<%=num2 %>" name="num2"/>	
</jsp:forward>

<!-- forward�� ��� a.jsp���ʳ� b.jsp������ ���� ���� request��ü�� �����ϰ� ����  -->
</body>
</html>