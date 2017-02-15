function boardCheck() {
	if(document.frm.name.value.length == 0) {
		alert("작성자 신분을 밝혀라");
		return false;
	}
	if(document.frm.pass.value.length == 0) {
		alert("비번 입력 안함?");
		return false;
	}
	if(document.frm.title.value.length == 0) {
		alert("제목입력 안함?");
		return false;
	}
	
	var regex= /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/; 
	if(regex.test(document.frm.email.value) == false) {  
	    alert("잘못된 이메일 형식입니다.");  
	    return false;  
	}
	return true;
}

function open_win(url,name) {
	window.open(url,name,"width=500, height=230");
}

function passCheck() {
	if(document.frm.pass.valu.length == 0) {
		alert("비번 입력 안함?");
		return false;
	}
	return true;
}