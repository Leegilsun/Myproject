<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>�Ż��Է��ض�</h2>
	<form method="post" action="loan_result.jsp">
		����� : <input type="text" name="money">�� <br> <br>
		����ݸ� : ��<input type="text" name="percent">% <br> <br>
		����Ⱓ : <input type="text" name="day">���� <br> <br>
		�������� a = �����ݱյ� b = ���ݱյ� <select name="loan" size="1">
			<option>a</option>
			<option>b</option>
			<br>
			<br>
			<input type="submit" value="���" />
			<input type="reset" value="���" />
		</select>
	</form>
</body>
</html>