$(function() {
	getData(0);
});

function dateFormate(date){
	if(date!=null){
		return date.substr(0,4)+"-"+date.substr(4,2)+"-"+date.substr(6,2);
	}
	return "";
}

//分页显示
function getData(pageNo){
	var param="pageNo="+(pageNo+1)+"&pageSize=10";
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'system/queryProduct.shtml',
		data:param,
		success : function(data) {
			var totalcount = data.totalRecords;
			var pagesize = data.pageSize;
			var myData = data.list;
			var div ="";
			if(totalcount!=0){
				div= "<thead><tr><th class=\"g-tl\" width=\"40%\">" +
				"<input class=\"g-checkbox\" id=\"j-ad-all\" type=\"checkbox\">产品名称</th>" +
				"<th width=\"10%\">产品栏目</th>" +
				"<th width=\"10%\">产品类型</th>" +
				"<th width=\"20%\">排序权值</th>" +
				"<th width=\"10%\">发布时间</th>" +
				"<th width=\"10%\">相关操作</th></tr></thead><tbody>";
				$.each(myData, function(i, n) {
					var cpmc=n.cpmc00;
						div=div+"<tr class=\"g-app-row\"><td><label class=\"g-ad-title\">" +
								"<input class=\"g-checkbox\" type=\"checkbox\">" +
								"<a href=\""+
								$("#basePath").val()+"pages/admin/news/news_detail.jsp?xwid00="+n.cpid00
								+"\"><img class=\"g-appimg\" src=\"bootstrap/img/new.gif\">"+
								cpmc.substr(0,20)
								+"</a></label></td><td>"+
								n.cplm00
								+"</td><td>" +
								n.cplx00
								+"</td><td><span class=\"g-col-org\">" +
								n.pxqz00
								+"</span></td><td><span class=\"g-col-grn\">" +
								dateFormate(n.fbsj00)
								+"</span></td><td>" +
								"<a href=\"javascript:goUpdate('" +n.cpid00+"')\">编辑</a>&nbsp;|&nbsp;" +
								"<a href=\"javascript:goDel(" +n.cpid00+");\">删除</a></td></tr>";
				});
				div=div+"</tbody>";
				$("#product_list").html(div);
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
				$("#product_list").html("<span style=\"color:red\">很遗憾未找到相关记录！</span>");
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
//前往编辑页面
function goUpdate(cpid00){
	var basePath=$("#basePath").val();
	window.location.href=basePath+"pages/admin/product/product_editor.jsp?cpid00="+cpid00;
}
//删除新闻
function goDel(cpid00){
	var param = "cpid00="+cpid00;
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'system/deleteProduct.shtml',
		data:param,
		success : function(data) {
			if(data.msg=="error_sys"){
				
			}else if(data.msg=="success"){
				getData(0);
			}
		}
	});
}