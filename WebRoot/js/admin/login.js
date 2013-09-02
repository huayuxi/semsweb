$(function() {
	var COOKIE_NAME = 'username';
	
	if ($.cookie(COOKIE_NAME)) {
		$("#userInput").val($.cookie(COOKIE_NAME));
	}
	
	$("#login-form").bind("click", function() {
		var valid = true;
		!loginCheck("userInput", "pwdInput", "用户名或密码为空") && (valid = false);
		
		if ($("#j-remember-me")[0].checked) {
			$.cookie(COOKIE_NAME, $("#userInput").val(), {
				expires : 10
			});
		} else {
			$.cookie(COOKIE_NAME, null);
		}
		
		if(valid){
			var param = "dlzh00="+$.trim($("#userInput").val())+"&dlmm00="+$.trim($("#pwdInput").val());
			$.ajax( {
				type : "POST",
				dataType : "json",
				url : 'login.shtml',
				data:param,
				success : function(data) {
					if(data.msg=="error_again"){
						$("#j-log-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("用户名或者密码错误").fadeIn(100);
					}else{
						$("#j-log-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("用户名或密码为空").fadeIn(100);
					}
				}
			});
		}
	});
	
	function loginCheck(selector1, selector2, tiptext) {
		if ($.trim($("#" + selector1).val()) == ""|| $.trim($("#" + selector2).val()) == "") {
			$("#j-log-tip").removeClass("input-tip-success").addClass("input-tip-warning").text(tiptext).fadeIn(100);
			return false;
		} else {
			$("#j-log-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("正在登陆...").fadeIn(100);
			return true;
		}
	};
	
	
	$("#userInput").focus(function(){
		$("#j-log-tip").fadeOut(100);
	});
	
	$("#pwdInput").focus(function(){
		$("#j-log-tip").fadeOut(100);
	});
});