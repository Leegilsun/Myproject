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
		out.println("접속한 클라이언트의 IP주소"+ request.getRemoteAddr()+ "<br/>");
		out.println("클라이언트의 요청 박식"+ request.getMethod());
		out.println("URL경로 " + request.getRequestURL() + "<br/>");
		out.println("웹 어플리케이션 콘텍스트 경로 :" +request.getContextPath() + "<br/>");
		out.println("인코딩" + request.getCharacterEncoding() + "<br/>");
		out.println("파라미터들");
		Enumeration e = request.getParameterNames();
		while(e.hasMoreElements()) {
			String paraName = (String)e.nextElement();
			out.println("파라미터 이름 : " + paraName + "<br/>");
			out.println("값 : " + request.getParameter(paraName) + "<br/>");
		}
	%>
</body>
</html>