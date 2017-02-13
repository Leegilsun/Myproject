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
	var url = "idCheck.do?userid=" + document.frm.userid.value;
	window.open(url,"_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
	return true;
}