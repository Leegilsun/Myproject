<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%
	int[] temp = new int[10];
%>
<body>
	<h1>�������� ���� �������� ����</h1>
	<table border="1">
		<caption>������</caption>
		<tr>
			<th>����</th>
			<th>��</th>
		</tr>
		<%
			for (int i = 1; i < 10; i++) {
				out.println("<tr>");
				for (int j = 0; j < 10; j++) {
					temp[i] = 2 * i;
					out.println("<tr> <td>" + i + "*" + j + "</td><td>" + temp[i] + "</td></tr>");
				}
			}
		%>


	</table>
</body>
</html>