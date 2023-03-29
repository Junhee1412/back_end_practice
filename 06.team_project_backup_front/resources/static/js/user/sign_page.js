
// 이메일 중복 확인
$('#id-Check-Btn').click(function(){
  const userIdemail=document.getElementById('sign_id_email').value;
  $.ajax({
    type:'get',
    url:`checkDuplication/${userIdemail}`,
    success:function(data){
      if(data==='available'){
        alert('사용가능한 아이디입니다.');
        $('#sign_id_email').attr('readonly',true);
        $('#mail-Check-Btn').attr('disabled',false);
        $('#id-Check-Btn').attr('disabled',true);
      }else{
        alert('이미 사용중인 아이디입니다.');
      }
    }
  })
})

// 이메일 발송
$('#mail-Check-Btn').click(function(){
  const useremail=document.getElementById('sign_id_email').value;
  const checkInput=$('.mail-check-input');

  $.ajax({
    type:'get',
    url: `emailConfirm/${useremail}`,
    success:function(data){
      checkInput.attr('disabled',false);
      code=data;
      alert('인증번호가 전송되었습니다.')
    }
  })
})

// 코드 확인
$('.mail-check-input').blur(function () {
  const inputCode = $(this).val();
  const $resultMsg = $('#mail-check-warn');
  
  if(inputCode === code){
    $resultMsg.html('인증번호가 일치합니다.');
    $resultMsg.css('color','green');
    $('#mail-Check-Btn').attr('disabled',true);
    $('#sign_id_code').attr('readonly',true);
    $('#userIdEmail').attr('value',document.getElementById('sign_id_email').value);
    console.log(document.getElementById('sign_id_email').value);
    $('.mail-check-input').attr('disabled',true);
    $('#userNickNameCheck').attr('disabled',false);
    $('#nickName-Check-Btn').attr('disabled',false);
  }else{
    $resultMsg.html('인증번호가 불일치 합니다. 다시 확인해주세요!.');
    $resultMsg.css('color','red');
  }
});

// 닉네임 중복 확인
$('#nickName-Check-Btn').click(function(){
  const userNickName=document.getElementById('userNickNameCheck').value;
  $.ajax({
    type:'get',
    url:`checkDuplicationNickName/${userNickName}`,
    success:function(data){
      if(data==='available'){
        alert('사용가능한 닉네임입니다.');
        $('#gotojoin_btn').attr('disabled',false);
        $('#userNickNameCheck').attr('disabled',true);
        $('#nickName-Check-Btn').attr('disabled',true);
        $('#sign_nick').attr('value',userNickName);
      }else{
        alert('이미 사용중인 닉네임입니다.');
      }
    }
  })
})



  

  
  function autoHypenPhone(str){
    str = str.replace(/[^0-9]/g, '');
    var tmp = '';
    if( str.length < 4){
        return str;
    }else if(str.length < 7){
        tmp += str.substr(0, 3);
        tmp += '-';
        tmp += str.substr(3);
        return tmp;
    }else if(str.length < 11){
        tmp += str.substr(0, 3);
        tmp += '-';
        tmp += str.substr(3, 3);
        tmp += '-';
        tmp += str.substr(6);
        return tmp;
    }else{
        tmp += str.substr(0, 3);
        tmp += '-';
        tmp += str.substr(3, 4);
        tmp += '-';
        tmp += str.substr(7);
        return tmp;
    }
    return str;
}

var cellPhone = document.getElementById('sign_ph');
cellPhone.onkeyup = function(event){
event = event || window.event;
var _val = this.value.trim();
this.value = autoHypenPhone(_val);
}





// 이름, 핸드폰, 비밀번호 유효성 검사
function ValidChecked() {

  var n_RegExp = /^[가-힣a-zA-Z\s]+$/;
  var p_RegExp = /^(?:(010-\d{4})|(01[1|6|7|8|9]-\d{3,4}))-(\d{4})$/;
  var pw_RegExp = /^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\W)(?=\S+$).{8,20}$/;


  var objName = document.getElementById("sign_name");
  var objPhone = document.getElementById("sign_ph");
  var objPassword=document.getElementById("sign_pwd");
  var objPWconfirm=document.getElementById("sign_pwd2");


       //이름 유효성 검사
     if (objName.value == "") {
       alert("이름을 입력하세요.");
       objName.focus();
       return false;
     };
     if (!n_RegExp.test(objName.value)) {
       alert("이름은 한글 2~15자까지 가능합니다.");
       objName.focus();
       return false;
     };

      // 비밀번호 유효성검사
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

      //휴대폰번호 유효성검사
    if (objPhone.value == "") {
      alert("휴대폰번호를 입력하세요.");
      objPhone.focus();
      return false;
    };
    if(!p_RegExp.test(objPhone.value)){
      alert("휴대폰번호가 올바르지 않습니다.");
      objPhone.focus();
      return false;
    };
    return true;
}

$("#file").on('change',function(){
  var fileName = $("#file").val();
  $(".upload-name").val(fileName);
});