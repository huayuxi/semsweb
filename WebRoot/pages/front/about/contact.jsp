<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=7c655807ef2f037964c79296dcee7ed6"></script>
	<!--[if lte IE 6]>
	<script src="<%=basePath%>js/common/DD_belatedPNG_0.0.8a.js" type="text/javascript"></script>
	    <script type="text/javascript">
	        DD_belatedPNG.fix('div, ul, img, li, input , a,span');
	    </script>
	<![endif]--> 
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
					 <li class="menu">
                    	<a href="<%=basePath%>pages/front/about/honors.jsp">荣誉资质</a>
                    </li>
                     <li class="menu active">
                    	<a href="<%=basePath%>pages/front/about/contact.jsp">联系我们</a>
                    </li>
                </ul>
            </div>
            <div class="right about">
            	<div class="feature-pic"></div>
                <div class="page-pos">
                	<a class="blue" href="<%=basePath%>index.jsp">首页</a>>
					<a class="blue" href="<%=basePath%>pages/front/about/company.jsp">关于我们</a>>联系我们</div>
                <div id="about-title1" class="title">联系我们</div>
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
                    <span style="display:none" class="detail-more"></span>
                   <div class="new_content">
                   	 <p><span> 深圳市智联信通科技有限公司(总部)</span></p>
					 <p><span> 地址：深圳市南山区高新区南区南环路29号留创大厦1002#</span></p>
					 <p><span> 电话：0755-86329565</span></p>
					 <p><span> 传真：0755-86329569</span></p>
					 <p><span> 邮箱：sales@iotcomm.com</span></p>
					 <div class="mapObj" id="sz_map"></div>
					 <p><span> 厦门市智联信通物联网科技有限公司(分公司)</span></p>
					 <p><span> 地址：厦门市思明区火炬高新区软件园曾厝垵北路1号北楼3楼</span></p>
					 <p><span> 电话：0592-2517558</span></p>
					 <p><span> 传真：0592-2520926</span></p>
					 <p><span> 邮箱：sales@iotcomm.com</span></p>
                     <p><span> 美国地址: 1613 Cannon Mountain Dr,Longmont,Colorado 80503,U.S.A</span></p>
					 <p><span> 电话:(+001)720-684-7564</span></p>
					 <div class="mapObj" id="xm_map"></div>
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
        <p>copyrights©2010-2013 Iotcomm.com.cn <a href="http://www.miitbeian.gov.cn">粤ICP备10052649号-1</a></p>
        <p>4008-090-880</p>
    </div>
</div>
<script type="text/javascript">
	var map_sz = new BMap.Map("sz_map");          // 创建地图实例
	var point_sz = new BMap.Point(113.953791,22.536679);  // 创建点坐标
	map_sz.centerAndZoom(point_sz,20);  					// 初始化地图，设置中心点坐标和地图级别
	var marker_sz = new BMap.Marker(point_sz);  // 创建标注
	map_sz.addOverlay(marker_sz);              // 将标注添加到地图中
	var infoWindow_sz = new BMap.InfoWindow("<p style='font-size:14px;'>深圳市智联信通科技有限公司(总部)</p><p style='font-size:12px;'>地址：深圳市南山区高新区南区南环路29号留创大厦1002#</p>");
	marker_sz.addEventListener("click", function(){this.openInfoWindow(infoWindow_sz);});	

	var map = new BMap.Map("xm_map");          // 创建地图实例
	var point = new BMap.Point(118.122988,24.437762);  // 创建点坐标
	map.centerAndZoom(point,20);  					// 初始化地图，设置中心点坐标和地图级别
	var marker = new BMap.Marker(point);  // 创建标注
	map.addOverlay(marker);              // 将标注添加到地图中
	var infoWindow = new BMap.InfoWindow("<p style='font-size:14px;'>厦门市智联信通物联网科技有限公司(分公司)</p><p style='font-size:12px;'>地址：厦门市思明区火炬高新区软件园曾厝垵北路1号北楼3楼</p>");
	marker.addEventListener("click", function(){this.openInfoWindow(infoWindow);});	               
</script>
</body>
</html>
