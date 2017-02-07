<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인 성공 <br>
<a href="<%=application.getContextPath() %>/update/update_input.jsp">정보수정</a> <br>
<a href="<%=application.getContextPath() %>/delete/delete_input.jsp">회원삭제</a> <br>
<a href="<%=application.getContextPath() %>/select/select_input.jsp">회원조회</a> <br>
<a href="<%=application.getContextPath() %>/select/selectAll_input.jsp">전체회원조회</a> <br>
<input type="button" value="로그아웃" onclick="location.href='<%=application.getContextPath() %>/main/memberTest.jsp'">
</body>
</html>