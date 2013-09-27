$(function() {
	getJobData();
});

//获取URL参数
function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}

function getJobData() {
	var zpid00=getQueryString("zpid00");
	if(zpid00!=null){
		var param="zpid00="+zpid00
		$.ajax( {
			type : "POST",
			dataType : "json",
			url : 'system/queryJobDetail.shtml',
			data:param,
			success : function(data) {
				var obj=data.job;
				$("#j-ui-id").val(obj.zpid00);
				$("#j-ui-type").val(obj.zplx00);
				$("#j-ui-title").val(obj.zpgw00);
				$("#j-ui-address").val(obj.gzdd00);
				$("#j-ui-num").val(obj.zprs00);
				$("#j-ui-sno").val(obj.pxqz00);
				$("#j-ui-content").text(obj.zpnr00);
				init();
			}
		});	
	}
}

function init(){
	var basePath=$("#basePath").val();	
	$(".dropdown .dropdown-menu li").bind("click",function(){
		var val= $(this).find("a").text();
		$(this).parent().parent().find(".data_value").val($(this).attr('class'));
		$(this).parent().parent().find(".value").html(val);
		$(this).parent().parent().removeClass("open");
		return false;
	});
	$("#jobdata-form").bind("click",function(){
		var valid = true;
		!userInfoCheck("j-ui-title","title")&& (valid = false);
		!userInfoCheck("j-ui-sno","sno") && (valid = false);
		!userInfoCheck("j-ui-content","content") && (valid = false);
		!userInfoCheck("j-ui-num","num") && (valid = false);
		!userInfoCheck("j-ui-address","address") && (valid = false);
		if(valid){
			var param = $('#job-form').formSerialize();;
			$.ajax( {
				type : "POST",
				dataType : "json",
				url : 'system/updateJob.shtml',
				data:param,
				success : function(data) {
					if(data.msg=="error_sys"){
						
					}else if(data.msg=="success"){
						window.location.href=basePath+"pages/admin/job/job.jsp";
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
	
	$("#j-ui-num").bind("blur",function(){
		userInfoCheck("j-ui-num","num");
	});
	
	$("#j-ui-address").bind("blur",function(){
		userInfoCheck("j-ui-address","address");
	});
};

function userInfoCheck(selector,type){
 		switch(type){
 			case "title" :
				if($.trim($("#"+selector).val())==""){
					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("招聘岗位不能为空").fadeIn(100);
					return false;
				}else{
					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
					return true;
				}
			break;
 			case "sno" :
 				var reg = new RegExp("^[0-9]*$");
 				var data= $("#"+selector).val();
 				if($.trim(data)=="" || !reg.test(data)){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("请输入数字").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 				break;
 			case "address" :
 				if($.trim($("#"+selector).val())==""){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("排序号不能为空").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 			break;
 			case "num" :
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
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("招聘内容不能为空").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 				break;
 		};
	};