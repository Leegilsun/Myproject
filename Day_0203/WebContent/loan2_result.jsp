<%@page import="java.util.List"%>
<%@page import="model.Loan" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
		<table>
			<tr>
				<th>회차</th>
				<th>상환액</th>
				<th>상환원금</th>
				<th>이자</th>
				<th>잔액</th>
			</tr>
			<%			
				List<Loan> list = (List) request.getAttribute("list");
				for(int i=0; i<list.size(); i++) {
					Loan loan = list.get(i);
					out.println("<td>" + loan.idx +"</td>");
					out.println("<td>" + loan.repayMonth +"</td>");
					out.println("<td>" + loan.thisMonthOrigin +"</td>");
					out.println("<td>" + loan.thisMonthRate +"</td>");
					out.println("<td>" + loan.amount +"</td>");
					out.println("</tr>");
				}
			
			%>
		</table>
	</center>
</body>
</html>