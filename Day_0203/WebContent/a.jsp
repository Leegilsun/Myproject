<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
hello a.jsp
<%
	System.out.println("나 a.jsp");
	
	String name = "Lee";
%>

<jsp:forward page="b.jsp">
	<jsp:param value="<%=name %>" name="name"/>
</jsp:forward>
</body>
</html>