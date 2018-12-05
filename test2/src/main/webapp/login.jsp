<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>青鸟租房 - 用户登录</title>
<LINK rel=stylesheet type=text/css href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("form").submit(function(){
			var username=$("input[name=username]").val();
			var password=$("input[name=password]").val();
			if(username==""){
				alert("请输入用户名！");
				return false;
			}else if(password==""){
				alert("请输入密码！");
				return false;
			}
			return true;
		});
				
	});
</script>
</head>
<body>
	<DIV id="header" class="wrap">
		<DIV id="logo">
			<IMG src="images/logo.gif">
		</DIV>
	</DIV>
	<DIV id="regLogin" class="wrap">
		<DIV class="dialog">
			<DIV class="box">
				<H4>用户登录</H4>
				<FORM id="user" method="post" name="user" action="login">
					<DIV class="infos">
						<TABLE class="field">
							<TBODY>
								<TR>
									<TD colspan="2"></TD>
								</TR>
								<TR>
									<TD class="field">用 户 名：</TD>
									<TD><input type="text" class="text" name="username" /></TD>
								</TR>
								<TR>
									<TD class="field">密 码：</TD>
									<TD><input type="password" class="text" name="password" />
									</TD>
								</TR>
							</TBODY>
						</TABLE>
						<DIV class="buttons">
							<INPUT value='登陆' type='submit'> <INPUT
								onclick='document.location.href="register.jsp"' value="注册" type="button">
							<INPUT onclick='document.location.href="load"' value="查询"
								type="button">
						</DIV>
					</DIV>
				</FORM>
			</DIV>
		</DIV>
	</DIV>
	<DIV id=footer class=wrap>
		<DL>
			<DT>青鸟租房 © 2010 北大青鸟 京ICP证1000001号</DT>
			<DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD>
		</DL>
	</DIV>

</body>
</html>