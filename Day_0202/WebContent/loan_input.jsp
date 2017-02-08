<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>신상입력해라</h2>
	<form method="post" action="loan_result.jsp">
		대출금 : <input type="text" name="money">원 <br> <br>
		대출금리 : 연<input type="text" name="percent">% <br> <br>
		대출기간 : <input type="text" name="day">개월 <br> <br>
		대출유형 a = 원리금균등 b = 원금균등 <select name="loan" size="1">
			<option>a</option>
			<option>b</option>
			<br>
			<br>
			<input type="submit" value="계산" />
			<input type="reset" value="취소" />
		</select>
	</form>
</body>
</html>