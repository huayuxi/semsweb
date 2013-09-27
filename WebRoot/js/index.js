
function getNewsData(){
	var param="pageNo=1&pageSize=6";
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
					if(xwbt.length>17){
						xwbt=xwbt.substr(0,17)+"..."
					}
					div=div+"<a href=\""+
						$("#basePath").val()+"pages/front/news/news_detail.jsp?xwid00="+n.xwid00
						+"\"><p>· " +xwbt+"</p></a>";
				});
				$("#news_list").html(div);
			}
		}
	});
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