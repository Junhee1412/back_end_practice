
function ValidChecked(){
  var pw_RegExp = /^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\W)(?=\S+$).{8,20}$/;
  var objPassword=document.getElementById("id"); // 비밀번호
  var objPWconfirm=document.getElementById("pwd"); // 비밀번호 확인


  if(objPassword.value==""){
    alert("비밀번호를 입력해주세요")
    objPassword.focus();
    return false;
   };
   if(objPassword.value!=objPWconfirm.value){
    alert("비밀번호가 일치하지않습니다.");
    objPWconfirm.focus();
    return false;
   }
   if(!pw_RegExp.test(objPassword.value)){
    alert("비밀번호는 영문 대,소문자와 숫자, 특수기호 모두가 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.");
    objPassword.focus();
    return false;
   }
  return true;
}