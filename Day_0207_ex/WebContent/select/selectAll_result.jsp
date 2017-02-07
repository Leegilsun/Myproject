<%@page import="model.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<Member> list = (List) request.getAttribute("msg");
	for(int i=0; i<list.size(); i++) {
		out.println(list.get(i).toString()+"<br>");
	}
%>
<input type="button" value="메뉴" onclick="location.href='login_result.jsp'">
</body>
</html>