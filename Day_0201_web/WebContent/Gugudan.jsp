<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>하이 구구단</title>
</head>
<body>
	구구단
	<br>
	<% int[] temp = new int[10]; %>

	<% 
	for(int i=1; i<10; i++) {
		temp[i] = 2*i;
		out.println("2*"+i+"="+temp[i]);
		if(i%3==0){
			out.println("<br>");
		}
	}
	%>

</body>
</html>