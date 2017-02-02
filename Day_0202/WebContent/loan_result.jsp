<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>입력하세요</title>
</head>
<body>
	<%
		String str1 = request.getParameter("money");
		double money = Integer.parseInt(str1);
		String str2 = request.getParameter("percent");
		double percent = Integer.parseInt(str2);
		double percent2 = (percent/100)/12;
		String str3 = request.getParameter("day");
		double day = Integer.parseInt(str3);
		int dday = Integer.parseInt(str3);
		String loan = request.getParameter("loan");
		
		double temp = percent2+1;
		
		double up = (money*percent2) * Math.pow(temp, day);
		double down = Math.pow(temp, day) - 1;
		
		double result = up/down;
		int resultInt = (int) result;
		
		double[] isa = new double[dday];
		double[] wongm = new double[dday];
		double[] jangm = new double[dday];
		for(int i=0; i<isa.length; i++) {
			if(i==0) {
				isa[i] = (money*percent2);
				wongm[i] = (result - isa[i]);
				jangm[i] = (money - wongm[i]);
			} else {
				isa[i] = jangm[i-1]*percent2;
				wongm[i] = (result - isa[i]);
				jangm[i] =(jangm[i-1] - wongm[i]);
			}
		}
		
		double[] isa2 = new double[dday];
		double[] wongm2 = new double[dday];
		double[] jangm2 = new double[dday];
		double[] nabib = new double[dday];
		for(int i=0; i<isa.length; i++) {
			if(i==0) {
				isa2[i] = (money*percent2);
				wongm2[i] = (money/day);
				jangm2[i] = (money - wongm2[i]);
			} else {
				isa2[i] = jangm2[i-1]*percent2;
				wongm2[i] = (money/day);
				jangm2[i] =(jangm2[i-1] - wongm2[i]);
			}
		}

	%>
	<table border="1">
	<tr>
	<th>상환금/납입액</th>
	<th>원금</th>
	<th>이자</th>
	<th>잔금</th>
	</tr>
	<%
	if(loan.equals("a"))
		for(int i =0; i<day; i++){
			out.println("<tr>");
			out.println("<td>" + resultInt + "</td>");
			out.println("<td>" + (int)(wongm[i]+0.5) + "</td>");
			out.println("<td>" + (int)(isa[i]+0.5) + "</td>");
			if(jangm[i] < 0)
				out.println("<td>" + 0 + "</td>");
			else
				out.println("<td>" +(int)(jangm[i]+0.5) + "</td>");
	}
	else {
		for(int i =0; i<day; i++){
			out.println("<tr>");
			out.println("<td>" + (int)((wongm2[i]+isa2[i])) + "</td>");
			out.println("<td>" + (int)(wongm2[i]+0.5) + "</td>");
			out.println("<td>" + (int)(isa2[i]+0.5) + "</td>");
			out.println("<td>" +(int)(jangm2[i]+0.5) + "</td>");
		}	
	}
	%>
	</table>
</body>
</html>