<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품 재고 관리</title>
</head>
<body>
<center>
<h3>상품 재고 관리</h3><hr>
<a href="<%=application.getContextPath() %>/create/create_input.jsp">상품 등록</a> <br>
<a href="<%=application.getContextPath() %>/update/update_input.jsp">재고 수량 변경</a> <br>
<a href="<%=application.getContextPath() %>/select/select_input.jsp">상품 검색</a> <br>
<a href="<%=application.getContextPath() %>/selectall">상품 전체 검색</a> <br>
<a href="<%=application.getContextPath() %>/delete/delete_input.jsp">상품제거</a> <br>
</center>
</body>
</html>