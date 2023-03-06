$('.confirm_btn').click(function(e){
    if (confirm("후원을 정말 확정하시겠습니까?\n후원 상태는 변경되지 않습니다.")){    //확인
        alert("해당 후원내역은 확정되었습니다!");
     }else{
        e.preventDefault();
    };
});

$('.delete_btn').click(function(e){
    if (confirm("후원 정말 취소하시겠습니까??\n후원 내역은 복구되지 않습니다.")){    //확인
        alert("해당 후원내역은 삭제되었습니다!");
     }else{   //취소
        e.preventDefault();
    };
});