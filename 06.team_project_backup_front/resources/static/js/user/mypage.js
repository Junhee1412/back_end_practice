
// 닉네임 변경하기 아이콘 숨기기
document.getElementById('changeNickNameBtn').style.display="none";


// 닉네임 중복검사
$('#checkNickNameDuplication_Btn').click(function(){
  const userNickName=document.getElementById('sign_nick').value;
  const $checkNickNameDuplication=$('#checkNickNameDuplication_span');
  $.ajax({
    type:'get',
    url:`checkDuplicationNickName/${userNickName}`,
    success:function(data){
      if(data==='available'){
        $checkNickNameDuplication.html('사용가능한 닉네임입니다.');
        $checkNickNameDuplication.css('color','green');
        $('#sign_nick').attr('readonly',true);
        document.getElementById('changeNickNameBtn').style.display="block";
        document.getElementById('checkNickNameDuplication_Btn').style.display="none";
        $('#changeNickNameBtn').attr('disabled', false);
      }else{
        $checkNickNameDuplication.html('이미 사용중인 닉네임입니다.');
        $checkNickNameDuplication.css('color','red');
      }
    }
  })
})