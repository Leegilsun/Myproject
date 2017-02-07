<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check(){
		if(document.frm.num.value == "") {
			alert("숫자를 입력하세요");
			document.frm.num.focus();
			return false;
		}
		else if( isNaN(document.frm.num.value)) {
			alert("나이는 숫자를 입력하세요");
			document.frm.num.focus();
			return false;
		}
		else 
			return true;
	}
</script>
</head>
<body>
<form method="get" action="goHttp" name="frm">
숫자 입력 : <input type="text" name="num">
<input type="submit" value="goHttp" onclick="return check()">
</form>
</body>
</html>