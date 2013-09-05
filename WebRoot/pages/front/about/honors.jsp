<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
  	<title>智联信通欢迎您</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	
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
					<li><a  href="<%=basePath%>pages/front/cases/cases.jsp" class="global_Case" ><span>全球案例</span></a></li>
					<li><a  href="<%=basePath%>pages/front/support/support.jsp" class="online_Support" ><span>在线支持</span></a></li>
					<li><a  href="<%=basePath%>pages/front/job/job.jsp" class="recruitment" ><span>人才招聘</span></a></li>
					<li class="active"><a href="<%=basePath%>pages/front/about/company.jsp" class="aboutus" ><span>关于我们</span></a></li>
				</ul>
			</div>
		</div>
    </div>
</div>
<div id="mbody">
	<div class="main">
    	<div class="content-wrapper">
        	<div class="content">
                <ul class="menus">
                	<li class="menu">
                    	<a href="<%=basePath%>pages/front/about/company.jsp">公司简介</a>
                    </li>
					 <li class="menu active">
                    	<a href="<%=basePath%>pages/front/about/honors.jsp">荣誉资质</a>
                    </li>
                     <li class="menu">
                    	<a href="<%=basePath%>pages/front/about/contact.jsp">联系我们</a>
                    </li>
                </ul>
            </div>
            <div class="right about">
            	<div class="feature-pic"></div>
                <div class="page-pos">
                	<a class="blue" href="<%=basePath%>index.jsp">首页</a>>
					<a class="blue" href="<%=basePath%>pages/front/about/company.jsp">关于我们</a>>荣誉资质</div>
                <div id="about-title1" class="title">荣誉资质</div>
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
                        	<a class="print" title="打印该页" onclick="window.print();" href="javascript:void(0);"></a>
							<span id="bdshare" class="bdshare_b"></span>
                        </span>
                    </div>
                    <span style="display:none" class="detail-more">			                    </span>
                   <div class="new_content">
                   	 	<div class="patent_intro">
                            <p><span>&nbsp;</span>电力线载波通信发明专利</p>
                            <p><span>&nbsp;</span>一种电路监控终端实用新型专利证书</p>
                            <p><span>&nbsp;</span>一种无缝数传网关设备实用新型专利证书</p>
                            <p><span>&nbsp;</span>基本GOOGLE地图控制的路灯监控软件</p>
                            <p><span>&nbsp;</span>电力载波终端单元生产自动化测试软件</p>
                            <p><span>&nbsp;</span>路灯电缆防盗监控软件</p>
                            <p><span>&nbsp;</span>基本嵌入式Linux的路灯集中控制器(网关)软件</p>
                            <p><span>&nbsp;</span>远程路灯监控系统软件</p>
                            <p><span>&nbsp;</span>远程路灯监控系统上位机软件</p>
                            <p><span>&nbsp;</span>CE和RoHS证书</p>
                        </div>
                   <div class="patent_item">
                     <ul>
                        <li><img src="<%=basePath%>images/001.gif" width="182" height="254" /></li>
                        <li><img src="<%=basePath%>images/002.gif" width="182" height="254" /></li>
                    </ul>
                 </div> 
                 <div class="patent_img">
                    <ul>
                        <li><img src="<%=basePath%>images/003.gif" width="166" height="231" /></li>
                        <li><img src="<%=basePath%>images/004.gif" width="166" height="231" /></li>
                        <li><img src="<%=basePath%>images/005.gif" width="166" height="231" /></li>
                        <li><img src="<%=basePath%>images/006.gif" width="166" height="231" /></li>
                    </ul>
                </div>
                <div class="patent_img">
                    <ul>
                        <li><img src="<%=basePath%>images/007.gif" width="166" height="231" /></li>
                        <li><img src="<%=basePath%>images/008.gif" width="166" height="231" /></li>
                        <li><img src="<%=basePath%>images/009.gif" width="166" height="231" /></li>
                        <li><img src="<%=basePath%>images/010.gif" width="166" height="231" /></li>
                    </ul>
                </div>
                   <div class="clear"></div> 
                   </div>
                  
					<!--end content-->
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
