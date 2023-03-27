    let replyIndex = {
    init: function () {
        $("#reply-btn-save").on("click", () => {
            this.replySave();
        });
    },

    replySave: function () {
        let data = {
            replyContent: $("#reply_content").val()

        }
        let postNo = $("#postNo").val();
        let comId = $("#comId").val();
        console.log(data);
        console.log(postNo);
        console.log(comId);
        $.ajax({
            type: "POST",
            url: `/api/board/${postNo}/reply`,
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "text"
        }).done(function (res) {
            alert("댓글작성이 완료되었습니다.");
            location.href = `/boardview?postNo=${postNo}&id=${comId}`;  //완료후 이동 경로
        }).fail(function (err) {
            alert(JSON.stringify(err));
        });
    },

            replyDelete: function (postNo, replyNo) {
        const urlParams = new URL(location.href).searchParams; //id값 가져오기
        const comid = urlParams.get('id');
        console.log(comid);
            $.ajax({
                type: "DELETE",
                url: `/api/v1/board/${postNo}/reply/${replyNo}`,
                dataType: "text"
            }).done(function (res) {
                alert("댓글삭제가 완료되었습니다.");
                location.href = `/boardview?postNo=${postNo}&id=${comid}`;
            }).fail(function (err) {
                alert(JSON.stringify(err));
            });
        },

}
replyIndex.init();