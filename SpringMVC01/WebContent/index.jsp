<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
	<a href="myController">sb</a>|
	<a href="hello?id=">hello</a>|
	<a href="login1">查询</a>
	</h1>
	
	<form action="login" method="post">
		用户名：<input name="name" />
		密码：<input name="password" type="password" />
		<input type="submit" value="登录"/>
	</form>
</body>
</html>