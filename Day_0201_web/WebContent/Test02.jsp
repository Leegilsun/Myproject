<%@page import="java.util.Enumeration"%>
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
		out.println("������ Ŭ���̾�Ʈ�� IP�ּ�"+ request.getRemoteAddr()+ "<br/>");
		out.println("Ŭ���̾�Ʈ�� ��û �ڽ�"+ request.getMethod());
		out.println("URL��� " + request.getRequestURL() + "<br/>");
		out.println("�� ���ø����̼� ���ؽ�Ʈ ��� :" +request.getContextPath() + "<br/>");
		out.println("���ڵ�" + request.getCharacterEncoding() + "<br/>");
		out.println("�Ķ���͵�");
		Enumeration e = request.getParameterNames();
		while(e.hasMoreElements()) {
			String paraName = (String)e.nextElement();
			out.println("�Ķ���� �̸� : " + paraName + "<br/>");
			out.println("�� : " + request.getParameter(paraName) + "<br/>");
		}
	%>
</body>
</html>