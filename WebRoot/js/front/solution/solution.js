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
	var param="pageNo="+(pageNo+1)+"&pageSize=10";
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'front/querySolution.shtml',
		data:param,
		success : function(data) {
			var totalcount = data.totalRecords;
			var pagesize = data.pageSize;
			var myData = data.list;
			var div ="";
			if(totalcount!=0){
				var jjfaid=getQueryString("jjfaid");
				$.each(myData, function(i, n) {
					if(i==0&&jjfaid==null){
						initData(n.jjfaid);
						div=div+"<li class=\"menu active\"><a href=\"" +
						 $("#basePath").val()+"pages/front/solution/solution.jsp?jjfaid="+n.jjfaid
					    +"\">"+n.famc00+"</a></li>";
					}else{
						if(jjfaid==n.jjfaid&&jjfaid!=""){
							initData(n.jjfaid);
							div=div+"<li class=\"menu active\"><a href=\"" +
								 $("#basePath").val()+"pages/front/solution/solution.jsp?jjfaid="+n.jjfaid
							    +"\">"+n.famc00+"</a></li>";
						}else{
							div=div+"<li class=\"menu\"><a href=\"" +
								$("#basePath").val()+"pages/front/solution/solution.jsp?jjfaid="+n.jjfaid
							+"\">"+n.famc00+"</a></li>";
						}		
					}
					
				});
				$("#solution_list").html(div);
			}
		}
	});
}

//初始化数据
function initData(jjfaid){
	var param="jjfaid="+jjfaid
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'front/querySolutionDetail.shtml',
		data:param,
		success : function(data) {
			var obj=data.solution;
			$("#solution_data").html(obj.fanr00);
			$("#about-title1").html(obj.famc00);
			$("#about_logo_title").html(obj.famc00);
		}
	});	
}
