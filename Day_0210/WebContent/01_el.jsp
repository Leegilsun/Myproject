<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>01_el</title>
</head>
<body>
${"Hello"} <br> <!-- 표현언어(el) -->
<%="Hello" %> <br> <!-- 표현식 -->
<% out.println("Hello"); %> <!-- 스크립틀릿 -->
</body>
</html>