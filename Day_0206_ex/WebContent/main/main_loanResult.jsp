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
			<jsp:include 
			page="../module/header.jsp"/>
		</td>
	</tr>
	<tr>
		<td width="200">
			<jsp:include 
			page="../module/left.jsp"></jsp:include>
		</td>
		<td width="400">
			<jsp:include 
			page="../loan/loan_result.jsp"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<jsp:include 
			page="../module/footer.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>