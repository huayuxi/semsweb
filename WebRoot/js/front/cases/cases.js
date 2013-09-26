$(function() {
	getData(0);
});
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
	var allx00=getQueryString("allx00");
	var key="";
	if(allx00!=null&&allx00!=""){
		key="&key_allx00="+allx00;
	}
	var param="pageNo="+(pageNo+1)+"&pageSize=10"+key;
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'front/queryCasesDetailList.shtml',
		data:param,
		success : function(data) {
			var totalcount = data.totalRecords;
			var pagesize = data.pageSize;
			var myData = data.list;
			var div ="";
			if(totalcount!=0){
				$.each(myData, function(i, n) {
						div=div+"<div class=\"case_item\"><div class=\"case_item_left\">" +
								"<img width=\"219\" height=\"162\" src=\""+
								n.zylj00
								+"\"></div><div class=\"case_item_right\"><p><strong><a href=\"" +
								$("#basePath").val()+"pages/front/cases/cases_detail.jsp?alid00="+n.alid00+"\">" +
								n.almc00 +
								"</a></strong></p><p><strong>项目背景：</strong><p>" +
								n.albj00
								+"</p></div></div>";
				});
				$("#cases_list").html(div);
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
				$("#cases_list").html("<span style=\"color:red\">很遗憾未找到相关记录！</span>");
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

