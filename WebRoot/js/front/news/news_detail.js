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
				$("#about-title1").html(obj.xwbt00);
				$("#new_content").html(obj.xwnr00);
			}
		});	
	}
}