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
	}	//�����ڶ�� �θ���� ���, �����ڷ� ���� �Լ��� ù���ڸ� �빮�ڷ� ����� ���
	var s = new student('�̱漱', 90, 100, 100);	//�ֻ��� ��ü window��ü�� name�Ӽ����� �̱漱,90,100,100�� �Ӽ����� �߰���
												//���� ��ü�� �ƴ� ���ο� ��ü�� ���� ���ο� ��ü ���ο��� �� �Լ��� ����
												//������� ���ο� ��ü�� ������												
// 	function s2(name, kor, eng, math){
// 		name = '�̱漱';
// 		kor = 90;
// 		eng = 100;
// 		math = 100;
// 		getSum = function() {
// 			return this.kor+this.math+this.eng;
// 		}
// 	}	//10~ 19���� �����ϸ� �̷� �ڵ�

	Student.prototype.getSum = function(){
		return this.kor+this.eng+this.math;
	}
	
												
</script>
</head>
<body>

</body>
</html>