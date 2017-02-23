<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">

	function Student(name, kor, eng, math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
// 		this.getSum = function() {
// 			return this.kor+this.math+this.eng;
// 		}
	}	//생성자라고 부르기로 약속, 생성자로 만든 함수는 첫글자를 대문자로 쓰기로 약속
	var s = new student('이길선', 90, 100, 100);	//최상위 객체 window객체에 name속성값에 이길선,90,100,100의 속성들이 추가됨
												//현재 객체가 아닌 새로운 객체를 만들어서 새로운 객체 내부에서 저 함수를 수행
												//만들어진 새로운 객체를 돌려줌												
// 	function s2(name, kor, eng, math){
// 		name = '이길선';
// 		kor = 90;
// 		eng = 100;
// 		math = 100;
// 		getSum = function() {
// 			return this.kor+this.math+this.eng;
// 		}
// 	}	//10~ 19줄을 번역하면 이런 코드

	Student.prototype.getSum = function(){
		return this.kor+this.eng+this.math;
	}
	
												
</script>
</head>
<body>

</body>
</html>