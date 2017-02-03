<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	final double[] plus = { 60.7, 125.9, 187.9, 280.6, 417.7, 709.5 };
	final int[] start = { 410, 910, 1600, 3850, 7300, 12940 };
	int use = Integer.parseInt(request.getParameter("use"));
	
	int i= 0;
	double result = 0;
	
	while(true){
		if(use > 100 && i<5){
			result += plus[i] * 100;
			i++;
			use -= 100;
		}
		else{
			result += plus[i] * use +plus[i];
			break;
		}
	}
	request.setAttribute("fee", result);
	// 나중에 데이터 회수할떄 사용할 이름 "fee", 데이터 타입은Object로 받아지기 떄문에 아무거나 다 떄려박을 수 있음 꺼내쓸때 형변황 잘해야됨 ㅇㅇ
%>
<jsp:forward page="electResult.jsp"></jsp:forward>
</body>
</html>