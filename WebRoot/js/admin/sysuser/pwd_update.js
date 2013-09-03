$(function() {	
	$("#userdata-form").bind("click",function(){
		var valid = true;
		!userInfoCheck("j-ui-old","old")&& (valid = false);
		!userInfoCheck("j-ui-pwd","pwd") && (valid = false);
		!userInfoCheck("j-ui-check","check") && (valid = false);
		
		if(valid){
			var param = $('#user-form').formSerialize();;
			$.ajax( {
				type : "POST",
				dataType : "json",
				url : 'system/updatePwd.shtml',
				data:param,
				success : function(data) {
					if(data.msg=="error_pwd"){
						$("#j-ui-old").next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("原密码出错").fadeIn(100);
					}
				}
			});
		}
	});
	
	$("#j-ui-old").bind("blur",function(){
		userInfoCheck("j-ui-old","old");
	});
	
	$("#j-ui-check").bind("blur",function(){
		userInfoCheck("j-ui-check","check");
	});
	
	$("#j-ui-pwd").bind("blur",function(){
		userInfoCheck("j-ui-pwd","pwd");
	});
	
	
 	function userInfoCheck(selector,type){
 		switch(type){
 			case "old" :
				if($.trim($("#"+selector).val())==""){
					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("原密码不能为空").fadeIn(100);
					return false;
				}else{
					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
					return true;
				}
			break;
 			case "check" :
 				var data= $("#"+selector).val();
 				var data_pwd= $("#j-ui-pwd").val();
 				if($.trim(data)==""){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("新密码不能为空").fadeIn(100);
 					return false;
 				}else if($.trim(data)!=$.trim(data_pwd)){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("新密码与确认密码不一致").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 			break;
 			case "pwd" :
 				var data= $("#"+selector).val();
 				if($.trim(data)==""){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("确认密码不能为空").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 				break;
 		};
	};

});