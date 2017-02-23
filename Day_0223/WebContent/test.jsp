<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
// 	setTimeout(function() {
// 		alert("출력")
// 		location.href='http://www.naver.com';
// 	}, 3000)

// 	var id = seInterval(function() {
// 		alert('alert 감옥');
// 	}, 1000);
// 	setTimeout(function() {
// 		clearInterval(id);
// 	}, 5000);

// 	alert('a');
// 	setTimeout(function() {
// 		alert('b');
// 	}, 0);
// 	alert('c');

// 	var output ='';
// 	for(var key in window){
// 		output += key + '//' + window[key] + '\n';	
// 	}
// 	alert(output);

// 	window.open('http://www.naver.com','naver','width=300, height=300, true');

// 	win = window.open('','','width=200, height=100');
// 	win.document.write("자바방");
// 	win.moveTo(500,100);
// 	var id = setInterval(function() {
// 		win.moveTo((Math.random()*500)+1, (Math.random()*500)+1);
// 	}, 1000);
// 	setTimeout(function() {
// 		clearInterval(id);
// 		win.close();
// 	}, 20000);

// 	alert(screen.width);//화면의 너비
// 	alert(screen.height);//화면의 높이
// 	alert(screen.availWidth);//실제화면에서 사용가능한 너비
// 	alert(screen.availHeight);//실제 화면에서 사용가능한 높이
// 	alert(screen.pixelDepth);//한 픽셀당 비트수
// 	alert(screen.colorDepth);//사용가능한 색상수

// 	var child = window.open('','','width=200, height=100');
// 	var width = screen.width;
// 	var height = screen.height;
// 	child.moveTo(0,0);
// 	child.resizeTo(width, height);
	
// 	var id = setInterval(function() {
// 		child.resizeBy(-20,-20);
// 		child.moveBy(10,10);
// 	}, 1000);
// 	setTimeout(function() {
// 		clearInterval(id);
// 		child.close();
// 	}, 10000);

	window.onload = function(){
		var hello = document.getElementById('hello');
		var bye = document.getElementById('bye');
		hello.onclick = function(){
			hello.style.background = 'red';			
		}
		bye.onclick = function(){
			bye.style.background = 'blue';			
		}
	}
	
	
	
</script>
</head>
<body>
<h1 id='hello'>hello</h1>
<h1 id='bye'>bye</h1>
</body>
</html>