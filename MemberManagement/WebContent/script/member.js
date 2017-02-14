function loginCheck(){
	if(document.frm.userid.value.length == 0) {
		alert("아이디 입력 안하냐?");
		frm.userid.focus();
		return false;
	}
	if(document.frm.pwd.value=="") {
		alert("비번 입력 안하냐?");
		frm.pwd.focus();
		return false;
	}
	return true;
}

function idCheck() {
	if(document.frm.userid.value == "") {
		alert("아이디 입력 안하냐?");
		document.frm.userid.focus();
		return;
		}
	var url = "idCheck.do?userid=" + document.frm.userid.value;
	window.open(url,"_blank_1",
			"toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
}

function idok() {
	opener.frm.userid.value=document.frm.userid.value;
	opener.frm.reid.value=document.frm.userid.value;
	self.close();
}

function joinCheck() {
	if(document.frm.name.value.length==0) {
		alert("이름 적어라");
		frm.name.focus();
		return false;
	}
	if(document.frm.userid.value.length==0) {
		alert("아이디를 써주세요");
		frm.userid.focus();
		return false;
	}
	if(document.frm.userid.value.length < 4) {
		alert("아이디는 4글자 이상이어야 합니다.");
		frm.userid.focus();
		return false;
	}
	if(document.frm.pwd.value=="") {
		alert("암호 입력해라");
		frm.pwd.focus();
		return false;
	}
	if(document.frm.pwd.value != document.frm.pwd_check.value) {
		alert("왜 다르게암호 말하냐");
		frm.pwd.focus();
		return false;
	}
	if(document.frm.reid.value.length ==0) {
		alert("중복 체크를 하지 않았습니다.");
		frm.userid.focus();
		return false;
	}
	return true;
}