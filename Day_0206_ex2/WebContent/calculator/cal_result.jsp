<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int result = (int)request.getAttribute("result");
	int cal = (int)request.getAttribute("cal");
	
	if(cal==1) 
		out.println("�� ���� ���� "+result);
	else if(cal==2)
		out.println("�� ���� ����"+result);
	else if(cal==3)
		out.println("�μ��� ����"+result);

%>
</body>
</html>