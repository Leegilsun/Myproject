<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>15_movieList</title>
</head>
<body>
<%
	String[] movieList = {"컨택트", "마스터", "킹", "조작된 도시"};
	pageContext.setAttribute("movies", movieList);
%>
<table border="1">
<tr>
<th>index</th>
<th>count</th>
<th>title</th>
</tr>

<c:forEach var="movie" items="${movies }" varStatus="status">
<tr>
<td>${status.index }</td> <td>${status.count }</td> <td>${movie }</td>
</tr>
</c:forEach>
</table>
</body>
</html>