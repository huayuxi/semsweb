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
	<title>Iotcomm</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- Bootstrap -->
	<link href="<%=basePath%>bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
	<link href="<%=basePath%>bootstrap/css/custom.css" rel="stylesheet" media="screen">
	<link href="<%=basePath%>bootstrap/css/ie.css" rel="stylesheet" type="text/css" >
	<script src="<%=basePath%>bootstrap/js/jquery.cookie.js" type="text/javascript"></script>
	<script src="<%=basePath%>bootstrap/js/jquery.js" type="text/javascript"></script>
	<script src="<%=basePath%>bootstrap/js/bootstrap.js" type="text/javascript"></script>
	<script src="<%=basePath%>bootstrap/js/action.js" type="text/javascript"></script>
	<script type="text/javascript">
      $(function(){
        var COOKIE_NAME = 'username';
        if($.cookie(COOKIE_NAME)){
          $("#userInput").val($.cookie(COOKIE_NAME));
        }
        $("#login-form").bind("submit",function(){
          if($("#j-remember-me")[0].checked){
            $.cookie(COOKIE_NAME, $("#userInput").val(),{ expires:10});
          }else{
            $.cookie(COOKIE_NAME,null);
          }
        });
      });
    </script>
</head>
<body class="login">
	<div class="container g-container980">
		<form class="form-signin" id="login-form" action="app_list.html">
			<h2 class="form-signin-heading">登录</h2>
			<div class="input-prepend">
				<span class="add-on"><i class="icon-user"></i></span> <input
					value="1" class="g-login-input" id="userInput"
					placeholder="Username" type="text">
			</div>
			<div class="input-prepend">
				<span class="add-on"><i class="icon-lock"></i></span> <input
					value="2" class="g-login-input" id="pwdInput"
					placeholder="password" type="text">
			</div>
			<div class="loginfo clearfix">
				<span class="input-tip" id="j-log-tip"></span> <label
					class="checkbox"> <input value="remember-me"
					id="j-remember-me" type="checkbox">记住账号 </label>
			</div>
			<button class="btn btn-large btn-primary" type="submit">登 录</button>
		</form>
	</div>
</body>
</html>
