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
	String url = (String)request.getAttribute("url");

if(url == null)
	url = "/hello/hello.jsp";
%>

<table border="1" width="1000" height="500">
	<tr heigth="100">
		<td colspan="2">
			<jsp:include page="../module/header.jsp"/>
		</td>
	</tr>
	<tr heigth="300">
		<td width="200">
			<jsp:include page="../module/left.jsp"></jsp:include>
		</td>
		<td width="400">
			<jsp:include page="<%= url %>"></jsp:include>
		</td>
	</tr>
	<tr heigth="100">
		<td colspan="2">
			<jsp:include page="../module/footer.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>