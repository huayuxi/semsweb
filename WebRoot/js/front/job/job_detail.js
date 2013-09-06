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
				$("#data-fbsj").html(obj.fbsj00);
				$("#data-zplx").html(obj.zplx00);
				$("#data-gzlb").html(obj.gzlb00);
				$("#data-gzdd").html(obj.gzdd00);
				$("#data-zprs").html(obj.zprs00);
				$("#data-zpnr").html(obj.zpnr00);
			}
		});	
	}
}