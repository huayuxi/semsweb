<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">

<title>智联信通-市场动态</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="css/layout.css" rel="stylesheet" />
</head>

<body>
	<div class="bgsTabTop_cn">
		<div class="bgsTabTopNav_cn">
			<div class="lng_left">&nbsp;</div>
			<div class="lng_right">
				<div class="lng_right_mark">
					<a href="#">中文&nbsp;|&nbsp;English</a>
				</div>
			</div>
		</div>
	</div>
	<div id="header">
		<div class="bound">
			<div id="logo">
				<a href="#">智联信通</a>
			</div>
			<div id="menu">
				<div class="nav">
					<ul>
						<li><a class="index_home" href="index.html"><span>首页</span></a></li>
						<li><a class="market_dynamics" href="news.html"><span>市场动态</span></a></li>
						<li><a class="productworld" href="#"><span>产品世界</span></a></li>
						<li><a class="solution" href="#"><span>解决方案</span></a></li>
						<li><a class="global_Case" href="#"><span>全球案例</span></a></li>
						<li><a class="online_Support" href="#"><span>在线支持</span></a></li>
						<li><a class="recruitment" href="#"><span>人才招聘</span></a></li>
						<li><a class="aboutus" href="#"><span>关于我们</span></a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div id="mbody">
		<div class="main">
			<div class="content-wrapper">
				<div class="content">
					<h2 class="blue">市场动态</h2>
					<ul class="menus">
						<li class="menu active"><a href="news.html">公司新闻</a></li>
						<li class="menu"><a href="#">行业新闻</a></li>
					</ul>
				</div>
				<div class="right news">
					<div class="feature-pic"></div>
					<div class="page-pos">
						<a class="blue" href="index.html">首页</a>> <a class="blue"
							href="news.html">市场动态</a>> <span id="about-title">公司新闻</span>
					</div>
					<div id="about-title1" class="title">物联网协会受厦门市经济发展局委托到我司调研</div>
					<div class="line1"></div>
					<div class="detail">
						<div class="share">
							<div class="print-btn">
								<a class="blue noprint" onclick="window.print();"
									href="javascript:void(0);"><span></span>打印</a>
							</div>
							<div class="share-btn">
								<a class="blue noprint shareto_button"
									href="javascript:void(0);"><span></span>分享</a>
							</div>
							<span class="r noprint"> <a class="print" title="打印该页"
								onclick="window.print();" href="javascript:void(0);"> </a> <span
								id="bdshare" class="bdshare_b"></span>
							</span>
						</div>
						<span style="display:none" class="detail-more"> </span>
						<div class="new_content">
							<p>
								<span>7月9日，物联网行业协会秘书长、集美大学信息工程学院院长等一行3人受厦门市经济发展局委托，来我司展开物联网产业技术现状调研。7月9日，物联网行业协会秘书长、集美大学信息工程学院院长等一行3人受厦门市经济发展局委托，来我司展开物联网产业技术现状调研。</span>
							</p>
							<p>
								<span>7月9日，物联网行业协会秘书长、集美大学信息工程学院院长等一行3人受厦门市经济发展局委托，来我司展开物联网产业技术现状调研。</span>
							</p>
						</div>
						<!--end content-->
						<div class="pager">
							<span class="active">1</span> <a class="ablue num" href="#">2</a>
							<a class="ablue num" href="#">3</a> <a class="ablue" href="#">..</a>
							<a class="ablue" href="#">下一页</a>
						</div>
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
