<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="600">
	<tr>
		<td colspan="2">
			<jsp:include page="header.jsp"/>
		</td>
	</tr>
	<tr>
		<td width="200">
			<jsp:include page="left.jsp"></jsp:include>
		</td>
		<td width="400">
			여기 내용만 다른 페이지임...
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<jsp:include page="footer.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>