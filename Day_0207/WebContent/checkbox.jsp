<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>스톤</h2>
합성할 스톤을 선택하세요.<hr>
<form method="get" action="CheckboxServlet">
<input type="checkbox" name="item" value="메타의지">메타의지
<input type="checkbox" name="item" value="발뭉">발뭉
<input type="checkbox" name="item" value="프레이의선고">프레이의선고<br>
<input type="checkbox" name="item" value="끝불">끝불
<input type="checkbox" name="item" value="고드름">고드름
<input type="checkbox" name="item" value="바탈">바탈
<input type="submit" value="전송">
</form>
</body>
</html>