<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>青鸟租房 - 用户注册</title>
<LINK rel=stylesheet type=text/css href="css/style.css">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
$(function(){
	$("form").submit(function(){
		var username=$("#name").val();
		var password=$("#pass").val();
		var repassword=$("#repass").val();
		var name=$("#zsname").val();
		if(username==""){
			alert("用户名不能为空！");
			return false;
		} else if(password==""){
			alert("密码不能为空！");
			return false;
		} else if(repassword==""){
			alert("确认密码不能为空！");
			return false;
		} else if(zsname==""){
			alert("用户姓名不能为空！");
			return false;
		} else if(password!=repassword){
			alert("两次密码输入不一致！");
			return false;
		}
		return true;
	});
	
	$("#name").blur(function(){
		var user=$(this).val();
		$.post("exists?username="+user,function(sb){
			if(sb=="N"){
				alert("用户名已被占用！");
			}
		});
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
			<DL class="clearfix">
				<DT>新用户注册</DT>
				<DD class="past">填写个人信息</DD>
			</DL>
			<DIV class="box">
				<FORM id='fm' action='register' method="post">
					<DIV class="infos">
						<TABLE class="field">
							<TBODY>
								<TR>
									<TD class="field">用 户 名：</TD>
									<TD><INPUT class="text" id='name' type="text" name="username">
									</TD>
								</TR>
								<TR>
									<TD class="field">密 码：</TD>
									<TD><INPUT class="text" type="password" id='pass'
										name="password"></TD>
								</TR>
								<TR>
									<TD class="field">确认密码：</TD>
									<TD><INPUT class="text" id="repass" type="password" name="repassword">
									</TD>
								</TR>
								<TR>
									<TD class="field">用户姓名：</TD>
									<TD><INPUT class="text" id="zsname" type="text" name="name"></TD>
								</TR>
							</TBODY>
						</TABLE>
						<DIV class="buttons">
							<INPUT value="立即注册" type="submit">
						</DIV>
					</DIV>
				</FORM>
			</DIV>
		</DIV>
	</DIV>
	<DIV id="footer" class="wrap">
		<DL>
			<DT>青鸟租房 © 2010 北大青鸟 京ICP证1000001号</DT>
			<DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD>
		</DL>
	</DIV>

</body>
</html>