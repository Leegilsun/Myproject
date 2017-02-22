<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>스크립트 연습(함수)</title>
<script type="text/javascript">


	//선언함수 만들기
// 	function func() {
// 		alert("선언함수랑께");
// 	}
	
	//선언함수 재정의
// 	function func() {
// 		alert("다시 왔당께 선언함수랑께");
// 	}
// 	func();
	
	//익명함수 만들기
// 	var myFunc = function (){
// 		alert("이름이 없어서 익명함수랑께");
// 	}
// 	myFunc();	//익명함수는 당장 호출하거나 변수에 담아두고 호출
	
	//익명함수 재정의
// 	var myFunc = function (){
// 		alert("다시 왔당께 익명함수랑께");
// 	}
	
	//함수를 담고 있는 변수를 alert하면 그 코드를 보여준다.
// 	alert(func);
// 	alert(myFunc);


// 	var name = prompt("너의 이름은");
// 	alert("너의 이름은 " +name);

// 	function f(x){
// 		alert(arguments.length);
// 		alert(arguments[0]);
// 		return x*x;
// 	}
// 	alert( f(3,1,3,4));
	
// 	function sumAll() {
// 		var sum = 0;
// 		for(var i=0; i<arguments.length; i++){
// 			sum += arguments[i];
// 		}
// 		return sum;
// 	}
//  	alert(sumAll(1,1,1,1,5));

// 	function returnTest(){
// 		alert("할로");
// 		return;
// 		alert("나도 할로 하고싶어");
// 	}
// 	alert(returnTest()); //값을 리턴하지 않았으므로 undefined

// 	function a() {
// 		alert("걍 a");
// 	}
// 	function func(){
// 		a();
// 		function a(){
// 			alert("func의 'a'");
// 		}
// 	}
// 	function func2(){
// 		function a() {
// 			alert("func2의 'a'");
// 		}
// 	}
// 	func();

// 	function func(test) {
// 		alert(test);
// 		alert(typeof(test));
// 		if(test instanceof Array) {	//배열일 경우
// 			for(var i in test) {
// 				alert(x[i]);	//매개변수로 받은 값이 단순한 값(문자열, 숫자,블리언)이 ㅇ니라 객체나 배열이라면 각 용범에 맞는 활용이 가능 
// 			}
// 		}
// 	}
// 	func('이길선');
// 	func(2);
// 	func(false);
// 	func([1,'이길선',true]);

	//매개변수로 받은 함수를 호출하기
// 	function callFiveTime(func) {
// 		for(var i=0;i<5;i++) {
// 			func();
// 		}
// 	}
// 	callFiveTime(function() {
// 		alert('죽창 한번만 찌르게해줘');	//매개변수로 전달되어지는 함수를 <콜백함수>라고 불림
// 	});
// //	문제
// 	//두 수를 받아서 덧셈
// 	function sumNum(num1, num2) {
// 		var sum = 0;
// 		sum = num1 + num2;
// 		return sum;
// 	}
	
// 	//두 수를 받아서 곱셈
// 	function multNum(num1, num2) {
// 		var mult = 0;
// 		mult = num1 * num2;
// 		return	mult;
// 	}
	
// 	//특정 함수를 매개변수로 받아서 해당 함수를 호출 후 반환값을 alert하는 함수
// 	function result(func, num1, num2) {
// 		var result = func(num1,num2);
// 		alert(result);
// 	}
// 	var num1 = prompt();
// 	var num2 = prompt();
// 	num1 = Number(num1);
// 	num2 = Number (num2);
	
// 	result(sumNum,num1,num2);
// 	result(multNum,num1,num2);

	//함수를 반환하는 함수
// 	function func() {
// 		alert('func가 호출됨');
// 		var f = function() {
// 			alert('func()의 내부에서 만들어진 익명함수 f');
// 		};
// 		return f;
// 	}
// 	var result = func();
// 	result();
	
// 	function func() {
// 		alert('func');
// 		return function() {
// 			alert('내부');
// 		};
// 	}
// 	var result = func();
	
// 	result()();

	//클로저
// 	var myFunc = function() {
// 		var hello = "안녕";
// 		var inner = function(){
// 			alert(hello);
// 		};
// 		return inner;
// 	};
	
// 	var a = myFunc();
// 	var b = myFunc();
// 	a();
// 	b();

// 	function full(name){
// 		var output = "할로, "+name+"~";
// 		return function(){
// 			return output;
// 		}
// 	}
// 	var first = full('Lee');
// 	var last = full('GilSun');
// 	alert(first());
// 	alert(last());	//first와 last는 각각 고유한 output을 가지고있음

// 	var seq = function(){
// 	var s = 0;
// 	return function(){
// 		return ++s;
// 		}
// 	}	
// 	var seq1 = seq();
// 	var seq2 = seq();
// 	seq1();
// 	seq2();
// 	alert(seq1());
// 	alert(seq2());

	var arr = [];
	for(var i=0; i<3; i++){ //java에서도 전역변수인가?
		(function() {
			var idx = i;
			arr[idx] = function(){
				alert(idx);
			}
		})();
// 		arr[i] = function(){
// 			alert(i);
// 		};
// 		arr[i]();
	}
	
	arr[0]();
	arr[1]();
	arr[2]();
</script>
</head>
<body>

</body>
</html>