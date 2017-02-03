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
	int result=0;
	if(type.equals("1"))
	{
		result = num1 + num2;
		url = "add.jsp";
	}
	else if(type.equals("2"))
	{
		result = num1 - num2;
		url = "sub.jsp";
	}
	else if(type.equals("3"))
	{
		result = num1 * num2;
		url = "mult.jsp";
	}
%>
<jsp:forward page="<%= url %>">
	<jsp:param value="<%=result %>" name="result"/>
</jsp:forward>

<!-- forward될 경우 a.jsp에너나 b.jsp에서나 서로 같은 request객체를 유지하고 있음  -->
</body>
</html>