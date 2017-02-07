<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
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
		else if(document.frm.name.value=="") {
			alert("name을 입력하세요");
			document.frm.name.focus();
			return false;
		}
		else 
			return true;
	}
</script>
</head>
<body>
<form action="memberCreate" name="frm">
id : <input type="text" name="id"><br>
pwd : <input type="text" name="pwd"><br>
name : <input type="text" name="name"><br>
<input type="submit" value="전송" onclick="return check()">
</form>
</body>
</html>