<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>재고 삭제</title>
</head>
<body>
<center>
<h3>재고 삭제</h3><hr>
<form action="<%=application.getContextPath() %>/delete">
<input type="text" name="code"><br>
<input type="submit" value="확인">&nbsp;<input type="button" value="메뉴" onclick="location.href='<%=application.getContextPath() %>/main/main.jsp'">
</form>
</center>
</body>
</html>