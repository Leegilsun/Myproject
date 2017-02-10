<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>09_el</title>
</head>
<body>
이름1 : ${list[0].name }<br> <!-- Member클래스에서 getter가 있어야 사용할 수 있다. -->
아이디1 : ${list[0].userid }<br><br>

이름2 : ${list[1].name }<br> <!-- Member클래스에서 getter가 있어야 사용할 수 있다. -->
아이디2 : ${list[1].userid }<br><br>

이름3 : ${list[2].name }<br> <!-- Member클래스에서 getter가 있어야 사용할 수 있다. -->
아이디3 : ${list[2].userid }<br><br>
</body>
</html>