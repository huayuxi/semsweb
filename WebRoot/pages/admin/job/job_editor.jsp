<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<base href="<%=basePath%>">
	<title>智联信通-编辑职位</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="编辑职位">

    <!-- Bootstrap -->
    <link href="<%=basePath%>bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
    <link href="<%=basePath%>bootstrap/css/custom.css" rel="stylesheet" media="screen">
    <script src="<%=basePath%>bootstrap/js/jquery.js" type="text/javascript"></script>
    <script src="<%=basePath%>js/common/jquery.form.js" type="text/javascript"></script>
    <script src="<%=basePath%>bootstrap/js/bootstrap.js" type="text/javascript"></script>
    
	<script type="text/javascript">
		window.UEDITOR_HOME_URL = "<%=basePath%>js/common/ueditor-1.2.6.1/";
		window.BASE_PATH = "<%=basePath%>";
	</script>
	
	<script src="<%=basePath%>js/common/ueditor-1.2.6.1/ueditor.config.js" type="text/javascript" ></script>
	<script src="<%=basePath%>js/common/ueditor-1.2.6.1/ueditor.all.js" type="text/javascript" ></script>
	<script src="<%=basePath%>js/admin/job/job_editor.js" type="text/javascript"></script>
	
</head>

<body>
  <input type="hidden" value="<%=basePath%>" id="basePath"/>
    <!--container980-->
    <div class="container container-full">
      <!--topbar row-->
      <div class="row row-fluid">
        <div class="span12">
          <div class="navbar g-navbar">
            <div class="navbar-inner">
              <div class="container-fluid">
                 <a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar">
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
			  <li class="active">
                <a href="<%=basePath%>pages/admin/job/job.jsp">招聘管理</a>
              </li>
			<li>
				<a href="<%=basePath%>pages/admin/sysuser/sysuser.jsp">用户管理</a>
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
            <!--create info-->
            <div class="g-create-info">
              <h3 class="title">编辑职位</h3>
              <form id="job-form">
                <input type="hidden" id="j-ui-id" name="cases.alid00"/>
                 <ul>                
                    <li>
                      <label class="lb-title">招聘岗位：</label>
                      <input id="j-ui-title" class="input-large" type="text" name=job.zpgw00>
                      <span class="input-tip input-tip-warning"></span>
                    </li>
                    <li>
                      <label class="lb-title">招聘类型：</label>
                      
                      <div class="btn-group dropdown" id="create-type-dropdown">
                     	 <input id="j-ui-type" type="hidden" name="job.zplx00" class="data_value"/>
                        <button data-toggle="dropdown" class="btn dropdown-toggle">
							<span class="value" id="create-app-type">请选择</span>
							<span class="caret"></span>
						</button>
                        <ul class="dropdown-menu">
                          <li class="100000"><a href="javascript:void(0)">社会招聘</a></li>
                          <li class="100001"><a href="javascript:void(0)">校园招聘</a></li>
                        </ul>
                      </div>
                      <span class="input-tip input-tip-warning"></span>
                    </li>
                    
                    <li>
                      <label class="lb-title">工作类别：</label>
                     
                      <div class="btn-group dropdown" id="create-type-dropdown">
                       <input id="j-ui-kind" type="hidden" name="job.gzlb00" class="data_value"/>
                        <button data-toggle="dropdown" class="btn dropdown-toggle">
							<span class="value" id="create-app-type">请选择</span>
							<span class="caret"></span>
						</button>
                        <ul class="dropdown-menu">
                          <li class="100000"><a href="javascript:void(0)">技术类</a></li>
                          <li class="100001"><a href="javascript:void(0)">行政类</a></li>
                        </ul>
                      </div>
                      <span class="input-tip input-tip-warning"></span>
                    </li>
                   
                    <li>
                      <label class="lb-title">工作地点：</label>
                      <input  id="j-ui-address" class="input-large" type="text" name="job.gzdd00">
                      <span class="input-tip input-tip-warning"></span>
                    </li>
					<li>
                      <label class="lb-title">招聘人数：</label>
                      <input  id="j-ui-num" class="input-large" type="text" name="job.zprs00">
                      <span class="input-tip input-tip-warning"></span>
                    </li>
                    <li>
                      <label class="lb-title">排序权值：</label>
                      <input  id="j-ui-sno" class="input-large" type="text" name="job.pxqz00">
                      <span class="input-tip input-tip-warning"></span>
                    </li>
					<li>
						<label class="lb-title">招聘内容：</label>					  
						<textarea rows="5" cols="20" id="j-ui-content" name="job.zpnr00"></textarea>
						<span class="input-tip input-tip-warning"></span>
                    </li>
                    <li><button type="button" id="jobdata-form" class="btn btn-success btn-large g-btn-add">确认发布</button></li>
                  </ul>
              </form>
            </div>
            <!--/create info-->
          </div>
        </div>
        <!--/main-->
      </div>
      <!--/main row-->
    </div>
    <!--/container980-->
    <script type="text/javascript">
	var editor = UE.getEditor('j-ui-content',{
        //focus时自动清空初始化时的内容
        autoClearinitialContent:true,
        //默认的编辑区域高度
        initialFrameHeight:300
    })
    editor.addListener("ready", function () {
    	editor.setContent($("#j-ui-content").text());
	});
    </script>
</body>
</html>
