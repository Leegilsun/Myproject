<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=application.getContextPath() %>/calculatorProc.do">
<input type="text" name="num1">
<br><br>
<input type="text" name="num2">
<br>
<select name ="type" size="1">
<option value="1">덧셈</option>
<option value="2">뺼셈</option>
<option value="3">곱셈</option>
</select>
<input type="submit" value="계산">
</form>
</body>
</html>