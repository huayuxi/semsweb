	
function init(){
	var basePath=$("#basePath").val();
	
	$(".dropdown #lx-menu li").bind("click",function(){
		var val= $(this).find("a").text();
		$(this).parent().parent().find("input").val($(this).attr('class'));
		$(this).parent().parent().find(".value").html(val);
		$(this).parent().parent().removeClass("open");
		return false;
	});
	
	$(".dropdown #lm-menu li").bind("click",function(){
		var val= $(this).find("a").text();
		
		if(val=="软件产品"){
			$("#j-li-lx").css("display","none");
			$("#j-li-lx").find("input").val("100000");
		}else{
			$("#j-li-lx").css("display","");
			$("#j-li-lx").find("input").val("");
		}
		
		$(this).parent().parent().find("input").val($(this).attr('class'));
		$(this).parent().parent().find(".value").html(val);
		$(this).parent().parent().removeClass("open");
		return false;
	});
	
	$("#productdata-form").bind("click",function(){
		var valid = true;
		!userInfoCheck("j-ui-title","title")&& (valid = false);
		!userInfoCheck("j-ui-sno","sno") && (valid = false);
		!userInfoCheck("j-ui-content","content") && (valid = false);
		!userInfoCheck("j-ui-images","images") && (valid = false);
		if(valid){
			var param = $('#product-form').formSerialize();;
			$.ajax( {
				type : "POST",
				dataType : "json",
				url : 'system/addProduct.shtml',
				data:param,
				success : function(data) {
					if(data.msg=="error_sys"){
						
					}else if(data.msg=="success"){
						window.location.href=basePath+"pages/admin/product/product.jsp";
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
	$("#j-ui-images").bind("blur",function(){
		userInfoCheck("j-ui-images","images");
	});
}	

function userInfoCheck(selector,type){
	switch(type){
		case "title" :
			if($.trim($("#"+selector).val())==""){
				$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("名称不能为空").fadeIn(100);
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
				$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("内容不能为空").fadeIn(100);
				return false;
			}else{
				$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
				return true;
			}
			break;
		case "images" :
				var data= $("#"+selector).val();
				if($.trim(data)==""){
					$("#"+selector).next(".input-tip").removeClass("input-tip-success").addClass("input-tip-warning").text("产品图片不能为空").fadeIn(100);
					return false;
				}else{
					$("#"+selector).next(".input-tip").removeClass("input-tip-warning").addClass("input-tip-success").text("填写正确").fadeIn(100);
					return true;
				}
				break;
	};
};