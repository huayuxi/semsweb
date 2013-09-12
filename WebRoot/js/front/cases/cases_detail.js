//获取URL参数
function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}
$(function() {
	getCasesData();
});

function getCasesData() {
	var alid00=getQueryString("alid00");
	if(alid00!=null){
		var param="alid00="+alid00
		$.ajax( {
			type : "POST",
			dataType : "json",
			url : 'front/queryCasesDetail.shtml',
			data:param,
			success : function(data) {
				var obj=data.casesDetail;
				$("#j-ui-name").html(obj.almc00);
				$("#j-ui-bj").html(obj.albj00);
				$("#j-ui-gm").html(obj.algm00);
				$("#j-ui-cx").html(obj.alcx00);
				$("#j-images").attr("src",$("#basePath").val()+obj.zylj00);
			}
		});	
	}
}