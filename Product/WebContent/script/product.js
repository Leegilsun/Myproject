function productCheck() {
	if(document.frm.name.value.length ==0) {
		alert("상풍명 입력 안함?");
		frm.name.focus();
		return false;
	}
	if(document.frm.price.value.length == 0) {
		alert("가격 입력 안함?");
		frm.price.focus();
		return false;
	}
	if(isNaN(document.frm.price.value)) {
		alert("숫자로 입력 안함?");
		frm.price.focus();
		return false;
	}
	return true;
}

