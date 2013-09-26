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
<script type="text/javascript">
jQuery(function($){
	$('.chat_f1_expr').animate({height:'186px'}, 1000 );
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
	//$('#ad img').attr("width",$(document).width());
	$('#ad').slideBox({
		easing : 'linear',//swing,linear//滚动特效
		delay : 5,//滚动延迟时间，单位：秒
		hideBottomBar : true//隐藏底栏
	});
	getNewsData();
	getCasesData()
});
</script>
</head>

<body>
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
				<ul>
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
    		<li><a href="javascript:void(0)" title="智慧照明监控领导者"><img src="images/1.jpg" style="left: -252px;position: relative;"></a></li>
    		<li><a href="javascript:void(0)" title="智慧照明监控领导者"><img src="images/2.jpg" style="left: -252px;position: relative;"></a></li>
    		<li><a href="javascript:void(0)" title="智慧照明监控领导者"><img src="images/3.jpg" style="left: -252px;position: relative;"></a></li>
    		<li><a href="javascript:void(0)" title="智慧照明监控领导者"><img src="images/4.jpg" style="left: -252px;position: relative;"></a></li>
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
    	<div class="latest-news">
        	<div class="title">
            	<h3>头条新闻<span><a href="<%=basePath%>pages/front/news/news.jsp">&gt;&nbsp;more</a></span></h3>
            </div>
            <div class="content" >
            	<a href="javascript:void(0)" class="image">
            		<img src="images/iotcomm_001news.jpg"  />
                </a>
                <span id="news_list"></span>
            </div>
        </div>
        <div class="video_media">
        	<div class="content">
        	<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="682" height="300"> 
				<param name="movie" value="http://static.youku.com/qplayer.swf?playMode=mp4&amp;winType=index&amp;VideoIDS=XNjA1NzcxMzQw" /> 
				<!--[if !IE]>--> 
				<object type="application/x-shockwave-flash" 
				data="http://static.youku.com/qplayer.swf?playMode=mp4&amp;winType=index&amp;VideoIDS=XNjA1NzcxMzQw" 
				width="682" height="300"> 
				<!--<![endif]--> 
				<p>Alternative content</p> 
				<!--[if !IE]>--> 
				</object> 
				<!--<![endif]--> 
			</object> 
          </div>
        </div>
        <div class="clear"></div>
    </div>
</div>
<div class="demo-mode">
	<div class="bound">
    	<ul>
        	<li><a href="javascript:void(0)"><img src="images/tunnelsystem.gif"  /><span>隧道系统演示</span></a></li>
            <li><a href="javascript:void(0)"><img src="images/landscapesystems.gif"  /><span>隧道系统演示</span></a></li>
            <li><a href="javascript:void(0)"><img src="images/solarsystem.gif"  /><span>隧道系统演示</span></a></li>
            <li><a href="javascript:void(0)"><img src="images/streetlightingsystem.gif"  /><span>隧道系统演示</span></a></li>
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
                	<a href=<%=basePath%>pages/front/cases/cases.jsp"><span style="padding-right:20px;">全球案例</span></a>
                </div>
            </div>
        </div>
        <div class="right_bg"></div>	
    </div>
</div>
<div class="seo-footer">
	<div class="bound">
    	<p>地址：深圳市南山区高新区南区南环29号留创大厦10</p>
        <p>copyrights©2010-2013 Iotcomm.com.cn 闽ICP备10052649号</p>
        <p>4008-090-880</p>
    </div>
</div>
<!--代码开始-->
<div id="chat_f1">
	<div id="chat_f1_main">
		<div id="close"></div>
       	<a title="点击咨询在线客服" href="http://wpa.qq.com/msgrd?v=3&uin=1625574787&site=qq&menu=yes" class="a_kf"></a>
		<a title="点击咨询售后" href="http://wpa.qq.com/msgrd?v=3&uin=1625574787&site=qq&menu=yes" class="a_sh"></a> 
	</div>
	<div class="chat_f1_expr">
		<div class="list">
			<div class="name">
            	<span class="arrow">&bull;</span><a title="华南片区"><SCRIPT>document.write("<a target=blank href=http://wpa.qq.com/msgrd?v=3&uin=1625574787&site=qq&menu=yes>");</SCRIPT>华南片区</a>
			</div>
			
		</div>
		<div class="list">
			<div class="name">
            	<span class="arrow">&bull;</span><a title="华东片区"><SCRIPT>document.write("<a target=blank href=http://wpa.qq.com/msgrd?v=3&uin=459481521&site=qq&menu=yes>");</SCRIPT>华东片区</a>

			</div>
		</div>
		<div class="list">
			<div class="name">
            	<span class="arrow">&bull;</span><a title="华北/东北区"><SCRIPT>document.write("<a target=blank href=http://wpa.qq.com/msgrd?v=3&uin=177492&site=qq&menu=yes>");</SCRIPT>华北/东北区</a>
			</div>
		</div>
		<div class="list">
			<div class="name">
            	<span class="arrow">&bull;</span><a title="西南片区"><SCRIPT>document.write("<a target=blank href=http://wpa.qq.com/msgrd?v=3&uin=3324443&site=qq&menu=yes>");</SCRIPT>西南片区</a>
			</div>
		</div>
		<div class="list">
			<div class="name">
            	<span class="arrow">&bull;</span><a title="西北片区"><SCRIPT>document.write("<a target=blank href=http://wpa.qq.com/msgrd?v=3&uin=85152351&site=qq&menu=yes>");</SCRIPT>西北片区</a>
			</div>
		</div>
		<div class="list">
			<div class="name">
            	<span class="arrow">&bull;</span><a title="闽/赣/徽片区"><SCRIPT>document.write("<a target=blank href=http://wpa.qq.com/msgrd?v=3&uin=343431094&site=qq&menu=yes>");</SCRIPT>闽/赣/徽片区</a>
				
			</div>
		</div>
        <div class="list">
			<div class="name">
            	<span class="arrow">&bull;</span><a title="海外片区区"><SCRIPT>document.write("<a target=blank href=http://wpa.qq.com/msgrd?v=3&uin=1692858376&site=qq&menu=yes>");</SCRIPT>海外片区</a>
         
			</div>
		</div>
	</div>
	<div id="chat_f1_bottom"></div>
</div>
<div id="chat_f2" style="display:none;">我要咨询</div>
<!--代码结束-->
</body>
</html>
