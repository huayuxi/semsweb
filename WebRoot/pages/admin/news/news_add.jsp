<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<title>新闻发布</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<script type="text/javascript">
	window.UEDITOR_HOME_URL = "<%=basePath%>js/common/ueditor-1.2.6.1/";
	window.BASE_PATH = "<%=basePath%>";
</script>

<script type="text/javascript" src="js/common/ueditor-1.2.6.1/ueditor.config.js"></script>
<script type="text/javascript" src="js/common/ueditor-1.2.6.1/ueditor.all.js"></script>
</head>

<body>
	<form action="addNews.shtml" method="post">
		新闻标题：<input name="news.xwbt00" type="text" />
		<p></p>
		新闻类型：<input name="news.xwlx00" type="text" />
		<p></p>
		栏目类型：<input name="news.lmlx00" type="text" />
		<p></p>
		排序权值：<input name="news.pxqz00" type="text" />
		<p></p>
		新闻内容：
		<textarea rows="5" cols="20" id="myEditor" name="newsContent.xwnr00"></textarea>
		<script type="text/javascript">
		    UE.getEditor('myEditor',{
		        //focus时自动清空初始化时的内容
		        autoClearinitialContent:true,
		        //关闭字数统计
		        wordCount:false,
		        //关闭elementPath
		        elementPathEnabled:false,
		        //默认的编辑区域高度
		        initialFrameHeight:300
		        //更多其他参数，请参考ueditor.config.js中的配置项
		    })
		</script>
		<input type="submit" value="发布新闻"/>
	</form>
</body>
</html>
