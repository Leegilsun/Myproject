<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
// 	alert("이것도 문자열");
// 	alert('이것도문자열');
// 	alert('제 이름은 "이길선"입니다.');
// 	alert("제 이름은 '이길선'입니다.");
// 	alert("제 이름은 \"이길선\"입니다.");
	
	//숫자 자료형
// 	alert(23); 
// 	alert(23.3);	//정수 실수 이런거 없음
	//논리 자료형
// 	alert(true);
// 	alert(false);	//문자열로 감싸있으면 문자열 숫자면 숫자 true/false면 논리형 그외것들은 규칙에 어긋나거나 키워드가 아니면 다 식별자(변수명/함수명)
	
// 	var a = '드루와';
// 	var b = 23;
// 	var c = true;
// 	alert(typeof(a));	//string
// 	alert(typeof(b));	//number
// 	alert(typeof(c));	//boolean
// 	alert(typeof(d));	//선언하지 않은 변수를 사용하는건 에러가 아니고 정의 되지않은 데이터를 그냥 출력 //에러가 있는 코드가 존재하더라도 그 코드를 만나기전까지 실행됨..
	
	//자바스크립트 자료형
// 	var e = {};
// 	var f =[];	
// 	function g() {};	//함수도 하나의 데이터
// 	alert(typeof(e));	//object
// 	alert(typeof(f));	//object(배열 객체)
// 	alert(typeof(g));	//function
	
// 	var arr = [1,'문자', true];
//	arr[3] = "읭읭";
// 	alert(arr[0]);
// 	alert(arr[1]);
// 	alert(arr[2]);
// 	alert(arr[3]);

	var obj = {
			"num" : 5,
			"str" : '문자',
			"boolean" : true
	};
	alert(obj.num);
	alert(obj.str);
	alert(obj.boolean);
	//배열형식
	alert(obj["num"]);
	alert(obj["str"]);
	alert(obj["boolean"]);
</script>
</head>
<body>

</body>
</html>