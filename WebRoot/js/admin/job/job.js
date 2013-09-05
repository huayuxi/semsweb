$(function() {
	getData(0);
});


//分页显示
function getData(pageNo){
	var param="pageNo="+(pageNo+1)+"&pageSize=10";
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'system/queryJob.shtml',
		data:param,
		success : function(data) {
			var totalcount = data.totalRecords;
			var pagesize = data.pageSize;
			var myData = data.list;
			var div ="";
			if(totalcount!=0){
				div= "<thead><tr><th class=\"g-tl\" width=\"40%\">" +
				"<input class=\"g-checkbox\" id=\"j-ad-all\" type=\"checkbox\">岗位名称</th>" +
				"<th width=\"10%\">招聘类型</th>" +
				"<th width=\"10%\">工作地点</th>" +
				"<th width=\"10%\">发布者</th>" +
				"<th width=\"20%\">发布时间</th>" +
				"<th width=\"10%\">相关操作</th></tr></thead><tbody>";
				$.each(myData, function(i, n) {
						div=div+"<tr class=\"g-app-row\"><td><label class=\"g-ad-title\">" +
								"<input class=\"g-checkbox\" type=\"checkbox\">" +
								"<a href=\""+
								$("#basePath").val()+"pages/admin/news/news_detail.jsp?xwid00="+n.xwid00
								+"\"><img class=\"g-appimg\" src=\"bootstrap/img/new.gif\">"+
								n.zpgw00
								+"</a></label></td><td>"+
								n.zplx00
								+"</td><td>" +
								n.gzdd00
								+"</td><td><span class=\"g-col-org\">" +
								n.fbz000
								+"</span></td><td><span class=\"g-col-grn\">" +
								n.fbsj00
								+"</span></td><td>" +
								"<a href=\"javascript:goUpdate('" +n.zpid00+"')\">编辑</a>&nbsp;|&nbsp;" +
								"<a href=\"javascript:goDel(" +n.zpid00+");\">删除</a></td></tr>";
				});
				div=div+"</tbody>";
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
				$("#job_list").html("<span style=\"color:red\">很遗憾未找到相关记录！</span>");
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
function goUpdate(zpid00){
	var basePath=$("#basePath").val();
	window.location.href=basePath+"pages/admin/job/job_editor.jsp?xwid00="+zpid00;
}
//删除新闻
function goDel(zpid00){
	var param = "zpid00="+zpid00;
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'system/deleteJob.shtml',
		data:param,
		success : function(data) {
			if(data.msg=="error_sys"){
				
			}else if(data.msg=="success"){
				getData(0);
			}
		}
	});
}