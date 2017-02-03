<%@page import="org.apache.catalina.Loader"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%!
	static class Loan{
		public int idx;
		public int repayMonth;
		public int thisMonthOrigin;
		public int thisMonthRate;
		public int amount;
	}
%>
</head>
<body>
	<%
		int amount = Integer.parseInt(request.getParameter("amount"));
		int rateInt = Integer.parseInt(request.getParameter("rate"));
		int period = Integer.parseInt(request.getParameter("period"));
		int type = Integer.parseInt(request.getParameter("type"));
	%>
	<%
		double rateYear = (double)rateInt / 100;//입력받은 이율이 %이므로 실수로 변환
		double rateMonth = rateYear / 12;//연이율을 월이율로 변환

		int repayMonth;

		//원리금 균등을 위해서 매달 상환액을 계산
		repayMonth = (int) ((amount * rateMonth * Math.pow((1 + rateMonth), period))
				/ (Math.pow((1 + rateMonth), period) - 1));
		
		//period길이만큼의 배열이나 어레이리스트를 준비...
		//반복문을 period만큼 돌면서...
		//한번 반복이 될때마다 Loan객체를 만들어서
		//그달 그달의 이자 상환원금 잔액을 계산해서 회차와 상환액등 모든 정보를 Loan객체에
		//때려박고.. 준비된 Loan객체를 준비해뒀던 배열이나 어레이리스트에 추가
		
		
		List<Loan> list = new ArrayList<Loan>();
		for(int i = 0; i < period; i++)
		{
			Loan loan = new Loan();
			int thisMonthRate = (int)(amount * rateMonth);//이번달 이자
			int thisMonthRepayOrigin = (repayMonth - thisMonthRate);
			amount = amount - thisMonthRepayOrigin;
			loan.idx = i + 1;
			loan.thisMonthOrigin = thisMonthRepayOrigin;
			loan.thisMonthRate = thisMonthRate;
			loan.amount = amount;
			loan.repayMonth = repayMonth;
			list.add(loan);
		}
		
		
	%>

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




























