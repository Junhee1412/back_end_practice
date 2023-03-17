$('.checkcheck').click(function(){
          var tmpp = $(this).prop('checked');
          var ss = $(".checkcheck:checked").length;

          //선택한 체크박스 값이 true 이거나 체크박스 1개 이상 체크시 버튼 활성화시키기
          if(tmpp==true && ss>1){
            $('#goToJoin').attr('disabled',false);
          }
          else{
            $('#goToJoin').attr('disabled',true);
          }
      });