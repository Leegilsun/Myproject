<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="<%=application.getContextPath()%>/electProc.do">
전기 사용량 : <input type="text" name="use"/>
<input type="submit" value="계산" /> <input type="reset" value="재입력" />
</form>
</body>
</html>