<%@page import="java.util.ArrayList"%>
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
<%
		int amount = Integer.parseInt(request.getParameter("amount"));
		int rateInt = Integer.parseInt(request.getParameter("rate"));
		int period = Integer.parseInt(request.getParameter("period"));
		int type = Integer.parseInt(request.getParameter("type"));
	%>
	<%
		double rateYear = (double)rateInt / 100;//�Է¹��� ������ %�̹Ƿ� �Ǽ��� ��ȯ
		double rateMonth = rateYear / 12;//�������� �������� ��ȯ

		int repayMonth;

		//������ �յ��� ���ؼ� �Ŵ� ��ȯ���� ���
		repayMonth = (int) ((amount * rateMonth * Math.pow((1 + rateMonth), period))
				/ (Math.pow((1 + rateMonth), period) - 1));
		
		List<Loan> list = new ArrayList<Loan>();
		for(int i = 0; i < period; i++)
		{
			Loan loan = new Loan();
			int thisMonthRate = (int)(amount * rateMonth);//�̹��� ����
			int thisMonthRepayOrigin = (repayMonth - thisMonthRate);
			amount = amount - thisMonthRepayOrigin;
			loan.idx = i + 1;
			loan.thisMonthOrigin = thisMonthRepayOrigin;
			loan.thisMonthRate = thisMonthRate;
			loan.amount = amount;
			loan.repayMonth = repayMonth;
			list.add(loan);
		}
		request.setAttribute("list", list);
	%>
	<jsp:forward page="loan2_result"></jsp:forward>
</body>
</html>