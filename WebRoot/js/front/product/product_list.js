//获取URL参数
function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}

function product_list(cplx00){
	var basePath=$("#basePath").val();
	window.location.href=basePath+"pages/front/product/product_list.jsp?key_cplm00=100000&key_cplx00="+cplx00;
}

function product_rs(){
	var basePath=$("#basePath").val();
	window.location.href=basePath+"pages/front/product/product_list.jsp?&key_cplm00=100001";
}

$(function() {
	getData(0);
	getReback();
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
});

function getReback(){
	var cplx00=getQueryString("key_cplx00");
	var cplm00=getQueryString("key_cplm00");
	switch(cplx00){
		case "100000" :
			$("#about-title").html("电力载波终端控制器");
			$("#about-title1").html("电力载波终端控制器");
		break;
		case "100001" :
			$("#about-title").html("集中控制器");
			$("#about-title1").html("集中控制器");
		break;
		case "100002" :
			$("#about-title").html("无线太阳能路灯控制器");
			$("#about-title1").html("无线太阳能路灯控制器");
		break;
		case "100003" :
			$("#about-title").html("防盗扩展模块及防盗终端");
			$("#about-title1").html("防盗扩展模块及防盗终端");
		break;
		case "100004" :
			$("#about-title").html("输入输出扩展模块");
			$("#about-title1").html("输入输出扩展模块");
		break;
		case "100005" :
			$("#about-title").html("光照采集器");
			$("#about-title1").html("光照采集器");
		break;
	};
	if(cplm00=="100001"){
		$("#about-title").html("管理平台");
		$("#about-title1").html("管理平台");
		$("#product").children("ul").css("display","none");
		$("#product").removeClass("active");
		$("#rs").addClass("active");
	}
}
//分页显示
function getData(pageNo){
	var param="pageNo="+(pageNo+1)+"&pageSize=10&key_cplm00="+getQueryString("key_cplm00")+"&key_cplx00="+getQueryString("key_cplx00");
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'front/queryProductList.shtml',
		data:param,
		success : function(data) {
			var totalcount = data.totalRecords;
			var pagesize = data.pageSize;
			var myData = data.list;
			var div ="";
			if(totalcount!=0){
				$.each(myData, function(i, n) {
						div=div+"<div class=\"product_item\"><div class=\"product_item_l\">" +
								"<img width=\"419\" height=\"210\" src=\"" +
								n.zylj00
								+"\"></div><div class=\"product_item_r\"><p><strong class=\"solutions\"><a href=\""+
								$("#basePath").val()+"pages/front/product/product_detail.jsp?cpid00="+n.cpid00
								+"\">"+
								n.cpmc00
								+"</a></strong></p><br><p>" +
								n.cpjj00
								 +"</p></div></div>"
				});
				$("#data_list").html(div);
				// 分页-只初始化一次
				$("#Pagination").pagination(totalcount, {
					callback : pageselectCallback,
					prev_text : "上一页",
					next_text : "下一页 ",
					items_per_page : pagesize,
					prev_show_always : true,
					next_show_always : true,
					current_page : pageNo,
					link_to : "javascript:void(0)"
				});
			}else{
				$("#data_list").html("<span style=\"color:red\">很遗憾未找到相关记录！</span>");
				$("#Pagination").html("");
			}
		}
	});
}

//翻页调用
function pageselectCallback(page_id,jq){
	scroll(0,0);
	getData(page_id);
}

