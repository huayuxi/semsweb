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
</head>

<body>
	<div class="bgsTabTop_cn">
	<div class="bgsTabTopNav_cn">
  	 <div class="lng_left">&nbsp;</div><div class="lng_right"><div class="lng_right_mark"><a href="#">中文&nbsp;|&nbsp;English</a></div></div>
   </div>
</div>
<div id="header">
	<div class="bound">
    	<div id="logo"><a href="#">智联信通</a></div>
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
	<div class="slide-index">
    	<div class="slides">
        	<div class="slide autoMaxWidth">
            	<div id="bi_2" class="image">
            	<a target="_blank" href="#">
                	<img src="images/2.jpg" name="02" style="left:-252px; position:relative;">
                </a>
            </div>
        </div>
        <div class="control">
            <a class="active" href="#"></a>
        </div>
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
            <div class="content">
            	<a href="#" class="image">
            		<img src="images/iotcomm_001news.jpg"  />
                </a>
                <p>· 智联信通盛大亮相2013广州光展<span>......</span></p>
				<p>· 智联信通盛大亮相2013广州光展<span>......</span></p>
                <p>· 智联信通盛大亮相2013广州光展<span>......</span></p>
                <p>· 智联信通盛大亮相2013广州光展<span>......</span></p>
                <p>· 智联信通盛大亮相2013广州光展<span>......</span></p>
            </div>
        </div>
        <div class="video_media">
        	<div class="content">
            	<a href="#">
                	<img src="images/videobg.gif"  />
                </a>
            </div>
        </div>
        <div class="clear"></div>
    </div>
</div>
<div class="demo-mode">
	<div class="bound">
    	<ul>
        	<li><a href="#"><img src="images/tunnelsystem.gif"  /><span>隧道系统演示</span></a></li>
            <li><a href="#"><img src="images/landscapesystems.gif"  /><span>隧道系统演示</span></a></li>
            <li><a href="#"><img src="images/solarsystem.gif"  /><span>隧道系统演示</span></a></li>
            <li><a href="#"><img src="images/streetlightingsystem.gif"  /><span>隧道系统演示</span></a></li>
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
                <p><span></span>广深高速单灯智能控制项目</p>
                <p><span></span>沈阳大四环新建路段照明智能控制项目</p>
                <p><span></span>福建省示范项目云霄县照明节能改造</p>
                <p><span></span>甘肃兰州隧道LED灯智能控制项目</p>
                <p><span></span>青海西宁全城景观亮化智能控制项目</p>
                <div class="case_title">
                	<span style="padding-right:20px;">全球案例</span>
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
</body>
</html>
