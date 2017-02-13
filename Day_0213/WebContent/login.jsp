<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
<form action="login.do">
아이디 : <input type="text" name="id">
암 &nbsp;호 : <input type="text" name="pwd">
<input type="radio" name="admin" value="1">사용자
<input type="radio" name="admin" value="2">관리자
<input type="submit" value="로그인">

</form>
</body>
</html>