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
	List<Member> list = (List<Member>) request.getAttribute("msg");
%>
<table border="1">
<tr>
<th>아이디</th>
<th>이름</th>
<th>삭제</th>
</tr>
<%
	for(int i=0; i<list.size(); i++) {
%>
<tr>
<td><%=list.get(i).getId()%></td>
<td><%=list.get(i).getName()%></td>
<td><input type="button" value="삭제" id="button<%=i %>" onclick="location.href='<%=application.getContextPath() %>/delete_one.jsp'"></td>
</tr>
<% 
	}
%>
</table>
<input type="button" value="메뉴" onclick="location.href='login_result.jsp'">
</body>
</html>