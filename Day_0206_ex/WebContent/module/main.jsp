<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1" width="1000" height="500">
	<tr heigth="100">
		<td colspan="2">
			<jsp:include page="header.jsp"/>
		</td>
	</tr>
	<tr heigth="300">
		<td width="200">
			<jsp:include page="left.jsp"></jsp:include>
		</td>
		<td width="400">
		</td>
	</tr>
	<tr heigth="50">
		<td colspan="2">
			<jsp:include page="footer.jsp"/>
		</td>
	</tr>
</table>

</body>
</html>