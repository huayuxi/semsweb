$(function() {
	getData(0);
});


//分页显示
function getData(pageNo){
	var param="pageNo="+(pageNo+1)+"&pageSize=10";
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'system/querySolution.shtml',
		data:param,
		success : function(data) {
			var totalcount = data.totalRecords;
			var pagesize = data.pageSize;
			var myData = data.list;
			var div ="";
			if(totalcount!=0){
				div= "<thead><tr><th class=\"g-tl\" width=\"60%\">" +
				"<input class=\"g-checkbox\" id=\"j-ad-all\" type=\"checkbox\">解决方案名称</th>" +
				"<th width=\"10%\">发布者</th>" +
				"<th width=\"20%\">发布时间</th>" +
				"<th width=\"10%\">相关操作</th></tr></thead><tbody>";
				$.each(myData, function(i, n) {
						div=div+"<tr class=\"g-app-row\"><td><label class=\"g-ad-title\">" +
								"<input class=\"g-checkbox\" type=\"checkbox\">" +
								"<a href=\""+
								$("#basePath").val()+"pages/front/solution/solution.jsp?jjfaid="+n.jjfaid
								+"\"><img class=\"g-appimg\" src=\"bootstrap/img/new.gif\">"+
								n.famc00
								+"</a></label></td><td><span class=\"g-col-org\">" +
								n.fbz000
								+"</span></td><td><span class=\"g-col-grn\">" +
								n.fbsj00
								+"</span></td><td>" +
								"<a href=\"javascript:goUpdate('" +n.jjfaid+"')\">编辑</a>&nbsp;|&nbsp;" +
								"<a href=\"javascript:goDel(" +n.jjfaid+");\">删除</a></td></tr>";
				});
				div=div+"</tbody>";
				$("#solution_list").html(div);
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
				$("#solution_list").html("<span style=\"color:red\">很遗憾未找到相关记录！</span>");
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
function goUpdate(jjfaid){
	var basePath=$("#basePath").val();
	window.location.href=basePath+"pages/admin/solution/solution_editor.jsp?jjfaid="+jjfaid;
}
//删除解决方案
function goDel(jjfaid){
	var param = "jjfaid="+jjfaid;
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'system/deleteSolution.shtml',
		data:param,
		success : function(data) {
			if(data.msg=="error_sys"){
				
			}else if(data.msg=="success"){
				getData(0);
			}
		}
	});
}
