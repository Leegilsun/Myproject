<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
		<form action="loan_result.jsp">
			<table>
				<tr>
					<td align="center">���� ����</td>
					<td><input type="text" name="amount"></td>
					<td>��</td>
				</tr>
				<tr>
					<td align="center">���� ����</td>
					<td><input type="text" name="rate"></td>
					<td>%</td>
				</tr>
				<tr>
					<td align="center">���� �Ⱓ</td>
					<td><input type="text" name="period"></td>
					<td>����</td>
				</tr>
				<tr>
					<td colspan="3" align="center"><input type="radio" name="type"
						value="1"> ���� �յ� ��ȯ <input type="radio" name="type"
						value="2"> ������ �յ� ��ȯ</td>
				</tr>
				<tr>
					<td colspan="3" align="center"><input type="reset"
						value="�ٽ��Է�"> <input type="submit" value="gogo"></td>
				</tr>
			</table>

		</form>
	</center>
</body>
</html>