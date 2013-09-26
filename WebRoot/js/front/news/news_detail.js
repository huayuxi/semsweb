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

function getNewsData() {
	var xwid00=getQueryString("xwid00");
	if(xwid00!=null){
		var param="xwid00="+xwid00
		$.ajax( {
			type : "POST",
			dataType : "json",
			url : 'front/queryNewsDetail.shtml',
			data:param,
			success : function(data) {
				var obj=data.newsDetail;
				var xwlx=obj.xwlx00;
				if(xwlx!=null&&xwlx!=""){
					if(xwlx=="100001"){
						$("#about-title").html("行业新闻");
						$("#about-title1").html("行业新闻");
						$(".menus li").parent().find("li").addClass("active");
						$(".menus li").parent().find("li").first().removeClass("active");
					}
				}
				$("#about-title1").html(obj.xwbt00);
				$("#new_content").html(obj.xwnr00);
			}
		});	
	}
}