<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
<script type="text/javascript">
window.onload = function(){
	var id = document.getElementById('id');
	var pass = document.getElementById('pass');
	var btn = document.getElementById('btn');
	var span = document.getElementById('span');
	
	
	/^[A-Z]{3}[0-9]{5}$/;
	
	btn.onclick = function(){
		if(pass.value.length<8){
// 			alert('비밀번호는 8자리 이상입니다.');
			span.innerHTML = '비밀번호는 8자리 이상입니다.';
			return false;
		}
		else if(!pass.value.match(/^(?=.*[a-zA-Z])(?=.*[!@#?$%^*+=-])(?=.*[0-9]).{6,16}$/)){
// 			alert("영,수,특 조합하셈");
			span.innerHTML = '영, 수 , 특 조합 ㄱㄱ';
			return false
		}
		else{
// 			alert('완성');
			span.innerHTML = '올 ㅋ';
		}
	}
}
</script>
</head>
<body>
<input type="text" name="id" id="id">
<input type="password" name="pass" id="pass">
<span id="span">뀨우?</span>
<button id="btn">가입</button>
</body>
</html>