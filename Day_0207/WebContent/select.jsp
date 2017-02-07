<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="SelectServlet">
<span style="float: left;margin-right: 20px">
<lable for="job">직업</lable>
<select id="job" name="job" size="1">
<option value="">선택하세요</option>
<option value="컴퓨터/인터넷">컴퓨터/인터넷</option>
<option value="언론">언론</option>
<option value="공무원">공무원</option>
<option value="군인">군인</option>
<option value="서비스업">서비스업</option>
<option value="교육">교육</option>
</select>
</span>
</form>
</body>
</html>