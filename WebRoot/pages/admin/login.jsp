<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base href="<%=basePath%>">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<title>智联信通官网后台管理</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- Bootstrap -->
	<link href="<%=basePath%>bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
	<link href="<%=basePath%>bootstrap/css/custom.css" rel="stylesheet" media="screen">
	<link href="<%=basePath%>bootstrap/css/ie.css" rel="stylesheet" type="text/css" >
	
	<script src="<%=basePath%>bootstrap/js/jquery.js" ></script>
	<script src="<%=basePath%>bootstrap/js/jquery.cookie.js" ></script>
	<script src="<%=basePath%>bootstrap/js/bootstrap.js" ></script>
	<script src="<%=basePath%>js/admin/login.js" ></script>
</head>

<body class="login">
	<div class="container g-container980">
		<input type="hidden" value="<%=basePath%>" id="basePath"/>
		<form class="form-signin">
			<h2 class="form-signin-heading">智联信通官网后台</h2>
			<div class="input-prepend">
				<span class="add-on"><i class="icon-user"></i></span> 
				<input class="g-login-input" id="userInput" placeholder="登陆帐号" type="text">
			</div>
			<div class="input-prepend">
				<span class="add-on"><i class="icon-lock"></i></span> 
				<input class="g-login-input" id="pwdInput" placeholder="登陆密码" type="password">
			</div>
			<div class="loginfo clearfix">
				<span class="input-tip" id="j-log-tip"></span> 
				<label class="checkbox"> 
				<input value="remember-me" id="j-remember-me" type="checkbox">记住账号 </label>
			</div>
			<button id="login-form" class="btn btn-large btn-primary" type="button" >登 录</button>
		</form>
	</div>
</body>
</html>
