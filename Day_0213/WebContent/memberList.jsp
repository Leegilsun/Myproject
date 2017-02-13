<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>memberList</title>
</head>
<body>
<table border="1">
<tr>
<th>index</th>
<th>count</th>
<th>name</th>
</tr>

<c:forEach var="list" items="${list }" varStatus="status">
<tr>
<td>${status.index }</td> <td>${status.count }</td> <td>${list.name }</td>
</tr>
</c:forEach>
</table>
</body>
</html>