// 삭제 시 한번 확인!
$('.confirm_deletePost_btn').click(function(e){
  if (confirm("삭제하시겠습니까?")){    //확인
      alert("삭제가 완료되었습니다!");
   }else{
      e.preventDefault();
  };
});