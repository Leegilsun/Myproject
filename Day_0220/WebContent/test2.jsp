<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

//if문 연습
	var date = new Date();
	var hour = date.getHours();
	
	if(hour<11) {
		alert("아침");
	}
	else if(hour<15) {
		alert("점심");
	}
	else {
		alert("저녁");
	}
		
//switch문 연습
var input = Number(prompt('숫자를 입력하세요.', '숫자'));

switch(input%2) {
case 0:
	alert("짝수 입니다.");
	break;
case 1:
	alert("홀수 입니다.");
	break;
default:
	alert ("숫자가 아닙니다.");
	break;
}
</script>
</head>
<body>

</body>
</html>