
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
					if(xwbt.length>16){
						xwbt.substr(0,15)+"..."
					}
					div=div+"<p>· " +xwbt+"</p>";
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
						div=div+"<p><span></span>" +n.almc00+"</p>";
				});
				$("#cases_list").html(div);
			}
		}
	});
}