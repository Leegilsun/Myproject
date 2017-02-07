<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP</title>
<script type="text/javascript">
	function check(){
		if(document.frm.id.value == "") {
			alert("id를 입력하세요");
			document.frm.id.focus();
			return false;
		}
		else if(document.frm.pwd.value=="") {
			alert("pwd를 입력하세요");
			document.frm.pwd.focus();
			return false;
		}
		else 
			return true;
	}
</script>
</head>
<body>
<form method="post" action="testLogin" name="frm">
<label for="userid">아이디 : </label>
<input type="text" name="id" id="userid"><br>

<label for ="userpwd">암호 : </label>
<input type="password" name="pwd" id="userpwd"><br>

<input type="submit" value="로그인" onclick="return check()">
</form>
</body>
</html>