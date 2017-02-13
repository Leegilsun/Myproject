<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>16_movieList</title>
</head>
<body>
<%
	String[] movieList = {"컨택트", "마스터", "킹", "조작된 도시"};
	pageContext.setAttribute("movies", movieList);
%>
<ul>
<c:forEach var="movie" items="${movies }" varStatus="status">
	<c:choose>
	<c:when test="${status.first }">
	<li>${movie }</li>
	</c:when>
	<c:otherwise>
	<li>${movie }</li>
	</c:otherwise>
	</c:choose>
</c:forEach> 
</ul>
</body>
</html>