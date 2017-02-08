<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%! String str = "main.jsp"; %>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="1000" height="500">
<tr height="100">
<td colspan="2"><jsp:include page="header.jsp" flush="false"></jsp:include></td>
</tr>
<tr height="300">
<td width="100"><jsp:include page="left.jsp" flush="false"></jsp:include></td>
<td><</td>
<tr height="100">
<td colspan="2"><jsp:include page="footer.jsp" flush="false"></jsp:include></td>
</tr>
</table>
</body>
</html>