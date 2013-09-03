$(document).ready(function() {	
	getData(0);
});

//分页显示
function getData(pageNo){
	var param="pageNo="+(pageNo+1)+"&pageSize=10";
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'system/queryNews.shtml',
		data:param,
		success : function(data) {
			var totalcount = data.totalRecords;
			var pagesize = data.pageSize;
			var myData = data.list;
			var div = "";
			if(totalcount!=0){
				$.each(myData, function(i, n) {
					div=div+"<div class=\"item\"><a href=\"\">"+n.xwbt00+"</a><span class=\"date\">"+n.xwfbsj+"</span>";
				});
				$("#news_list").html(div);
			
				// 分页-只初始化一次
				$("#Pagination").pagination(totalcount, {
					callback : pageselectCallback,
					prev_text : "<上一页",
					next_text : "下一页 >",
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
	getData(page_id);
}