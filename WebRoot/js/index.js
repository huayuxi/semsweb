
function getNewsData(){
	var param="pageNo=1&pageSize=4";
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
					var xwbt=n.xwbt00;
					if(xwbt.length>26){
						xwbt=xwbt.substr(0,25)+"..."
					}
					div=div+"<p><a href=\""+
						$("#basePath").val()+"pages/front/news/news_detail.jsp?xwid00="+n.xwid00
						+"\"> <strong class=\"news_dynamic_intro_name\">· " +xwbt+"</strong><strong class=\"news_dynamic_intro_time\">" +dateFormate(n.fbsj00)+
								"</strong></a></p>";
				});
				$("#news_list").html(div);
			}
		}
	});
}

function dateFormate(date){
	if(date!=null){
		return date.substr(0,4)+"-"+date.substr(4,2)+"-"+date.substr(6,2);
	}
	return "";
}

function getCasesData(){
	var param="pageNo=1&pageSize=5";
	$.ajax( {
		type : "POST",
		dataType : "json",
		url : 'front/queryCases.shtml',
		data:param,
		success : function(data) {
			var totalcount = data.totdalRecords;
			var pagesize = data.pageSize;
			var myData = data.list;
			var div ="";
			if(totalcount!=0){
				$.each(myData, function(i, n) {
					var almc=n.almc00;
					if(almc.length>21){
						almc=almc.substr(0,21)+"...";
					}
					div=div+"<a href=\""+
						$("#basePath").val()+"pages/front/cases/cases_detail.jsp?alid00="+n.alid00
						+"\"><p><span></span>" +almc+"</p>";
				});
				$("#cases_list").html(div);
			}
		}
	});
}