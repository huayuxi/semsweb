$(function() {
	$(".dropdown .dropdown-menu li").bind("click",function(){
		var val= $(this).find("a").text();
		$("#j-ui-sex").val($(this).attr('class'));
		$(this).parent().parent().find(".value").html(val);
		$(this).parent().parent().removeClass("open");
		return false;
	});
	
	$("#userdata-form").bind("click",function(){
		var valid = true;
		!userInfoCheck("j-ui-name","name") && (valid = false);
		!userInfoCheck("j-ui-email","email") && (valid = false);
		if(valid){
			var param = $('#user-form').formSerialize();;
			$.ajax( {
				type : "POST",
				dataType : "json",
				url : 'updateSysUser.shtml',
				data:param,
				success : function(data) {
					
				}
			});
		}
	});
	
	
	$("#j-ui-name").bind("blur",function(){
		userInfoCheck("j-ui-name","name");
	});
	
	$("#j-ui-email").bind("blur",function(){
		userInfoCheck("j-ui-email","email");
	});
	
	
 	function userInfoCheck(selector,type){
 		switch(type){
 			case "name" :
 				if($.trim($("#"+selector).val())==""){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("真实姓名不能为空").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 			break;
 			case "email" :
 				var reg =  /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
 				var data= $("#"+selector).val();
 				if($.trim(data)=="" || !reg.exec(data)){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("请输入正确的邮箱地址").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 				break;
 		};
	};

});