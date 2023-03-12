    function comma(str) {
        str = String(str);
        return str.replace(/(\d)(?=(?:\d{3})+(?!\d))/g, '$1,');
    }

    function uncomma(str) {
        str = String(str);
        return str.replace(/[^\d]+/g, '');
    }

    function inputNumberFormat(obj) {
        obj.value = comma(uncomma(obj.value));
    }

    function inputOnlyNumberFormat(obj) {
        obj.value = onlynumber(uncomma(obj.value));
    }

    function onlynumber(str) {
	    str = String(str);
	    return str.replace(/(\d)(?=(?:\d{3})+(?!\d))/g,'$1');
	}

    function removeComma(str){
		n = parseInt(str.replace(/,/g,""));
		return n;
	}

function PostInsertValidChecked() {

   var a_RegExp = /^([1-9]|\w{2,})000$/;

   var objPostIdSelectByFreeSell = document.getElementById("post_id_select_byFreeSell");
   var objPostIdSelectByUsedTransfer = document.getElementById("post_id_select_byUsedTransfer");
   var objPostTitle = document.getElementById("post_title");
   var objPostContent = document.getElementById("post_content");
   var objSecondPrice = document.getElementById("second_amount");

      //제목 유효성 검사
      if (objPostTitle.value == "") {
        alert("제목을 입력해주세요.");
        objPostTitle.focus();
        return false;
      };

      //내용 유효성 검사
      if (objPostContent.value == "") {
        alert("내용을 입력해주세요.");
        objPostContent.focus();
        return false;
      };

      //글종류 유효성 검사
      if ($("input[name='communityId']").val() == 'FRE_SEL'){
          if (objPostIdSelectByFreeSell.value == "") {
            alert("무료나눔 품목을 선택해주세요.");
            objPostIdSelectByFreeSell.focus();
            return false;
          };
      };


    if ($("input[name='communityId']").val() == 'USD_TRN'){

       if(objPostIdSelectByUsedTransfer.value == ""){
       alert("중고거래 품목을 선택해주세요.");
       objPostIdSelectByUsedTransfer.focus();
       return false;
       };

       if(objSecondPrice.value==""){
       alert("금액을 입력해주세요.");
       objSecondPrice.focus();
       return false;
       };

       if (!a_RegExp.test(removeComma(objSecondPrice.value))) {
       alert("금액은 천원 단위로 입력이 가능합니다.");
       objSecondPrice.focus();
       return false;
       };

       document.querySelector("input[name='price']").value = removeComma(objSecondPrice.value);
    };

   return true;
};

