<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>�پ��� �Է� ��</h3>
	<form method="post" action="result2.jsp">
		����: <input type="text" name="person" /> 
		<br> 
		����: <input type="radio" name="sex" value="male" />���� 
			 <input type="radio" name="sex" value="female" />����
		<br> 
		����: <select name="job" size="1">
			<option>�л�</option>
			<option>ȸ���</option>
			<option>������</option>
			<option>��Ÿ</option>
		</select>
		<p>
			��������о�(�������� ����)
			<br>
			 - �о�: <input type="checkbox" name="books" value="computer" />��ǻ��
			<input type="checkbox" name="books"	value="economy" />����
			 <input type="checkbox" name="books" value="common" />���
			 <br> 
			 ���: <br>
			<textarea name="comments" rows="4" cols="40" /></textarea>
		</p>
		<hr>
		<input type="submit" value="��û" /> <input type="reset" value="���" />
	</form>
</body>
</html>