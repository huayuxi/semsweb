$(function() {
	getData(0);
});


//分页显示
function getData(pageNo){
	var param="pageNo="+(pageNo+1)+"&pageSize=10";
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'system/querySysUser.shtml',
		data:param,
		success : function(data) {
			var totalcount = data.totalRecords;
			var pagesize = data.pageSize;
			var myData = data.list;
			var div ="";
			if(totalcount!=0){
				div= "<thead><tr><th class=\"g-tl\" width=\"40%\">" +
				"<input class=\"g-checkbox\" id=\"j-ad-all\" type=\"checkbox\">用户帐号</th>" +
				"<th width=\"10%\">用户姓名</th><th width=\"10%\">用户性别</th>" +
				"<th width=\"20%\">用户邮箱</th><th width=\"10%\">创建时间</th>" +
				"<th width=\"10%\">相关操作</th></tr></thead><tbody>";
				$.each(myData, function(i, n) {
						div=div+"<tr class=\"g-app-row\"><td><label class=\"g-ad-title\">" +
								"<input class=\"g-checkbox\" type=\"checkbox\"><a href=\"news_detail.html\">" +
								"<img class=\"g-appimg\" src=\"bootstrap/img/new.gif\">"+
								n.dlzh00
								+"</a></label></td><td>"+
								n.yhxm00
								+"</td><td>" +
								n.yhxb00
								+"</td><td><span class=\"g-col-org\">" +
								n.yhyx00
								+"</span></td><td><span class=\"g-col-grn\">" +
								n.cjsj00
								+"</span></td><td><a href=\"javascript:goUpdate('" +n.dlzh00+"')\">编辑</a>&nbsp;|&nbsp;" +
								"<a href=\"javascript:goDel(" +n.yhid00+");\">删除</a></td></tr>";
				});
				div=div+"</tbody>";
				$("#user_lists").html(div);
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
				$("#user_lists").html("<span style=\"color:red\">很遗憾未找到相关记录！</span>");
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

function goUpdate(dlzh00){
	var basePath=$("#basePath").val();
	window.location.href=basePath+"system/goUpdateSysUser.shtml?dlzh00="+dlzh00;
}

function goDel(yhid00){
	var param = "yhid00="+yhid00;
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'system/delSysUser.shtml',
		data:param,
		success : function(data) {
			if(data.msg=="error_sys"){
				
			}else if(data.msg=="success"){
				getData(0);
			}
		}
	});
}