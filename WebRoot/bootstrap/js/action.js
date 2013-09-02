(function(){ 
	$(".g-table").delegate(".action-run","click",function(){
		if($(this).hasClass("btn-success")){
			$(this).removeClass("btn-success").addClass("btn-warning");
			$(this).html("暂停");
		}else{
			$(this).removeClass("btn-warning").addClass("btn-success");
			$(this).html("运行");
		}
	});
	$(".g-table").delegate(".action-run-sub","click",function(){
		if($(this).find("i").hasClass("icon-play")){
			$(this).html('<i class="icon-pause"></i>暂停');
		}else{
			$(this).html('<i class="icon-play"></i>运行');
		}
	});

	$("#j-ad-all").on("change",function(){
		if(this.checked){
			$(".g-ad-title input").each(function(){
				this.checked = true;
			});
		}else{
			$(".g-ad-title input").each(function(){
				this.checked = false;
			});
		};
	});

	$(".dropdown .dropdown-menu li").bind("click",function(){
		var val= $(this).find("a").text();
		$(this).parent().parent().find(".value").html(val);
		$(this).parent().parent().removeClass("open");
		return false;
	});

	//form submit check
	$("#create-next-btn").bind("click",function(){
		var valid = true;

		!selectCheck("create-type-dropdown","请选择应用类型","请选择") && (valid = false);
		!textCheck("create-app-name","应用名称不能为空") && (valid = false);

		return valid;
	});
	$("#create-type-dropdown .dropdown-menu li").bind("click",function(){
		selectCheck("create-type-dropdown","请选择应用类型","请选择");
	});
	$("#create-app-name").bind("blur",function(){
		textCheck("create-app-name","应用名称不能为空");
	});

	//add form submit check
	$("#addModal .btn-primary").bind("click",function(){
		var valid = true;
		$(this).attr("data-dismiss","");
		$(this).attr("aria-hidden","");
		!selectCheck("ad-type-dropdown","请选择广告位类型","请选择") && (valid = false);
		!textCheck("add-ad-name","广告位名称为空") && (valid = false);
		if(valid){
			var name = $.trim($("#add-ad-name").val()),
				type = $.trim($("#ad-type-dropdown").find(".value").text()),
				created = new Date();

			var tmpl = '<tr>\
                          <td><span class="g-textclip1">' + name + '</span></td>\
                          <td>' + type + '</td>\
                          <td>\
                            <button class="btn btn-small action-run-sub" type="button"><i class="icon-play"></i>运行</button>\
                          </td>\
                          <td><span class="g-col-grn g-textclip2">后端返回广告位ID</span></td>\
                          <td>' + created.getFullYear() + "-" + (created.getMonth() + 1) + "-" + created.getDate() + " " + created.getHours() + ":" + created.getMinutes() + '</td>\
                        </tr>';

            $("#j-ad-table tbody").append(tmpl);

			$(this).attr("data-dismiss","modal");
			$(this).attr("aria-hidden","true");
			$(".input-tip").hide();
			$("#add-ad-name").val("");
			$("#ad-type-dropdown").find(".value").text("请选择");
		};
	});
	$("#addModal .close").bind("click",function(){
		$(".input-tip").hide();
		$("#add-ad-name").val("");
		$("#ad-type-dropdown").find(".value").text("请选择");
	});

	$("#ad-type-dropdown .dropdown-menu li").bind("click",function(){
		selectCheck("ad-type-dropdown","请选择广告位类型","请选择");
	});

	$("#add-ad-name").bind("blur",function(){
		textCheck("add-ad-name","广告位名称为空");
	});

	$("#login-form").bind("submit",function(){
		var valid = true;
		!loginCheck("userInput","pwdInput","用户名或密码为空") && (valid = false);
		return valid;
	});
	$("#userdata-form").bind("submit",function(){
		var valid = true;
		!userInfoCheck("j-ui-name","name") && (valid = false);
		!userInfoCheck("j-ui-tel","tel") && (valid = false);
		!userInfoCheck("j-ui-qq","qq") && (valid = false);
		return valid;
	});
	$("#j-ui-name").bind("blur",function(){
		userInfoCheck("j-ui-name","name");
	});
	$("#j-ui-tel").bind("blur",function(){
		userInfoCheck("j-ui-tel","tel");
	});
	$("#j-ui-qq").bind("blur",function(){
		userInfoCheck("j-ui-qq","qq");
	});
	function textCheck(selector,tiptext){
		var text_selector = $("#"+selector);
		if($.trim(text_selector.val())==""){
			text_selector.next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text(tiptext).fadeIn(100);
			return false;
		}else{
			text_selector.next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("正确").fadeIn(100);
			return true;
		}
	};

	function selectCheck(selector,tiptext,deftext){
		var drop_selector = $("#"+selector);
		if(drop_selector.find(".value").text()==deftext){
			drop_selector.next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text(tiptext).fadeIn(100);
			return false;
		}else{
			drop_selector.next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("正确").fadeIn(100);
			return true;
		}
	};

	function loginCheck(selector1,selector2,tiptext){
		if($.trim($("#"+selector1).val())=="" || $.trim($("#"+selector2).val())==""){
			$("#j-log-tip").removeClass("input-tip-success").addClass("input-tip-warning").text(tiptext).fadeIn(100);
			return false;
		}else{
			$("#j-log-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("正确").fadeIn(100);
			return true;
		}
	};
	
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
 			case "tel" :
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
 			case "qq" :
 				var reg = /^[0-9][0-9]{4,}$/;
 				var data= $("#"+selector).val();
 				if($.trim(data)=="" || !reg.exec(data)){
 					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("请输入正确的QQ或MSN号码").fadeIn(100);
 					return false;
 				}else{
 					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
 					return true;
 				}
 				break;
 		};
	};

})()