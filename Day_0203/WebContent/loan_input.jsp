<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>대출금 이자 계산</title>
</head>
<body>
	<center>
		<form action="loan_result.jsp">
			<table>
				<tr>
					<td align="center">대출 원금</td>
					<td><input type="text" name="amount"></td>
					<td>원</td>
				</tr>
				<tr>
					<td align="center">대출 이율</td>
					<td><input type="text" name="rate"></td>
					<td>%</td>
				</tr>
				<tr>
					<td align="center">대출 기간</td>
					<td><input type="text" name="period"></td>
					<td>개월</td>
				</tr>
				<tr>
					<td colspan="3" align="center"><input type="radio" name="type"
						value="1"> 원금 균등 상환 <input type="radio" name="type"
						value="2"> 원리금 균등 상환</td>
				</tr>
				<tr>
					<td colspan="3" align="center"><input type="reset"
						value="다시입력"> <input type="submit" value="gogo"></td>
				</tr>
			</table>

		</form>
	</center>
</body>
</html>