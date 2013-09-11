//获取URL参数
function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}
$(function() {
	getNewsData();
});
function initData(){
	var basePath=$("#basePath").val();
	$(".dropdown .dropdown-menu li").bind("click",function(){
		var val= $(this).find("a").text();
		$("#j-ui-type").val($(this).attr('class'));
		$(this).parent().parent().find(".value").html(val);
		$(this).parent().parent().removeClass("open");
		return false;
	});
	
	$("#newsdata-form").bind("click",function(){
		var valid = true;
		!userInfoCheck("j-ui-title","title")&& (valid = false);
		!userInfoCheck("j-ui-sno","sno") && (valid = false);
		!userInfoCheck("j-ui-content","content") && (valid = false);
		if(valid){
			var param = $('#news-form').formSerialize();;
			$.ajax( {
				type : "POST",
				dataType : "json",
				url : 'system/updateNews.shtml',
				data:param,
				success : function(data) {
					if(data.msg=="error_sys"){
						
					}else if(data.msg=="success"){
						window.location.href=basePath+"pages/admin/news/news.jsp";
					}
				}
			});
		}
	});
	
	$("#j-ui-title").bind("blur",function(){
		userInfoCheck("j-ui-title","title");
	});
	
	$("#j-ui-sno").bind("blur",function(){
		userInfoCheck("j-ui-sno","sno");
	});
	
	$("#j-ui-content").bind("blur",function(){
		userInfoCheck("j-ui-content","content");
	});
	
 	function userInfoCheck(selector,type){
 		switch(type){
 			case "title" :
				if($.trim($("#"+selector).val())==""){
					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("新闻标题不能为空").fadeIn(100);
					return false;
				}else{
					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
					return true;
				}
			break;
 			case "sno" :
 				if($.trim($("#"+selector).val())==""){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("排序号不能为空").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 			break;
 			case "content" :
 				var data= $("#"+selector).val();
 				if($.trim(data)==""){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("新闻内容不能为空").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 				break;
 		};
	};
}


function getNewsData() {
	var xwid00=getQueryString("xwid00");
	if(xwid00!=null){
		var param="xwid00="+xwid00
		$.ajax( {
			type : "POST",
			dataType : "json",
			url : 'system/queryNewsDetail.shtml',
			data:param,
			success : function(data) {
				var obj=data.newsDetail;
				$("#j-ui-id").val(obj.xwid00);
				$("#j-ui-type").val(obj.xwlx00);
				$("#j-ui-title").val(obj.xwbt00);
				$("#j-ui-sno").val(obj.pxqz00);
				$("#j-ui-content").text(obj.xwnr00);
				initData();
			}
		});	
	}
}