    <%@page import="com.util.Uploader"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

    <%
    request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	String path=this.getServletContext().getRealPath("/");
	System.out.print(path);
    Uploader up = new Uploader(request);
    up.setSavePath("upload");
    String[] fileType = {".gif" , ".png" , ".jpg" , ".jpeg" , ".bmp"};
    up.setAllowFiles(fileType);
    up.setMaxSize(10000); //单位KB
    up.upload();
    response.getWriter().print("{'original':'"+up.getOriginalName()+"','url':'"+up.getUrl()+"','title':'"+up.getTitle()+"','state':'"+up.getState()+"'}");
    %>
