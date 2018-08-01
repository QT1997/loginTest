<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String basePath = request.getScheme()+"://"
        +request.getServerName()+":"+request.getServerPort()+
        request.getContextPath()+"/";		
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<title>系统首页</title>
</head>
<body>
    <h1 align="center">系统首页</h1>
	 <h2 align="center">欢迎${currentUser.username}访问</h2>
</body>
</html>