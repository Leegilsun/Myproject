<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>랄랄라</title>
<% Date date = new Date(); %>
</head>
<body>
현재시간<br>
<%= date %>
<%
	if(date.getHours() < 12) {
%>
오전이네요<br>

<%
	}
	else {
%>
오후이네요<br>
<% 	} %>
</body>
</html>