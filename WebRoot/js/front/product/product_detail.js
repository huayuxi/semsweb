//获取URL参数
function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}

$(function() {
	getProductData();
});

function product_list(cplx00){
	var basePath=$("#basePath").val();
	window.location.href=basePath+"pages/front/product/product_list.jsp?key_cplm00=100000&key_cplx00="+cplx00;
}

function product_rs(){
	var basePath=$("#basePath").val();
	window.location.href=basePath+"pages/front/product/product_list.jsp?&key_cplm00=100001";
}

function getProductData() {
	var cpid00=getQueryString("cpid00");
	if(cpid00!=null){
		var param="cpid00="+cpid00
		$.ajax( {
			type : "POST",
			dataType : "json",
			url : 'front/queryProductDetail.shtml',
			data:param,
			success : function(data) {
				var obj=data.productDetail;
				$("#j-ui-mc").html(obj.cpmc00);
				$("#j-ui-jj").html(obj.cpjj00);
				$("#j-ui-nr").html(obj.cpnr00)
				$("#j-ui-images").attr("src",$("#basePath").val()+obj.zylj00);
			}
		});	
	}
}