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
<script src="<%=basePath%>js/common/jquery-1.8.3.js" type="text/javascript"></script>
<script src="<%=basePath%>js/front/cases/cases_detail.js" type="text/javascript"></script>
<!--[if lte IE 6]>
<script src="<%=basePath%>js/common/DD_belatedPNG_0.0.8a.js" type="text/javascript"></script>
    <script type="text/javascript">
        DD_belatedPNG.fix('div, ul, img, li, input , a,span');
    </script>
<![endif]--> 
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
                <ul class="menus">
                	<li class="menu active">
                    	<a href="<%=basePath%>pages/front/cases/cases.jsp?allx00=100000">国内案例</a>
                    </li>
                    <li class="menu">
                    	<a href="<%=basePath%>pages/front/cases/cases.jsp?allx00=100001">海外案例</a>
                    </li>
                </ul>
            </div>
            <div class="right news">
            	<div class="feature-pic"></div>
                <div class="page-pos">
                	<a class="blue" href="index.html">首页</a>>
                	<a class="blue" href="<%=basePath%>pages/front/cases/cases.jsp">全球案例</a>>
                	<span id="about-title">国内案例</span>
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
                        	<a class="print" title="打印该页" onclick="window.print();" href="javascript:void(0);"></a>
							<span id="bdshare" class="bdshare_b"></span>
                        </span>
                    </div>
                    <span style="display:none" class="detail-more"></span>
                   <div class="new_content">
                   		<div class="case_item">
                           	<div class="case_item_left">
                                <img width="219" height="162" id="j-images">
                                </div>
                                <div class="case_item_right">
                                <p>
                                <strong>
                                <a href="javascript:viod(0)" id="j-ui-name"></a>
                                </strong>
                                </p>
                                <p>
                                <strong>项目背景：</strong>
                                </p>
                                <p id="j-ui-bj"></p>
                                <p>
                                <strong>项目规模：</strong>
                                </p>
                                <p id="j-ui-gm"></p>
                                <p>
                                <strong>项目成效：</strong>
                                </p>
                                <p id="j-ui-cx"></p>
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
        <p>copyrights©2010-2013 Iotcomm.com.cn <a href="http://www.miitbeian.gov.cn">粤ICP备10052649号-1</a></p>
        <p>4008-090-880</p>
    </div>
</div>
</body>
</html>
