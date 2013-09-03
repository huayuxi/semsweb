<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
  <base href="<%=basePath%>">    
    <title>个人信息</title>
    <meta charset="utf-8">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="个人信息">
    <!-- Bootstrap -->
    <link href="<%=basePath%>bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
    <link href="<%=basePath%>bootstrap/css/custom.css" rel="stylesheet" media="screen">
    
    <script src="<%=basePath%>bootstrap/js/jquery.js" type="text/javascript"></script>
    <script src="<%=basePath%>bootstrap/js/bootstrap.js" type="text/javascript"></script>
    <script src="<%=basePath%>js/common/jquery.form.js" type="text/javascript"></script>
    <script src="<%=basePath%>js/admin/sysuser/sysuser_detail.js" type="text/javascript"></script>
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
                      <a href="#">${sysUser.yhxm00}</a>
                    </li>
                    <li>
                      <a href="<%=basePath%>loginOut.shtml">注销</a>
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
			<li>
				<a href="<%=basePath%>pages/admin/news/news.jsp">新闻管理</a>
			</li>
			<li>
				<a href="<%=basePath%>pages/admin/product/product.jsp">产品管理</a>
			</li>
			<li>
				<a href="<%=basePath%>pages/admin/cases/cases.jsp">案例管理</a>
			</li>
			<li>
				<a href="<%=basePath%>pages/admin/solution/solution.jsp">解决方案管理</a>
			</li>
			<li>
				<a href="<%=basePath%>pages/admin/recruitment/recruitment.jsp">招聘管理</a>
			</li>
			<li>
				<a href="<%=basePath%>pages/admin/sysuser/sysuser.jsp">用户管理</a>
			</li>
			<li class="nav-header">
              	个人中心
            </li>
              <li  class="active">
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
            <!--create info-->
            <div class="g-create-info">
              <!--tips-->
              <div class="alert pw-tips">
                  <button type="button" class="close" data-dismiss="alert">×</button>
                  <h4>小贴士：</h4>
                  <p>为了给您提供更好的服务，请填写真实资料。</p> 
                  <p>我们会保护用户隐私资料，绝不会向第三方透露用户的个人资料。</p>
              </div>
              <!--tips-->
              <h3 class="title">个人信息</h3>
              <!--userdata-->
              <form id="user-form">
                <ul>
  				 <li>
                    <label class="lb-title">用户帐号：</label>
                     <input class="input-large"  type="hidden" name="sysUser.dlzh00" value="${sysUser.dlzh00}">
                    <span class="lb-txt">${sysUser.dlzh00}</span>
                  </li>
                  <li>
                    <label class="lb-title"><span class="im">*</span>真实姓名：</label>
                    <input class="input-large" id="j-ui-name" type="text" name="sysUser.yhxm00">
                    <span class="input-tip"></span>
                  </li>

                  <li>
                    <label class="lb-title"><span class="im">*</span>用户邮箱：</label>
                    <input class="input-large" id="j-ui-email" type="text" name="sysUser.yhyx00">
                    <span class="input-tip"></span>
                  </li>
                 
                  <li>
                    <label class="lb-title"><span class="im">*</span>用户性别：</label>
                    <input id="j-ui-sex" type="hidden" name="sysUser.yhxb00"/>
                    <div class="btn-group dropdown" id="province-dropdown">
                      <button data-toggle="dropdown" class="btn dropdown-toggle"><span class="value">请选择</span><span class="caret"></span></button>
                      <ul class="dropdown-menu">
                        <li class="100000"><a href="javascript:void();">男</a></li>
                        <li class="100001"><a href="javascript:void();">女</a></li>
                      </ul>
                    </div>                  
                  </li>
                  <li><button class="btn btn-warning g-btn-submit" type="button" id="userdata-form">确认保存</button></li>
                </ul>
              </form>
              <!--/userdata-->
            </div>
            <!--/create info-->
          </div>
        </div>
        <!--/main-->
      </div>
      <!--/main row-->
    </div>
    <!--/container980-->
  </body>
</html>
