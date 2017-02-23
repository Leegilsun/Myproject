<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	var pass1 = document.getElementById('pass1');
	var pass2 = document.getElementById('pass2');
	var button = document.getElementById('button');
	
	button.onclick = function(){
		if(pass1.value == pass2.value){
			alert('응 같아');
		} else {
			alert('응 달라');
		}
	}
}
</script>
</head>
<body>
<input type="password" id="pass1">
<input type="password" id="pass2">
<input type="button" value="체크"	 id="button">
</body>
</html>