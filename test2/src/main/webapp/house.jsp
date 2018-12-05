<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>青鸟租房 - 房屋列表</title>
<LINK rel=stylesheet type=text/css href="css/style.css">
<style type="text/css">
.house-price a {
	font-size: 20px;
	text-decoration: none;
}

.house-price a:hover {
	color: red;
	text-decoration: none;
}

#footer {
	position: absolute;
	top: 500px;
	left: 202px;
}

.house-list {
	font-size: 16px;
}
</style>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	
	$(function() {
		$("#dis")
				.change(
						function() {
							var did = $(this).val();
							var sid = "${param.street}";
							$("#street option").not(":eq(0)").remove();
							$
									.getJSON(
											"street?did=" + did,
											function(sb) {
												var option;
												for (var i = 0; i < sb.length; i++) {
													if (sid == sb[i].sid) {
														option = "<option value='"+sb[i].sid+"' selected=selected >"
																+ sb[i].sname
																+ "</option>";
													} else {
														option = "<option value='"+sb[i].sid+"' >"
																+ sb[i].sname
																+ "</option>";
													}
													$("#street").append(option);
												}
											});
						});
		$("#floorage").val("${param.floorage}");
		$("#price").val("${param.prices}");
		$("select[name=type]").val("${param.type}");
		$("select[name=dis]").val("${param.dis}");

		$("#dis").trigger("change");

		$(".del").click(function() {
			if (confirm("确认是否删除？")) {
				var hid = $(this).attr("hid");
				$.post("del?hid=" + hid, function(sb) {
					if (sb == "Y") {
						alert("删除成功！");
						window.location = "load.action";
					} else {
						alert("删除失败！")
					}
				});
			}
		});
	});
</script>
</head>
<body>
	<DIV id="header" class="wrap">
		<DIV id="logo">
			<IMG src="images/logo.gif" /> <span
				style="font: normal bold 16px 宋体; padding-left: 600px;">欢迎：${sessionScope.users.name }</span><a
				style='padding-left: 30px' href='exit.action'>注销</a>
		</DIV>
	</DIV>
	<form action="load.action" method="post">
		<DIV id="navbar" class="wrap">
			<br /> 标题: <input type="text" name="titles" value="${param.titles }" />
			面积: <select name="floorage" id="floorage">
				<option value="0">--请选择--</option>
				<option value="0-60">0-60</option>
				<option value="61-120">61-120</option>
				<option value="121-200">121-200</option>
			</select> 价格: <select name="prices" id="price">
				<option value="0" selected=selected>--请选择--</option>
				<option value="0-600">0-600</option>
				<option value="601-1200">601-1200</option>
				<option value="1201-2000">1201-2000</option>
				<option value="2001-8000">2001-8000</option>
			</select> 类型: <select name="type">
				<option value="0" selected=selected>--请选择--</option>
				<c:forEach items="${tylist }" var="tp">
					<option value="${tp.tid }">${tp.tname }</option>
				</c:forEach>
			</select> 区县: <select name="dis" id="dis">
				<option value="0" selected='selected'>--请选择--</option>
				<c:forEach items="${dlist }" var="dis">
					<option value="${dis.did }">${dis.dname }</option>
				</c:forEach>
			</select> 街道: <select name="street" id="street">
				<option value="0" selected="selected">--请选择--</option>
			</select> <LABEL class=ui-blue><INPUT value='搜索房屋' type='submit'
				name="search"></LABEL> &nbsp;&nbsp;&nbsp;&nbsp; <a
				href='issus.action'>发布房屋</a>
		</DIV>
	</form>
	<!-- 列表 -->
	<DIV class="main wrap">
		<TABLE class="house-list">
			<TBODY>
				<c:forEach items="${pg }" var="hs">
					<TR>
						<TD class="house-thumb"><span><A
								href="details?&hid=${hs.hid }" target="_blank"><img
									src="images/thumb_house.gif" width="100" height="75" alt="">
							</a> </span></TD>
						<TD>
							<DL>
								<DT>
									<A href="details?hid=${hs.hid }" target="_blank">${hs.title }</A>
								</DT>
								<DD>
									${hs.dis.dname }${hs.st.sname }${hs.area }平米 <BR>
									联系方式：${hs.phone }
								</DD>
							</DL>
						</TD>
						<TD class="house-type">${hs.tp.tname }</TD>
						<TD class="house-price"><SPAN>${hs.price }</SPAN>元/月</TD>
						<TD class="house-price"><c:if test="${not empty users }">
								<a href='updateHouse.action?hid=${hs.hid }'>修改</a>
								<a class='del' hid="${hs.hid }" href='javascript:void(0)'>删除</a>
							</c:if></TD>
					</TR>
				</c:forEach>
			</TBODY>
		</TABLE>

		<DIV class="pager">
			<UL>
				<LI class="current"><A
					href="load.action?pageIndex=1&titles=${param.titles }&floorage=${param.floorage}
					&prices=${param.prices}&type=${param.type}&dis=${param.dis}&street=${param.street}">首页</A>
				</LI>
				<LI><A
					href="load.action?pageIndex=${pg.getPageNum()-1 }&titles=${param.titles }&floorage=${param.floorage}
					&prices=${param.prices}&type=${param.type}&dis=${param.dis}&street=${param.street}">上一页</A></LI>
				<LI><A
					href="load.action?pageIndex=${pg.getPageNum()+1 }&titles=${param.titles }&floorage=${param.floorage}
					&prices=${param.prices}&type=${param.type}&dis=${param.dis}&street=${param.street}">下一页</A></LI>
				<LI><A
					href="load.action?pageIndex=${pg.getPages() }&titles=${param.titles }&floorage=${param.floorage}
					&prices=${param.prices}&type=${param.type}&dis=${param.dis}&street=${param.street}">末页</A></LI>
			</UL>
			<SPAN class="total">${pg.getPageNum() }/${pg.getPages() }页</SPAN>

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