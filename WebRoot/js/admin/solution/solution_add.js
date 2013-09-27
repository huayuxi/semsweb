$(function() {
	var basePath=$("#basePath").val();
	$("#solutiondata-form").bind("click",function(){
		var valid = true;
		!userInfoCheck("j-ui-title","title")&& (valid = false);
		!userInfoCheck("j-ui-sno","sno") && (valid = false);
		!userInfoCheck("j-ui-content","content") && (valid = false);
		if(valid){
			var param = $('#solution-form').formSerialize();;
			$.ajax( {
				type : "POST",
				dataType : "json",
				url : 'system/addSolution.shtml',
				data:param,
				success : function(data) {
					if(data.msg=="error_sys"){
						
					}else if(data.msg=="success"){
						window.location.href=basePath+"pages/admin/solution/solution.jsp";
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
					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("标题不能为空").fadeIn(100);
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
 			case "content" :
 				var data= $("#"+selector).val();
 				if($.trim(data)==""){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("内容不能为空").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 				break;
 		};
	};

});