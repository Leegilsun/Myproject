<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
// 		var header = document.createElement("h1");	//요소노드생성
// 		var textNode = document.createTextNode("제목데스!");//텍스트노드생성	
// 		header.appendChild(textNode);//header(h1)요소에 textNode을 연결
// 		document.body.appendChild(header);

// 		var img = document.createElement("img");
// 		img.src = 'dd.jpg';
// 		img.width = 500;
// 		img.height = 350;
		//이 방법이 위 방법보다 좋음
// 		img.setAttribute('src', ' dd.jpg');
// 		img.setAttribute('width', 500);
// 		img.setAttribute('height', 350);
// 		img.setAttribute('data-property', 350);
// 		document.body.appendChild(img);
// 		//노가다 방법
// 		var output = '';
// 		output +='<ul>';
// 		output +='<li>123</li>';
// 		output +='<li>456</li>';
// 		output +='<li>789</li>';
// 		output +='</ul>';
// 		document.body.innerHTML = output;
		
		//문서객체 가져오기
// 		var header1 = document.getElementById('header1');
// 		var header2 = document.getElementById('header2');
// 		header1.innerHTML = '여기는 1번';
// 		header2.innerHTML = '여기는 2번';
		
		//문서객체를 태그이름으로 가져오기
// 		var headers = document.getElementsByTagName("h1");
// 		for(var i=0; i<headers.length; i++){
// 			headers[i].innerHTML = "Elements" +'\n';
// 		}
		
		//3번방법
		var button = document.getElementById('button');
		var text = document.getElementById('text1');
		button.onclick = function(){
			alert(text.value);
		};
	}
</script>
</head>
<body>
	<input type="text" id="text1">
	<input type="button" value="눌러봥" id='button'>
</body>
</html>