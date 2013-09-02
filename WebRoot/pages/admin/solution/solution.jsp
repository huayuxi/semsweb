<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
 <head>
 <base href="<%=basePath%>">    
    <title>解决方案管理</title>
    <meta charset="utf-8">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="解决方案管理">
    <!-- Bootstrap -->
    <link href="<%=basePath%>bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
    <link href="<%=basePath%>bootstrap/css/custom.css" rel="stylesheet" media="screen">
    <script src="<%=basePath%>bootstrap/js/jquery.js" type="text/javascript"></script>
    <script src="<%=basePath%>bootstrap/js/bootstrap.js" type="text/javascript"></script>
    <script src="<%=basePath%>bootstrap/js/action.js" type="text/javascript"></script>
  </head>
  
  <body>
    <!--container980-->
    <div class="container container-full">
      <!--topbar row-->
      <div class="row row-fluid">
        <div class="span12">
          <div class="navbar g-navbar">
            <div class="navbar-inner">
              <div class="container-fluid">
                 <a data-target=".navbar-responsive-collapse" 
				 data-toggle="collapse" class="btn btn-navbar">
				 <span class="icon-bar"></span>
				 <span class="icon-bar"></span>
				 <span class="icon-bar"></span>
				 </a> 
				 <a href="#" class="brand">智联信通官网后台V1.0</a>
                <div class="nav-collapse collapse navbar-responsive-collapse">
                  <ul class="nav"></ul>
                  <ul class="nav g-nav-login pull-right">
                    <li>
                      <a href="#">Iotcomm@163.com</a>
                    </li>
                    <li>
                      <a href="login.html">注销</a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!--/topbar-->
      <!--main row-->
      <div class="row row-fluid-sidefixed">
        <!--sidebar-->
        <div class="col-sidebar">
		<!--side nav-->
            <ul class="nav nav-list g-nav">
			<li class="nav-header">
              	功能列表
            </li>
              <li >
                <a href="<%=basePath%>pages/admin/news/news.jsp">新闻管理</a>
              </li>
              <li >
                <a href="<%=basePath%>pages/admin/product/product.jsp">产品管理</a>
              </li>
			     <li>
                <a href="<%=basePath%>pages/admin/cases/cases.jsp">案例管理</a>
              </li>
			  <li class="active">
                <a href="<%=basePath%>pages/admin/solution/solution.jsp">解决方案管理</a>
              </li>
			  <li class="active">
                <a href="<%=basePath%>pages/admin/recruitment/recruitment.jsp">招聘管理</a>
              </li>
			<li class="nav-header">
              	个人中心
            </li>
              <li class="">
                <a href="<%=basePath%>pages/admin/sysuser/sysuser_detail.jsp">个人信息</a>
              </li>
			   <li class="">
                <a href="<%=basePath%>pages/admin/sysuser/pwd_update.jsp">密码修改</a>
              </li>
            </ul>
            <!--/side nav-->
        </div>
        <!--/sidebar-->
        <!--main-->
        <div class="col-main">
          <div class="g-main-box">
            <!--action panel-->
            <div class="g-action-panel">
              <a href="news_add.html" class="btn btn-success pull-right" type="button">发布职位</a>
              <button class="btn btn-danger" type="button">批量删除</button>
            </div>
            <!--/action panel-->
            <!--table-->
            <table class="table g-table">
              <thead>
                <tr>
                  <th class="g-tl" width="40%">
					<input class="g-checkbox" id="j-ad-all" type="checkbox">岗位名称
				  </th> 
				  <th width="10%">岗位类型</th>
				  <th width="10%">招聘部门</th>
                  <th width="10%">发布者</th>
                  <th width="20%">发布时间</th>
				  <th width="10%">相关操作</th>
                </tr>
              </thead>
              <tbody>
                <tr class="g-app-row">
                  <td>
                    <label class="g-ad-title">
                      <input class="g-checkbox" type="checkbox">
                      <a href="news_detail.html">
						<img class="g-appimg" src="bootstrap/img/new.gif">
						Java工程师
					  </a>
                    </label>
                  </td>
                  <td>
					研发工程师
				  </td>
                  <td>系统研发部</td>
                  <td><span class="g-col-org">超级管理员</span></td>
                  <td><span class="g-col-grn">2013-08-29</span></td>
				  <td><a href="">编辑</a>&nbsp;|&nbsp;<a href="">删除</a></td>
                </tr>
                  <tr class="g-app-row">
                  <td>
                    <label class="g-ad-title">
                      <input class="g-checkbox" type="checkbox">
                      <a href="news_detail.html">
						<img class="g-appimg" src="bootstrap/img/new.gif">
						Java工程师
					  </a>
                    </label>
                  </td>
                  <td>
					研发工程师
				  </td>
                  <td>系统研发部</td>
                  <td><span class="g-col-org">超级管理员</span></td>
                  <td><span class="g-col-grn">2013-08-29</span></td>
				  <td><a href="">编辑</a>&nbsp;|&nbsp;<a href="">删除</a></td>
                </tr>
  				<tr class="g-app-row">
                  <td>
                    <label class="g-ad-title">
                      <input class="g-checkbox" type="checkbox">
                      <a href="news_detail.html">
						<img class="g-appimg" src="bootstrap/img/new.gif">
						Java工程师
					  </a>
                    </label>
                  </td>
                  <td>
					研发工程师
				  </td>
                  <td>系统研发部</td>
                  <td><span class="g-col-org">超级管理员</span></td>
                  <td><span class="g-col-grn">2013-08-29</span></td>
				  <td><a href="">编辑</a>&nbsp;|&nbsp;<a href="">删除</a></td>
                </tr>
  				<tr class="g-app-row">
                  <td>
                    <label class="g-ad-title">
                      <input class="g-checkbox" type="checkbox">
                      <a href="news_detail.html">
						<img class="g-appimg" src="bootstrap/img/new.gif">
						Java工程师
					  </a>
                    </label>
                  </td>
                  <td>
					研发工程师
				  </td>
                  <td>系统研发部</td>
                  <td><span class="g-col-org">超级管理员</span></td>
                  <td><span class="g-col-grn">2013-08-29</span></td>
				  <td><a href="">编辑</a>&nbsp;|&nbsp;<a href="">删除</a></td>
                </tr>
  				<tr class="g-app-row">
                  <td>
                    <label class="g-ad-title">
                      <input class="g-checkbox" type="checkbox">
                      <a href="news_detail.html">
						<img class="g-appimg" src="bootstrap/img/new.gif">
						Java工程师
					  </a>
                    </label>
                  </td>
                  <td>
					研发工程师
				  </td>
                  <td>系统研发部</td>
                  <td><span class="g-col-org">超级管理员</span></td>
                  <td><span class="g-col-grn">2013-08-29</span></td>
				  <td><a href="">编辑</a>&nbsp;|&nbsp;<a href="">删除</a></td>
                </tr>
  				<tr class="g-app-row">
                  <td>
                    <label class="g-ad-title">
                      <input class="g-checkbox" type="checkbox">
                      <a href="news_detail.html">
						<img class="g-appimg" src="bootstrap/img/new.gif">
						Java工程师
					  </a>
                    </label>
                  </td>
                  <td>
					研发工程师
				  </td>
                  <td>系统研发部</td>
                  <td><span class="g-col-org">超级管理员</span></td>
                  <td><span class="g-col-grn">2013-08-29</span></td>
				  <td><a href="">编辑</a>&nbsp;|&nbsp;<a href="">删除</a></td>
                </tr>
  				<tr class="g-app-row">
                  <td>
                    <label class="g-ad-title">
                      <input class="g-checkbox" type="checkbox">
                      <a href="news_detail.html">
						<img class="g-appimg" src="bootstrap/img/new.gif">
						Java工程师
					  </a>
                    </label>
                  </td>
                  <td>
					研发工程师
				  </td>
                  <td>系统研发部</td>
                  <td><span class="g-col-org">超级管理员</span></td>
                  <td><span class="g-col-grn">2013-08-29</span></td>
				  <td><a href="">编辑</a>&nbsp;|&nbsp;<a href="">删除</a></td>
                </tr>				
              </tbody>
            </table>
            <!--/table-->
            <!--page-->
            <div class="pagination pagination-centered">
              <ul>
                <li class="disabled">
                  <a href="#">上一页</a>
                </li>
                <li class="active">
                  <a href="#">1</a>
                </li>
                <li>
                  <a href="#">2</a>
                </li>
                <li>
                  <a href="#">3</a>
                </li>
                <li>
                  <a href="#">4</a>
                </li>
                <li>
                  <a href="#">5</a>
                </li>
                <li>
                  <a href="#">下一页</a>
                </li>
              </ul>
            </div>
            <!--/page-->
          </div>
        </div>
        <!--/main-->
      </div>
      <!--/main row-->
    </div>
    <!--/container980-->
  </body>
</html>
