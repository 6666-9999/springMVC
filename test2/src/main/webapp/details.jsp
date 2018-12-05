<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK rel=stylesheet type=text/css href="css/style.css">
<!-- <style type="text/css">
	#ud{
		font-size: 22px;
		position:absolute;
		right: 750px;
		top: 300px;
	}
</style> -->
<title>青鸟租房 -房屋信息</title>
</head>
<body>
	<DIV id="header" class="wrap">
		<DIV id="logo">
			<IMG src="images/logo.gif">
		</DIV>
	</DIV>

	<DIV id="view" class="main wrap">
		<DIV class="intro">
			<DIV class="lefter">
				<H1>${house.title }</H1>
				<DIV class="subinfo">${house.htime }</DIV>
				<DIV class="houseinfo">
					<P>
						户 型：<SPAN>${house.tp.tname }</SPAN>
					</P>
					<P>
						面 积：<SPAN>${house.area }m<SUP>2</SUP></SPAN>
					</P>
					<P>
						位 置：<SPAN>${house.dis.dname }${house.st.sname }</SPAN>
					</P>
					<P>
						联系方式：<SPAN>${house.phone }</SPAN>
					</P>
					<!-- <p id="ud">
						<a href='updateServlet?opr=find&id=12'>修改</a> <a class='del'
							title="12" href='javascript:void(0)'>删除</a>
					</p> -->
				</DIV>
			</DIV>
			<DIV class="side">
				<P>
					<A class="bold" href="javascript:void(0)">北京青鸟房地产经纪公司</A>
				</P>
				<P>资质证书：有</P>
				<P>内部编号:1000</P>
				<P>联 系 人：</P>
				<P>
					联系电话：<SPAN></SPAN>
				</P>
				<P>
					手机号码：<SPAN>暂无</SPAN>
				</P>
			</DIV>
			<DIV class="clear"></DIV>
			<DIV class="introduction">
				<H2>
					<SPAN><STRONG>房源详细信息</STRONG></SPAN>
				</H2>
				<DIV class="content">
					<P>${house.content }</P>
				</DIV>
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