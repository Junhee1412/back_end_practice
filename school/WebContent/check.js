function add(){
	if(frm.sid.value.length==0){
		alert("학번이 입력되지 않았습니다");
		frm.sid.focus();
		return false;
	}
	else if(frm.midscore.value.length==0){
		alert("중간고사는 숫자가 아니거나 입력되지 않았습니다");
		frm.midscore.focus();
		return false;
	}
	else if(frm.finalscore.value.length==0){
		alert("기말고사는 숫자가 아니거나 입력되지 않았습니다");
		frm.finalscore.focus();
		return false;
	}
	else if(frm.attend.value.length==0){
		alert("출석은 숫자가 아니거나 입력되지 않았습니다");
		frm.attend.focus();
		return false;
	}
	else if(frm.report.value.length==0){
		alert("레포트는 숫자가 아니거나 입력되지 않았습니다");
		frm.report.focus();
		return false;
	}
	else if(frm.etc.value.length==0){
		alert("기타는 숫자가 아니거나 입력되지 않았습니다");
		frm.etc.focus();
		return false;
	}
	else{
		alert("성적정보가 정상적으로 등록되었습니다.");
		document.frm.submit();
		return true;
	}
}

function res(){
	alert("정보를 지우고 처음부터 다시 입력합니다");
	document.frm.reset();
	
}

function search(){
	document.frm2.sumit();
}