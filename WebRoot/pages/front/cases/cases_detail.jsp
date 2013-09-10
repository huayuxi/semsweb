<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<base href="<%=basePath%>"/>
<title>智联信通-市场动态</title>

<meta http-equiv="pragma" content="no-cache"/>
<meta http-equiv="cache-control" content="no-cache"/>
<meta http-equiv="expires" content="0"/>
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
<meta http-equiv="description" content="This is my page"/>
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
					<li><a  href="<%=basePath%>index.jsp" class="index_home"><span>首页</span></a></li>
					<li><a  href="<%=basePath%>pages/front/news/news.jsp" class="market_dynamics" ><span>市场动态</span></a></li>
					<li><a  href="<%=basePath%>pages/front/product/product.jsp" class="productworld" ><span>产品世界</span></a></li>
					<li><a  href="<%=basePath%>pages/front/solution/solution.jsp" class="solution" ><span>解决方案</span></a></li>
					<li class="active"><a  href="<%=basePath%>pages/front/cases/cases.jsp" class="global_Case active" ><span>全球案例</span></a></li>
					<li><a  href="<%=basePath%>pages/front/support/support.jsp" class="online_Support" ><span>在线支持</span></a></li>
					<li><a  href="<%=basePath%>pages/front/job/job.jsp" class="recruitment" ><span>人才招聘</span></a></li>
					<li ><a href="<%=basePath%>pages/front/about/company.jsp" class="aboutus" ><span>关于我们</span></a></li>
				</ul>
			</div>
		</div>
    </div>
</div>
<div id="mbody">
	<div class="main">
    	<div class="content-wrapper">
        	<div class="content">
            	<h2 class="blue">全球案例</h2>
                <ul class="menus">
                	<li class="menu active">
                    	<a href="case.html">全球案例</a>
                    </li>
                </ul>
            </div>
            <div class="right news">
            	<div class="feature-pic"></div>
                <div class="page-pos">
                	<a class="blue" href="index.html">首页</a>>全球案例>全球案例</div>
                	<div id="about-title1" class="title">全球案例</div>
                <div class="line1"></div>
                <div class="detail">
                	<div class="share">
                    	<div class="print-btn">
                        	<a class="blue noprint" onclick="window.print();" href="javascript:void(0);"><span></span>打印</a>
                        </div>
                        <div class="share-btn">
                        	<a class="blue noprint shareto_button" href="javascript:void(0);"><span></span>分享</a>
                        </div>
                        <span class="r noprint">
                        	<a class="print" title="打印该页" onclick="window.print();" href="javascript:void(0);">　　</a>
							<span id="bdshare" class="bdshare_b"></span>
                        </span>
                    </div>
                    <span style="display:none" class="detail-more">			                    </span>
                   <div class="new_content">
                   		<div class="case_item">
                           	<div class="case_item_left">
                                <img width="219" height="162" src="../images/case_001.gif">
                                </div>
                                <div class="case_item_right">
                                <p>
                                <strong>
                                <a href="case10.html">重点案例之广深高速单灯智能控制项目</a>
                                </strong>
                                </p>
                                <p>
                                <strong>项目背景：</strong>
                                </p>
                                <p>广深高速全长122.8公里，全封闭、全立交，全线设有路灯照明。</p>
                                <p>作为国内较为先进的高速公路，经历了三代照明控制系统的变更，</p>
                                <p>目前采用的是由我司提供的第四代单灯智能控制系统方案，是目前</p>
                                <p>全世界具备最先进照明监控科技的高速公路项目。</p>
                                <p>
                                <strong>项目规模：</strong>
                                </p>
                                <p>全程7000多盏路灯，均采用智联信通单灯控制器及集中控制器。</p>
                                <p>
                                <strong>项目成效：</strong>
                                </p>
                                <p>该项目为高速公路照明节能改造项目，采用了由智联信通提供的</p>
                                <p>单灯控制系统方案后，达到了如下成效——</p>
                                <p>1、 节能环保。实现按需照明，节省30%的照明用电，创造城市</p>
                                <p>2、 便捷维护。单灯故障报警，免人工巡线，节省维护成本，提高</p>
                                <p>运维效率。</p>
                                <p>3、 安全防护。线路破损或设施被盗即时报警，防止出现财产损失</p>
                                <p>4、智慧管理。采用监控中心、平板电脑及手机即可随时随地对每盏 </p>
                                <p>灯进行监控管理；</p>
                                <p></p>
                                <p></p>
                            </div> 
                        </div>	 
                   <div class="clear"></div> 
                   </div>
                <!--end detail-->
            </div>
			<!--end right_news-->
            <div class="clear"></div>
        </div>
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
