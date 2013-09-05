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
					<li class="active"><a  href="<%=basePath%>pages/front/solution/solution.jsp" class="solution" ><span>解决方案</span></a></li>
					<li><a  href="<%=basePath%>pages/front/cases/cases.jsp" class="global_Case" ><span>全球案例</span></a></li>
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
                <ul class="menus solution_ul">
                	<li class="menu active">
                    	<a href="case.html">行业能耗动态监测</a>
                    </li>
                    <li class="menu">
                    	<a href="case.html">LED远程智能监控</a>
                    </li>
                    <li class="menu">
                    	<a href="case.html">回路控制方案</a>
                    </li>
                    <li class="menu">
                    	<a href="case.html">太阳能LED路灯监控</a>
                    </li>
                    <li class="menu">
                    	<a href="case.html">水泵房远程管理监控</a>
                    </li>
                </ul>
            </div>
            <div class="right product">
            	<div class="feature-pic"></div>
                <div class="page-pos">
                	<a class="blue" href="index.html">首页</a>>解决方案>行业能耗动态监测解决方案</div>
                <div id="about-title1" class="title">行业能耗动态监测解决方案</div>
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
                            <img width="219" height="162" src="images/solutions_001.gif">
                            </div>
                            <div class="case_item_right">
                            <p>
                            <strong class="solutions">SEMS智能照明监控系统与LED等高效照明产品对接,将是解决</strong>
                            </p>
                            <p>
                            <strong class="solutions">照明节能的最优方案</strong>
                            </p>
                            <br>
                            <p>系统更侧重于远程组网开闭控制、自动或人工干预远程多级调光、灵活组</p>
                            <p>合亮灯、远程监控与维护。</p>
                            </div>
                          </div>
                          <div class="case_item">
                            <div class="case_item_left">
                            <img width="219" height="162" src="images/solutions_002.gif">
                            </div>
                            <div class="case_item_right">
                            <p>
                            <strong class="solutions">SEMS智能照明监控系统基于电力线载波通信技术,更利于在隧道</strong>
                            </p>
                            <p>
                            <strong class="solutions">等特殊环境下进行照明控制</strong>
                            </p>
                            <br>
                            <p>系统更侧重于黑灯检测以保证亮灯率,通过传感器技术判断车流状况以确定亮灯</p>
                            <p>比例或调光控制。</p>
                            </div>
                          </div>
                          <div class="case_item">
                            <div class="case_item_left">
                            <img width="219" height="162" src="images/solutions_003.gif">
                            </div>
                            <div class="case_item_right">
                            <p>
                            <strong class="solutions">SEMS智能照明监控系统对于码头、货场等使用大功率照明的场</strong>
                            </p>
                            <p>
                            <strong class="solutions">所更能提供最佳的指向性照明要求</strong>
                            </p>
                            <br>
                            <p>系统更侧重于通过单灯控制与作业区域的联动来保证最佳的指向性照明,既保证</p>
                            <p>最佳工作照度,又能可靠、低投入的实现节能目的。</p>
                            </div>
                          </div>
                    </div>	 
                   <div class="clear"></div> 
                    <div class="pager">
                    	<span class="active">1</span>
                            <a class="ablue num" href="#">2</a>
                            <a class="ablue num" href="#">3</a>
                            <a class="ablue" href="#">..</a>
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
