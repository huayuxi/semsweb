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
