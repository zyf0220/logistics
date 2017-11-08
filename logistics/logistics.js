//检测所有问题都选择了
// function isCheck(form) {
//     var inputList = form.getElementsByTagName('input');
//     for (var i = 0; i < inputList.length; i++) {
//         const item = inputList[i];
//         if (item.type === 'radio' && item.checked === true) {
//             return item.value;
//         }
//     }
//     return false;
// }
// function submitvote(event){
//     var inputList = document.getElementsByTagName('form');
//     var checkstatus = inputList;
//     console.log(checkstatus);
//     var infomessage=true;
//     for(var i=0;i<checkstatus.length;i++){
//         const item = checkstatus[i];
//         if(isCheck(item) == false){
//             infomessage=false;
//             console.log(isCheck(item))
//         }
//     }
//     if(infomessage){
//         alert("提交成功");
//     }else{
//         alert("请选择选项全部问题答案后再点击提交按钮！");
//     }
// }

function show_confirm()
{
var r=confirm("确认提交？");
if (r==true)
  {
  alert("提交成功");
  }
else
  {
  alert("取消成功");
  }
}

//post传数据给后台

$("#button").click(function () {
	$(".question").each(function(){
		var code=$(".question").val();
		$.post('http://localhost:8084',{
   			 Authorization:'',
    		question:code,
  },function (data) {
    if (data.question)
    {
      console.log('反馈信息提交成功');
      console.log('反馈的信息为'+data.question);
    }
  });
}
	)})
	


