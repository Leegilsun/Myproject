<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		var div1 = document.getElementById('div1');
		var div2 = document.getElementById('div2');
		div1.onclick = function(){
			div1.style.background = 'red';
		};
		div2.onclick = function(){
			div2.style.background = 'pink';
		};
		setTimeout(function(){
			document.body.removeChild(div2);
		}, 2000);
	}
</script>
</head>
<body>
<div id='div1'>ㅇㅇ</div>
<div id='div2'>ㅇㅋ</div>
</body>
</html>