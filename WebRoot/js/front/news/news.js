var key="";

$(function() {
	get_reback_data()
	getData(0);
	$(".menus li").bind("click",function(){
		$(this).parent().find("li").removeClass("active");
		$("#about-title").html($(this).html());
		$("#about-title1").html($(this).html());
		$(this).addClass("active");
	});
});

//处理返回页的参数
function get_reback_data(){
	var xwlx=getQueryString("xwlx00");
	if(xwlx!=null&&xwlx!=""){
		key="&key_xwlx00="+xwlx;
		if(xwlx=="100001"){
			$("#about-title").html("行业新闻");
			$("#about-title1").html("行业新闻");
			$(".menus li").parent().find("li").addClass("active");
			$(".menus li").parent().find("li").first().removeClass("active");
		}
	}
}

function news_list(xwlx00){
	key="&key_xwlx00="+xwlx00;
	getData(0);
}

//获取URL参数
function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}
//分页显示
function getData(pageNo){
	if(key==""){
		key="&key_xwlx00=100000";
	}
	var param="pageNo="+(pageNo+1)+"&pageSize=10"+key;
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'front/queryNews.shtml',
		data:param,
		success : function(data) {
			var totalcount = data.totalRecords;
			var pagesize = data.pageSize;
			var myData = data.list;
			var div ="";
			if(totalcount!=0){
				$.each(myData, function(i, n) {
						div=div+"<div class=\"item\"><span class=\"date\">" +n.fbsj00Str
						+"</span><a href=\""+
						$("#basePath").val()+"pages/front/news/news_detail.jsp?xwid00="+n.xwid00
						+"\">"+n.xwbt00+"</a></div>";
				});
				$("#news_list").html(div);
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
				$("#news_list").html("<span style=\"color:red\">很遗憾未找到相关记录！</span>");
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

