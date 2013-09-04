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
					<li><a  href="<%=basePath%>pages/front/jobs/jobs.jsp" class="recruitment" ><span>人才招聘</span></a></li>
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
                <ul class="menus">
                	<li class="menu active">
                    	<a href="case.html">国内案例</a>
                    </li>
                    <li class="menu">
                    	<a href="case.html">海外案例</a>
                    </li>
                </ul>
            </div>
            <div class="right product">
            	<div class="feature-pic"></div>
                <div class="page-pos">
                	<a class="blue" href="index.html">首页</a>>
					<a class="blue" href="news.html">全球案例</a>>
                    <span id="about-title">国外案例</span>
                </div>
                <div id="about-title1" class="title">国内案例</div>
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
                            <img width="219" height="162" src="images/case_001.gif">
                            </div>
                            <div class="case_item_right">
                            <p>
                            <strong>
                            <a href="case/case_detail.html">重点案例之甘肃兰州隧道LED灯智能控制项目</a>
                            </strong>
                            </p>
                            <p>
                            <strong>项目背景：</strong>
                            </p>
                            <p>采古隧道等五条隧道建设项目隶属于甘肃省重点项目-宕迭项目。</p>
                            <p>甘肃省政府意将把宕迭项目的交通道路修成一条真正意义上资源节</p>
                            <p>约型、环境友好型的生态环保路。</p>
                            </div>
                      </div>
                      <div class="case_item">
                            <div class="case_item_left">
                            <img width="219" height="162" src="images/case_002.gif">
                            </div>
                            <div class="case_item_right">
                            <p>
                            <strong>
                            <a href="#">重点案例之青海西宁全城景观亮化智能控制项目</a>
                            </strong>
                            </p>
                            <p>
                            <strong>项目背景：</strong>
                            </p>
                           <p>青海西宁已建成的景观亮化项目有效提升了城市美观形象度，但同时</p>
<p>在运行中，由于缺乏智能化的管理系统，出现了不能集中管理、能源</p>
<p>浪费、光污染等现象。</p>
                          </div>
                      </div>
                      <div class="case_item">
                            <div class="case_item_left">
                            <img width="219" height="162" src="images/case_003.gif">
                            </div>
                            <div class="case_item_right">
                            <p>
                            <strong>
                            <a href="#">土耳其伊斯坦布尔单灯控制项目，2000盏钠灯，4000盏LED</a>
                            </strong>
                            </p>
                            <p>
                            <strong>项目背景：</strong>
                            </p>
                            <p>福建省城市道路照明节能改造示范工程，采用LED路灯配合最</p>
<p>新一代单灯智能控制系统，以合同能源管理模式，不仅实现政府零</p>
<p>投入，还实现了节能盈利。</p>
<p></p>
                            </div>
                      </div>	 
                   <div class="clear"></div> 
                   </div>
                <!--end detail-->
                 <div class="pager">
                    	<span class="active">1</span>
                            <a class="ablue num" href="#">2</a>
                            <a class="ablue num" href="#">3</a>
                            <a class="ablue" href="#">..</a>
                            <a class="ablue" href="#">下一页</a>
                  </div>
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
