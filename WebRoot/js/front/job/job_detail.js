//获取URL参数
function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}

$(function() {
	getJobData();
});

function dateFormate(date){
	if(date!=null){
		return date.substr(0,4)+"-"+date.substr(4,2)+"-"+date.substr(6,2);
	}
	return "";
}

function getJobData() {
	var zpid00=getQueryString("zpid00");
	if(zpid00!=null){
		var param="zpid00="+zpid00
		$.ajax( {
			type : "POST",
			dataType : "json",
			url : 'front/queryJobDetail.shtml',
			data:param,
			success : function(data) {
				var obj=data.job;
				$("#data-zpgw").html(obj.zpgw00);
				$("#data-fbsj").html(dateFormate(obj.fbsj00));
				
				var zplx=obj.zplx00;
				
				if(zplx=="100001"){
					$("#about-title").html("校园招聘");
					$("#about-title1").html("校园招聘");
					$("#data-zplx").html("校园招聘");
					$(".menus li").parent().find("li").addClass("active");
					$(".menus li").parent().find("li").first().removeClass("active");
				}else{
					$("#data-zplx").html("社会招聘");
				}
				
				
				$("#data-gzlb").html(obj.gzlb00=="100000"?"技术类":"行政类");
				$("#data-gzdd").html(obj.gzdd00);
				$("#data-zprs").html(obj.zprs00);
				$("#data-zpnr").html(obj.zpnr00);
			}
		});	
	}
}