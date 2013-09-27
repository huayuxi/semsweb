function init(){
	var basePath=$("#basePath").val();	
	$(".dropdown .dropdown-menu li").bind("click",function(){
		var val= $(this).find("a").text();
		$(this).parent().parent().find(".data_value").val($(this).attr('class'));
		$(this).parent().parent().find(".value").html(val);
		$(this).parent().parent().removeClass("open");
		return false;
	});
	$("#casesdata-form").bind("click",function(){
		var valid = true;
		!userInfoCheck("j-ui-name","name")&& (valid = false);
		!userInfoCheck("j-ui-sno","sno") && (valid = false);
		!userInfoCheck("j-ui-bj","bj") && (valid = false);
		!userInfoCheck("j-ui-cx","cx") && (valid = false);
		!userInfoCheck("j-ui-gm","gm") && (valid = false);
		!userInfoCheck("j-ui-images","images") && (valid = false);
		if(valid){
			var param = $('#cases-form').formSerialize();;
			$.ajax( {
				type : "POST",
				dataType : "json",
				url : 'system/addCases.shtml',
				data:param,
				success : function(data) {
					if(data.msg=="error_sys"){
						
					}else if(data.msg=="success"){
						window.location.href=basePath+"pages/admin/cases/cases.jsp";
					}
				}
			});
		}
	});
	$("#j-ui-name").bind("blur",function(){
		userInfoCheck("j-ui-name","name");
	});
	
	$("#j-ui-bj").bind("blur",function(){
		userInfoCheck("j-ui-bj","bj");
	});
	
	$("#j-ui-sno").bind("blur",function(){
		userInfoCheck("j-ui-sno","sno");
	});
	
	$("#j-ui-gm").bind("blur",function(){
		userInfoCheck("j-ui-gm","gm");
	});
	
	$("#j-ui-cx").bind("blur",function(){
		userInfoCheck("j-ui-cx","cx");
	});
	
	$("#j-ui-images").bind("blur",function(){
		userInfoCheck("j-ui-images","images");
	});
};

function userInfoCheck(selector,type){
 		switch(type){
 			case "name" :
				if($.trim($("#"+selector).val())==""){
					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("不能为空").fadeIn(100);
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
 			case "bj" :
 				if($.trim($("#"+selector).val())==""){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("案例背景不能为空").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 			break;
 			case "gm" :
 				if($.trim($("#"+selector).val())==""){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("案例规模不能为空").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 			break;
 			case "cx" :
 				if($.trim($("#"+selector).val())==""){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("案例成效不能为空").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 			break;
 			case "images" :
 				var data= $("#"+selector).val();
 				if($.trim(data)==""){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("案例图片不能为空").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 				break;
 		};
	};