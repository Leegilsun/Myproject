<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//자바스크립트 내부함수
// 	var URI = 'https://www.google.co.kr/search?q=%EC%9D%B4%EA%B8%B8%EC%84%A0&oq=%EC%9D%B4%EA%B8%B8%EC%84%A0&aqs=chrome..69i57j69i61j0l4.1575j0j7&sourceid=chrome&ie=UTF-8';
// 	var output = '';
// 	output += escape(URI) + '\n\n';
// 	output += encodeURI(URI) + '\n\n';
// 	output += encodeURIComponent(URI);
// 	alert(output);
	
	//그 외 내부함수
// 	var msg = 'var num = 10;';
// 	msg = 'alert(msg);';
// 	eval(msg);
// 	alert(num);
	
// 	var num1 = 10 / 0;
// 	var num2 = 10 / 'a';
// 	alert(num1);
// 	alert(num2);
	
// 	alert( isFinite(num1));	//false
// 	alert( isNaN(num2) );	//true

// 	var won1 = parseInt('1000원');
// 	var won2 = Number('1000원');
	
// 	alert(won1);	//1000
// 	alert(won2);	//nan

	//객체
// 	var arr = ['사과','바나나','딸기'];

// 	var obj = {
// 		이름 : '이길선',
// 		나이 : 24,
// 		직업 : '네오니트'
// 	};

// 	alert(arr[0]);
// 	alert(arr[1]);
// 	alert(arr[2]);	//배열의 요소에 접근할때는 대괄호를 이용해 인덱스를 지정

// 	alert(obj['이름']);
// 	alert(obj['나이']);
// 	alert(obj['직업']);

// 	alert(obj.이름);
// 	alert(obj.나이);
// 	alert(obj.직업);

	var car = {
		speed : 100,
		mile : 5000,
		color : 'RED',
		speedUp : function() {
					alert('부르릉');
		}
	};

	car.speedUp();
	alert(car.speed);

	

	
	
</script>
</head>
<body>

</body>
</html>