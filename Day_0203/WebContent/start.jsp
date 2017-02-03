<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>forward를 공부해보자</title>
</head>
<body>
<form method="post" action="forwardTest.jsp">
<input type="text" name="num1">
<br><br>
<input type="text" name="num2">
<br><br>
<select name ="type" size="1">
<option value="1">덧셈</option>
<option value="2">뺼셈</option>
<option value="3">곱셈</option>
</select>
<input type="submit" value="신청" /> <input type="reset" value="취소" />

</form>
</body>
</html>