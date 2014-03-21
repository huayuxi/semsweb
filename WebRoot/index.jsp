<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<base href="<%=basePath%>">
<title>智联信通欢迎您</title>
<link href="<%=basePath%>css/layout.css" rel="stylesheet" />
<link href="<%=basePath%>css/index.css" rel="stylesheet" />
<link href="<%=basePath%>js/common/jquery.slideBox/css/jquery.slideBox.css" rel="stylesheet" type="text/css" />
<script src="<%=basePath%>js/common/jquery-1.8.3.js" type="text/javascript"></script>
<script src="<%=basePath%>js/common/jquery.slideBox/js/jquery.slideBox.js" type="text/javascript"></script>
<script src="<%=basePath%>js/index.js" type="text/javascript"></script>
<!--[if lte IE 6]>
<script src="<%=basePath%>js/common/DD_belatedPNG_0.0.8a.js" type="text/javascript"></script>
    <script type="text/javascript">
        DD_belatedPNG.fix('div, ul, img, li, input , a,span');
    </script>
<![endif]--> 
<script type='text/javascript' src='http://tb.53kf.com/kf.php?arg=10057644&style=1'></script>
<script type="text/javascript">
jQuery(function($){
	$('.chat_f1_expr').animate({height:'211px'}, 1000 );
	$('#close').click(function(){
		$('#chat_f1').hide();
		$('#chat_f2').show();
	})
	$('#chat_f2').click(function(){
		$(this).hide();
		$('#chat_f1').show();
	})
	$('.name').hover(function(){
		$(this).children('.detail').show();
		$(this).children('.arrow').css('color','#a00');
		},function(){
		$(this).children('.detail').hide();	
		$(this).children('.arrow').css('color','#fff');
	})
	var ga_w=document.body.clientWidth;
	$('#ad').slideBox({
		hideBottomBar:false,//隐藏底栏
		width : ga_w,
		height :396
	});
	getNewsData();
	getCasesData()
});
</script>
</head>

<body>
   <input type="hidden" value="<%=basePath%>" id="basePath"/>
	<div class="bgsTabTop_cn">
	<div class="bgsTabTopNav_cn">
  	 <div class="lng_left">&nbsp;</div><div class="lng_right"><div class="lng_right_mark"><a href="#">中文&nbsp;|&nbsp;English</a></div></div>
   </div>
</div>
<div id="header">
	<div class="bound">
    	<div id="logo"><a href="<%=basePath%>">智联信通</a></div>
		<div id="menu">
			<div class="nav">
				<ul style="position:relative;">
					<li class="active"><a  href="<%=basePath%>index.jsp" class="index_home"><span>首页</span></a></li>
					<li><a  href="<%=basePath%>pages/front/news/news.jsp" class="market_dynamics" ><span>市场动态</span></a></li>
					<li><a  href="<%=basePath%>pages/front/product/product.jsp" class="productworld" ><span>产品世界</span></a></li>
					<li><a  href="<%=basePath%>pages/front/solution/solution.jsp" class="solution" ><span>解决方案</span></a></li>
					<li><a  href="<%=basePath%>pages/front/cases/cases.jsp" class="global_Case" ><span>全球案例</span></a></li>
					<li><a  href="<%=basePath%>pages/front/support/support.jsp" class="online_Support" ><span>在线支持</span></a></li>
					<li><a  href="<%=basePath%>pages/front/job/job.jsp" class="recruitment" ><span>人才招聘</span></a></li>
					<li ><a href="<%=basePath%>pages/front/about/company.jsp" class="aboutus" ><span>关于我们</span></a></li>
				</ul>
			</div>
		</div>
    </div>
</div>
<div class="pcList">
	<div class="slideBox" id="ad">
    	<ul class="items">
    		<li><a href="<%=basePath%>pages/front/solution/solution.jsp" ><img src="images/1.jpg" style=""></a></li>
    		<li><a href="<%=basePath%>pages/front/product/product.jsp" ><img src="images/2.jpg" style=""></a></li>
    		<li><a href="<%=basePath%>pages/front/product/product_list.jsp?&key_cplm00=100001" ><img src="images/3.jpg" style=""></a></li>
    		<li><a href="<%=basePath%>pages/front/product/product_detail.jsp?cpid00=16"><img src="images/4.jpg" style=""></a></li>
  		</ul>
    </div>	
</div>
<div class="latest-slogin-index">
	<div class="bound">
    	<div class="slogin-index">
        	<h2>智慧照明监控领导者</h2>
        </div>
    </div>
</div>
<div class="latest-news-index">
<div class="bound">
        <div class="video_media">
        	<div class="video_common">
        	<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="469" height="276"> 
				<param name="movie" value="http://static.youku.com/qplayer.swf?playMode=mp4&amp;winType=index&amp;VideoIDS=XNjA1NzcxMzQw" /> 
				<!--[if !IE]>--> 
				<object type="application/x-shockwave-flash" 
				data="http://static.youku.com/qplayer.swf?playMode=mp4&amp;winType=index&amp;VideoIDS=XNjA1NzcxMzQw" 
				width="469" height="276"> 
				<!--<![endif]--> 
				<p>Alternative content</p> 
				<!--[if !IE]>--> 
				</object> 
				<!--<![endif]--> 
			</object> 
			</div>
        </div>
      <div class="latest-news">
        	<div class="title">
            	<div class="news_title">公司新闻</div>
                <div class="more"><a href="<%=basePath%>pages/front/news/news.jsp">&gt;more</a></div>
            </div>
            <hr  class="news_line"/>
			<div class="content">
            	<div class="new_images">
                 	<img src="images/iotcomm_001news.jpg"  /> 	
                </div>
                <div class="clear"></div>
                <div class="news_content" id="news_list">
                </div>
            </div>
        </div>
        <div class="clear"></div>
    </div>
</div>
<div class="demo-mode">
	<div class="bound">
    	<ul>
        	<li><a href="<%=basePath%>pages/front/product/product_detail.jsp?cpid00=22"><img src="images/tunnelsystem.gif"  /><span>隧道灯智慧无级调光系统</span></a></li>
            <li><a href="<%=basePath%>pages/front/product/product_detail.jsp?cpid00=23"><img src="images/landscapesystems.gif"  /><span>城市道路照明智能监控系统</span></a></li>
            <li><a href="<%=basePath%>pages/front/product/product_detail.jsp?cpid00=24"><img src="images/solarsystem.gif"  /><span>太阳能照明智能监控系统</span></a></li>
            <li><a href="<%=basePath%>pages/front/product/product_detail.jsp?cpid00=23"><img src="images/streetlightingsystem.gif"  /><span>景观亮化照明智能监控系统</span></a></li>
        </ul>
    </div>
</div>
<div class="global_case_index">
	<div class="bound">
    	<div class="left_bg"></div>
        <div class="middle_bg">
        	<div class="case_image">
            	<img src="images/case_image.jpg" />
            </div>
            <div class="case_content">
          		<h3>全球案例</h3> 
          		<span id="cases_list"></span>
                <div class="case_title">
                	<a href="<%=basePath%>pages/front/cases/cases.jsp"><span style="padding-right:20px;">全球案例</span></a>
                </div>
            </div>
        </div>
        <div class="right_bg"></div>	
    </div>
</div>
<div class="seo-footer">
	<div class="bound">
    	<p>地址：深圳市南山区高新区南区南环29号留创大厦10</p>
        <p>copyrights©2010-2013 Iotcomm.com.cn <a href="http://www.miitbeian.gov.cn">粤ICP备10052649号-1</a></p>
        <p>4008-090-880</p>
    </div>
</div>
</body>
</html>
