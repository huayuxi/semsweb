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
                	<li class="menu active">
                    	<a href="<%=basePath%>pages/front/about/company.jsp">公司简介</a>
                    </li>
					 <li class="menu">
                    	<a href="<%=basePath%>pages/front/about/honors.jsp">荣誉资质</a>
                    </li>
                     <li class="menu">
                    	<a href="<%=basePath%>pages/front/about/contact.jsp">联系我们</a>
                    </li>
                </ul>
            </div>
            <div class="right about">
            	<div class="feature-pic" id="feature_pic"></div>
                <div class="page-pos">
                	<a class="blue" href="<%=basePath%>index.jsp">首页</a>>
					<a class="blue" href="<%=basePath%>pages/front/about/company.jsp">关于我们</a>>公司简介</div>
                <div id="about-title1" class="title">公司简介</div>
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
                   	 <p><span>深圳市智联信通科技有限公司成立于2010年3月，注册资金人民币1500万元，是由在美国的华人科学家投资创立的，一家从事通讯技术、智能控制技术和物联网技术研究和应用开发的高科技企业。公司国内运营总部设在厦门，并在美国丹佛、杭州、深圳设立了研发及销售机构，提供包括SEMS智能照明远程监控系统、电力线载波通讯模块、多媒介无缝数据传输技术（以电力线载波通讯技术，ZIGBEE通讯技术、RFID以及DSP/ARM9等处理器技术为核心，把电力线载波通讯、Wi-Fi、Zigbee、以太网、GPRS/3G，RS485/Modbus/DMX等总线数据传输完美衔接在一起）在内的产品和系统服务。</span></p>
					 <p><span>公司的SEMS智能化城市照明监控系统广泛地应用于城市道路照明控制、隧道照明控制、太阳能照明控制等，能实现远程单灯控制、节能和智慧管理功能，节能效果达到40%以上，日常维护费用节省50%以上，延长灯具寿命25%以上。系统具有自动断电报警、来电提醒功能、具有意外开灯、意外关灯报警功能、缺相报警功能、亮灯率计算、具有经纬度控制、光控、定时控制等回路控制功能、具有内置三相电表提供实时电量、年月日报表等多种功能。能够提供及时有效的数据给客户分析，在节省电量的同时也提供了多种设备维护的信息给客户。投资成本低，投资汇报率高。</span></p>
                      <p><span>目前公司已累积90余项国内外发明专利及10余项软件著作权，并取得了“双软企业”的称号。依托这些核心技术，公司将逐步推出远程智能充电桩管理系统、远程能源监测系统等系统产品，在节能和智能管理领域为行业客户提供价值。</span></p>
                      <p><span>公司先后在广东、辽宁、安徽、江西、浙江、江苏、青海、四川、湖南、湖北、黑龙江等几乎所有省份完成了多个工程项目，获得用户的一致好评，重点工程项目有广深高速单灯控制项目、全运会重点沈阳大四环单灯控制项目、青海西宁市城市亮化智能控制项目、安徽亳州全城单灯控制项目等。公司产品也大量出口到美国、德国、埃及、沙特、土耳其等二十余个国家。</span></p>
                      <p><span>公司先后在广东、辽宁、安徽、江西、浙江、江苏、青海、四川、湖南、湖北、黑龙江等几乎所有省份完成了多个工程项目，获得用户的一致好评，重点工程项目有广深高速单灯控制项目、全运会重点沈阳大四环单灯控制项目、青海西宁市城市亮化智能控制项目、安徽亳州全城单灯控制项目等。公司产品也大量出口到美国、德国、埃及、沙特、土耳其等二十余个国家。</span></p>
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
