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
	var zplx00=getQueryString("zplx00");
	var key="";
	if(zplx00!=null&&zplx00!=""){
		key="&key_zplx00="+zplx00;
	}
	var param="pageNo="+(pageNo+1)+"&pageSize=10"+key;
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'front/queryJob.shtml',
		data:param,
		success : function(data) {
			var totalcount = data.totalRecords;
			var pagesize = data.pageSize;
			var myData = data.list;
			var div ="";
			if(totalcount!=0){
				div= "<div class=\"head\"><div class=\"name\">职位名称</div><div class=\"jobclass\">招聘类型</div>" +
						"<div class=\"city\">工作地点</div><div class=\"date\">发布时间</div></div>";
				$.each(myData, function(i, n) {
						div=div+ "<div class=\"item\"><div class=\"name\"><a class=\"ablue\" href=\"" +
								$("#basePath").val()+"pages/front/job/job_detail.jsp?zpid00="+n.zpid00
								+"\">" +
								n.zpgw00
								+"</a></div><div class=\"jobclass\">" +
								n.zplx00
								+"</div><div class=\"city\">" +
								n.gzdd00
								+"</div><div class=\"date\">" +
								n.fbsj00
								+"</div></div>"
				});
				$("#job_list").html(div);
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
