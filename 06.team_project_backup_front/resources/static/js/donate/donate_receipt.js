var initBody;

function beforePrint() {
 initBodyHTML = document.body.innerHTML;
 document.body.innerHTML = document.getElementById('donate_receipt_box').innerHTML;
}
function afterPrint() { 
 document.body.innerHTML = initBodyHTML;
}
function printArea() {
 window.print();
}

window.onbeforeprint = beforePrint;
window.onafterprint = afterPrint;

function goBack(){
    window.history.back();
}