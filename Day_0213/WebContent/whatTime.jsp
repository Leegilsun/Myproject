<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>whatTime</title>
</head>
<body>
현재 시간은 ${date }<br>

<c:if test="${date.hours <= 12 }">
오전입니다.
</c:if>

<c:if test="${date.hours >12 }">
오후입니다.
</c:if>

</body>
</html>