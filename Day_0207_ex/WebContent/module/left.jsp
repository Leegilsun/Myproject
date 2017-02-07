<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="<%=application.getContextPath() %>/memberServlet?type=create">회원가입</a> <br>
<a href="<%=application.getContextPath() %>/memberServlet?type=update">정보수정</a> <br>
<a href="<%=application.getContextPath() %>/memberServlet?type=delete">회원삭제</a> <br>
<a href="<%=application.getContextPath() %>/memberServlet?type=select">회원조회</a> <br>
<a href="<%=application.getContextPath() %>/memberServlet?type=selectAll">전체회원조회</a> <br>
</body>
</html>