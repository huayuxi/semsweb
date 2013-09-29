$(function() {
	$(".menus li").bind("click",function(){
		$(this).parent().find("li").removeClass("active");
		$(this).parent().find("li").children("ul").css("display","none");
		$(this).addClass("active");
		var next_css=$(this).children("ul").css("display");
		if(next_css=="none"){
			$(this).children("ul").css("display","");
		}else{
			$(this).children("ul").css("display","none");
		}
	});
})

function product_list(cplx00){
	var basePath=$("#basePath").val();
	window.location.href=basePath+"pages/front/product/product_list.jsp?&key_cplm00=100000&key_cplx00="+cplx00;
}

function product_rs(cplx00){
	var basePath=$("#basePath").val();
	window.location.href=basePath+"pages/front/product/product_list.jsp?&key_cplm00=100001";
}