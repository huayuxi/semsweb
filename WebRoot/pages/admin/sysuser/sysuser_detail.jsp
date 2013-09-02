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
			<li class="nav-header">
              	个人中心
            </li>
              <li class="active">
                <a href="<%=basePath%>pages/admin/sysuser/Sysuser_detail.jsp">个人信息</a>
              </li>
			   <li>
                <a href="<%=basePath%>pages/admin/sysuser/pwd_update.jsp">密码修改</a>
              </li>
            </ul>
            <!--/side nav-->
        <!--main-->
        <div class="col-main">
          <div class="g-main-box">
            <!--create info-->
            <div class="g-create-info">
              <!--tips-->
              <div class="alert uinfo-tips">
                  <button type="button" class="close" data-dismiss="alert">×</button>
                  <h4>小贴士：</h4>
                  <p>为了给您提供更好的服务，请填写真实资料。</p> 
                  <p>我们会保护用户隐私资料，绝不会向第三方透露用户的个人资料。</p>
              </div>
              <!--tips-->
              <h3 class="title">基本信息</h3>
              <!--userdata-->
              <form id="userdata-form">
                <ul>
                  <li>
                    <label class="lb-title">当前帐号：</label>
                    <span class="lb-txt">iotcomm@163.com</span>
                  </li>
                  <li>
                    <label class="lb-title"><span class="im">*</span>真实姓名：</label>
                    <input class="input-large" id="j-ui-name" type="text">
                    <span class="input-tip"></span>
                  </li>
                  <li>
                    <label class="lb-title">身份证号码：</label>
                    <input class="input-large" type="text">
                  </li>
                  <li>
                    <label class="lb-title"><span class="im">*</span>联系电话：</label>
                    <input class="input-large" id="j-ui-tel" type="text">
                    <span class="input-tip"></span>
                  </li>
                  <li>
                    <label class="lb-title"><span class="im">*</span>QQ或MSN：</label>
                    <input class="input-large" id="j-ui-qq" type="text">
                    <span class="input-tip"></span>
                  </li>
                  <li>
                    <label class="lb-title">省市：</label>
                    <div class="btn-group dropdown" id="province-dropdown">
                      <button data-toggle="dropdown" class="btn dropdown-toggle"><span class="value">请选择</span><span class="caret"></span></button>
                      <ul class="dropdown-menu">
                        <li><a href="#">福建省</a></li>
                        <li><a href="#">江西省</a></li>
                        <li><a href="#">安徽省</a></li>
                      </ul>
                    </div>
                    <div class="btn-group dropdown" id="city-dropdown">
                      <button data-toggle="dropdown" class="btn dropdown-toggle"><span class="value">请选择</span><span class="caret"></span></button>
                      <ul class="dropdown-menu">
                        <li><a href="#">厦门市</a></li>
                        <li><a href="#">泉州市</a></li>
                        <li><a href="#">南平市</a></li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <label class="lb-title">联系地址：</label>
                    <input class="input-large" type="text">
                  </li>
                  <li>
                    <label class="lb-title">公司名称：</label>
                    <input class="input-large" type="text">
                  </li>
                  <li>
                    <label class="lb-title">公司地址：</label>
                    <input class="input-large" type="text">
                  </li>
                  <li>
                    <label class="lb-title">传真号码：</label>
                    <input class="input-large" type="text">
                  </li>
                  <li>
                    <label class="lb-title">邮编号码：</label>
                    <input class="input-large" type="text">
                  </li>
                  <li>
                    <label class="lb-title">公司网站：</label>
                    <input class="input-large" type="text">
                  </li>
                  <li><button class="btn btn-warning g-btn-submit">确认保存</button></li>
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
